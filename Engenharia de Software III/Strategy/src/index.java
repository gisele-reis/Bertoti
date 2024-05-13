import cells.Erythrocytes;
import cells.Leukocytes;
import cells.Platelets;

public class index {

    public static void main(String[] args) {
        Platelets platelet = new Platelets();
        Erythrocytes erythrocyte = new Erythrocytes();
        Leukocytes leukocyte = new Leukocytes();

        Cell cellFunction = new Cell(leukocyte);

        System.out.println(cellFunction.work());
    }
}