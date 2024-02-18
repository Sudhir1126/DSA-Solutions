public class secondlargest{
public static int secondlargest(int[] Arr) {
    int max1,max2;
    max1=max2=Arr[0];
    for (int i=0;i<Arr.length;i++) {
        if(Arr[i]>max1){
            max2=max1;
            max1=Arr[i];
        }
        else if (Arr[i]>max2) {
            max2=Arr[i];
        }
    }
    return max2;
}
    public static void main(String[] args) {
        int Arr[] = new int[5];
        int max1; int max2;
        for(int i = 0;i<Arr.length;i++){
            Arr[i]=i+1;
            System.out.println(Arr[i]);
        }
        max2 = secondlargest(Arr);
        System.out.println("The Second largest element in this array is " +max2);
    }
}
