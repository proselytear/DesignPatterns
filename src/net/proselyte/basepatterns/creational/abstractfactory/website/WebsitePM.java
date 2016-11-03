package net.proselyte.basepatterns.creational.abstractfactory.website;

import net.proselyte.basepatterns.creational.abstractfactory.ProjectManger;

public class WebsitePM implements ProjectManger{
    @Override
    public void manageProject() {
        System.out.println("Website PM manages website project...");
    }
}
