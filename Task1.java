public class Task1 {
    public static void main(String[] args) {
        Phone_book Phone_book = new Phone_book();
        Phone_book.add("Петров Петр Петрович", "123");
        Phone_book.add("Петров Петр Петрович", "321");
        Phone_book.add("Кузнецов Иван Иванович", "99932");
        Phone_book.add("Игнатьев Петр Александрович", "75633");
        Phone_book.add("Кузнецов Иван Иванович", "44432");
        Phone_book.add("Кузнецов Иван Иванович", "88746");
        Phone_book.add("Серов Сергей Петрович", "732465");

        System.out.println(Phone_book.getAllBook());
        System.out.println(Phone_book.findContact("Иван"));
    }
}