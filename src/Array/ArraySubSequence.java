package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraySubSequence {

    /**
     * array [5, 1, 22, 25, 6, -1, 8, 10]
     * subseq : [1, 6, -1, 10]
     * return : true
     * @param args
     */
    public static void main (String args[]) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(1);
        list.add(22);
        list.add(25);
        list.add(6);
        list.add(-1);

        List<Integer> subList = new ArrayList<>();
        subList.add(22);
        subList.add(25);
        subList.add(-1);

        boolean isSeq = isSubSequence(list, subList);
        System.out.println(isSeq);

    }


    public static boolean isSubSequence(List<Integer> list, List<Integer> sublist) {

        int subSeqIndex = 0;
        for (int i=0; i<list.size(); i++) {
            if (list.get(i) == sublist.get(subSeqIndex)) {
                subSeqIndex ++;
            }

            if (subSeqIndex == sublist.size())
                break;
        }

        return subSeqIndex == sublist.size();
    }


}
