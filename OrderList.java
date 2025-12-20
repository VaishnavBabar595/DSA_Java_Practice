import java.util.Scanner;

class OrderList {

    int[] arr;
    int n;

    void accept() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of orders: ");
        n = sc.nextInt();

        arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter delivery time for order " + (i + 1) + " (in minutes): ");
            arr[i] = sc.nextInt();
        }
    }

    void display() {
        System.out.println("\nThe order delivery times are:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    void mergeSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }

        int mid = (left + right) / 2;

        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);

        merge(arr, left, mid, right);
    }

    void merge(int[] arr, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];

        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        OrderList obj = new OrderList();

        obj.accept();
        obj.display();

        obj.mergeSort(obj.arr, 0, obj.n - 1);
        System.out.println("\nAfter sorting :- ");
        obj.display();
    }
}

