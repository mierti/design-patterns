package cmdANDobserver.entities;

import cmdANDobserver.observer.PlayersObserver;

public class Player extends PlayersObserver {
    private String position = "idle";

    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }

    public Player(Horse horse){
        this.horse = horse;
        this.horse.attach(this);
    }

    @Override
    public void update() {
        this.setPosition(horse.getPosition());
        System.out.println( "Player notification: " + this.getPosition());
    }
}
