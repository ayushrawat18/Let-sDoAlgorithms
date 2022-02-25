package String;

public class VersionCompare {

    public static void main(String args[]) {
        System.out.println(compareVersion("1.0.1", "1"));
    }

    public static int compareVersion(String version1, String version2) {

        //Itr version1 & version2
        String arr1[] = version1.split("\\.");
        String arr2[] = version2.split("\\.");

        int i=0, j=0;

        while(i < arr1.length || j < arr2.length) {

            int subVersion1 = i < arr1.length ? Integer.valueOf(arr1[i]) : 0;
            int subVersion2 = j < arr2.length ? Integer.valueOf(arr2[j]) : 0;


            if(subVersion1 < subVersion2) {
                return -1;
            } else if(subVersion1 > subVersion2) {
                return 1;
            }
            i++;
            j++;
        }
        return 0;
    }
}
