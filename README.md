Amazon Online Test
=========

### Interview Zen ###
http://www.interviewzen.com/interview/FMxhG2

### License ###
GPLv2

### Requirement ###
Please note the approved languages:
* C
* C++
* C#
* Java
* Python
* Ruby
* PHP
* JavaScript

### Question ###

Tree Printing [Data Structures]

You are given a binary tree where each node contains an integer. Print the tree out to the console level by level, with each level on its own line and each node’s value separated by a space. You may assume that the tree is non-empty, but not necessarily sorted, balanced, or complete. You may use the JDK or the standard template library. Your solution will be evaluated on correctness, runtime complexity (big-O), and adherence to coding best practices.  A complete answer will include the following:

1.      Document your assumptions
2.      Explain your approach and how you intend to solve the problem
3.      Provide code comments where applicable
4.      Explain the big-O run time complexity of your solution. Justify your answer.
5.      Provide Test Cases

Example input:
```
    5
   / \
  3   1
 /   / \
9   4   5
   /
  2
```

Example output:
```
5
3 1
9 4 5
2
```

You can use one of the following code skeletons for your solution, or feel free to use the language of your choice from the above list.  

Java:
```java
public class Node {
  public int value;
  public Node left;
  public Node right;
}

void printTree(Node root) {

}
```
C++:
```c++
typedef struct tnode {
  int value;
  struct tnode* left;
  struct tnode* right;
} Node;

void printTree (Node* root) {

}
```
