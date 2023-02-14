package com.github.curriculeon;

import java.util.Iterator;

public class MyLinkedList<SomeType> implements MyCollectionInterface<SomeType> {
    private MyNode<SomeType> head; // The current node accessed in the linked list
    private int size; // The length/size of the linked list (how many nodes are in it)

    public MyLinkedList() { // Null constructor
        this.head = null;
        this.size = 0;
    }

    public MyLinkedList(SomeType... valuesToBePopulatedWith) { // Custom Constructor
        SomeType[] array = valuesToBePopulatedWith; // Setting own array equal to inputted array
        int arrayLength = array.length; // Length of the inputted array

        // Sets the head node equal to the first object in the inputted array
        MyNode<SomeType> currentNode = (MyNode<SomeType>) array[0];
        // Iterate through the linked list and set the current node equal to the jawn inputted
        for ( int i = 1; i < arrayLength ; i++ ){
            currentNode.setData(array[i]); // Sets the value
            currentNode = currentNode.getNext(); // Iterates the linked list
        }
    }


    // The following methods are derived from the "myarraylist" set of tests, to coincide with the methods that the
    // tests are testing for.
    @Override
    public void add(SomeType data){
        MyNode<SomeType> nodeToBeAdded = new MyNode<>(data, null); // Set New Node Equal To Null.
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

    @Override
    public void remove(SomeType objectToRemove) {
        if (head==null){ // If the list is empty
            System.out.println("The inputted value does not exist within the list.");;
        } else if (head.getData() == objectToRemove){ // If the head is the node to be removed
            head = head.getNext();
            size--;
        }
        // Go thru the list until reaching the value wanted
        MyNode<SomeType> currentNode = head;
        while ( currentNode.getNext() != null){
            if ( currentNode.getNext().getData() == objectToRemove){
                MyNode<SomeType> nextNode = currentNode.getNext(); // Creates a placeholder variable
                nextNode = currentNode.getNext().getNext(); // Sets the next node to the double next node, if you will
                size--; // Decrements the size of the list
            }
            currentNode = currentNode.getNext(); // Moves the head to the next node
        }
    }

    @Override
    public void remove(int indexOfObjectToRemove) {

    }

    public void removeByIndex(int index) {
        if (head == null) { // If the list is empty
            System.out.println("The inputted value does not exist within the list.");
            ;
        } else if (index == 0) { // If the wanted index of removal is the head node's index
            head = head.getNext();
            size--;
        } else {
            // Iterate thru the linked list until
            MyNode<SomeType> currentNode = head; // current node in iteration
            for ( int i = 0 ; i < index ; i++ ){
                currentNode = currentNode.getNext(); // iterates
            }
                currentNode = currentNode.getNext(); // Moves the head to the next node
        }
    }

    public SomeType get(int index){
        if (index >= size || index < 0) { // Yes I totally just copy-pasted this, I couldn't make it better myself to be honest.
            throw new IndexOutOfBoundsException();
        }
        MyNode<SomeType> currentNode = head; // current node in iteration
        for ( int i = 0 ; i < index ; i++ ){
            currentNode = currentNode.getNext(); // iterates
        }
        return currentNode.getData(); // Returns the data
    }

    @Override
    public Boolean contains(SomeType objectToCheckFor) {
        return null;
    }

    @Override
    public Integer size() {
        return null;
    }

    @Override
    public Iterator<SomeType> iterator() {
        return null;
    }
}
