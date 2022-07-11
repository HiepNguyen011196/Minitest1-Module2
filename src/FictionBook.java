public class FictionBook extends Book{
    String category;

    public FictionBook(){
    }
    public FictionBook(String category, int price) {
        this.category = category;
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
