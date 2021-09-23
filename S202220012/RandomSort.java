package S202220012;

import java.util.Random;

public class RandomSort {
    public void swap(int nums[], int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    public void random(int nums[], int times, int size) {
        for (int i = 0; i < times; i++) {
            Random random = new Random();
            int k = random.nextInt(1000) % size;
            int j = random.nextInt(1000) % size;
            swap(nums, k, j);
        }
    }
}
