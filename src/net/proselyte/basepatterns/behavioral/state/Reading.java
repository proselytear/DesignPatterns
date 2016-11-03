package net.proselyte.basepatterns.behavioral.state;

public class Reading implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("Reading book...");
    }
}
