package logics.Assignment2;
public class Find_TotalPuntuationinString {
    public static void main(String[] args){
        String str="Hi ,how are you??";

        int count=0;
        for(int i=0;i<str.length()-1;i++){
            char check=str.charAt(i);
            if(!Character.isLetterOrDigit(check) && !Character.isSpaceChar(check)){
                count++;
            }
        }
        System.out.println(count);
    }
}

