Java annotation can be used to define the metadata of a Java class or class element. We can use Java annotation at the
compile time to instruct the compiler about the build process. 
Annotation is also used at runtime to get insight into the properties of class elements.
Here, we define an annotation , where  is the only member in that custom annotation. The  takes only  type values, and the default is
"GUEST". If we do not define the value for this annotation member, then it takes the default. By using @Target, we can specify where our 
annotation can be used. For example, the  annotation can only be used with the method in a class. @Retention defines whether the annotation is available
at runtime. To learn more about Java annotation, you can read the tutorial and oracle docs.

Compiler Message
Success
Input (stdin)

Download
3
SENIOR 75
JUNIOR 45
SENIOR 40
Expected Output

Download
Senior Member
Spend: 75
Budget Left: 25
Junior Member
Spend: 45
Budget Left: 5
Senior Member
Spend: 40
Budget Left: 60
