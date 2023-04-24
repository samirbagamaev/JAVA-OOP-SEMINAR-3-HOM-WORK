//РАЗБОЙНИК

package WORK.Units;

import java.util.ArrayList;

public class Thief extends Infantry{
    protected int invisibility; // невидимость, может и не надо, пусть пока будет

    public Thief(int init, ArrayList<Hero> team, String name, int health, int[] damage, int armor, int tool, int invisibility) {
        super(init,team, name, health, damage, armor, tool);
        this.invisibility = invisibility;
    }
    public Thief(ArrayList<Hero> team, String name) {
        this(7,team, name, 10, new int [] {1,3}, 1, 2,4);
    }

    @Override
    public String getInfo() {
        return String.format("%s  invisibility: %d", super.getInfo(), this.invisibility);
    }
}
