package JspiderCodes.Programming;
//WAP to remove duplicates in arraylist

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Objects;

public class removeDuplicatesInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0, 10);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(2, 30);
        System.out.println(list);
//        for(int i=0; i<list.size(); i++){
//            for(int j=i+1; j<list.size(); j++){
//                if(list.get(i).equals((list.get(j)))){
//                    list.remove(j);
//                    j--;
//                }
//            }
//        }

        LinkedHashSet<Integer> noDups = new LinkedHashSet<>(list);
        list = new ArrayList<>(noDups);
        System.out.println(list);

    }
}
