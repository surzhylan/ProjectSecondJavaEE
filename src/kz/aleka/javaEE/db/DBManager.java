package kz.aleka.javaEE.db;

import kz.aleka.javaEE.model.Item;

import java.util.ArrayList;

public class DBManager {
    private static ArrayList<Item> list = new ArrayList<>();
    private static Long id = 6L;
    static{
        list.add(new Item(1L,"IPhone 13 Pro Max",450000,10));
        list.add(new Item(2L,"XIAOMI REDMI NOTE 8",82000,20));
        list.add(new Item(3L,"Oppo 3 Model X",350000,15));
        list.add(new Item(4L,"Macbook Pro M1 13",750000,15));
        list.add(new Item(5L,"ASUS TUF Gaming",340000,7));
    }

    public static void addItem(Item item){
        item.setId(id);
        list.add(item);
        id++;
    }

    public static ArrayList<Item> getList(){
        return list;
    }

    public static Item getItem(Long id){
        for(Item it: list){
            if(it.getId()==id){
                return it;
            }
        }
        return null;
    }
}
