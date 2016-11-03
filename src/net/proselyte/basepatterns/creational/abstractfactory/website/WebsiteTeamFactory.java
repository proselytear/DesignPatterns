package net.proselyte.basepatterns.creational.abstractfactory.website;

import net.proselyte.basepatterns.creational.abstractfactory.Developer;
import net.proselyte.basepatterns.creational.abstractfactory.ProjectManger;
import net.proselyte.basepatterns.creational.abstractfactory.ProjectTeamFactory;
import net.proselyte.basepatterns.creational.abstractfactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory{
    @Override
    public Developer getFirstDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Developer getSecondDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManger getProjectManager() {
        return new WebsitePM();
    }
}
