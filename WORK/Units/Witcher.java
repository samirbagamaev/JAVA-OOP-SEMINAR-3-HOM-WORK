//КОЛДУН

package WORK.Units;

import java.util.ArrayList;

public class Witcher extends Magian {
    public Witcher(ArrayList<Hero> team, String name) {

        super(5,team, name, 13, new int [] {1,3}, 3, 3,1,2);
    }

    @Override
    public String getInfo() {
        return String.format("%s  mana: %d  accuracy: %d",
                super.getInfo(), this.mana, this.accuracy);
    }
}
