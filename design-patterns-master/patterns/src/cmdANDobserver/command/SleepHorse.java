package cmdANDobserver.command;

import cmdANDobserver.entities.Horse;

public class SleepHorse implements Command {
    private Horse horse;

    public SleepHorse(Horse horse){
        this.horse = horse;
    }
    public void execute() {
    	horse.sleep();
    }
}