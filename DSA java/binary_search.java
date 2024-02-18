public class binary_search {
    public static int binarysearch(int[] arr, int target){

        int low = 0;
        int high = arr.length - 1;

        while (low <= high){
            int mid = low + (high - low) / 2;
        
            if (target == arr[mid]){
                return mid;
            }

            else if(target > mid){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        int[] array = {2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int target = 16;
        int target2 = 4;
        System.out.println(binarysearch(array, target));
        System.out.println(binarysearch(array, target2));
    }
}
