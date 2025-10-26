import java.util.ArrayList;
import java.util.List;

public class Library{

    private List<LibraryItem> items = new ArrayList<>();

    public void addItem(LibraryItem item) {
        items.add(item);
    }

    public void borrowItem(String title){
        System.out.println("Вы хотите получить ресурс " + title);
        for(LibraryItem libraryItem : items){
            if(title.equals(libraryItem.getTitle())){
                System.out.println(libraryItem.borrowItem());
                return;
            }
        }
        System.out.println("Такого ресурса нет в наличии");
    }

    public void returnItem(String title){
        System.out.println("Вы хотите вернуть ресурс " + title);
        for(LibraryItem libraryItem : items){
            if(title.equals(libraryItem.getTitle())){
                System.out.println(libraryItem.returnItem());
                return;
            }
        }
        System.out.println("Такой ресурс уже возвращен");
    }

    public void printAvailableItems(){
        System.out.println("Доступные ресурсы");
        for (int i = 0; i < items.size(); i++){
            LibraryItem libraryItem = items.get(i);
            if(libraryItem.isAvailable()){
                System.out.println(i + 1 + ") " + libraryItem.getTitle());
            }
        }
    }
}

