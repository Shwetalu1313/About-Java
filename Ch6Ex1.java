public class Ch6Ex1 {
    public static void main(String[] args) {
        int[] nums = {70, 35, 100, 40, 80, 90, 50, 70, 45, 28};
        System.out.println();

        //display
        Displayarr(nums);

        //sum
        System.out.println("Summation of Elements: " + SumArr(nums));

        //average
        System.out.println("Average value of this array: " + AverageArr(nums));

        //search specific number
        searchArr(nums, 70);

    }

    public static void Displayarr(int[] arrs) {
        System.out.print("Arrays Elements => ");
        for (int i : arrs) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int SumArr(int[] arrs) {
        int sum = 0;
        for (int i : arrs) {
            sum += i;
        }
        return sum;
    }

    public static double AverageArr(int[] arrs) {
        double result = SumArr(arrs) / arrs.length;
        return result;
    }

    public static void searchArr(int[] arrs, int value) {
        int i;
        boolean con;
        for (i = 0; i < arrs.length; i++) {
            if (i < arrs.length) {
                con = true;
            } else {
                con = false;
                System.out.println("The specific value \'"+value+"\' was not found in the array.");
            }

            while (con) {
                if (arrs[i] == value) {
                    System.out.println("We found the specific value\'"+value+"\' at index " + i + " => " + arrs[i]);
                }
                con = false;
            }
        }
    }
}
            /*
            if (arrs[i] == value) {
                break;
            }
        }
        if (i < arrs.length) {
            System.out.println("We found the specific value at index " + i +" => "+arrs[i]);
        } else {
            System.out.println("The specific value was not found in the array.");
        }*/


