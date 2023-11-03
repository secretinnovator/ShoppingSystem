public  class BoxCart {
    String item;
    BoxCart next;
    BoxCart(String item){
        this.item = item;
        this.next = null;
    }

}
class ShopCart{
    BoxCart head;
    ShopCart(){
        head = null;
    }
    public void AddCart(String item)
    {
        BoxCart newItem = new BoxCart(item);
        if(head == null)
        {
            head = newItem;
        }
        else
        {
            BoxCart current = head;
            while(current.next != null)
            {
                current = current.next;
            }
            current.next = newItem;
        }
        System.out.println(" (Item added)");
    }

    public void viewCart()
    {

        if (head == null)
        {
            System.out.println("Empty Cart");
            return;
        }
        BoxCart current = head;
        while(current != null)
        {
            System.out.println("Item : "+current.item);
            current = current.next;
        }
    }
    public void searchCart(String item) {
        if(head == null) {
            System.out.println("No item in the cart!");
        }
        BoxCart current = head;
        while(current != null)
        {
            if (current.item.equalsIgnoreCase(item))
            {
                System.out.println("Your Item is in the cart!");
                return;
            }
            current = current.next;
        }
        System.out.println("Not in the Cart");
    }
    public void viewinDel()
    {
        if(head == null) {
            System.out.println("Empty Cart (Enter any type to exit)");
        }
        BoxCart current = head;
        while(current != null)
        {
            System.out.println(current.item);
            current = current.next;
        }
    }

    public void deleteCart(String item)
    {
        if(head == null)
        {
            return;
        }
        if(head.item.equalsIgnoreCase(item))
        {
            head = head.next;
            return;
        }
        BoxCart current = head;
        while (current.next != null) {
            if (current.next.item.equalsIgnoreCase(item)) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
        System.out.println("Not in Cart");
    }
    //Update in the Cart
    public void updateCart(String oldItem, String newItem) {
        if (head == null) {
            System.out.println("The cart is empty!");
            return;
        }

        BoxCart current = head;
        while (current != null) {
            if (current.item.equalsIgnoreCase(oldItem)) {
                current.item = newItem;
                return;
            }
            current = current.next;
        }

        System.out.println("Item not found in the cart.");
    }

}