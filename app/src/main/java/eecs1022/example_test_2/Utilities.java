package eecs1022.example_test_2;

public class Utilities {
    /*
        Given an array of integers, calculate the average of its elements.
        You can assume that the array is not empty and contains at least 1 one element.
     */
    double averageOf(int[] ia) {
        /*
            Your Task: Implement the body of this method,
            so that its return value matches what's expected from
            executing the UtilitiesTester.
         */
        int sum = 0;
        for (int i = 0; i < ia.length; i++) {
            sum += ia[i];
        }
        return sum/ia.length;
    }

    /*
        Given an integer array ia, determine whether or not
        all elements are multiples of 5.
     */
    boolean allMultiplesOf5(int[] ia) {
        /*
            Your Task: Implement the body of this method,
            so that its return value matches what's expected from
            executing the UtilitiesTester.
         */
        for (int i = 0; i < ia.length; i++) {
            if (ia[i] % 5 != 0) {
                return false;
            }
        }
        return true;
    }

    /*
        Given an integer array ia, determine whether or not
        at lease one element is multiple of 5.
     */
    boolean atLeastOneMultipleOf5(int[] ia) {
        /*
            Your Task: Implement the body of this method,
            so that its return value matches what's expected from
            executing the UtilitiesTester.
         */
        for (int i = 0; i < ia.length; i++) {
            if (ia[i] % 5 == 0) {
                return true;
            }
        }
        return false;
    }

    /*
        Given an array of integers, find out the second maximum element.
        The input array may contain duplicates.
        You can assume that integer array ia contains at least two elements.
        Your are forbidden to use any library class, e.g., Arrays.sort.
     */
    int secondMaximumOf(int[] ia) {
        /*
            Your Task: Implement the body of this method,
            so that its return value matches what's expected from
            executing the UtilitiesTester.
         */
        int a = 0, b = 0;
        for (int i = 0; i < ia.length; i++) {
            if (a <= ia[i]) {
                b = a;
                a = ia[i];
            }
        }
        return b;
    }

    /*
        Given an array of integers, return its reverse.
        Your are forbidden to use any library class, e.g., Arrays.sort.
     */
    int[] reverseOf(int[] ia) {
        /*
            Your Task: Implement the body of this method,
            so that its return value matches what's expected from
            executing the UtilitiesTester.
         */
        int[] ret = new int[ia.length];
        for (int i = ia.length - 1; i >= 0; i--) {
            ret[ia.length - i - 1] = ia[i];
        }
        return ret;
    }

    /*
        Given two arrays of integers, determine whether or not
        one is exactly the reverse of the other.
        Your are forbidden to use any library class, e.g., Arrays.sort.
     */
    boolean isReverseOfEachOther(int[] ia1, int[] ia2) {
        /*
            Your Task: Implement the body of this method,
            so that its return value matches what's expected from
            executing the UtilitiesTester.
         */
        for (int i = ia1.length - 1; i >= 0; i--) {
            if (ia1[i] != ia2[ia1.length - i - 1]) {
                return false;
            }
        }
        return true;
    }

    /*
        Return the first n elements in an arithmetic sequence whose
        start term is start and common difference is diff.
     */
    int[] getArithSeq(int start, int diff, int n) {
        /*
            Your Task: Implement the body of this method,
            so that its return value matches what's expected from
            executing the UtilitiesTester.
         */
        int[] seq = new int[n];
        for (int i = 0; i < n; i++) {
            seq[i] = start + diff * i;
        }
        return seq;
    }

    /*
        Given an integer array, determine if it's an arithmetic sequence,
        i.e., there's a common different between every two consecutive elements.
     */
    boolean isArithSeq(int[] ia) {
        /*
            Your Task: Implement the body of this method,
            so that its return value matches what's expected from
            executing the UtilitiesTester.
         */
        if (ia.length < 2) return true;
        int gap = ia[1] - ia[0];
        for (int i=0;i<ia.length-1;i++) {
            if (ia[i + 1] - ia[i] != gap) {
                return false;
            }
        }
        return true;
    }

    /*
        Return the first i items in a Fibonacci sequence.
        A Fibonacci sequence is:
        1, 1, 2, 3, 5, 8, 13, 21, ...
        where the 1st and 2nd elements are always 1, and
        starting from the third element, the value of an element
        is the sum of its previous two neighbouring elements.
        For example, 2 == 1 + 1, 3 == 2 + 1, 5 == 3 + 2, 8 == 5 + 3, and etc.
        You can assume that the input i >= 0.
     */
    int[] getFibSeq(int i) {
        /*
            Your Task: Implement the body of this method,
            so that its return value matches what's expected from
            executing the UtilitiesTester.
         */
        int[] ret = new int[i];
        if (i > 0) ret[0] = 1;
        if (i > 1) ret[1] = 1;
        for (int a = 2; a < i; a++) {
            ret[a] = ret[a - 1] + ret[a - 2];
        }
        return ret;
    }

    /*
        Determine whether or not an integer array ia contains
        the first ia.length elements in a Fibonacci sequence.
        Remember that ia.length >= 0
     */
    boolean isFibSeq(int[] ia) {
        /*
            Your Task: Implement the body of this method,
            so that its return value matches what's expected from
            executing the UtilitiesTester.
         */
        if (ia.length >= 1 && ia[0] != 1) return false;
        if (ia.length >= 2 && ia[1] != 1) return false;
        for (int i = 2; i < ia.length; i++) {
            if (ia[i] != ia[i - 1] + ia[i - 2]) {
                return false;
            }
        }
        return true;
    }

    /*
        Count the number of occurrences of string s in string array sa.
     */
    int numberOfOccurrences(String[] sa, String s) {
        /*
            Your Task: Implement the body of this method,
            so that its return value matches what's expected from
            executing the UtilitiesTester.
         */
        int count = 0;
        for (int i = 0; i < sa.length; i++) {
            if (sa[i].equals(s)) {
                count++;
            }
        }
        return count;
    }

    /*
        Return an array storing the indices of string s in string array sa.
        If s does not occur in sa, then the returned array should be EMPTY.
        Length of the returned array should correspond to the number of times
        string s occurs in string array sa.
     */
    int[] getIndices(String[] sa, String s) {
        /*
            Your Task: Implement the body of this method,
            so that its return value matches what's expected from
            executing the UtilitiesTester.
         */
        int[] ret = new int[this.numberOfOccurrences(sa, s)];
        int pos = 0;
        for (int i = 0; i<sa.length;i++) {
            if (sa[i].equals(s)) {
                ret[pos] = i;
                pos ++;
            }
        }
        return ret;
    }
}
