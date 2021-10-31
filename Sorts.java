public class Sorts
{
    //selection sort:start
    void selectionSort(int arr[])
    {
        for (int i = 0; i < arr.length-1; i++)
        {
            int minimum_index = i;
            for (int j = i+1; j < arr.length-1; j++)
                if (arr[j] < arr[minimum_index])
                    minimum_index = j;
 
            // Swap
            int temp = arr[minimum_index];
            arr[minimum_index] = arr[i];
            arr[i] = temp;
        }
    }
    //selection sort: end


    //quick sort: start
    void quickSort(int arr[], int low, int up)
    {
        int pivotLocation;
        if(low>=up)
            return;
        pivotLocation=partition(arr, low, up);
        quickSort(arr, low, pivotLocation-1);
        quickSort(arr, pivotLocation+1, up);
    }

    int partition(int arr[],  int low, int up)
    {
        int i=low+1, j=up;
        int pivot=arr[low];

        while(i<=j)
        {
            while((arr[i]<pivot) && (i<up))
                i++;
            while(arr[j]>pivot)
                j--;
            if(i<j)
            {
                int tmp=arr[i];
                arr[j]=arr[j];
                arr[j]=tmp;
                i++;
                j--;
            }else{
                i++;
            }
        }

        arr[low]=arr[j];
        arr[j]=pivot;
        return j;
    }

    public static void main(String[] args) {
        int qs[], ss[];
        //add 50k random numbers to the array
        qs = new int[50000];
        ss = new int[50000];
        for(int i=0; i<50000; i++)
        {
            qs[i] = (int)(Math.random()*100000);
            ss[i] = (int)(Math.random()*100000);
        }
        //sorting the array and comparing the time taken
        Sorts s = new Sorts();
        long startTime = System.currentTimeMillis();
        s.quickSort(qs, 0, qs.length-1);
        long endTime = System.currentTimeMillis();
        System.out.println("Quick Sort: " + (endTime - startTime) + "ms");
        startTime = System.currentTimeMillis();
        s.selectionSort(ss);
        endTime = System.currentTimeMillis();
        System.out.println("Selection Sort: " + (endTime - startTime) + "ms");

    }
}