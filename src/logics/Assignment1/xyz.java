package logics.Assignment1;

import java.util.LinkedHashMap;

public class xyz {
    public static void main(String[] args) {
        String s = "vaishnavi";
        LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        map.forEach((key,value)->{
//           if(value==1) unique
//           if(value>1) duplicate

            System.out.println(key+"->"+value);
        });

    }
}
