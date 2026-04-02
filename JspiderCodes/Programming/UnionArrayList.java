package JspiderCodes.Programming;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class UnionArrayList {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        list1.add("virat");
        list1.add("rahul");
        list1.add("pandya");
        list1.add("dhoni");

        list2.add("rohit");
        list2.add("rahul");
        list2.add("rishab");
        list2.add("dhoni");
        list2.add("yuvi");
        System.out.println(list1);
        System.out.println(list2);

        LinkedHashSet res = new LinkedHashSet(list1);
        for (String str : list2) {
            res.add(str);
        }
        System.out.println(res);
        ArrayList<String> listResult = new ArrayList<String>();
        for (int i = 0; i < list1.size(); i++) {
            for (int j = i + 1; j < list1.size(); j++) {
                if (list1.get(i).equals(list1.get(j))) {
                    list1.remove(j);
                    j--;
                }

            }
            System.out.println(i + " " + listResult);
        }
        for (int i = 0; i < list2.size(); i++) {
            for (int j = i + 1; j < listResult.size(); j++) {
                if (!listResult.get(j).equals(list2.get(i))) {
                    listResult.add(list2.get(i));
                }
            }
            System.out.println(i + " " + listResult);

        }
        System.out.println(listResult);


    }
}
