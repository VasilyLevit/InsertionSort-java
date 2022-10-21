package InsertionSort;
public class sort {
    public void sort(int array[]) {
        for (int left = 0; left < array.length; left++) {
            // Извлекаем значение элемента
            int value = array[left];
            // Перемещаемся по элементам влево от извлеченного элемента
            int i = left - 1;
            for (; i >= 0; i--) {
                // Если извлекли значение меньшее — передвигаем больший элемент дальше
                if (value < array[i]) array[i + 1] = array[i];
                else break;
            }
            // В освободившееся место вставляем извлеченный элемент
            array[i + 1] = value;
        }
    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {12, 16, 13, 17, 22, 19};
        printArray(arr);
        sort object = new sort();
        object.sort(arr);
        System.out.print("Sorted array: ");
        printArray(arr);
    }
}
