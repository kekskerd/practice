package org.example.abstractfactory.website;

import org.example.abstractfactory.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual tester tests code...");
    }
}
