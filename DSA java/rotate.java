public class rotate {
    public static void main(String[] args) {
        int arr[] = new int[] {1,2,3,4,5,6,7,8,9,10};
        for ( int x : arr) {
            System.out.print(x+",");
        }
        System.out.println("");
        // int temp = arr[0];
        // for(int i = 1;i<arr.length;i++){
        //     arr[i-1] = arr[i];
        // }
        // arr[arr.length-1] = temp;

        int temp2 = arr[arr.length-1];
        for(int j=arr.length-1;j>0;j--){
            arr[j] = arr[j-1];
        }
        arr[0] = temp2;
        
        
        for ( int x : arr) {
            System.out.print(x+",");
        }
        System.out.println("");
    }
}

