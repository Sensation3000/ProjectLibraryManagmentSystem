public class Magazine extends AbstractLibraryItem{

    private int issueNumber;

    public Magazine(boolean isAvailable, String title, int issueNumber) {
        super(isAvailable, title);
        this.issueNumber = issueNumber;
    }

    @Override
    public String borrowItem() {
        if(isAvailable()!=true){
            return "Извините, журнал не доступен в данный момент";
        }else {
            setAvailable(false);
            return "Журнал " + getTitle() + " номер " + issueNumber + " выдан";
        }
    }

    @Override
    public String returnItem() {
        setAvailable(true);
        return "Журнал " + getTitle() + " номер " + issueNumber + " возвращен";
    }

    @Override
    public String toString() {
        return "Журнал: " + getTitle() + " (№" + issueNumber + ")";
    }
}
