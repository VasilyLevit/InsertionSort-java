package InsertionSort;
public class sort {
    void sort(int array[]) {
        for (int i = 1; i < array.length; ++i) {
            int keyValue = array[i];
            // Перемещаемся по элементам влево от извлеченного элемента
            int j = i - 1;
            while (j >= 0 && keyValue < array[j]) {
                // Заменяем ячейку ключевого элемента большим (левым) элементом
                array[j + 1] = array[j];
                j -= 1;
            }
            // В освободившееся место вставляем извлеченный элемент
            array[j + 1] = keyValue;
        }
    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {22, 16, 13, 17, 12, 19};
        printArray(arr);
        sort object = new sort();
        object.sort(arr);
        System.out.print("Sorted array: ");
        printArray(arr);
    }
}
