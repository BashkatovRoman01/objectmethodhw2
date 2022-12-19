public class Main {
    public static void main(String[] args) {
    Author author1 = new Author("Лев", "Толстой");
    Author author2= new Author(" Алексей", "Толстой");
        System.out.println(author1.equals(author2));
        System.out.println(author2);
        System.out.println(author1.printAuthor());
        String author = author1 +" "+author2;
        System.out.println(author);
        Book book = new Book(" Война и мир ", author1, 2012);
        System.out.println(book);
    }
}