import java.util.Arrays;

public class Array2dUtility {

    // Declare all methods as static.

    // 1. print
    // Implement a method called print that prints out the values of a 2D array of integers row by row.

    public static void print(int[][] myArray) {

        for (int i = 0; i < myArray.length; i++) {

            for (int k = 0; k < myArray[i].length; k++) {

                System.out.println(myArray[i][k] + "");

            }

            System.out.println();
        }

    }
    // 2. sum
    // Implement a method called sum that returns the sum of a 2D array of integers

    public static int sum(int[][] myArray) {

        int sum = 0;

        for (int i = 0; i < myArray.length;i ++) {

            for (int k = 0; k < myArray[i].length; k++) {

                sum += myArray[i][k];
            }
        }
        return sum;
    }
    // 3. average
    // Implement a method called average that returns the average value of a 2D array of integers.
    // You may assume that the 2D array is a square. That is, it has the same number of rows and columns.
    // Reminder: call your sum method within the average method.

    public static double average(int[][] myArray) {

        return (double) sum(myArray)/(myArray.length*myArray[0].length);

    }
    // 4. minimum
    // Implement a method called minimum that returns the minimum value of a 2D array of integers.
    public static int minimum(int[][] myArray) {

        int minValue = myArray[0][0];
        for (int i = 0; i < myArray.length;i ++) {

            for (int k = 0; k < myArray[i].length; k++) {

                if (myArray[i][k] < minValue) {

                    minValue = myArray[i][k];

                }
            }
        }
        return minValue;

    }
    // 5. maximum
    // Implement a method called maximum that returns the maximum value of a 2D array of integers.

    public static int maximum(int[][] myArray) {

        int maxValue = myArray[0][0];
        for (int i = 0; i < myArray.length;i ++) {

            for (int k = 0; k < myArray[i].length; k++) {

                if (myArray[i][k] > maxValue) {

                    maxValue = myArray[i][k];

                }
            }
        }
        return maxValue;
    }

    // 6. evenCountStandard
    // Implement a method called evenCountStandard that returns the number of even numbers in a 2D array of integers.
    // Use a standard for loop to implement this method.

    public static int evenCountStandard(int[][] array) {

        int count = 0;

        for (int i = 0; i < array.length;i ++) {

            for (int k = 0; k < array[i].length; k++) {

                if (array[i][k] % 2 == 0) {

                    count++;

                }
            }
        }

        return count;

    }
    // 7. evenCountEnhanced
    // Implement a method called evenCountEnhanced that returns the number of even numbers in a 2D array of integers.
    // Use an enhanced for loop to implement this method.

    public static int evenCountEnhanced(int[][] array) {

        int count = 0;

        for (int[] row: array) {

            for (int col: row) {

                if (col % 2 == 0) {

                    count++;

                }
            }
        }

        return count;

    }
    // 8. allPositive
    // Implement a method called allPositive that returns true if all the values in a 2D array of integers are positive.

    public static boolean allPositive(int[][] array) {

        for (int i = 0; i < array.length;i ++) {

            for (int k = 0; k < array[i].length; k++) {

                if (array[i][k] < 0) {

                    return false;

                }
            }
        }

        return true;

    }
    // 9. rowSums
    // Implement a method called rowSums that returns a one dimensional array that contains the sum of each row at each index.

    public static int[] rowSums(int[][] myArray) {

        int[] newArray = new int[myArray.length];

        for (int i = 0; i < myArray.length; i++) {

            int sum = 0;

            for (int k = 0; k < myArray[i].length; k++) {

                sum += myArray[i][k];
            }
            newArray[i] = sum;
        }

        return newArray;
    }
    // 10. colSums
    // Implement a method called colSums that returns a one dimensional array that contains the sum of each col at each index.

    public static int[] colSums(int[][] myArray) {


        int[] newArray = new int[myArray.length];

        for (int i = 0; i < myArray.length; i++) {

            int sum = 0;

            for (int k = 0; k < myArray[i].length; k++) {

                sum += myArray[k][i];

            }
            newArray[i] = sum;
        }

        return newArray;

    }
}
