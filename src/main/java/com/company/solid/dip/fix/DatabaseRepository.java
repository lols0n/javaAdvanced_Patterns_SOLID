package com.company.solid.dip.fix;

public class DatabaseRepository implements Repository {

    @Override
    public void saveTask(String task) {
        System.out.println("Saving to " + task + " table");
    }

    @Override
    public void deleteTask(String task) {
        System.out.println("Deleting from " + task + " table");
    }
}
