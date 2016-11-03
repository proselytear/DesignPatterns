package net.proselyte.basepatterns.creational.abstractfactory.banking;

import net.proselyte.basepatterns.creational.abstractfactory.Developer;

public class JavaDeveloper implements Developer{

    @Override
    public void writeCode() {
        System.out.println("Java developer writes Java code...");
    }
}
