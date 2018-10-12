import java.util.Arrays;

public class Colections implements  myColections{
    private int array1[]  = new int[1];

    public int[] getArray1() {
        return array1;
    }

    public void elementAdd(int element){
        if(array1[array1.length-1] == 0){

            array1[array1.length-1] = element;
            System.out.println(Arrays.toString(array1));
        }
        else {
            int array2[] = new int[array1.length + 1];
            System.arraycopy(array1, 0, array2, 0, array1.length);
            array2[array2.length - 1] = element;
            array1 = array2;
            System.out.println(Arrays.toString(array1));
        }
    }

    public void addElementPoIndexu(int index, int element){
        int array2[] = new int[array1.length + 1];
        System.arraycopy(array1,0,array2,0,index);
        array2[index] = element;
        System.arraycopy(array1,index ,array2,index +1,array1.length-index);
        array1 = array2;
        System.out.println("В масив по индексу : " + index+ " Вставлено число : " +element+" \n"+Arrays.toString(array1));
    }

    @Override
    public void deleteElementPoindexu(int index) {
        int array2[] = new int[array1.length - 1];
        System.arraycopy(array1,0,array2,0,index);
        System.arraycopy(array1,index + 1,array2,index,array1.length - index - 1);
        array1 = array2;
        System.out.println("Елемент по индексу : " + index+ " Удален из масива " +"\n"+Arrays.toString(array1));
    }

    @Override
    public void isHaveElement(int element) {
        int count = 0;
        boolean flag = false;
        for(int i = 0; i < array1.length;i++) {
            if (array1[i] == element) {
                flag = true;
                count++;
            }
        }
        if(flag == true){
            System.out.println("Элемент " + element+" встречается в колеции, количество раз:  " + count);

        }else {
            System.out.println("Элемент не встречается в колеции   ");
        }
    }

    public void clearColections(){
        int array2[] = new int[1];
        array1 = array2;
        System.out.println("Масив очищен : " + Arrays.toString(array1));
    }
    public void sizeColections() {
        System.out.println("Размерность масива равна : " + array1.length);
    }

}



