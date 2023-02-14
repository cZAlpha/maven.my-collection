package com.github.curriculeon;

import java.util.Iterator;

public class MySet<T> implements MyCollectionInterface<T> {
    private final T[][] T = null; // Was a suggestion on how to get rid of an error, no idea wtf im even doing tbh
    private int index; // Holds The Length Of The Set (The Size)
    private T[] content; // Holds The Set As An Array
    private static final Integer resize = 5;

    public MySet() {
        // Instantiate The Length Of The Set To Be Zero
        this.index = 0;
    }

    public MySet(Object[] valuesToBePopulatedWith) {
        // Initiate the backbone array to be bigger than the length as the inputted array
        this.content = T[valuesToBePopulatedWith.length + resize];
        // Loop through the array starting at "index" until reaching the length of the array given as "valuesToBePopulatedWith"
        // Each iteration of the loop, used teh "add" method that hasn't been created yet to add the given object to the array
        for (int i = index; i < valuesToBePopulatedWith.length; i++) {
            content[i] = (T) valuesToBePopulatedWith[i]; // Copy shit over
        }
    }

    @Override
    public void add(T objectToAdd) {

    }

    @Override
    public void remove(T objectToRemove) {

    }

    @Override
    public void remove(int indexOfObjectToRemove) {

    }

    @Override
    public T get(int indexOfElement) {
        return null;
    }

    @Override
    public Boolean contains(T objectToCheckFor) {
        return null;
    }

    @Override
    public Integer size() {
        return null;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
