package com.github.curriculeon;

public class MySet<T> {
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

    public <T> boolean add(T object){
        // Returns True If The Item Trying To Be Added Is Unique Amongst The Contents Of The Set, Otherwise False.
       // setArray[] = T object;

    }
}
