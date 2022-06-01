public class CheckDublicate {
    public static void checkDublicate( int arr,int toCheckDublicatevalues) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Dublicate element is present in the array:" + arr[j]);
                }
            }


        }
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1, 3, 6, 7, 8, 1, 3, 1, 3, 1, 7, 7};
        int toCheckDublicatevalues=3;
        checkDublicate(arr, toCheckDublicatevalues);
    }
}


