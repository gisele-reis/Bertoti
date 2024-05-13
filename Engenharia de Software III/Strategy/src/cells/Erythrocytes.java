package cells;

import strategy.CellFunction;

public class Erythrocytes implements CellFunction{
    public String transport(){
        return "Red blood cells carries oxygen from the lungs to all parts of the body!";
    }

    @Override
    public String operate(){
        Erythrocytes erythrocyte = new Erythrocytes();
        String function = erythrocyte.transport();
        return function;
    }
}
