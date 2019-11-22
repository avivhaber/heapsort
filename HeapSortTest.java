import java.util.Arrays;;

public class HeapSortTest {
    public static void main (String[] args) {
        // Sorting 100M integers takes ~44sec on a macbook pro
        int[]a=HeapSortTest.randomArray(100000000,100000000);
        HeapSort s=new HeapSort(a);
        long start=System.currentTimeMillis();
        s.sort();
        long time=System.currentTimeMillis()-start;
        System.out.printf("time: %dms\nsorted:%b\n",time,isSorted(a));

    }

    static int[] randomArray (int size, int max) {
        int[]a=new int[size];
        for (int i=0;i<size;i++){
            a[i]=(int)(Math.random()*max)+1;
        }
        return a;
    }

    static boolean isSorted(int[] a) {
        for (int i=1;i<a.length;i++) {
            if (a[i]<a[i-1]) return false;
        }
        return true;
    }
}