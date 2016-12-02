package net.proselyte.basepatterns.creational.factory;

public class Program {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = new JavaDeveloperFactory();
        Developer developer = developerFactory.createDeveloper();

        developer.writeCode();
    }

}
