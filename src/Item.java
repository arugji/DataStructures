

public class Item {

String name, material, sizeAbbrevation, ownerName, state;

public Item(String name, String material, String sizeAbbrevation, String ownerName, String state) {

name = name;

material = material;

this.sizeAbbrevation = sizeAbbrevation;

this.ownerName = ownerName;

this.state = state;

}

public String getname() {

return name;

}

public void setname(String name) {

name = name;

}

public String getmaterial() {

return material;

}

public void setmaterial(String material) {

material = material;

}

public String getsizeAbbrevation() {

return sizeAbbrevation;

}

public void setsizeAbbrevation(String sizeAbbrevation) {

this.sizeAbbrevation = sizeAbbrevation;

}

public String getownerName() {

return ownerName;

}

public void setownerName(String ownerName) {

this.ownerName = ownerName;

}

public String getstate() {

return state;

}

public void setstate(String state) {

this.state = state;

}

public int compareTo(Item item) {
	// TODO Auto-generated method stub
	return 0;
}

}

