package SearichingAndSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingList {

    private static Comparator<List<Integer>> cmp = new Comparator<List<Integer>>() {
        @Override
        public int compare(List<Integer> o1, List<Integer> o2) {
            return o1.get(1) - o2.get(1);
        }
    };

    public static void sortListOfList() {
        List<List<Integer>> mainList = new ArrayList<List<Integer>>();

        List<Integer> list1 = new ArrayList();
        list1.add(45);
        list1.add(10);

        List<Integer> list2 = new ArrayList();
        list2.add(45);
        list2.add(9);
        List<Integer> list3 = new ArrayList();
        list3.add(45);
        list3.add(8);
        List<Integer> list4 = new ArrayList();
        list4.add(45);
        list4.add(3);
        List<Integer> list5 = new ArrayList();
        list5.add(45);
        list5.add(1);
        List<Integer> list6 = new ArrayList();
        list6.add(45);
        list6.add(33);

        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);
        mainList.add(list4);
        mainList.add(list5);
        mainList.add(list6);

        Collections.sort(mainList, cmp);

        for(List<Integer> le : mainList) {
            System.out.println(le.get(1));
        }

    }
}
