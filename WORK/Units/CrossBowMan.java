//АРБАЛЕТЧИК

package WORK.Units;

import java.util.ArrayList;

public class CrossBowMan extends Shooter {
    public CrossBowMan(ArrayList<Hero> team, String name) {
        super(6, team, name, 10, new int[] { 1, 3 }, 2, 1, 1, 1);
    }

    @Override
    public String getInfo() {
        return String.format("%s  arrows: %d  accuracy: %d",
                super.getInfo(), this.arrows, this.accuracy);
    }

}
