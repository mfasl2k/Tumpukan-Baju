import java.util.ArrayList;
import java.util.Arrays;

public class Toys {
    public static int[] bubleSort(int[] array){
        for(int i = 0; i <array.length; i++){
            for(int j = 1; j < array.length - 1; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        return array;
    }

    public  static  void showResult(Integer[] array){
        ArrayList<Integer> finalResult = new ArrayList<Integer>();
        for(int j = 0 ; j < array.length; j++){
            if(array[j] != null){
                finalResult.add(array[j]);
            }
        }
        System.out.println(finalResult.size());
        System.out.println(Arrays.toString(finalResult.toArray()));

    }

    public static  void  main(String[] args){
        int money = 50;
        int[] toys = {1,12,5,111,200,1000,10};
        int temp = money;
        Integer[] result = new Integer[toys.length];
        bubleSort(toys);
        for(int i = 0; i < toys.length; i++){
            if(money < toys[i]){
                result[i] = null;
            }else {
                result[i] = toys[i];
                temp = money-toys[i];
                money = temp;
            }
        }
        showResult(result);
    }

}
