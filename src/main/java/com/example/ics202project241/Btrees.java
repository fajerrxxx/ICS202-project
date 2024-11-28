package com.example.ics202project241;

import java.util.ArrayList;
import java.util.List;

public class Btrees {
    class BPlusTree {
        // Implementation of B+ tree
        // This is a simplified version for demonstration purposes
        // You can find more detailed implementations online

        public void insert(int key, Student value) {
            // Insert logic
        }

        public Student search(int key) {
            // Search logic
            return null;
        }

        public List<Student> searchByLastName(String lastName) {
            // Search logic for last name
            return new ArrayList<>();
        }

        public List<Student> searchByFirstName(String firstName) {
            // Search logic for first name
            return new ArrayList<>();
        }

        public List<Student> searchByLevel(String level) {
            // Search logic for academic level
            return new ArrayList<>();
        }
    }

    BPlusTree idIndex = new BPlusTree();
    BPlusTree lastNameIndex = new BPlusTree();
    BPlusTree firstNameIndex = new BPlusTree();
    BPlusTree levelIndex = new BPlusTree();

    public void addStudent(Student student) {
        idIndex.insert(student.getId().hashCode(), student);
        lastNameIndex.insert(student.getLastName().hashCode(), student);
        firstNameIndex.insert(student.getFirstName().hashCode(), student);
        levelIndex.insert(student.getLevel().hashCode(), student);
    }

    public Student searchById(String id) {
        return idIndex.search(id.hashCode());
    }

    public List<Student> searchByLastName(String lastName) {
        return lastNameIndex.searchByLastName(lastName);
    }

    public List<Student> searchByFirstName(String firstName) {
        return firstNameIndex.searchByFirstName(firstName);
    }

    public List<Student> searchByLevel(String level) {
        return levelIndex.searchByLevel(level);
    }
}

