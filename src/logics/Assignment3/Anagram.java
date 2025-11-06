package logics.Assignment3;

public class Anagram {
    public static void main(String[] args) {
        String s1="cat";
        String s2="acy";
        int len = s1.length();
        //System.out.println(s1.length());

        if(s1.length() != s2.length()){
            System.out.println("Not Anagram");
        }
        else {
            for(int i = 0;i<len;i++){
                char ch=s1.charAt(0);
                s1=s1.replace(ch+"","");
                s2=s2.replace(ch+"","");

            }


          if(s1.length()==0 && s2.length()==0){
              System.out.println("Anagram");
          }
          else System.out.println("Not Anagram");


        }


    }
}
