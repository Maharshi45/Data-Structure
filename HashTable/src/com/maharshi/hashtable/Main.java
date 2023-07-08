package com.maharshi.hashtable;

public class Main {
    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee jamesBond =  new Employee("James", "Bond", 7);

        SimpleHashTable hashTable = new SimpleHashTable();
        hashTable.put(janeJones.getLastName(), janeJones);
        hashTable.put(johnDoe.getLastName(), johnDoe);
        hashTable.put(mikeWilson.getLastName(), mikeWilson);
        hashTable.put(marySmith.getLastName(), marySmith);
        hashTable.put(jamesBond.getLastName(), jamesBond);

//        hashTable.printHashTable();

        System.out.println(hashTable.get(jamesBond.getLastName()));

    }
}