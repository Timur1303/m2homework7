import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> listA = new ArrayList<>();
        Iterator<String> iteratorA = listA.iterator();
        ArrayList<String> listB = new ArrayList<>();
        Iterator<String> iteratorB = listA.iterator();
        Scanner scanner = new Scanner(System.in);
        while (listA.size() < 5) {
            System.out.println("Введите: ");
            listA.add(scanner.nextLine());
        }
        iteratorA = listA.iterator();
        while (iteratorA.hasNext()) {
            System.out.println(iteratorA.next());
        }

        while (listB.size() < 5) {
            System.out.println("Введите: ");
            listB.add(scanner.nextLine());
        }
            iteratorB = listB.iterator();
            while (iteratorB.hasNext()) {
                System.out.println(iteratorB.next());
            }


        ArrayList<String> listC = new ArrayList<>();
        /*listC.addAll(listA);
        listC.add(1,listB.get(4));
        listC.add(3,listB.get(3));
        listC.add(5,listB.get(2));
        listC.add(7,listB.get(1));
        listC.add(9,listB.get(0));*/
//        Collections.reverse(listB);
        while (iteratorA.hasNext() && iteratorB.hasNext()) {
            listC.add(iteratorA.next());
            listC.add(iteratorB.next());
        }

        System.out.println(listC);
        System.out.println("--------------------");


        Collections.sort(listC);
        System.out.println(listC);



    }
}
