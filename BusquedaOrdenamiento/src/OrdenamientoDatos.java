import java.util.Random;

public class OrdenamientoDatos {
    int[] dataArr;
    int[] bubbleArr;
    int[] insertionArr;

    public void fillDataArr() {
        Random rand = new Random();
        for (int i = 0; i < dataArr.length; i++) {
            dataArr[i] = rand.nextInt(10000);
        }
    }

    public void bubbleSort() {
        bubbleArr = dataArr.clone();
        int n = bubbleArr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (bubbleArr[j] > bubbleArr[j+1]) {
                    int temp = bubbleArr[j];
                    bubbleArr[j] = bubbleArr[j+1];
                    bubbleArr[j+1] = temp;
                }
            }
        }
    }

    public void insertionSort() {
        insertionArr = dataArr.clone();
        int n = insertionArr.length;
        for (int i = 1; i < n; ++i) {
            int key = insertionArr[i];
            int j = i - 1;

            while (j >= 0 && insertionArr[j] > key) {
                insertionArr[j + 1] = insertionArr[j];
                j = j - 1;
            }
            insertionArr[j + 1] = key;
        }
    }

    public int[] getBubbleArr() {
        return bubbleArr;
    }

    public int[] getInsertionArr() {
        return insertionArr;
    }

    public int[] getDataArr() {
        return dataArr;
    }

    public void fillDataArrWithNumData(int numData) {
        dataArr = new int[numData];
        Random rand = new Random();
        for (int i = 0; i < numData; i++) {
            dataArr[i] = rand.nextInt(10000);
        }
    }
}
