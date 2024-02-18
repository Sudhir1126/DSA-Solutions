import java.util.Scanner;
public class linear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int arr[] = new int[]{2,5,7,8,10};
    int key;
    System.out.println("Enter the key");
    key = sc.nextInt();

    for (int i = 0;i<arr.length;i++) {
        if(key == arr[i]){
            System.out.println("Element is found at " +i);
            System.exit(0);
        }
    }
        System.out.println("Not Found");
    }
   
}
