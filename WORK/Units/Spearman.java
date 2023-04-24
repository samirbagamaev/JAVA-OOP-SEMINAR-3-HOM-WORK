//КОПЕЙЩИК

package WORK.Units;

import java.util.ArrayList;

public class Spearman extends Infantry {  
    public Spearman (ArrayList<Hero> team, String name){

        super(7,team, name, 12, new int [] {1,2}, 1, 2);
    }

    @Override
    public String getInfo() {
        return String.format("%s  tool: %d", super.getInfo(), this.tool);
    }
}

