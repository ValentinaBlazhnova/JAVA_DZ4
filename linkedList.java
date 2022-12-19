// Реализуйте очередь с помощью LinkedList со следующими методами:enqueue() - помещает элемент в конец очереди, 
// dequeue() - возвращает первый элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.

package DZ4;
import java.util.LinkedList;
import java.util.Queue;


public class linkedList {
    public static void main(String[] args) {
        Queue<Integer> myList = new LinkedList<Integer>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        for(int i: myList)       
            System.out.println(i);

        // dequeue() - возвращает первый элемент из очереди и удаляет его
        myList.poll(); //poll - возвращает элемент из головы очереди и удаляет его. Возвращает null, если очередь пуста.
        System.out.println("После преобразований:");
        for(int i: myList)
            System.out.println(i);
        
        // enqueue() - помещает элемент в конец очереди,
        myList.offer(22);  //offer() вставляет элемент в очередь, если это не удалось - возвращает false.       
        for(int i: myList)
            System.out.println(i);

        // first() - возвращает первый элемент из очереди, не удаляя.
        System.out.println(myList.peek());  //Peek — позволяет получить элемент в начале очереди без его удаления.
    }
}

    

