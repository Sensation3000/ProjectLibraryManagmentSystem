public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book ruslanAndLudmila = new Book(true, "Руслан и Людмила", "Пушкин");
        Magazine esquire = new Magazine(true, "Эсквайр", 120);

        //добавляем книги в библиотеку
        library.addItem(ruslanAndLudmila);
        library.addItem(esquire);
        library.printAvailableItems();
        System.out.println("====================");

        //пробуем взять книгу, которая есть в библиотеке
        library.borrowItem("Руслан и Людмила");
        library.printAvailableItems();
        System.out.println("====================");

        //пробуем вернуть книгу в библиотеку
        library.returnItem("Руслан и Людмила");
        library.printAvailableItems();
        System.out.println("====================");

        //пробуем вернуть книгу, которая уже возвращена в библиотеку
        library.returnItem("Руслан и Людмила");
        System.out.println("====================");

        //пробуем взять книгу, которой нет в библиотеке
        library.borrowItem("Новая книга");

        //пробуем взять журнал, которая есть в библиотеке
        library.borrowItem("Эсквайр");
        library.printAvailableItems();
        System.out.println("====================");

        //пробуем вернуть журнал в библиотеку
        library.returnItem("Эсквайр");
        library.printAvailableItems();
        System.out.println("====================");


    }
}
