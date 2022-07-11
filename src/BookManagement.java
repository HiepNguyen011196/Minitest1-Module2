import java.util.Objects;

public class BookManagement extends Book {
    public static void main(String[] args) {
        ProgrammingBook book1 = new ProgrammingBook();
        book1.setLanguage("Java");
        book1.setFramework("frame1");
        book1.setPrice(100000);
        ProgrammingBook book2 = new ProgrammingBook();
        book2.setLanguage("Normal");
        book2.setFramework("frame2");
        book2.setPrice(150000);
        ProgrammingBook book3 = new ProgrammingBook();
        book3.setLanguage("Normal");
        book3.setFramework("frame1");
        book3.setPrice(200000);
        ProgrammingBook book4 = new ProgrammingBook();
        book4.setLanguage("Java");
        book4.setFramework("frame1");
        book4.setPrice(100000);
        ProgrammingBook book5 = new ProgrammingBook();
        book5.setLanguage("Java");
        book5.setFramework("frame2");
        book5.setPrice(150000);

        FictionBook book6 = new FictionBook("Fiction1");
        book6.setPrice(100000);
        FictionBook book7 = new FictionBook("Fiction2");
        book7.setPrice(150000);
        FictionBook book8 = new FictionBook("Fiction1");
        book8.setPrice(300000);
        FictionBook book9 = new FictionBook("Fiction1");
        book9.setPrice(500000);
        FictionBook book10 = new FictionBook("Fiction3");
        book10.setPrice(50000);

        double totalPrice = book1.getPrice() + book2.getPrice() + book3.getPrice() + book4.getPrice() + book5.getPrice()
                + book6.getPrice() + book7.getPrice() + book8.getPrice() + book9.getPrice() + book10.getPrice();
        System.out.println("Total price is: " + totalPrice);

        String[] javaLanguague = {book1.getLanguage(), book2.getLanguage(), book3.getLanguage(), book4.getLanguage(), book5.getLanguage()};
        int count = 0;
        for (String s : javaLanguague) {
            if (Objects.equals(s, "Java")) {
                count++;
            }
        }
        System.out.println(count + " Java books");

        String[] fictionCategory = {book6.getCategory(), book7.getCategory(), book8.getCategory(), book9.getCategory(), book10.getCategory()};
        int count1 = 0;
        for (String k : fictionCategory) {
            if (Objects.equals(k, "Fiction1")) {
                count1++;
            }
        }
        System.out.println(count1 + " Fiction1 books");

        double[] lowPrice = {book6.getPrice(), book7.getPrice(), book8.getPrice(), book9.getPrice(), book10.getPrice()};
        int count2 = 0;
        for (double v : lowPrice) {
            if (v <= 100000) {
                count2++;
            }
        }
        System.out.println(count2 + " books with price lower or equal to 100000");
    }
}
