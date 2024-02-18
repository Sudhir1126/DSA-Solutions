public class delete {
    public static void main(String[] args) {
        int arr[] =  new int[5];
        int n=5;
        arr[0] = 5;
        arr[1] = 9;
        arr[2] = 6;
        arr[3] = 10;
        arr[4] = 12;
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
        System.out.println("");

        int index = 1;
        for(int i=index;i<n-1;i++){
            arr[i] = arr[i+1];
        }
        // n--;

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
        System.out.println("");
    }
}
