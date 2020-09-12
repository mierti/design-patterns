package cmdANDobserver.entities;

import cmdANDobserver.observer.PlayersObserver;

import java.util.ArrayList;
import java.util.List;

public class Horse {
    private String position = "idle";
    private List<PlayersObserver> observers = new ArrayList<>();

    public void eat() {
        this.setPosition("The horse is eating");
    }
    public void sleep() {
        this.setPosition("The horse is sleeping");
    }

    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
        notifyAllObservers();
    }

    public void attach(PlayersObserver observer){
        observers.add(observer);
    }
    public void notifyAllObservers(){
        for (PlayersObserver observer : observers) {
            observer.update();
        }
    }
	public void idle() {
		// TODO Auto-generated method stub
		
	}
}
