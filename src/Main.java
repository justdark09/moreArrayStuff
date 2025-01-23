public class Main
{
    public static void main(String[] args)
    {
        int[] intArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        String[] param = {"Hi", "Example", "Laughter", "Lobster", "Otters like to swim! No they don't!"};


        System.out.println("Start to Finish:");
        for (int i : intArr) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("\nFinish to Start:");
        for (int i = intArr.length-1; i >= 0; i--) {
            System.out.print(intArr[i] + " ");
        }

        System.out.println();
        System.out.println("\nPrint First Letter of each String in String Array:");
        printFirst(param);

        System.out.println();
        System.out.println("\nPrint Last Letter of each String in String Array:");
        printLast(param);

        System.out.println();
        System.out.println("\nSummation of Numbers from an Array (in this case 1-10):");
        System.out.print(summate(intArr));

        System.out.println();
        System.out.println("\nDetermine the second largest element in an array of integers:");
        secondLarge(intArr);

        System.out.println();
        System.out.println("Create a method that returns an array but reversed:");
        for (int s : reverseArr(intArr)) {
            System.out.print(s + " ");
        }

        System.out.println();
        System.out.println("\nCreate a method that returns the sum of the two largest elements:");
        System.out.print(sumOfLargest(intArr));
    }

    public static void printFirst(String[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i].charAt(0) + " ");
        }
    }

    public static void printLast(String[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i].charAt(a[i].length()-1) + " ");
        }
    }

    public static int summate(int[] a) {
        int b = 0;
        for (int i = 0; i < a.length; i++) {
            b += a[i];
        }
        return b;
    }

    public static void secondLarge(int[] a) {
        int current = a[0];
        int max = 0;

        for (int i = 0; i < a.length; i++) {
            //gets max number in array
            if (max < a[i]) {
                max = a[i];
                current = i;
            }
        }
        max = 0;
        for (int i = 0; i < a.length; i++) {
            if (max != a[current] && i != current) {
                max = a[i];
            }
        }


        System.out.println(max);
    }

    public static int[] reverseArr(int[] a) {
        int[] arr = new int[a.length];

        for (int i = a.length-1, j = 0; i >= 0; i--, j++) {
            arr[j] = a[i];
        }

        return arr;
    }

    public static int sumOfLargest(int[] a) {

        int current = a[0];
        int largest = 0;
        for (int i = 0; i < a.length; i++) {
            //gets max number in array
            if (largest < a[i]) {
                largest = a[i];
                current = i;
            }
        }
        a[current] = 0;
        int second = 0;
        for (int i = 0; i < a.length; i++) {
            if (second < a[i]) {
                second = a[i];
                current = i;
            }
        }
        second = a[current];
        // resets array to default
        a[current] = 10;

        return second + largest;
    }
}