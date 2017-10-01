
/**
 * Created by lixir on 24.09.2017.
 */
public class SubarraySearch {
    private int[] arr;
    private int firstIndex = -1;
    private int secondIndex = -1;


    public SubarraySearch(int[] arr){
        this.arr = arr;
    }

    public int getFirstIndex(){ return  firstIndex;}

    public int getSecondIndex(){ return secondIndex;}

    public void subarraySearch(){
        int sum = 0;
        int temp = 0;
        int tempFirstIndex = 0;
        for (int i = 0; i < arr.length; i++){
            temp += arr[i];
            if (temp < 0) {
                temp = 0;
                tempFirstIndex = i + 1;
            } else if (temp > sum) {
                sum = temp;
                firstIndex = tempFirstIndex;
                secondIndex = i;
            }
        }
    }
}