import java.util.Arrays;

public class revarr {
    public static void main(String[] args) {
            int arr [] = new int[] {1,2,3,4,5,6};
            int i=0,j=arr.length-1,temp;
            while(i<j){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            for(int a=arr.length;a>0;a--){
                System.out.print(" "+a);
            }
        } 
    }
