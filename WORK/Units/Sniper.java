//СНАЙПЕР

package WORK.Units;

import java.util.ArrayList;

public class Sniper extends Shooter {
    public Sniper(ArrayList<Hero> team, String name) {
        super(6,team, name, 12, new int [] {1,1}, 1, 1,1,15);
    }

    @Override
    public String getInfo() {
        return String.format("%s  arrows: %d  accuracy: %d",
                super.getInfo(), this.arrows, this.accuracy);
    }
}
