import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;

public class ListExample {
    public static void run() {
        ArrayList<Book> books = new ArrayList<>();

        books.add(new Book(1, "Абай жолы", "Мұхтар Әуезов", "Роман"));
        books.add(new Book(2, "Менің атым Қожа", "Бердібек Соқпақбаев", "Повесть"));
        books.add(new Book(3, "Java негіздері", "Иван Иванов", "Оқу"));

        System.out.println("Бірінші кітап: " + books.get(0));

        books.set(1, new Book(2, "Қожа", "Бердібек Соқпақбаев", "Повесть"));
        System.out.println("Кітап саны: " + books.size());

        System.out.println("Қарапайым for:");
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i));
        }

        System.out.println("For-each:");
        for (Book b : books) {
            System.out.println(b);
        }

        System.out.println("Iterator:");
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        books.remove(1);
        System.out.println("Жойғаннан кейін: " + books);

        Collections.sort(books, Comparator.comparing(Book::getName));
        System.out.println("Атауы бойынша сұрыптау:");
        for (Book b : books) {
            System.out.println(b);
        }

        System.out.println("Автор бойынша іздеу:");
        for (Book b : books) {
            if (b.getAuthor().equals("Мұхтар Әуезов")) {
                System.out.println(b);
            }
        }

        System.out.println("Роман жанрындағы кітаптар:");
        for (Book b : books) {
            if (b.getGenre().equals("Роман")) {
                System.out.println(b);
            }
        }



        LinkedList<String> history = new LinkedList<>();
        history.add("Абай жолы");
        history.add("Java негіздері");
        history.addFirst("Алғашқы қаралған кітап");
        history.addLast("Соңғы қаралған кітап");

        System.out.println("nLinkedList тарихы: " + history);
        System.out.println("Бірінші элемент: " + history.getFirst());

        history.removeFirst();
        System.out.println("Жойғаннан кейін: " + history);

        System.out.println("Book:");
        for (Book b : books) {
            if (b.getAuthor().equals("Иван Иванов")) {
                System.out.println(b);
                if(b.getPrice() .equals())
            }
        }

    }

}
