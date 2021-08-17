
package vendingmachine;
import java.util.Scanner;

public class VendingMachine {
static Scanner keyboard = new Scanner(System.in);
//müşteriye ne kadar parası olduğunu sormak ve öğrenmek amacı ile
//scanner implement ettim.

    /**
     *
     * @return
     */
    public static double displayChoices(){
    //Ürünleri göstermek için method impementi
    double price = -1;
    //eğer geçersiz bir ürün değeri girilir ise 
    //otomatın -1 döndürmesini istiyoruz
    
    System.out.println("You can look the snacks you want:");
    System.out.println("A.          $1.55       Chocolate");
    System.out.println("B.          $1.75       Fruit Juice");
    System.out.println("C.          $2.00       Chips");
    System.out.println("D.          $2.25       Oreo");
    System.out.println("E.          $0.85       Crackers");
    System.out.println();
    System.out.println("what would you like to purchase?:");
    
    String choice = keyboard.next().toUpperCase();
    //Satırın değil de sadece bir harfin girilmesini istediğimizden 
     //keyboard.next komutunu kullandım.
     if(choice.equals("A")){
         price = 1.55;
         return 1.55;
    }
     else if(choice.equals("B")){
    price = 1.75;     
    return 1.75;
    }
     else if(choice.equals("C")){
    price = 2.00;     
    return 2.00;
     }
     else if(choice.equals("D")){
    price = 2.25;     
    return 2.25;
     }
     else if(choice.equals("E")){
    price = 0.85;     
    return 0.85;
     }
     else{
    return price ;
    //Fiyat başta -1 olarak tanımlıydı bu değerlerden biri girilmez ise
    //tekrardan -1 değerine dönüyoruz
}
}
    //ürün ve para iadesi için method implementi
   public static void dispense(double moneyinserted, double snackCost){
   
    if(moneyinserted> snackCost){
    System.out.println("vending..");
    System.out.println("Here`s your snack!");
    double change = moneyinserted - snackCost;
    System.out.println("Here is your $" + change + "in change.");
    
   
    }
    else{
      System.out.println("Sorry , you don`t have enough money. Here is your $"
      + moneyinserted + "back.");
    
    }
 
   
       
       
   }


    public static void main(String[] args) {
    System.out.println("welcome!");
    System.out.println("Best snacks are here");
    //kullanıcının parasını öğrenip hafızada tuttuğumuz kısım.
    System.out.print("how much money do you have ?:");
    
    double moneyinserted = keyboard.nextDouble();
    //scanner devreye giriyor.
    
    double snackCost = displayChoices();
    
    
    dispense(moneyinserted, snackCost);
    //return tipi void olduğundan double olarak veriyi saklamıyorum.
    }
    
}




