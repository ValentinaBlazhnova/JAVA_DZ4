// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

package DZ4;
import java.util.LinkedList;

public class perevernytii_linkedList {
    public static void main(String[] args) {
        LinkedList<String> linkedL = new LinkedList<String>();
        linkedL.add("Cолнце");
        linkedL.add("Облака");
        linkedL.add("Небо");
        System.out.print("Элементы до сортировки: " + linkedL);
        linkedL = reverseLinkedList(linkedL);
        System.out.print("\nЭлементы после сортировки: " + linkedL);
        }
          
    public static LinkedList<String> reverseLinkedList(LinkedList<String> list) {
        LinkedList<String> revLinkedList = new LinkedList<String>();
        for (int i = list.size() - 1; i >= 0; i--) {
            revLinkedList.add(list.get(i));
        }
        return revLinkedList;
    }
}
    

