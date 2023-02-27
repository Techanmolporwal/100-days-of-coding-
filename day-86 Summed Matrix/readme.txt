A matrix is constructed of size n*n. such that Mi,j= i+j. Count the number of cells having value q.
Note: Assume, the array is in 1-based indexing.

 

Example 1:

Input:
n = 4, q = 7
Output:
2
Explanation:
Matrix becomes
2 3 4 5 
3 4 5 6 
4 5 6 7
5 6 7 8
The count of 7 is 2.
Example 2:

Input:
n = 5, q = 4
Output:
3
Explanation:
Matrix becomes
2 3 4 5 6 
3 4 5 6 7 
4 5 6 7 8 
5 6 7 8 9 
6 7 8 9 10 
The count of 4 is 3.
 

Your Task:
You don't need to read input or print anything. Your task is to complete the function sumMatrix() which takes 2 Integers n, and q as input and returns the count of q in the n*n matrix.

 

Expected Time Complexity: O(1)
Expected Auxiliary Space: O(1)

 

Constraints:
1 ≤ n,q ≤ 1018
