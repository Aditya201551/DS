public class RevArray {

    void reverse(int arr[]) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        RevArray ob = new RevArray();
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        ob.reverse(arr);
        for (int i : arr)
            System.out.print(i + " ");
    }
}
