package com.github.curriculeon;

public class MyLinkedList<SomeType> {
    private MyNode<SomeType> head; // The current node accessed in the linked list
    private int size; // The length/size of the linked list (how many nodes are in it)

    public MyLinkedList() { // Null constructor
        this.head = null;
        this.size = 0;
    }

    public MyLinkedList(SomeType... valuesToBePopulatedWith) { // Custom Constructor
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

    public void remove(SomeType data){
        if (head==null){ // If the list is empty
            System.out.println("The inputted value does not exist within the list.");;
        } else if (head.getData() == data){ // If the head is the node to be removed
            head = head.getNext();
            size--;
        }
        // Go thru the list until reaching the value wanted
        MyNode<SomeType> currentNode = head;
        while ( currentNode.getNext() != null){
            if ( currentNode.getNext().getData() == data){
                MyNode<SomeType> nextNode = currentNode.getNext(); // Creates a placeholder variable
                nextNode = currentNode.getNext().getNext(); // Sets the next node to the double next node, if you will
                size--; // Decrements the size of the list
            }
            currentNode = currentNode.getNext(); // Moves the head to the next node
        }
    }

    public SomeType get(int index){
        SomeType data = null; // The data to be returned
        if (index >= size || index < 0) { // Yes I totally just copy-pasted this, I couldn't make it better myself to be honest.
            throw new IndexOutOfBoundsException();
        }
        MyNode<SomeType> currentNode = head; // current node in iteration
        for ( int i = 0 ; i < index ; i++ ){
            currentNode = currentNode.getNext(); // iterates
        }
        return currentNode.getData(); // Returns the data
    }
}
