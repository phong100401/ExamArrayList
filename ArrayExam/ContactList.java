package ArrayExam;

import java.util.ArrayList;

public class ContactList {
    private String myNumber;
    private ArrayList<Contact> myContact;

    public ContactList(String myNumber){
        this.myNumber = myNumber;
        this.myContact = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact){
        if (findContact(contact.getName()) >= 0){
            System.out.println("Contact is already on file");
            return false;
        }
        myContact.add(contact);
        return true;
    }
    public boolean updateContact(Contact oldContact,Contact newCOntact){
        int foundPosition = findContact((oldContact));
        if (foundPosition < 0){
            System.out.println(oldContact.getName() + ",was ot found.");
            return false;
        }
        this.myContact.set(foundPosition,newCOntact);
        System.out.println(oldContact.getName() + ",was replaced with " + newCOntact);
        return true;

    }
    public boolean removeContact(Contact contact){
        int foundPosition = findContact(contact);
        if (foundPosition < 0){
            System.out.println(contact.getName() + "was not found");
            return false;
        }
        this.myContact.remove(foundPosition);
        System.out.println(contact.getName()+ ",was deleted.");
        return true;

    }
    private int findContact(Contact contact){
        return this.myContact.indexOf(contact);
    }
    private int findContact(String ContactName){
        for (int i = 0;i<this.myContact.size();i++){
            Contact contact = this.myContact.get(i);
            if (contact.getName().equals(ContactName)){
                return i;
            }
        }
        return -1;
    }
    public String queryContact(Contact contact){
        if (findContact(contact) >= 0){
            return contact.getName();
        }
        return null;
    }
    public Contact queryContact(String name){
        int position = findContact(name);
        if ((position >=0)){
            return this.myContact.get(position);
        }
        return null;
    }
    public void printContact(){
        System.out.println("Contact List " + myNumber );
        for (int i = 0 ; i < this.myContact.size();i++){
            System.out.println((i + 1) + "." + this.myContact.get(i).getName() + " -> " + this.myContact.get(i).getPhoneNumber());
        }
    }
}
