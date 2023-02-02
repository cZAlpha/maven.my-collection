package com.github.curriculeon;

public class MyLinkedList<SomeType> {
    private MyNode<SomeType> head; // The current node accessed in the linked list
    private int size; // The length/size of the linked list (how many nodes are in it)

    public MyLinkedList() { // Null constructor
        this.head = null;
        this.size = 0;
    }

    public MyLinkedList(SomeType valuesToBePopulatedWith) { // Custom Constructor
    }


    // The following methods are derived from the "myarraylist" set of tests, to coincide with the methods that the
    // tests are testing for.

    public void add(SomeType data){
        MyNode<SomeType> nodeToBeAdded = null; // Set New Node Equal To Null.
        nodeToBeAdded.setData(data); // Set The Data For The New Node To The Inputted Data.

        if (head == null){ // If the linked list is empty
            head = nodeToBeAdded;
        } else { // If it is not empty
            // Iterate thru the linked list until the next node == null (when at the end of the list) and then
            // Set the next node to the node to be added.
            MyNode<SomeType> currentNode = head;
            while ( currentNode.getNext() != null){
                currentNode = currentNode.getNext();
            }
            // Once end of the list has been reached, add new node
            currentNode.setNext(nodeToBeAdded);
        }
        // Increments the size of the list if the new node has been appended to the list.
        size++;

    }
}
