import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void run() {
        Map<Integer, Book> books = new HashMap<>();

        books.put(1, new Book(1, "Абай жолы", "Мұхтар Әуезов", "Роман"));
        books.put(2, new Book(2, "Менің атым Қожа", "Бердібек Соқпақбаев", "Повесть"));
        books.put(3, new Book(3, "Java негіздері", "Иван Иванов", "Оқу"));

        System.out.println("ID 1 кітабы: " + books.get(1));
        System.out.println("ID 2 бар ма: " + books.containsKey(2));

        books.put(2, new Book(2, "Қожа", "Бердібек Соқпақбаев", "Повесть"));
        System.out.println("Өзгерткеннен кейін: " + books.get(2));

        books.remove(3);

        System.out.println("\\nБарлық кітап:");
        for (Map.Entry<Integer, Book> entry : books.entrySet()) {
            System.out.println(
                    "Кілт: " + entry.getKey()
                            + ", Мәні: " + entry.getValue()
            );
        }

        System.out.println("Кітап саны: " + books.size());
    }
}
