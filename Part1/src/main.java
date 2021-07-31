import java.util.NavigableSet;

public class main {

    public static void main(String[] argv)
    {
        try{
            System.out.println("*******************************");
            System.out.println("*** NavigableSetWithAVLTree ***");
            System.out.println("*******************************");

            System.out.println("--- Create NavigableSetWithAVLTree ---");
            NavigableSet<Integer> ns = new NavigableSetWithAVLTree<>();
            System.out.println(ns.toString());

            System.out.println("******************************************");
            System.out.println("Before adding the '0' to the set");
            System.out.println(ns.toString());
            ns.add(0);
            System.out.println("After adding the '0' to the set");
            System.out.println(ns.toString());

            System.out.println("******************************************");
            System.out.println("After adding some items: 1, 5, 6, 2, 3 ,4 ,10, 13, 45");
            ns.add(1);
            ns.add(5);
            ns.add(6);
            ns.add(2);
            ns.add(3);
            ns.add(4);
            ns.add(10);
            ns.add(13);
            ns.add(45);
            System.out.println(ns.toString());

            System.out.println("******************************************");
            System.out.println("Before adding the '1' to the set");
            System.out.println(ns.toString());
            ns.add(1);
            System.out.println("After adding the '1' to the set");
            System.out.println(ns.toString());

            System.out.println("******************************************");
            System.out.println("-> headSet(3, true)");
            System.out.println(ns.headSet(3, true));
            System.out.println("------------------------------------------");
            System.out.println("-> headSet(3, false)");
            System.out.println(ns.headSet(3, false));
            System.out.println("------------------------------------------");
            System.out.println("-> headSet(120, true)");
            System.out.println(ns.headSet(120, true));
            System.out.println("------------------------------------------");
            System.out.println("-> headSet(120, false)");
            System.out.println(ns.headSet(120, false));
            System.out.println("------------------------------------------");
            System.out.println("-> headSet(-5, true)");
            System.out.println(ns.headSet(-5, true));
            System.out.println("------------------------------------------");
            System.out.println("-> headSet(-5, false)");
            System.out.println(ns.headSet(-5, false));

            System.out.println("******************************************");
            System.out.println("-> tailSet(3, true)");
            System.out.println(ns.tailSet(3, true));
            System.out.println("------------------------------------------");
            System.out.println("-> tailSet(3, false)");
            System.out.println(ns.tailSet(3, false));
            System.out.println("------------------------------------------");
            System.out.println("-> tailSet(120, true)");
            System.out.println(ns.tailSet(120, true));
            System.out.println("------------------------------------------");
            System.out.println("-> tailSet(120, false)");
            System.out.println(ns.tailSet(120, false));
            System.out.println("------------------------------------------");
            System.out.println("-> tailSet(-5, true)");
            System.out.println(ns.tailSet(-5, true));
            System.out.println("------------------------------------------");
            System.out.println("-> tailSet(-5, false)");
            System.out.println(ns.tailSet(-5, false));

            System.out.println("\n\n");
            System.out.println("********************************");
            System.out.println("*** NavigableSetWithSkipList ***");
            System.out.println("********************************");

            System.out.println("--- Create NavigableSetWithSkipList ---");
            NavigableSet<Integer> ns2 = new NavigableSetWithSkipList<>();
            System.out.println(ns2.toString());

            System.out.println("******************************************");
            System.out.println("Before adding the '0' to the set");
            System.out.println(ns2.toString());
            ns2.add(0);
            System.out.println("After adding the '0' to the set");
            System.out.println(ns2.toString());

            System.out.println("******************************************");
            System.out.println("After adding some items: 1, 5, 6, 2, 3 ,4 ,10, 13, 45");
            ns2.add(1);
            ns2.add(5);
            ns2.add(6);
            ns2.add(2);
            ns2.add(3);
            ns2.add(4);
            ns2.add(10);
            ns2.add(13);
            ns2.add(45);
            System.out.println(ns2.toString());

            System.out.println("******************************************");
            System.out.println("Before removing the '3' from the set");
            System.out.println(ns2.toString());
            System.out.println("Size: "+ ns2.size());
            ns2.remove(3);
            System.out.println("After removing the '3' from the set");
            System.out.println(ns2.toString());
            System.out.println("Size: "+ ns2.size());

            System.out.println("******************************************");
            System.out.println("Before removing the '30' from the set");
            System.out.println(ns2.toString());
            System.out.println("Size: "+ ns2.size());
            ns2.remove(30);
            System.out.println("After removing the '30' from the set");
            System.out.println(ns2.toString());
            System.out.println("Size: "+ ns2.size());

        }
        catch (Exception e){
            System.out.println(e.toString());
        }

    }
}
