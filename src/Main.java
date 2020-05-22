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

        ArrayList<String> listC = new ArrayList<>(listA.size() + listB.size());
        Collections.reverse(listB);
        listC.addAll(listA);
        listC.addAll(listB);

        System.out.println(listC);
        System.out.println("--------------------");

        Collections.sort(listC);
        System.out.println(listC);


    }
}
