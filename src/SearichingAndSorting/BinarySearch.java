package SearichingAndSorting;

public class BinarySearch {

    public static boolean binarySearch(int[] in, int s, int f, int r) {
        System.out.println("checking between: " + in[s] + " and " + in[f]);
        int midI = getMiddleIndex(s, f);

        System.out.println("middle value:" + in[midI]);
        if(in[midI] == r) {
            System.out.println("found the number: " + in[midI]);
            return true;
        } else if( r < in[midI] ) {
            System.out.println("the number is smaller, use left half of array");
            return binarySearch(in, s, midI - 1, r);
        } else {
            System.out.println("the number is bigger, use right half of array");
            return binarySearch(in, midI + 1, f, r);
        }

    }

    private static int getMiddleIndex(int sIndex, int eIndex) {

        //get the size of the interval inclusive
        int size = eIndex - sIndex + 1;
        int middleIncrement = 0;

        if( isEven(size) ) {
            middleIncrement = size/2 - 1;
        } else {
            middleIncrement = size/2;
        }

        return sIndex + (middleIncrement);
    }

    private static boolean isEven(int size) {
        return size%2 == 0;
    }
}
