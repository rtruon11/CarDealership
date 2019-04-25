import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    int cCount = 1;
    int sCount = 1;

    public static void main(String[] args) {

        Main main = new Main();

        final char EXIT_CODE = 'E';
        final char CUST_CODE = 'C';
        final char CUST_PRNT = 'P';
        final char INV_PRNT = 'I';
        final char SALES_CODE = 'T';
        final char SALES_PERSON = 'S';
        final char HELP_CODE = '?';
        char userAction;
        System.out.println("Team 4 Car Dealership");
        final String PROMPT_ACTION = "Add 'C'ustomer, 'P'rint Customer, List 'I'nventory, Add 'O'rder, List 'S'ales People or 'E'xit: ";
        ArrayList<Customer> cList = new ArrayList<>();
        ArrayList<Salesperson> sList = new ArrayList<>();

        userAction = getAction(PROMPT_ACTION);

        while (userAction != EXIT_CODE) {
            switch (userAction) {
                case CUST_CODE:
                    cList.add(main.addCustomer());
                    break;
                case CUST_PRNT:
                    Customer.printCustomer(cList);
                    break;
                case INV_PRNT:
                    //Inventory.listInventory(mList);
                    break;
                case SALES_CODE:
                    //SalesLead.listSalesLead);
                    break;
                case SALES_PERSON:
                    sList.add(main.addListenToTheCustomersNeeds());
                    break;
            }

            userAction = getAction(PROMPT_ACTION);
        }
    }

    public static char getAction(String prompt) {
        Scanner scnr = new Scanner(System.in);
        String answer = "";
        System.out.println(prompt);
        answer = scnr.nextLine().toUpperCase() + " ";
        char firstChar = answer.charAt(0);
        return firstChar;
    }

    public Customer addCustomer() {
        Customer cust = new Customer(cCount++);
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please Enter The Customer's First Name: ");
        cust.setFirst(scnr.nextLine());
        System.out.println("Please Enter The Customer's Last Name: ");
        cust.setLast(scnr.nextLine());
        System.out.println("Please Enter The Customer's Phone Number ");
        cust.setphone(scnr.nextLine());
        System.out.println("Please Enter The Customer's Buying Preference (New or Used)");
        cust.setpreference(scnr.nextLine());
        return cust;
    }

    public Salesperson addListenToTheCustomersNeeds() {
        Salesperson needs = new Salesperson();
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please Enter The Customer's Price Range: ");
        needs.setPriceRange(scnr.nextLine());
        System.out.println("Please Enter The Customer's Vehicle Type (ie SUV, Sedan): ");
        needs.setVehicleType(scnr.nextLine());
        System.out.println("Please Enter The Customer's Car Color:  ");
        needs.setColor(scnr.nextLine());
        System.out.println("Please Enter The Customer's Payment Type: ");
        needs.setPayment(scnr.nextLine());
        System.out.println("Please Enter The Customer's Car Need: ");
        needs.setNeed(scnr.nextLine());
        return needs;
    }
}