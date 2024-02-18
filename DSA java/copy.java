public class copy {
    public static void main(String[] args) {
        int arr[] = new int[]{3,5,6,8,9,4};
        int arr2[] = new int[arr.length];
        int j;
        for(int i=arr.length-1;i>=0;j=0,i--,j++){
            arr2[i] = arr[i];
        }
        System.out.println("Elements of original array: ");    
        for (int i = arr.length-1;i>=0;i--) {     
           System.out.print(arr[i] + " ");    
        }     
            
        System.out.println();    
            
        System.out.println("Elements of new array: ");    
        for (j = 0; j < arr2.length; j++) {     
           System.out.print(arr2[j] + " ");    
        }
    }
}


        // System.out.println("Elements of original array: ");    
        // for (int i = 0; i < arr.length; i++) {     
        //    System.out.print(arr[i] + " ");    
        // }     
            
        // System.out.println();    
            
           
        // System.out.println("Elements of new array: ");    
        // for (int i = 0; i < arr2.length; i++) {     
        //    System.out.print(arr2[i] + " ");    
        // }
    

