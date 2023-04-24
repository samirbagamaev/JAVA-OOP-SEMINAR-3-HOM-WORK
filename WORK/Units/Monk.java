//МОНАХ

package WORK.Units;

import java.util.ArrayList;

public class Monk extends Magian {
    public Monk(ArrayList<Hero> team, String name) {

        super(5, team, name, 13, new int [] {1,3}, 3, 3,1,8);
    }

    @Override
    public String getInfo() {
        return String.format("%s  mana: %d  field: %d",
                super.getInfo(), this.mana, this.field);
    }
}