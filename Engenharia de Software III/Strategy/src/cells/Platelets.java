package cells;

import strategy.*;

public class Platelets implements CellFunction {
    public String cluster(){
        return "Platelets help your body form clots to stop bleeding!";     
    };

    @Override
    public String operate(){
        Platelets platelet = new Platelets();
        String function = platelet.cluster();
        return function;
    }
}
