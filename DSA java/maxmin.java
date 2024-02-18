public class maxmin {
    public static void main(String[] args) {
        int arr[] = new int[10];
        for(int i = 0; i<arr.length;i++){
            arr[i] = i+1;
            System.out.println(arr[i]);
        }
        int max = arr[0];
        for(int i = 1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Maximum element in this array is " + max);

        int min = arr[0];
        for(int i = 1;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Minimum element in this array is " + min);
    }
}
