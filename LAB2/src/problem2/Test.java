package problem2;

import java.util.*;

public class Test {
	public static void main(String[] args) {
	HashSet<Contact> contacts = new HashSet<>();

    Contact contact1 = new Contact ("+7755367685", "something@mail.ru");
    Contact contact2 = new Contact ("+7755367685", "something@mail.ru");
    Person person1 = new Person("+7755367685", "something@mail.ru", "Aidyn", 18);
    Person person2 = new Person("+77022762116", "noone@mail.ru", "A", 25);

    contacts.add(contact1);
    contacts.add(contact2);
    contacts.add(person1);
    contacts.add(person2);
    

  
    	System.out.println(contact1.equals(contact2));
    
   
    System.out.println(contact1.hashCode() + "\n" + contact2.hashCode());
    	
    System.out.print(contacts.size());
    

}

}
