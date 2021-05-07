import java.util.List;

public class Driver {

public static void main(String[] args) {

Recycled Recycled=new Recycled();

Item item1=new Item("pc", "metal", "medium", "Ari", "Iowa");

Item item2=new Item("laptop", "metal", "small", "Elna", "Iowa");

Item item3=new Item("box", "plastic", "small", "Roni", "Iowa");

Item item4=new Item("box", "plastic", "small", "Era", "Iowa");

Item item5=new Item("door", "wood", "large", "Arda", "3Iowa");

Recycled.addItems(item1);

Recycled.addItems(item2);

Recycled.addItems(item3);

Recycled.addItems(item4);

Recycled.addItems(item5);

Item Item1=new Item("pc", "metal", "medium", "Lea", "Iowa");

Item Item2=new Item("box", "plastic", "big", "Ari", "Iowa");

List<Item> Items=Recycled.getitemLinkeDList();

System.out.println("Before Insertion Sort\n");

for (int i = 0; i < Items.size(); i++) {

System.out.println(Items.get(i));

}

//Inserton Sort List

for (int i = 1; i < Items.size(); i++) {

for(int j = i ; j > 0 ; j--){

if(Items.get(j).compareTo(Items.get(j-1))<0){

Item temp = Items.get(j);

Items.set(j, Items.get(j-1));

Items.set(j-1, temp);

}

}

}

  

System.out.println("\n\nAfter Insertion Sort\n");

for (int i = 0; i < Items.size(); i++) {

System.out.println(Items.get(i));

}

}

}