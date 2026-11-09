import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void run() {
        Set<Book> books = new HashSet<>();

        books.add(new Book(1, "Абай жолы", "Мұхтар Әуезов", "Роман"));
        books.add(new Book(2, "Менің атым Қожа", "Бердібек Соқпақбаев", "Повесть"));
        books.add(new Book(1, "Басқа кітап атауы", "Басқа автор", "Басқа жанр"));

        System.out.println("Кітаптар: " + books);
        System.out.println("Кітап саны: " + books.size());

        boolean exists = books.contains(
                new Book(1, "Кез келген атау", "Кез келген автор", "Кез келген жанр")
        );
        System.out.println("ID 1 бар ма: " + exists);

        books.remove(new Book(2, "Менің атым Қожа", "Бердібек Соқпақбаев", "Повесть"));
        System.out.println("Жойғаннан кейін: " + books);

        System.out.println("Барлық кітап:");
        for (Book b : books) {
            System.out.println(b);
        }

        Set<String> genres = new HashSet<>();
        genres.add("Роман");
        genres.add("Повесть");
        genres.add("Роман");

        System.out.println("Жанрлар: " + genres);




    }
}

