
public class BookManagement {


    public static void main(String[] args) {
        Book [] book = new Book[10];
        book[0] = new ProgrammingBook("java", "frameAA", 100);
        book[1] = new ProgrammingBook("javascript", "frameBB", 50);
        book[2] = new ProgrammingBook("javascript", "frameBB", 80);
        book[3] = new ProgrammingBook("java", "frameAA", 200);
        book[4] = new ProgrammingBook("java", "javaAA", 150);
        book[5] = new FictionBook("fiction1", 180);
        book[6] = new FictionBook("fiction2", 300);
        book[7] = new FictionBook("fiction3", 98);
        book[8] = new FictionBook("fiction2", 50);
        book[9] = new FictionBook("fiction1",79);

        int sum = totalPrice(book);
        System.out.println("Total price is: " + sum);
        int checkJava = checkJava(book);
        System.out.println(checkJava + " java books");
        int checkFiction1 = checkFiction1(book);
        System.out.println(checkFiction1 + " fictions1 books");
    }
    public static int totalPrice(Book []book) {
        int sum = 0;
        for (int i = 0; i < book.length; i++) {
            sum += book[i].getPrice();
        }
        return sum;
    }

    public static int checkJava(Book []book) {
        int countJava = 0;
        for (int i = 0; i < book.length; i++) {
            if (book[i] instanceof ProgrammingBook) {
                String language = ((ProgrammingBook) book[i]).getLanguage();
                if (language.equals("java")) countJava++;
            }
        }
        return countJava;
    }

    public static int checkFiction1(Book []book) {
        int countFiction1 = 0;
        for (int i = 0; i < book.length; i++) {
            if (book[i] instanceof FictionBook) {
                String category =((FictionBook) book[i]).getCategory();
                if (category.equals("fiction1")) countFiction1++;
            }
        }
        return countFiction1;
    }
}
