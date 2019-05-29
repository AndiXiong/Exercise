
import java.util.ArrayList;

public class Exercise2 {
    public static void main(String args[]) {
        test1();
        test2();
        test3();
    }

    /**
     * Given an arraylist of integers, find the length of the longest unimodal sequence.
     * Unimodal is defined as
     * ie. If the list is [1,1], you should return 0
     * ie. If the list is [1,2,1], you should return 3
     * ie. If the list is [1,2,3,4,5,4,3,2,1], you should return 9
     * ie. If the list is [5,4,3,2,1], you should return 0
     * ie. If the list is [1,2,3,2,1,4,5,9,4,3,2,1], you should return 8
     * @return the length of the longest non-descending sub-sequence
     */
    public static int LongestUnimodalSequence(ArrayList<Integer> list) {
        int longest = 0;
        int count, j;

        for(int i = 0; i < list.size(); i++){
            j = 0;
            count = 0;
            while( j < list.size() && list.get(j) < list.get(j + 1)) {
                count++;
                j++;
            }
            while( j < list.size() && list.get(j) > list.get(j + 1)) {
                count++;
                j++;
            }
            if(count > longest){
                longest = count;
            }
        }

        return longest;
    }

    public static void test1() {
        ArrayList<Integer> nums = new ArrayList<>(){{
            add(1);
            add(2);
            add(3);
        }};

        if(LongestUnimodalSequence(nums) == 0)
            System.out.println("Passed test 1");
        else
            System.out.println("Failed test 1");
    }

    public static void test2() {
        ArrayList<Integer> nums = new ArrayList<>(){{
            add(2);
            add(2);
            add(1);
            add(1);
            add(2);
            add(9);
        }};

        if(LongestUnimodalSequence(nums) == 3)
            System.out.println("Passed test 2");
        else
            System.out.println("Failed test 2");
    }

    public static void test3() {
        ArrayList<Integer> nums = new ArrayList<>(){{
            add(9);
            add(8);
            add(7);
            add(6);
            add(5);
            add(4);
        }};

        if(LongestUnimodalSequence(nums) == 0)
            System.out.println("Passed test 3");
        else
            System.out.println("Failed test 3");
    }

    // add more tests of your own choice
}
