package Must_Practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListtoSetandVice {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(1);
        System.out.print(list + " ");
        System.out.println();
        Set<Integer> set = new HashSet<>(list);

        System.out.print(set + " ");
        System.out.println();
        List<Integer> Newlist = new ArrayList<>(set);
        System.out.print(Newlist + " ");

    }
}
