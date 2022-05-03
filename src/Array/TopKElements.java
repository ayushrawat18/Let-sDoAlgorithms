package Array;

import commons.Commons;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class TopKElements {
    public static void main(String args[]) {
        int arr[] = {1,2,2,2,2,2,5,5,5,5};
        findTopKElements(arr, 2);
    }


    //Space : O(n)
    //Time : O(nLog(n))
    private static int[] findTopKElements(int[] arr, int k) {

        Map<Integer, Integer> elements = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            elements.put(arr[i], elements.getOrDefault(arr[i],0)+1);
        }

        Pair[] elementsOcc = new Pair[elements.size()];

        int idx = 0;
        for (Integer key : elements.keySet()) {
            elementsOcc[idx++] = new Pair(key, elements.get(key));
        }

        Arrays.sort(elementsOcc, new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                if (o1.occurence == o2.occurence)
                    return 0;
                else if (o1.occurence > o2.occurence)
                    return 1;
                else
                    return -1;
            }
        });

        int answer[] = new int[k];
        for (int i = 0; i < k; i++) {
            answer[i] = elementsOcc[elementsOcc.length-1-i].num;
        }

        Commons.printArray(answer);
        return answer;
    }
}


class Pair {
    int num;
    int occurence;

    public Pair(int num, int occurence) {
        this.num = num;
        this.occurence = occurence;
    }
}

