import java.util.Random;

class Solution {

    private int[] original;
    private int[] array;
    private Random rand;

    public Solution(int[] nums) {
        rand = new Random();
        original = nums.clone();   
        array = nums.clone();      
    }

    public int[] reset() {
        array = original.clone();
        return array;
    }

    public int[] shuffle() {
        for (int i = 0; i < array.length; i++) {
            int j = i + rand.nextInt(array.length - i);
            swap(array, i, j);
        }
        return array;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
