////frequency
package logics.Assignment1;
//
//import java.util.LinkedHashMap;
//
//public class FrequencyOfElements {
//    public static void main(String[] args) {
//        String s = "vaishnavi";
//
//        LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
//        for(char ch:s.toCharArray()){
//            map.put(ch,map.getOrDefault(ch,0)+1);
//        }
//        map.forEach((key,value)->{
////           if(value==1) unique
////           if(value>1) duplicate
//
//            System.out.println(key+"->"+value);
//        });
//
//    }
//}



import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfElements {
    public static void main(String[] args) {
        int[] a={1,2,4,1,3,2};
        Map<Integer,Integer> m= new LinkedHashMap<>();
         for(int x:a){
             m.put(x,m.getOrDefault(x,0)+1);
         }
         m.forEach((key,value)->{
             //if(value==1)
                 System.out.println(key+"->"+value);
         });

//         for(Map.Entry<Integer, Integer> x: m.entrySet()){
//             System.out.println(x.getKey()+"->"+x.getValue());
//         }

    }
}