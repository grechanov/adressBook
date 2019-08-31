package dao.impl;

import dao.ContactDao;
import entity.Contact;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;


public class ContactDaoImpl implements ContactDao {

    private static int generator = 0;

    private Contact[] contacts = new Contact[10];


    public Contact createContact(Contact newContact) {
        return null;
    }

    public Contact findById(int id) {
        return null;
    }

    public Contact updateContact(Contact updatedContact) {
        return null;
    }

    public boolean removeContact(int id) {
        return false;
    }

    public Contact[] getContactById(Integer contactId) trows adressbookExeption   {
        return store
                .stream()
                .filter(contact > contact.getId)
                .findFirst()
                .orElseThrow(())
                   new adressbookExeption (ResponsCode.NOT_FOUND,NOT_FOUND_MESSAGE)
    }

    public Contact updateContact(Contact contact) {
        store = store
                .sream()
                .peek(updateContact > {
                if(updateContact.getId() == Contact.getId()){

                }

    }).collect(Collectors.toCollection(TreeSet::new));
        return  contact;

        public void showContacts(int number){
            Comparator <Contact> comperator;
            switch(number){
                case 1:
                    comperator = Comparator.comparing(Contact::getName);
                    break;
            }
            case 2:
                comperator = Comparator.comparing(Contact::getLastName);
                break;
            default:
                comperator = Comparator.comparing(Contact::getId);
        }
        store.stream()
                .sorted(comparator)
                .colect(Collectors.toList())
                .forEach()
            //дописать делейт контакт байэнтити.гет контакт бай нейм Д/З

        }

        public boolean deleteContactByEtity(Contact contact) throws adressbookExeption

    public void searchSameContact(Contact contact) throws adressbookExeption {
  Option <Contact> sameContactOpt = store.stream()
          .filter(sameContact >
                  sameContact.getPhoneNumber()
                  .equals(contact.getPhoneNumber()))
          .findFirst();
  if(sameContactOpt.isPresent()){
      throw new adressBookExeptional(ResponseCode.OBJECT_EXIST,
              "Same contact is exist with id:" + searchSameContac;)
  }


 }
 //Д/З (джава доки)
//    /** начало первого интерфейса */
//    interface going{
//        void keepGoing();
//    }
//    /** начало второго интерфейса */
//    interface going2{
//        void  keepGoing();
//    }
//    /** начало класса с двумя интерфейсами */
//    class Impl implements going, going2{
//        void keepGoing(){}
//
        List<Contact> arrayList = new ArrayList<>();
       ArrayList<String> arrayListLarge = new ArrayList<>();
//
   arrayList.add(0, "name");
     arrayList.add(1, "Lastname");
     arrayList.add(2, "age");
     arrayList.add(3, "Lastname");
      arrayList.add(4, "phoneNamber");
      arrayList.add(5, "isMarried");
   arrayList.add(6, "  LocalDateTime createDate");
     arrayList.add(7, "  LocalDateTime updateTime");
       int arraySize = arrayList.size();
  }

}
}









