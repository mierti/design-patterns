package cmdANDobserver.command;

import cmdANDobserver.entities.Horse;

public class EatHorse implements Command {
    private Horse horse;

    public EatHorse(Horse horse){
        this.horse = horse;
    }

    public void execute() {
    	horse.eat();
    }
}