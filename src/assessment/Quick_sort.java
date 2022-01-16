package assessment;

class Quick_sort
{
   
    int partition(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        { 
            if (arr[j] <= pivot)
            {
                i++;

                // swap1
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

     //swap2
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }



    void sort(int arr[], int low, int high)
    {
        if (low < high)
        {

            int pi = partition(arr, low, high);

            
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }


    public static void main(String args[])
    {
        int arr[] = {19, 7, 8, 7, 10, 5};
        int n = arr.length;

        Quick_sort ob = new Quick_sort();
        ob.sort(arr, 0, n-1);

        System.out.println("sorted array");
        printArray(arr);
    }
}
