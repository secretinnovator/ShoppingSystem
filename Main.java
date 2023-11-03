import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ShopCart myCart = new ShopCart();
        try (Scanner buyer = new Scanner(System.in)){
            String item;
            int choice;
            while (true) {
                System.out.println("\n------Shopping Cart System--------\n");
                System.out.println(      "Open 24/7\n");
                System.out.println( "[1] Add Item 	[4]Delete");
                System.out.println( "[2] View Item	[5]Update");
                System.out.println( "[3] Search	    [6] Exit");
                System.out.print("\nStart shopping now! (Enter number 1-6): ");


                choice = buyer.nextInt();

                switch(choice)
                {
                    case 1:
                        System.out.print("Enter Item : ");
                        item = buyer.next();
                        myCart.AddCart(item);
                        break;
                    case 2:
                        myCart.viewCart();
                        break;
                    case 3:
                        System.out.print("Enter Item to Search: ");
                        item = buyer.next();
                        myCart.searchCart(item);
                        break;
                    case 4:
                        myCart.viewinDel();
                        System.out.print("Enter Item to Delete: ");
                        item = buyer.next();
                        myCart.deleteCart(item);
                    case 5:
                        System.out.print("Enter the Item to Update");
                        String oldItem,newItem;
                        oldItem = buyer.next();
                        System.out.println("Enter new Item");
                        newItem = buyer.next();
                        myCart.updateCart(oldItem,newItem);
                    case 6:
                        System.exit(6);
                        break;
                    default:
                        System.out.println("Invalid Input");
                }
            }
        }
    }
}