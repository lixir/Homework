import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by lixir on 24.09.2017.
 */
public class SubarraySearch {
    private int[] arr;
    private int firstIndex;
    private int secondIndex;


    public SubarraySearch(int[] arr){
        this.arr = arr;
    }

    public int getFirstIndex(){ return  firstIndex;}

    public int getSecondIndex(){ return secondIndex;}

    public void subarraySearch(){
        int max = 0;
        int temp = 0;
        for (int i = 0; i < arr.length; i++){
            temp = 0;
            for (int j = 0; j < arr.length - i; j++){
                temp += arr[i + j];
                if (temp > max) {
                    max = temp;
                    firstIndex = i;
                    secondIndex = i + j;
                }
            }
        }
    }
}