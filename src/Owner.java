

public class Owner implements Comparable<Owner> {

String ID, firstName, lastName, reason, recyclable;

public Owner(String iD, String firstName, String lastName, String reason, String recyclable) {

ID = iD;

this.firstName = firstName;

this.lastName = lastName;

this.reason = reason;

recyclable = recyclable;

}

public String getID() {

return ID;

}

public void setID(String iD) {

ID = iD;

}

public String getFirstName() {

return firstName;

}

public void setFirstName(String firstName) {

this.firstName = firstName;

}

public String getLastName() {

return lastName;

}

public void setLastName(String lastName) {

this.lastName = lastName;

}

public String getreason() {

return reason;

}

public void setreason(String reason) {

this.reason = reason;

}

public String getrecyclable() {

return recyclable;

}

public void setrecyclable(String recyclable) {

recyclable = recyclable;

}

@Override

public int compareTo(Owner Owner) {

int compare=getID().compareTo(Owner.getID());

if (compare==0) {

compare=getLastName().compareTo(Owner.getLastName());

}

if (compare==0) {

compare=getFirstName().compareTo(Owner.getFirstName());

}

return compare;

}

@Override

public String toString() {

// TODO Auto-generated method stub

return "ID: "+getID()+" FirstName: "+getFirstName()+" LastName: "+getLastName()+" CreditHours: "+getreason()+

" getrecyclable: "+getrecyclable();

}

}

