public class ProgrammingBook extends Book {
    String language;
    String framework;
    public ProgrammingBook(){
    }
    public ProgrammingBook(String language, String framework, int price) {
        this.language = language;
        this.framework = framework;
        this.price = price;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }


}
