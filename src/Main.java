public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book ruslanAndLudmila = new Book(true, "Руслан и Людмила", "Пушкин");
        Magazine esquire = new Magazine(true, "Эсквайр", 120);

        library.addItem(ruslanAndLudmila);
        library.addItem(esquire);

        library.printAvailableItems();

        library.borrowItem("Руслан и Людмила");
        library.printAvailableItems();
        System.out.println("====================");
        library.returnItem("Руслан и Людмила");
        library.printAvailableItems();
    }
}
