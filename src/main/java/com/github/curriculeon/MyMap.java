package com.github.curriculeon;

public class MyMap<KeyType, ValueType> implements MyMapInterface<KeyType, ValueType> {
//    void put(KeyType key, ValueType value);
//    ValueType get(KeyType key);
//    MySet<KeyType> getKeySet();
//    MyCollectionInterface<ValueType> getValues();
//    MySet<KeyValue<KeyType, ValueType>> getList();
//    MyMapInterface<ValueType, KeyType> invert();

    KeyType keyValue; // Key
    ValueType value; // Value

    @Override
    public void put(KeyType key, ValueType value){
        new KeyValue(key,value); // creates new key value pair for the map
    }

    @Override
    public ValueType get(KeyType key){
        ValueType returnVar = null;

        return returnVar;
    }

    @Override
    public MySet<KeyType> getKeySet(){
        return null;
    }

    @Override
    public MyCollectionInterface<ValueType> getValues(){
        return null;
    }

    @Override
    public MySet<KeyValue<KeyType, ValueType>> getList(){
        return null;
    }

    @Override
    public MyMapInterface<ValueType, KeyType> invert(){
        return null;
    }

}
