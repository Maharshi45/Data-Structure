package com.maharshi.hashtable;

import java.util.Objects;

public class SimpleHashTable {

    private Employee[] hashTable;

    public SimpleHashTable() {
        this.hashTable = new Employee[10];
    }

    public void put(String key, Employee employee) {
        int hashedKey = hashKey(key);
        if (Objects.nonNull(hashTable[hashedKey])) {
            System.out.println("Sorry, there is already an employee at position " + hashedKey);
        } else {
            hashTable[hashedKey] = employee;
        }
    }

    public Employee get(String key) {
        int hashedKey = hashKey(key);
        return hashTable[hashedKey];
    }

    private int hashKey(String key) {
        return key.length() % hashTable.length;
    }

    public void printHashTable() {
        for (int i = 0; i < hashTable.length; i++) {
            System.out.println(hashTable[i]);
        }
    }

}
