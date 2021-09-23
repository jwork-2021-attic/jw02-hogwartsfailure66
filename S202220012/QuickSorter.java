package S202220012;

public class QuickSorter implements Sorter {

    private int[] a;
    private String plan = "";

    @Override
    public void load(int[] a) {
        this.a = a;
    }

    private void swap(int i, int j) {
        int temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
//        plan += "" + a[i] + "<->" + a[j] + "\n";
        plan += "" + i + "<->" + j + "\n";
    }

    @Override
    public void sort() {
        quickSort(0, a.length - 1);
//        for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i]);
//        }
//        System.out.println();
    }

    public void quickSort(int l, int r) {
//        System.out.println("quicksort");
        if (l >= r) return;
        int i = l;
        int j = r;
        int pivot = a[l];
        while (i < j) {
            while (a[j] >= pivot && i < j) {
                j--;
            }
            while (a[i] <= pivot && i < j) {
                i++;
            }
            if (i < j) {
//                System.out.println("swap" + i + j);
                swap(i, j);
            }
        }
        if (i != l) {
            swap(i, l);
        }
//        a[l] = a[i];
//        a[i] = pivot;
        quickSort(l, i - 1);
        quickSort(i + 1, r);
    }

    @Override
    public String getPlan() {
        return this.plan;
    }
}
