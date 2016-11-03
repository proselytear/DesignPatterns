package net.proselyte.basepatterns.creational.abstractfactory.website;

import net.proselyte.basepatterns.creational.abstractfactory.Tester;

public class ManualTester implements Tester{
    @Override
    public void testCode() {
        System.out.println("Manual tester tests website...");
    }
}
