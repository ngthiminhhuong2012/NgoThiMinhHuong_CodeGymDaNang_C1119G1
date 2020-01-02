public class GiaTriMin {
    public static void main(String[] args) {
        int [] arr = {4,7,12,3,7,83,2};
        int index = minValue(arr);
        System.out.println(arr[index]);


    }
    public static int minValue(int []array){
        int min = array[0];
        int index = 0;
        for(int i=1;i<array.length;i++){
            if(min > array[i]){
                min = array[i];
                index =i;
            }
        }
        return index;
    }
}
