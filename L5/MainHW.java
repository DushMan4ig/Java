import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainHW {
    /*Реализуйте структуру телефонной книги с помощью HashMap, 
    учитывая, что 1 человек может иметь несколько телефонов.
    */
    public class PhoneBook {
        private Map<String, List<String>> phoneBook;
    
        public PhoneBook() {
            phoneBook = new HashMap<>();
        }
    
        // Добавить контакт и номер телефона в телефонную книгу
        public void addContact(String name, String phoneNumber) {
            List<String> phoneNumbers = phoneBook.getOrDefault(name, new ArrayList<>());
            phoneNumbers.add(phoneNumber);
            phoneBook.put(name, phoneNumbers);
        }
    
        // Получить все номера телефонов для данного имени
        public List<String> getPhoneNumbers(String name) {
            return phoneBook.getOrDefault(name, new ArrayList<>());
        }
    
        // Получить все контакты в телефонной книге
        public Map<String, List<String>> getAllContacts() {
            return phoneBook;
        }
    
        public static void main(String[] args) {
            PhoneBook phoneBook = new PhoneBook();
    
            phoneBook.addContact("Иванов", "123456789");
            phoneBook.addContact("Петров", "987654321");
            phoneBook.addContact("Иванов", "111111111");
    
            System.out.println("Все контакты:");
            Map<String, List<String>> allContacts = phoneBook.getAllContacts();
            for (String name : allContacts.keySet()) {
                List<String> phoneNumbers = allContacts.get(name);
                for (String phoneNumber : phoneNumbers) {
                    System.out.println(name + ": " + phoneNumber);
                }
            }
    
            System.out.println("\nНомера телефонов для Иванова:");
            List<String> ivanovPhoneNumbers = phoneBook.getPhoneNumbers("Иванов");
            for (String phoneNumber : ivanovPhoneNumbers) {
                System.out.println(phoneNumber);
            }
        }
    }
}
