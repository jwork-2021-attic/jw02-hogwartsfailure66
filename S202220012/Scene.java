package S202220012;

import S202220012.BubbleSorter;
import S202220012.Geezer;
import S202220012.Sorter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Scene {

    public static void main(String[] args) throws IOException {

        int size = 256;
//        Line line = new Line(size);
        Matrix line = new Matrix(size);
        int nums[] = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = i;
        }
        RandomSort randomSort = new RandomSort();
        randomSort.random(nums, 256, size);
        for (int i = 0; i < size; i++) {
            Gourd gourd = new Gourd(i);
            line.put(gourd, nums[i]);
        }

        Geezer theGeezer = Geezer.getTheGeezer();

//        Sorter sorter = new BubbleSorter();
        Sorter sorter = new QuickSorter();

        theGeezer.setSorter(sorter);

        String log = theGeezer.lineUp(line);

        BufferedWriter writer;
        writer = new BufferedWriter(new FileWriter("result.txt"));
        writer.write(log);
        writer.flush();
        writer.close();

//        QuickSorter quickSorter = new QuickSorter();
//        int[] a = {
//            6,1,2,3,4,5,0
//        } ;
//        quickSorter.load(a);
//        quickSorter.sort();

    }

}
