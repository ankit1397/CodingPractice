public class MergeTwoSortedIntoSingleSortedArray {
    static void merge(int arr1[], int arr2[], int n, int m) {
        int len = n + m, temp;
        int[] a = new int[len];

        for (int i = 0; i < n; i++) {
            a[i] = arr1[i];
        }

        for (int i = 0; i < m; i++) {
            a[i + n] = arr2[i];
        }

        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            arr1[i] = a[i];
        }

        for (int i = 0; i < m; i++) {
            arr2[i] = a[i + n];
        }

        System.out.println("arr1");
        for(int num : arr1){
            System.out.print(num+" ");
        }
        System.out.println("\narr2");
        for(int num : arr2){
            System.out.print(num+" ");
        }
    }

    // Driver code
    public static void main(String args[]) {
        int n=4, m=5;
        int[] arr1 = new int[]{1,3,5,7};
        int[] arr2 = new int[]{0,2,6,8,9};
        merge(arr1,arr2,n,m);
    }
}
