import java.util.Arrays;

public class Shop 
{
  private static Product[] menu;
  private Order[] orders;
  private int nextOrderIndex;

  public Shop(Product[] menu) 
  {
    this.menu = menu;
    this.orders = new Order[1000];
    nextOrderIndex = 0;
  }
  
  public void placeOrder(int menuItemId, int table)
  {
   	Product product = menu[menuItemId];
        orders[nextOrderIndex] = new Order(table, product);
        nextOrderIndex++;
  }

  public void completeOrder(int number){
    orders[number].setComplete(true);
  }

  public static Product[] getMenu(){
      return menu;
  }
  
  public void printOrder(){
      for (int i=0 ; i<nextOrderIndex ; i++)
      {
        System.out.println("#"+i+" "+orders[i].toString());
      }
  }


   
}
