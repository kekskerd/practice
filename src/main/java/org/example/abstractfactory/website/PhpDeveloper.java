package org.example.abstractfactory.website;

import org.example.abstractfactory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("PHP developer writes php code...");
    }
}
