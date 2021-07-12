public class BinarySearch {
    boolean bSearch(int arr[], int item, int low, int high)
    {
        int mid;
        if(high<low)
            return false;
        mid=(low+high)/2;
        if(item>arr[mid])
            return bSearch(arr, item, mid+1, high);
        else if(item<arr[mid])
            return bSearch(arr, item, low, mid-1);
        else
            return true;
    }

    public static void main(String[] args) {
        /* test array */
        int arr[] = {2, 3, 4, 10, 40};
        int item = 40;
        BinarySearch bs = new BinarySearch();
        boolean b = bs.bSearch(arr, item, 0, arr.length-1);
        System.out.println(b);
    }
}
