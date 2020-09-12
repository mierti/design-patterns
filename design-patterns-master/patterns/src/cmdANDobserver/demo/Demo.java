package cmdANDobserver.demo;

import cmdANDobserver.command.IdleHorse;
import cmdANDobserver.command.EatHorse;
import cmdANDobserver.command.SleepHorse;
import cmdANDobserver.entities.Behavior;
import cmdANDobserver.entities.Horse;
import cmdANDobserver.entities.Cow;
import cmdANDobserver.entities.Player;

public class Demo {
    public static void main(String[] args) {
    	Behavior behavior = new Behavior();
        Horse horse = new Horse();
        Cow cow = new Cow();
        Player playerOne = new Player(horse);
        Player playerTwo = new Player(horse);
        Player playerThree = new Player(horse);

        IdleHorse idleHorseCmd = new IdleHorse(horse);
        EatHorse eatHorseCmd = new EatHorse(horse);
        SleepHorse sleepHorseCmd = new SleepHorse(horse);

        System.out.println("Horse behavior: " + horse.getPosition());
        System.out.println("Cow behavior: " + cow.getPosition());
        behavior.makeCommand(eatHorseCmd);
        System.out.println("Horse behavior changed to: " + horse.getPosition());

   
    }
}
