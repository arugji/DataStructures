

import java.util.LinkedList;

public class Recycled {

LinkedList<Item> itemLinkeDList;

public Recycled() {

itemLinkeDList=new LinkedList<>();

}

public void addItems(Item item) {

itemLinkeDList.add(item);

}

public LinkedList<Item> getitemLinkeDList() {

return itemLinkeDList;

}

public void setitemLinkeDList(LinkedList<Item> itemLinkeDList) {

this.itemLinkeDList = itemLinkeDList;

}

}

