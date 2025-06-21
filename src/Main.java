//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ContactsManager myContactsManager = new ContactsManager();

        Contact c1 = new Contact();
        c1.name = "Sara";
        c1.phoneNumber = "0708091909";
        myContactsManager.addContact(c1);

        Contact c2 = new Contact();
        c2.name = "Fatou";
        c2.phoneNumber = "0757612332";
        myContactsManager.addContact(c2);

        Contact c3 = new Contact();
        c3.name = "Yasmine";
        c3.phoneNumber = "0708950653";
        myContactsManager.addContact(c3);

        Contact c4 = new Contact();
        c4.name = "Grace";
        c4.phoneNumber = "0700000040";
        myContactsManager.addContact(c4);

        Contact c5 = new Contact();
        c5.name = "Domi";
        c5.phoneNumber = "0706005050";
        myContactsManager.addContact(c5);

        // Recherche d’un contact
        Contact result = myContactsManager.searchContact("Sara");
        if (result != null)
        {
            System.out.println("Numéro de Sara: " + result.phoneNumber);
        }
        else
        {
            System.out.println("Contact introuvable.");
        }
    }
}
