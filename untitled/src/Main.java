// palindromik kelimeler bulan program örn;abba,asa
        public class Main {
            static boolean isPalindrome(String str){
                int i=0;
                int j=str.length()-1;// index numarası odan başlar.
                while (i<j){
                    if ( str.charAt(i)!=str.charAt(j)){
                        return false;
                    }
                    i++;
                    j--;
                }
                return true;
            }

            public static void main(String[] args) {
                System.out.println(isPalindrome("abba"));
                System.out.println(isPalindrome("kavak" ));



            }
        }
