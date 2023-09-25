import java.util.*;

import java.lang.System;

 
class Market
{
  
private String madeBy;
  
Market (String madeBy)
  {
    
this.madeBy = madeBy;
  
}
  
 
public void mainMenu ()
  {
    
System.out.println ("------------SUPER MARKET------------");
    
System.out.println ();
    
System.out.println ("------------BILLING-------------------");
    
System.out.println ();
    
System.out.println ("-------------PROJECT-----------------");
    
System.out.println ();
    
System.out.println ("MADE MY : - " + madeBy);
    
System.out.println ();
    
System.out.print ("ENTER 0 FOR EXIT AND 1 FOR CONTINUE : ");

 
} 
} 
 
 
class Administrator

{
  
Prod pro;
  
int quan;
  
Scanner sc = new Scanner (System.in);
  
ArrayList < Prod > arrProdects = new ArrayList <> ();
  
 
Administrator ()
  {
    
arrProdects.add (new Prod (101, "toyCar", 120));
    
arrProdects.add (new Prod (102, "toyBike", 250));
    
arrProdects.add (new Prod (103, "toyPhone", 380));
    
arrProdects.add (new Prod (104, "Cycle", 3400));
    
arrProdects.add (new Prod (105, "Remote", 540));
  
} 
 
public void adminMenu ()
  {
    
System.out.println ();
    
System.out.println ("ADMIN MENU :- ");
    
System.out.println ("1.CREATE PRODUCT ");
    
System.out.println ("2.DISPLAY ALL PRODUCT ");
    
System.out.println ("3.MODIFY PRODUCT");
    
System.out.println ("4.DELETE PRODUCT");
    
System.out.println ("5.BACK TO MAIN MENU");
    
System.out.print ("Enter Your Choice(1-5) :-  ");
    
int userInput = sc.nextInt ();
    
 
if (userInput == 1)
      {
	
addProd ();
      
}
    else if (userInput == 2)
      {
	
showProduct (false);
      
}
    else if (userInput == 3)
      {
	
modify ();
      
}
    else if (userInput == 4)
      {
	
deleteProduct ();
      
}
    else if (userInput == 5)
      {
	
Main.mainMenu ();
      
}
  
}
  
 
 
 
void deleteProduct ()
  {
    
System.out.println ();
    
System.out.print ("Eneter Product Id To Delete :- ");
    
int id = sc.nextInt ();
    
pro = null;
  
for (Prod pro1:arrProdects)
      {
	
if (id == pro1.getID ())
	  {
	    
pro = pro1;
	  
}
      
}
    
if (pro != null)
      {
	
arrProdects.remove (pro);
	
System.out.println ("Product Delete Successful : ");
      
}
    else
      {
	
System.out.println ("Wrong Id!! ");
      
}
  
}
  
 
void addProd ()
  {
    
System.out.print ("Please Enter The Product Id :- ");
    
int id = sc.nextInt ();
    
System.out.print ("Please Enter Name of Product :- ");
    
String name = sc.next ();
    
System.out.print ("Please Enter The Price of Product  :- ");
    
float price = sc.nextFloat ();
    
System.out.println ();
    
System.out.println ("The Product Has Been Created :) ");
    
 
arrProdects.add (new Prod (id, name, price));
  
} 
 
 
void modify ()
  {
    
System.out.println ();
    
System.out.print ("Eneter Product Id To Modify Product :- ");
    
int id = sc.nextInt ();
    
pro = null;
  
for (Prod pro1:arrProdects)
      {
	
if (id == pro1.getID ())
	  {
	    
pro = pro1;
	  
}
      
}
    
if (pro != null)
      {
	
modifyPart (pro);
      
}
    else
      {
	
System.out.println ("Wrong Id!! ");
      
}
  
}
  
 
 
void modifyPart (Prod pro)
  {
    
System.out.println ();
    
System.out.println ("1.Edit Id");
    
System.out.println ("2.Edit Name");
    
System.out.println ("3.Edit Price");
    
System.out.println ();
    
System.out.print ("Enter What You Want To Edit :- ");
    
int edit = sc.nextInt ();
    
switch (edit)
      {
      
case 1:
	
System.out.println ();
	
System.out.print ("Enter New Id To Edit :- ");
	
int newId = sc.nextInt ();
	
pro.setID (newId);
	
System.out.print ("ID Modifyed Successful : ");
	
System.out.println ();
	
break;
      
 
case 2:
	
System.out.println ();
	
System.out.print ("Enter New Name To Edit :- ");
	
String newName = sc.next ();
	
pro.setProdectName (newName);
	
System.out.print ("Name Modifyed Successful : ");
	
System.out.println ();
	
break;
      
 
case 3:
	
System.out.println ();
	
System.out.print ("Enter New Price To Edit :- ");
	
int newPrice = sc.nextInt ();
	
pro.setPrice (newPrice);
	
System.out.print ("Price Modifyed Successful : ");
	
System.out.println ();
	
break;
      
 
}
  
}
  
 
void showProduct (boolean is)
  {
    
System.out.println ();
    
System.out.println ("PRODUCT MENU :- ");
    
System.out.println ();
    
System.out.
      println
      ("------------------------------------------------------------ ");
    
System.out.println ("ID" + "          " + "NAME" + "          " +
			 "PRICE");
    
System.out.
      println
      ("------------------------------------------------------------ ");
    
System.out.println ();
  
 
for (Prod pro2:arrProdects)
      {
	
 
System.out.println (pro2.getID () + "          " +
			       pro2.getProdectName () + "          " +
			       pro2.getPrice ());
	
System.out.
	  println
	  ("------------------------------------------------------------ ");
      
}
    
if (is)
      {
	
System.out.
	  print ("Enter 0 For Main Menu And 1 To Continue Shoping : - ");
	
int shop = sc.nextInt ();
	
System.out.println ();
	
if (shop == 0)
	  {
	    
Main.mainMenu ();
	  
}
	else
	  {
	    
showProductPart ();
	  
}
      
}
  
 
}
  
 
 
void showProductPart ()
  {
    
System.out.println ("PLACE YOUR ORDER ");
    
System.out.println ();
    
System.out.print ("Enter The Product Id Of The Product :- ");
    
int productId = sc.nextInt ();
    
pro = null;
  
for (Prod pro1:arrProdects)
      {
	
if (productId == pro1.getID ())
	  {
	    
pro = pro1;
	  
}
      
}
    
 
if (pro == null)
      {
	
System.out.println ();
	
System.out.
	  println ("Product Not Found !! , Enter Right Product ID ");
      
}
    else
      {
	
System.out.print ("Quantity in Number :- ");
	
quan = sc.nextInt ();
	
System.out.println ();
	
System.out.print ("Do You Want To Buy This (y/n) : ");
	
String yesno = sc.next ();
	
if (yesno.equals ("Y") || yesno.equals ("y"))
	  {
	    
invoice ();
	  
}
	else
	  {
	    
System.out.println ("Check Our New Products");
	  
}
      
}
  
}
  
 
 
void invoice ()
  {
    
System.out.println ();
    
System.out.println ("----------INVOICE----------");
    
System.out.println ();
    
System.out.println ("Product ID : " + pro.getID ());
    
System.out.println ();
    
System.out.println ("Product Name : " + pro.getProdectName ());
    
System.out.println ();
    
System.out.println ("Product Price : " + pro.getPrice ());
    
System.out.println ();
    
System.out.println ("Your Total Quantity is : " + quan);
    
System.out.println ();
    
System.out.println ("Your Total Price is : " + (pro.getPrice () * quan));
    
System.out.println ();
    
 
 
System.out.println ("----------ENTER 0 FOR MAIN MENU----------");
    
int temp = sc.nextInt ();
    
if (temp == 0)
      {
	
Main.mainMenu ();
      
}
  
}

 
}


 
 
class Prod
{
  
private int id;
  
private String prodectName;
  
private float price;
  
 
public Prod (int id, String prodectName, float price)
  {
    
this.id = id;
    
this.prodectName = prodectName;
    
this.price = price;
  
} 
 
public int getID ()
  {
    
return id;
  
}
  
 
public String getProdectName ()
  {
    
return prodectName;
  
}
  
 
public float getPrice ()
  {
    
return price;
  
}
  
 
public void setID (int id)
  {
    
this.id = id;
  
} 
 
public void setProdectName (String prodectName)
  {
    
this.prodectName = prodectName;
  
} 
 
public void setPrice (float price)
  {
    
this.price = price;

} 
 
 
} 
 
 
 
class Main

{
  
static Scanner sc = new Scanner (System.in);
  
static Administrator admin = new Administrator ();
  
static Market mar = new Market ("RAHUL MAJUMDAR");
  
public static void main (String[]args)
  {
    
mar.mainMenu ();
    
firstScreen ();
  
} 
 
static void firstScreen ()
  {
    
int userInput = sc.nextInt ();
    
if (userInput == 0)
      {
	
System.out.println ("Thanks For Using SUPER MARKET :) ");
      
}
    else if (userInput == 1)
      {
	
mainMenu ();
      
}
  
}
  
 
public static void mainMenu ()
  {
    
System.out.println ();
    
System.out.println ("MAIN MENU :- ");
    
System.out.println ();
    
System.out.println ("1.CUSTOMER ");
    
System.out.println ("2.ADMINISTRATOR ");
    
System.out.println ("3.EXIT ");
    
System.out.println ();
    
System.out.print ("Please select Your Option(1-3) :- ");
    
int userInput = sc.nextInt ();
    
 
while (true)
      {
	
if (userInput == 1)
	  {
	    
	      //Customer cust = new Customer();
	      admin.showProduct (true);
	  
}
	else if (userInput == 2)
	  {
	    
admin.adminMenu ();
	  
}
	else if (userInput == 3)
	  {
	    
System.out.println ("Thaks For Using My Shop :) ");
	    
System.exit (0);
	    
break;
	  
}
      
}
  
}

 
}
