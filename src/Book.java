public class Book {
    private final String title;
    private int publishingYear;
    private final Author author;

    public Book(String title, int publishingYear, Author author) {
        this.title = title;
        this.publishingYear = publishingYear;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }


    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public Author getAuthor() {
        return author;
    }


    public void printInfo() {
        System.out.println("Название книги: " + getTitle() + " Год издания: " + getPublishingYear() + " , " +
                "Автор: " + getAuthor().getName() + " " + getAuthor().getSurname());
    }
}
