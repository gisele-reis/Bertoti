package cells;

import strategy.CellFunction;

public class Leukocytes implements CellFunction {
    public String fight(){
        return "White blood cell help the immune system fight infections!";
    }
    
    @Override
    public String operate(){
        Leukocytes leukocyte = new Leukocytes();
        String function = leukocyte.fight();
        return function;
    }
}
