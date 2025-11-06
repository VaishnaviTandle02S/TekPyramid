package logics.Assignment3;

public class All_Subsets {
    public static void main(String[] args) {
        String s ="fun";
        int len = s.length();
        for(int i=0; i < len; i++){
            for(int j = 0; j < len-i; j++){
                System.out.print(s.substring(i+j,len)+" ");
            }
            System.out.println();

        }
    }
}
