package dao.impl;

import Exeption.addressBookException;
import dao.ContactDao;
import entity.Contact;

import java.util.Objects;

//** описываем джава методы и сетим их*/
public class ContactDaoImpl implements ContactDao {

    private static int generator = 0;

    private Contact[] contacts = new Contact[10];

    @Override
    public Contact createContact(Contact newContact) {
            for (int i = 0; i < contacts.length; i++) {
                if (Objects.isNull(contacts[i])) {
                    contacts[i] = new Contact();
                    contacts[i].setId(++generator);
                    contacts[i].setName(newContact.getName());
                    contacts[i].setLastName(newContact.getLastname());
                    contacts[i].setAge(newContact.getAge());
                    contacts[i].setMarried(newContact.isMarried());
                    contacts[i].setPhoneNumber(newContact.getPhoneNumber());
                    contacts[i].setCreateDate(newContact.getCreateDate());
                    contacts[i].setUpdateTime(newContact.getUpdateTime());
                    return newContact;
                }
            }
        System.out.println("Array have not empty cell.");
        return newContact;
    }

    @Override
    public Contact findById(int id) {
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] != null && contacts[i].getId() == id) {
                System.out.println(contacts[i]);
                return contacts[i];
            }
        }
        System.out.println("Contact with id = " + id + " not found");
        return new Contact();
    }

    @Override
    public boolean removeContact(int id) {
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] != null && contacts[i].getId() == id) {
                contacts[i] = null;
            }
        }
        return false;
    }

    @Override
    public Contact updateContact(Contact updatedContact) {
        for (Contact contactStore : contacts) {
            if (contactStore != null && Objects.equals(contactStore.getId(), updatedContact.getId())) {
                contactStore.setName(updatedContact.getName());
                contactStore.setLastName(updatedContact.getLastname());
                contactStore.setAge(updatedContact.getAge());
                contactStore.setPhoneNumber(updatedContact.getPhoneNumber());
                contactStore.setMarried(updatedContact.isMarried());
                contactStore.setUpdateTime(updatedContact.getUpdateTime());
                System.out.println("Contact was updated");
                System.out.println(contactStore);
                return updatedContact;
            }
        }
        return updatedContact;
    }

    @Override
    public void showAllContacts() {
        for (int i = 0; i < contacts.length; i++) {
            if (!Objects.isNull(contacts[i])) {
                System.out.println(contacts[i]);
            }
        }
    }



//    public Contact[] getContactById(Integer contactId) trows adressbookExeption {
//        return store
//                .stream()
//                .filter(contact > contact.getId)
//                .findFirst()
//                .orElseThrow(())
//        new adressbookExeption(ResponsCode.NOT_FOUND, NOT_FOUND_MESSAGE)
//    }

//    @Override
//    public Contact updateContact(Contact contact) {
//        store = store
//                .sream()
//                .peek(updateContact > {
//        if (updateContact.getId() == Contact.getId()) {
//
//        }
//
//    }).collect(Collectors.toCollection(TreeSet::new));
//        return contact;
//
//        public void showContacts ( int number){
//            Comparator<Contact> comperator;
//            switch (number) {
//                case 1:
//                    comperator = Comparator.comparing(Contact::getName);
//                    break;
//            }
//            case 2:
//                comperator = Comparator.comparing(Contact::getLastName);
//                break;
//            default:
//                comperator = Comparator.comparing(Contact::getId);
//        }
//        store.stream()
//                .sorted(comparator)
//                .colect(Collectors.toList())
//                .forEach()
    //дописать делейт контакт байэнтити.гет контакт бай нейм Д/З

//    }

//    pub
//    lic boolean deleteContactByEtity(Contact contact) throws addressBookException {
//        return true;
//    }
//    public void searchSameContact(Contact contact) throws adressbookExeption {
//        Option<Contact> sameContactOpt = store.stream()
//                .filter(sameContact >
//                        sameContact.getPhoneNumber()
//                                .equals(contact.getPhoneNumber()))
//                .findFirst();
//        if (sameContactOpt.isPresent()) {
//            throw new adressBookExeptional(ResponseCode.OBJECT_EXIST,
//                    "Same contact is exist with id:" + searchSameContac;)
//        }
//    }
//
//        ArrayList<Contact> arrayListContacts = new ArrayList<>();
//       ArrayList<String> arrayListLarge = new ArrayList<>();
//
//   arrayListContacts.add(0, "name");
//     arrayListContacts.add(1, "Lastname");
//     arrayListContacts.add(2, "age");
//     arrayListContacts.add(3, "Lastname");
//      arrayListContacts.add(4, "phoneNamber");
//      arrayListContacts.add(5, "isMarried");
//   arrayListContacts.add(6, "  LocalDateTime createDate");
//     arrayListContacts.add(7, "  LocalDateTime updateTime");
//       int arraySize = arrayListContacts.size();
}










