package Practice;

public class QuickSort {
    public static void quickSort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }


    private static void sort(int[] arr, int low, int high) {
        // low가
        if (low >= high) return;

        int mid = partition(arr, low, high);
        sort(arr, low, mid - 1);
        sort(arr, mid, high);
    }

    /*
    매개변수로 정수형 배열과 피봇 설정을 위한 정수형을 받고,
    반환 타입으로 정수를 리턴하는 함수를 만듬
    * */
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[(low + high) / 2]; //피봇은 배열의 중간 위치로 한다

        while (low <= high) {
            while (arr[low] < pivot) low++;
            while (arr[high] > pivot) high--;
            if (low <= high) {
                swap(arr, low, high);
                low++;
                high--;
            }
        }
        return low;
    }
    
    // 값 교환을 위한 메소드
    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
    public static void main(String[] args) {
        int[] arr = {8,6,1,5,4,3,2,9};
        quickSort(arr);
    }
}
