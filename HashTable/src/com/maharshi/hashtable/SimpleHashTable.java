package com.maharshi.hashtable;

import java.util.Objects;

public class SimpleHashTable {

    private StoredEmployee[] hashTable;

    public SimpleHashTable() {
        this.hashTable = new StoredEmployee[10];
    }

    public void put(String key, Employee employee) {
        int hashedKey = hashKey(key);
        if (isOccupied(hashedKey)) {
            int stopIndex = hashedKey;
            if (hashedKey == (hashTable.length - 1)) {
                hashedKey = 0;
            } else {
                hashedKey++;
            }
            while (isOccupied(hashedKey) && hashedKey != stopIndex) {
                hashedKey = (hashedKey + 1) % hashTable.length;
            }
        }
        if (Objects.nonNull(hashTable[hashedKey])) {
            System.out.println("Sorry, there is already an employee at position " + hashedKey);
        } else {
            hashTable[hashedKey] = new StoredEmployee(key, employee);
        }
    }

    public Employee get(String key) {
        int hashedKey = findKey(key);
        return hashedKey == -1 ? null : hashTable[hashedKey].getEmployee();
    }

    private int hashKey(String key) {
        return key.length() % hashTable.length;
    }

    private int findKey(String key) {
        int hashedKey = hashKey(key);
        if (Objects.nonNull(hashTable[hashedKey]) && hashTable[hashedKey].getKey().equals(key))
            return hashedKey;
        int stopIndex = hashedKey;
        if (hashedKey == (hashTable.length - 1)) {
            hashedKey = 0;
        } else {
            hashedKey++;
        }
        while (hashedKey != stopIndex && Objects.nonNull(hashTable[hashedKey]) && !hashTable[hashedKey].getKey().equals(key)) {
            hashedKey = (hashedKey + 1) % hashTable.length;
        }
        if (stopIndex == hashedKey)
            return -1;
        else
            return hashedKey;
    }

    private boolean isOccupied(int index) {
        return Objects.nonNull(hashTable[index]);
    }

    public void printHashTable() {
        for (int i = 0; i < hashTable.length; i++) {
            if (Objects.isNull(hashTable[i]))
                System.out.println("empty");
            else
                System.out.println("position: " + i + ": " + hashTable[i].getEmployee());
        }
    }

}
