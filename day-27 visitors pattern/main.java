import java.util.ArrayList;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import java.util.ArrayList;
import java.util.Scanner;

enum Color {
    RED, GREEN
}

abstract class Tree {

    private int value;
    private Color color;
    private int depth;

    public Tree(int value, Color color, int depth) {
        this.value = value;
        this.color = color;
        this.depth = depth;
    }

    public int getValue() {
        return value;
    }

    public Color getColor() {
        return color;
    }

    public int getDepth() {
        return depth;
    }

    public abstract void accept(TreeVis visitor);
}

class TreeNode extends Tree {

    private ArrayList<Tree> children = new ArrayList<>();

    public TreeNode(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitNode(this);

        for (Tree child : children) {
            child.accept(visitor);
        }
    }

    public void addChild(Tree child) {
        children.add(child);
    }
}

class TreeLeaf extends Tree {

    public TreeLeaf(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitLeaf(this);
    }
}

abstract class TreeVis
{
    public abstract int getResult();
    public abstract void visitNode(TreeNode node);
    public abstract void visitLeaf(TreeLeaf leaf);

}

class SumInLeavesVisitor extends TreeVis {
    int result=0;
    public int getResult() {
      	//implement this
        return result;
    }

    public void visitNode(TreeNode node) {
      	//implement this
    }

    public void visitLeaf(TreeLeaf leaf) {
      	//implement this
          result += leaf.getValue();
    }
}

class ProductOfRedNodesVisitor extends TreeVis {
     long result = 1;
     static long modulo = (int)Math.pow(10,9) + 7;
    public int getResult() {
      	//implement this
        return (int)result;
    }

    public void visitNode(TreeNode node) {
      	//implement this
          if (node.getColor() == Color.RED)
                result = (result * node.getValue()) % modulo;
    }

    public void visitLeaf(TreeLeaf leaf) {
      	//implement this
           if (leaf.getColor() == Color.RED)
                result = (result * leaf.getValue()) % modulo;
    }
}

class FancyVisitor extends TreeVis {
     int evenNodesSum = 0;
        int greenLeafSum = 0;
    public int getResult() {
      	//implement this
            int result =  Math.abs(evenNodesSum - greenLeafSum);
            evenNodesSum= 0;
            greenLeafSum =0;
            return result;
       
    }

    public void visitNode(TreeNode node) {
    	//implement this
        if (node.getDepth() % 2 == 0) {//even
                evenNodesSum += node.getValue();
            }
    }

    public void visitLeaf(TreeLeaf leaf) {
    	//implement this
        if (leaf.getColor() == Color.GREEN) {
                greenLeafSum += leaf.getValue();
            }
    }
}

public class Solution {
  
    public static Tree solve() {
       Tree root = null;

            //read the tree from STDIN and return its root as a return value of this function
          
              try (BufferedReader inputBufferReader = new BufferedReader(new InputStreamReader(System.in));) {
                int numberOfNodes = Integer.parseInt(inputBufferReader.readLine());
                String[] values = inputBufferReader.readLine().split(" ");
                String[] colors = inputBufferReader.readLine().split(" ");

                Map<Integer, List<Integer>> nodeToChildren = new HashMap<>();
                Map<Integer, Integer> NoOfEdges = new HashMap<>();
                String edgeLine = null;
                while ((edgeLine = inputBufferReader.readLine()) != null) {
                    String[] nodes = edgeLine.split(" ");
                    int node1 = Integer.valueOf(nodes[0]) - 1;
                    int node2 = Integer.valueOf(nodes[1]) - 1;

                    if (nodeToChildren.get(node1) == null) {
                        nodeToChildren.put(node1, new LinkedList<Integer>());
                    }
                    if (nodeToChildren.get(node2) == null) {
                        nodeToChildren.put(node2, new LinkedList<Integer>());
                    }
                    nodeToChildren.get(node1).add(node2);
                    nodeToChildren.get(node2).add(node1);


                    NoOfEdges.put(node1, (NoOfEdges.get(node1) == null ? 0 : NoOfEdges.get(node1)) + 1);
                    NoOfEdges.put(node2, (NoOfEdges.get(node2) == null ? 0 : NoOfEdges.get(node2)) + 1);
                }

                Map<Integer, Tree> indexToNode = new HashMap<>();
                for (int nodeNo = 0; nodeNo < numberOfNodes; nodeNo++) {
                    int depth = getDepth(0, nodeNo, nodeToChildren, new HashSet<Integer>(),indexToNode);
                    Tree node = null;
                    if (NoOfEdges.get(nodeNo) == 1) {
                        node = new TreeLeaf(Integer.valueOf(values[nodeNo]), Color.values()[Integer.valueOf(colors[nodeNo])], depth);
                    } else {
                        node = new TreeNode(Integer.valueOf(values[nodeNo]), Color.values()[Integer.valueOf(colors[nodeNo])], depth);
                    }

                    indexToNode.put(nodeNo, node);
                }
                root = indexToNode.get(0);

                HashSet<Integer> alreadyVisited = new HashSet<>();
                alreadyVisited.add(0);
                addChildren(0, nodeToChildren, alreadyVisited, indexToNode);


            } catch (IOException e) {
                e.printStackTrace();
            }
            return root;
        
    }   
    
      private static void addChildren(int currentNode, Map<Integer, List<Integer>> nodeToChildren, Set<Integer> alreadyVisited, Map<Integer, Tree> indexToNode) {
            for (Integer childrenNo : nodeToChildren.get(currentNode)) {
                if (!alreadyVisited.contains(childrenNo)) {
                    ((TreeNode) indexToNode.get(currentNode)).addChild(indexToNode.get(childrenNo));
                    alreadyVisited.add(childrenNo);
                    addChildren(childrenNo, nodeToChildren, alreadyVisited, indexToNode);
                }
            }

        }

        private static int getDepth(int currentDepth, int currentNode, Map<Integer, List<Integer>> nodeToChildren, Set<Integer> alreadyVisited, Map<Integer, Tree> indexToNode) {
            if (currentNode == 0) {
                return currentDepth;
            }
            if(indexToNode.get(currentNode) != null){
                return currentDepth + indexToNode.get(currentNode).getDepth();
            }
            if (nodeToChildren.get(currentNode) != null && !alreadyVisited.contains(currentNode)) {
                alreadyVisited.add(currentNode);
                for (Integer integer : nodeToChildren.get(currentNode)) {
                    int depth = getDepth(currentDepth + 1, integer, nodeToChildren, alreadyVisited,indexToNode);
                    if (depth != -1)
                        return depth;
                }
            }
            return -1;
    }


    public static void main(String[] args) {
      	Tree root = solve();
		SumInLeavesVisitor vis1 = new SumInLeavesVisitor();
      	ProductOfRedNodesVisitor vis2 = new ProductOfRedNodesVisitor();
      	FancyVisitor vis3 = new FancyVisitor();

      	root.accept(vis1);
      	root.accept(vis2);
      	root.accept(vis3);

      	int res1 = vis1.getResult();
      	int res2 = vis2.getResult();
      	int res3 = vis3.getResult();

      	System.out.println(res1);
     	System.out.println(res2);
    	System.out.println(res3);
	}
}
