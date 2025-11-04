package logics.Assignment1;

import java.util.ArrayList;
import java.util.Arrays;

//public class RightRotate2Element {
//    public static void main(String[] args) {
//        int[] n = {1,2,3,4,5};
//        int num = 2;
//        for(int i = 0; i < num; i++) {
//            int last = n[n.length-1];
//            for (int j = n.length-1; j > 0; j--) {
//                n[j] = n[j-1];
//            }
//            n[0] = last;
//        }
//        System.out.println(Arrays.toString(n));
//    }
//}
public class RightRotate2Element {
    public static void main(String[] args) {
        int[] n ={1,2,3,4,5};
        ArrayList list = new ArrayList();
        for(int i : n){
            list.add(i);
            System.out.println(i);
        }
        for(int i = 0; i < 2; i++){
            Object last=list.get(list.size()-1); //fetching 0th index value from list
            list.remove(list.size()-1);
            list.add(0,last);
        }
        System.out.println(list);
    }
}



