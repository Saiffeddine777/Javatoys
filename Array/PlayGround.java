package Array;

public class PlayGround {

    public static class Vehicule {
        public void honk() {
            System.out.println("Honk Honk");
        }
    }

    public static class Car extends Vehicule {
        public Car() {

        }
    }

    public int countEvens(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    public boolean only14(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 1 && nums[i] != 4) {
                return false;
            }
        }
        return true;
    }

    public int[] fizzArray3(int start, int end) {
        if (start < end) {
            int[] arr = new int[end - start];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = start;
                start++;
                if (start == end) {
                    break;
                }
            }
            return arr;
        }
        return new int[] {};
    }

    public String[] fizzBuzz(int start, int end) {
        if (end > start) {
            String[] arr = new String[end - start];
            for (int i = 0; i < arr.length && end > start; i++) {
                if (start % 3 == 0 && start % 5 == 0) {
                    arr[i] = "FizzBuzz";
                } else if (start % 3 == 0) {
                    arr[i] = "Fizz";
                } else if (start % 5 == 0) {
                    arr[i] = "Buzz";
                } else {
                    arr[i] = String.valueOf(start);
                }
                start++;
            }
            return arr;
        }

        return new String[] {};
    }

    public int[] evenOdd(int[] nums) {
        int[] newArr = new int[nums.length];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 1) {
                newArr[index] = nums[i];
            }
            index++;
        }

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] % 2 == 0) {
                newArr[index] = nums[j];
            }
            index++;
        }

        return newArr;
    }

    public static void main(String[] args) {
        System.out.println(new PlayGround().only14(new int[] { 1, 4, 1, 4 }));
    }

}