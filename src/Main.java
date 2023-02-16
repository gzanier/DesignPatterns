import builder.Address;
import builder.Item;
import builder.ShoppingCart;
import singleton.Singleton;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {




        Singleton singleton = Singleton.newInstance();
        singleton.logINFO("log1");
        Singleton singleton2 = Singleton.newInstance();
        singleton2.logINFO("log2");
        Singleton singleton3 = Singleton.newInstance();
        singleton3.logINFO("log3");
        /*Main builder

      /*  Item item1 = new Item(1,10,"maglia","maglia gialla");
        Item item2 = new Item(2,10,"maglia","maglia gialla");
        Item item3 = new Item(3,10,"maglia","maglia gialla");
        Item item4 = new Item(4,10,"maglia","maglia gialla");
        Item item5 = new Item(5,10,"maglia","maglia gialla");

        List<Item> itemList = new ArrayList<>();
        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);
        itemList.add(item4);
        List<Item> itemList2 = new ArrayList<>();
        itemList2.add(item1);
        itemList2.add(item3);
        itemList2.add(item4);
        itemList2.add(item5);

        //Address address1 = new Address("Italy", "Roma", "00100");
        //Address address2 = new Address("Italy", "Milano", "20210");
        Address address1 = Address.AddressBuilder.builder().setAddress("Roma").setCountry("Italy").setPostalCode("00100").build();
        Address address2 = Address.AddressBuilder.builder().setAddress("Milano").setCountry("Italy").setPostalCode("20210").build();

        Item item1 = Item.ItemBuilder.builder().setId(1).setName("Maglia").build();
        List<Item> itemList = new ArrayList<>();
        itemList.add(item1);

        ShoppingCart shoppingCart = new ShoppingCart(1,100,100,address1,itemList);
        //ShoppingCart shoppingCart2 = new ShoppingCart(2,100,100,address2,itemList2);*/

    }
}
