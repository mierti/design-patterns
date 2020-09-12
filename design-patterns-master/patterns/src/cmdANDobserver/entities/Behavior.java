package cmdANDobserver.entities;

import cmdANDobserver.command.Command;

public class Behavior {
    public void makeCommand(Command command){
        command.execute();
    }
}
