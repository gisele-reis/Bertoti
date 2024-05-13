import strategy.CellFunction;

public class Cell {
    private CellFunction cell;

    public Cell(CellFunction cell){
        this.cell = cell;
    }

    public void setCell(CellFunction cell){
        this.cell = cell;
    }

    public String work(){
        String cellFunction = this.cell.operate();
        return cellFunction;
    }
}
