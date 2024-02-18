public class revstr {
    public static void main(String[] args) {
        String str = "abba";
        String rstr = "";
        char ch;
        for(int i = 0;i<str.length();i++){
            ch = str.charAt(i);
            rstr =  ch + rstr;
        }
         if(str.equals(rstr)) {
            System.out.println("Palindrome string");
         } 
         else {
            System.out.println("Not a Palindrome string");
        }
          System.out.print(rstr);
    }
}


