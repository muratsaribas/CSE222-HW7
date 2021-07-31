import java.util.ArrayList;
import java.util.Random;

public class main {
    public static void main(String[] args) {

        Random rand = new Random();

        long startTime = 0;
        long stopTime = 0;
        int range = 999999999;

        ArrayList<ArrayList<Integer>> integers10k = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < 10; i++)
            integers10k.add(new ArrayList<Integer>(10000));

        for (int i = 0; i < 10; i++) {
            while (integers10k.get(i).size() < 10000) {
                int number = rand.nextInt(range);
                if (!integers10k.get(i).contains(number))
                    integers10k.get(i).add(number);
            }
        }

        ArrayList<ArrayList<Integer>> integers20k = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < 10; i++)
            integers20k.add(new ArrayList<Integer>(20000));

        for (int i = 0; i < 10; i++) {
            while (integers20k.get(i).size() < 20000) {
                int number = rand.nextInt(range);
                if (!integers20k.get(i).contains(number))
                    integers20k.get(i).add(number);
            }
        }

        ArrayList<ArrayList<Integer>> integers40k = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < 10; i++)
            integers40k.add(new ArrayList<Integer>(40000));

        for (int i = 0; i < 10; i++) {
            while (integers40k.get(i).size() < 40000) {
                int number = rand.nextInt(range);
                if (!integers40k.get(i).contains(number))
                    integers40k.get(i).add(number);
            }
        }

        ArrayList<ArrayList<Integer>> integers80k = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < 10; i++)
            integers80k.add(new ArrayList<Integer>(80000));

        for (int i = 0; i < 10; i++) {
            while (integers80k.get(i).size() < 80000) {
                int number = rand.nextInt(range);
                if (!integers80k.get(i).contains(number))
                    integers80k.get(i).add(number);
            }
        }

        ArrayList<AVLTree<Integer>> avlList10k = new ArrayList<AVLTree<Integer>>(10);
        ArrayList<AVLTree<Integer>> avlList20k = new ArrayList<AVLTree<Integer>>(10);
        ArrayList<AVLTree<Integer>> avlList40k = new ArrayList<AVLTree<Integer>>(10);
        ArrayList<AVLTree<Integer>> avlList80k = new ArrayList<AVLTree<Integer>>(10);

        ArrayList<BinarySearchTree<Integer>> bstList10k = new ArrayList<BinarySearchTree<Integer>>(10);
        ArrayList<BinarySearchTree<Integer>> bstList20k = new ArrayList<BinarySearchTree<Integer>>(10);
        ArrayList<BinarySearchTree<Integer>> bstList40k = new ArrayList<BinarySearchTree<Integer>>(10);
        ArrayList<BinarySearchTree<Integer>> bstList80k = new ArrayList<BinarySearchTree<Integer>>(10);

        ArrayList<RedBlackTree<Integer>> rbtList10k = new ArrayList<RedBlackTree<Integer>>(10);
        ArrayList<RedBlackTree<Integer>> rbtList20k = new ArrayList<RedBlackTree<Integer>>(10);
        ArrayList<RedBlackTree<Integer>> rbtList40k = new ArrayList<RedBlackTree<Integer>>(10);
        ArrayList<RedBlackTree<Integer>> rbtList80k = new ArrayList<RedBlackTree<Integer>>(10);

        ArrayList<SkipList<Integer>> skpList10k = new ArrayList<SkipList<Integer>>(10);
        ArrayList<SkipList<Integer>> skpList20k = new ArrayList<SkipList<Integer>>(10);
        ArrayList<SkipList<Integer>> skpList40k = new ArrayList<SkipList<Integer>>(10);
        ArrayList<SkipList<Integer>> skpList80k = new ArrayList<SkipList<Integer>>(10);

        for (int i = 0; i < 10; i++){
            avlList10k.add(new AVLTree<Integer>());
            avlList20k.add(new AVLTree<Integer>());
            avlList40k.add(new AVLTree<Integer>());
            avlList80k.add(new AVLTree<Integer>());

            bstList10k.add(new BinarySearchTree<Integer>());
            bstList20k.add(new BinarySearchTree<Integer>());
            bstList40k.add(new BinarySearchTree<Integer>());
            bstList80k.add(new BinarySearchTree<Integer>());

            rbtList10k.add(new RedBlackTree<Integer>());
            rbtList20k.add(new RedBlackTree<Integer>());
            rbtList40k.add(new RedBlackTree<Integer>());
            rbtList80k.add(new RedBlackTree<Integer>());

            skpList10k.add(new SkipList<Integer>());
            skpList20k.add(new SkipList<Integer>());
            skpList40k.add(new SkipList<Integer>());
            skpList80k.add(new SkipList<Integer>());
        }

        for (int i=0; i< integers10k.size(); i++){
            for (int j=0; j < integers10k.get(i).size(); j++){
                int number = integers10k.get(i).get(j);
                avlList10k.get(i).add(number);
                bstList10k.get(i).add(number);
                rbtList10k.get(i).add(number);
                skpList10k.get(i).add(number);
            }
        }

        for (int i=0; i< integers20k.size(); i++){
            for (int j=0; j < integers20k.get(i).size(); j++){
                int number = integers20k.get(i).get(j);
                avlList20k.get(i).add(number);
                bstList20k.get(i).add(number);
                rbtList20k.get(i).add(number);
                skpList20k.get(i).add(number);
            }
        }

        for (int i=0; i< integers40k.size(); i++){
            for (int j=0; j < integers40k.get(i).size(); j++){
                int number = integers40k.get(i).get(j);
                avlList40k.get(i).add(number);
                bstList40k.get(i).add(number);
                rbtList40k.get(i).add(number);
                skpList40k.get(i).add(number);
            }
        }

        for (int i=0; i< integers80k.size(); i++){
            for (int j=0; j < integers80k.get(i).size(); j++){
                int number = integers80k.get(i).get(j);
                avlList80k.get(i).add(number);
                bstList80k.get(i).add(number);
                rbtList80k.get(i).add(number);
                skpList80k.get(i).add(number);
            }
        }

        // Create extra 100 random numbers
        ArrayList<Integer> extraNum = new ArrayList<Integer>();
        while (extraNum.size() < 100) {
            int number = rand.nextInt(range);
            if (!extraNum.contains(number))
                extraNum.add(number);
        }

        ArrayList<Long> avlRunningTimes = new ArrayList<Long>();
        ArrayList<Long> bstRunningTimes = new ArrayList<Long>();
        ArrayList<Long> rbtRunningTimes = new ArrayList<Long>();
        ArrayList<Long> skipRunningTimes = new ArrayList<Long>();

        for (int i = 0; i < 10; i++) {
            // Calculate time for AVLTree
            startTime = System.nanoTime();
            for (int j = 0; j < extraNum.size(); j++)
                avlList10k.get(i).add(extraNum.get(j));
            stopTime = System.nanoTime();
            avlRunningTimes.add(stopTime - startTime);

            // Calculate time for Binary Search Tree
            startTime = System.nanoTime();
            for (int j = 0; j < extraNum.size(); j++)
                bstList10k.get(i).add(extraNum.get(j));
            stopTime = System.nanoTime();
            bstRunningTimes.add(stopTime - startTime);

            // Calculate time for Red-Black Tree
            startTime = System.nanoTime();
            for (int j = 0; j < extraNum.size(); j++)
                rbtList10k.get(i).add(extraNum.get(j));
            stopTime = System.nanoTime();
            rbtRunningTimes.add(stopTime - startTime);

            // Calculate time for SkipList
            startTime = System.nanoTime();
            for (int j = 0; j < extraNum.size(); j++)
                skpList10k.get(i).add(extraNum.get(j));
            stopTime = System.nanoTime();
            skipRunningTimes.add(stopTime - startTime);
        }

        for (int i = 0; i < 10; i++) {
            // Calculate time for AVLTree
            startTime = System.nanoTime();
            for (int j = 0; j < extraNum.size(); j++)
                avlList20k.get(i).add(extraNum.get(j));
            stopTime = System.nanoTime();
            avlRunningTimes.add(stopTime - startTime);

            // Calculate time for Binary Search Tree
            startTime = System.nanoTime();
            for (int j = 0; j < extraNum.size(); j++)
                bstList20k.get(i).add(extraNum.get(j));
            stopTime = System.nanoTime();
            bstRunningTimes.add(stopTime - startTime);

            // Calculate time for Red-Black Tree
            startTime = System.nanoTime();
            for (int j = 0; j < extraNum.size(); j++)
                rbtList20k.get(i).add(extraNum.get(j));
            stopTime = System.nanoTime();
            rbtRunningTimes.add(stopTime - startTime);

            // Calculate time for SkipList
            startTime = System.nanoTime();
            for (int j = 0; j < extraNum.size(); j++)
                skpList20k.get(i).add(extraNum.get(j));
            stopTime = System.nanoTime();
            skipRunningTimes.add(stopTime - startTime);
        }

        for (int i = 0; i < 10; i++) {
            // Calculate time for AVLTree
            startTime = System.nanoTime();
            for (int j = 0; j < extraNum.size(); j++)
                avlList40k.get(i).add(extraNum.get(j));
            stopTime = System.nanoTime();
            avlRunningTimes.add(stopTime - startTime);

            // Calculate time for Binary Search Tree
            startTime = System.nanoTime();
            for (int j = 0; j < extraNum.size(); j++)
                bstList40k.get(i).add(extraNum.get(j));
            stopTime = System.nanoTime();
            bstRunningTimes.add(stopTime - startTime);

            // Calculate time for Red-Black Tree
            startTime = System.nanoTime();
            for (int j = 0; j < extraNum.size(); j++)
                rbtList40k.get(i).add(extraNum.get(j));
            stopTime = System.nanoTime();
            rbtRunningTimes.add(stopTime - startTime);

            // Calculate time for SkipList
            startTime = System.nanoTime();
            for (int j = 0; j < extraNum.size(); j++)
                skpList40k.get(i).add(extraNum.get(j));
            stopTime = System.nanoTime();
            skipRunningTimes.add(stopTime - startTime);
        }

        for (int i = 0; i < 10; i++) {
            // Calculate time for AVLTree
            startTime = System.nanoTime();
            for (int j = 0; j < extraNum.size(); j++)
                avlList80k.get(i).add(extraNum.get(j));
            stopTime = System.nanoTime();
            avlRunningTimes.add(stopTime - startTime);

            // Calculate time for Binary Search Tree
            startTime = System.nanoTime();
            for (int j = 0; j < extraNum.size(); j++)
                bstList80k.get(i).add(extraNum.get(j));
            stopTime = System.nanoTime();
            bstRunningTimes.add(stopTime - startTime);

            // Calculate time for Red-Black Tree
            startTime = System.nanoTime();
            for (int j = 0; j < extraNum.size(); j++)
                rbtList80k.get(i).add(extraNum.get(j));
            stopTime = System.nanoTime();
            rbtRunningTimes.add(stopTime - startTime);

            // Calculate time for SkipList
            startTime = System.nanoTime();
            for (int j = 0; j < extraNum.size(); j++)
                skpList80k.get(i).add(extraNum.get(j));
            stopTime = System.nanoTime();
            skipRunningTimes.add(stopTime - startTime);
        }

        System.out.println(avlRunningTimes.toString());
        System.out.println(bstRunningTimes.toString());
        System.out.println(rbtRunningTimes.toString());
        System.out.println(skipRunningTimes.toString());



    }
}
