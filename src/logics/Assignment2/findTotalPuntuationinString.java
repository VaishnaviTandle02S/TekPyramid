package logics.Assignment2;

public class findTotalPuntuationinString {
    public static void main(String[] args) {
        String str = "Hi ,how are you??";
//
//     int count=0;
//     for(int i=0;i<str.length()-1;i++){
//         char check=str.charAt(i);
//         if(!Character.isLetterOrDigit(check) && !Character.isSpaceChar(check)){
//                count++;
//            }
//     }
//        System.out.println(count);
//        String result=str.replaceAll("[^//p{punct}]","");
        String res = str.replaceAll("[^\\p{Punct}]", "");
        System.out.println(res);
        System.out.println(res.length());
    }
}

//package Strings;
//
//public class CountPunctuations {
//    public static void main(String[] args) {
//        String str = "Hello!!! How are you doing today? I'm fine, thank you.";
//
//        int count = 0;
//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//            if (ch == '!' || ch == ',' || ch == ';' || ch == '.' ||
//                    ch == '?' || ch == '-' || ch == '\'' || ch == '\"') {
//                count++;
//            }
//        }
//
//        System.out.println("Total number of punctuations: " + count);
//    }}




