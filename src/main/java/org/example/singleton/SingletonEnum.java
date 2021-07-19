package org.example.singleton;

public enum SingletonEnum {
    INSTANCE;

    String name;

    public void getName() {
        System.out.println("Singleton name is " + name);
    }

    public void setName(String name) {
        this.name = name;
    }

}
