public class Book extends AbstractLibraryItem {
    private String author;

    public Book(boolean isAvailable, String title, String author) {
        super(isAvailable, title);
        this.author = author;
    }

    @Override
    public String borrowItem() {
        if(!isAvailable()){
            return "Извините, книга не доступна в данный момент";
        } else {
            setAvailable(false);
            return "Книга " + getTitle() + " автора " + author + " выдана";
        }
    }

    @Override
    public String returnItem() {
        if (isAvailable()) {
            return "Книга уже в библиотеке!";
        }
        setAvailable(true);
        return  "Книга " + getTitle() + " автора " + author + " возвращена";
    }

    @Override
    public String toString() {
        return "Книга: " + getTitle() + " (автор: " + author + ")";
    }
}
