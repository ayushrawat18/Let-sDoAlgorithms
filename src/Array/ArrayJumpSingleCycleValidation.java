package Array;

public class ArrayJumpSingleCycleValidation {

    public static void main(String args[]) {
        int arr[] = {10, 11, -6, -23, -2, 3, 88, 908, -26};
        boolean isSingleCycleExists = validateSingleCycleCheck(arr);
        System.out.println(isSingleCycleExists);
    }

    private static boolean validateSingleCycleCheck(int[] arr) {
        int isVisited[] = new int[arr.length];
        int noOfElementsVisited = 0;
        int startingIdx = 0;
        boolean isCyclic = false;

        while (noOfElementsVisited < arr.length) {
            if (isVisited[startingIdx] != 0)
                return false;
            else {
                isVisited[startingIdx] = 1;
                startingIdx = getNextIdx(startingIdx, arr);
                noOfElementsVisited ++;
            }
        }

        if (startingIdx == 0)
            isCyclic = true;

        return isCyclic;
    }

    private static int getNextIdx(int startingIdx, int[] arr) {
        int jump = arr[startingIdx];
        int next = (startingIdx + jump)%arr.length;

        return next >=0 ? next : next + arr.length;

    }
}
