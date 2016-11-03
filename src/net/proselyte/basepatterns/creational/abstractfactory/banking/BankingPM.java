package net.proselyte.basepatterns.creational.abstractfactory.banking;

import net.proselyte.basepatterns.creational.abstractfactory.ProjectManger;

public class BankingPM implements ProjectManger{
    @Override
    public void manageProject() {
        System.out.println("Banking PM manages banking project...");
    }
}
