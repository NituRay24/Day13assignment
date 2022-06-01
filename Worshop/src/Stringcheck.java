public class Stringcheck {
        private static boolean isSubstring(String s, String seq)
        {
            return s.contains(seq);
        }

        public static void main(String[] args) {
            String s = "Saturday";
            String seq = "Sat";

            System.out.println(isSubstring(s, seq)? "Yes": "No");        // Yes
        }
    }

}
