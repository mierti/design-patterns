package cmdANDobserver.observer;

import cmdANDobserver.entities.Horse;

public abstract class PlayersObserver {
    protected Horse horse;
    public abstract void update();
}