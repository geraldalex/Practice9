
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Colections c = new Colections();
        System.out.print("Выводим исходный масив : ");
        System.out.println(Arrays.toString(c.getArray1()));
        c.sizeColections();
        c.elementAdd(8);
        c.elementAdd(8);
        c.isHaveElement(8);
        c.elementAdd(8);
        c.elementAdd(8);
        c.sizeColections();
        c.clearColections();
        c.sizeColections();
        c.elementAdd(9);
        c.elementAdd(3);
        c.elementAdd(3);
        c.elementAdd(3);
        c.addElementPoIndexu(2,125);
        c.elementAdd(3);
        c.deleteElementPoindexu(2);

    }
}









