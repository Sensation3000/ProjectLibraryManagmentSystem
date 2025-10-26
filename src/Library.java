import java.util.ArrayList;
import java.util.List;

public class Library{

    private List<LibraryItem> items = new ArrayList<>();;

    public List<LibraryItem> addItem(LibraryItem item) {
        items.add(item);
        return items;
    }

    public void borrowItem(String title){
        System.out.println("Вы хотите получить ресурс " + title);
        for(LibraryItem libraryItem : items){
            if(title.equals(libraryItem.getTitle())){
                System.out.println(libraryItem.borrowItem());
            } else {
                System.out.println("Такого ресурса нет в наличии");
            }
            return;
        }
    }

    public void returnItem(String title){
        System.out.println("Вы хотите вернуть ресурс " + title);
        for(LibraryItem libraryItem : items){
            if(title.equals(libraryItem.getTitle())){
                System.out.println(libraryItem.returnItem());
            } else {
                System.out.println("Такой ресурс уже возвращен");
            }
            return;
        }
    }

    public void printAvailableItems(){
        System.out.println("Доступные ресурсы");
        for (int i = 0; i < items.size(); i++){
            LibraryItem libraryItem = items.get(i);
            if(libraryItem.isAvailable()){
                System.out.println(i + ") " + libraryItem.getTitle());
            }
        }
    }
}

