package cmdANDobserver.command;

import cmdANDobserver.entities.Horse;

public class IdleHorse implements Command {
    private Horse horse;

    public IdleHorse(Horse horse){
        this.horse = horse;
    }
    public void execute() {
    	horse.idle();
    }
}