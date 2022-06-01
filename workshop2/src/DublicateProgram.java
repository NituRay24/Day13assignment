public class DublicateProgram {

    public static void dublicateElementCheck(int arr[]) {



        for (int i = 0; i < arr.length; i++) {
            for (int  j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                {
                    System.out.println("Dublicate element is present in the array:" + arr[j]);
                }
            }
        }


    }

    public static void main(String[] arg) {
        int arr[] = new int[]{1, 3, 6, 7, 8, 1, 3, 1, 3, 1, 7, 7};
        int toCheckValue = 3;
        // System.out.println("Numbers is" +arr[i]);

        dublicateElementCheck(arr);

    }

}
