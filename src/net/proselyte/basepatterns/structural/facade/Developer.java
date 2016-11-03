package net.proselyte.basepatterns.structural.facade;

public class Developer {
    public void doJobBeforeDeadline(BugTracker bugTracker){
        if(bugTracker.isActiveSprint()){
            System.out.println("Developer is solving problems...");
        }else {
            System.out.println("Developer is reading Habrahabr...");
        }
    }
}
