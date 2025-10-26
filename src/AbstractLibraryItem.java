import java.util.Objects;

public  abstract class AbstractLibraryItem implements LibraryItem{
    private String title;
    private boolean isAvailable;

    public AbstractLibraryItem(boolean isAvailable, String title) {
        this.isAvailable = isAvailable;
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }

    protected void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public boolean isAvailable() {
        return isAvailable;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        AbstractLibraryItem that = (AbstractLibraryItem) o;
        return Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(title);
    }

    public abstract String borrowItem();

    public abstract String returnItem();
    }
