package mirea.homework2.com;

public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Андрей", "andrey22@gmail.com", 'M');
        Author a2 = new Author("Владимир", "vova2122@mail.ru", 'M');
        Author a3 = new Author("Лиза", "lizzzz111@mail.ru", 'F');

        a1.setEmail("Andreeey@mirea.com");
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
    }
}
