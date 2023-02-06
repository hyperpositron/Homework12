public class Main {
    public static void main(String[] args) {
        Author lermontov = new Author("Михаил", "Лермонтов");
        Author tolstoy = new Author("Лев", "Толстой");

        Book mtsyri = new Book("Мцыри", 1839, lermontov);
        Book warAndPeace = new Book("Война и мир", 1867, tolstoy);
        System.out.println(mtsyri);
        System.out.println(warAndPeace);
    }
}