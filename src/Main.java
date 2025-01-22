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

        summate(intArr);
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

    public static void summate(String[] a) {
        
    }
}