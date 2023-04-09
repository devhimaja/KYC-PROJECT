package Customer;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

 
 
public class Customer { 
    public static void main(String[] args) { 
    	List<Contact> c = new ArrayList<Contact>(); 
    	Scanner s = new Scanner(System.in) ; 
    	Scanner s1 = new Scanner(System.in); 
      int option; 
      do { 
       System.out.println("-------" + "Welcome to KYC Project" + "-------"); 
       System.out.println("Enter your Choice :   \n"); 
       System.out.println("1.Display Customer Registered\n"); 
       System.out.println("2.Business operation\n"); 
       System.out.println("5.Exist\n"); 
       option = s.nextInt(); 
       switch(option) { 
       case 1: 
         
        Iterator<Contact> i = c.iterator(); 
        while(i.hasNext()){ 
         Contact e = i.next(); 
         System.out.println(e); 
        } 
        break;  
        
       case 2:  
        int ch = 0; 
        do { 
         System.out.println("1.New Enrollment"); 
         System.out.println("2.Search Customer"); 
         System.out.println("3.Delete Customer"); 
         System.out.println("4. exit"); 
         System.out.println("Enter you choice:  "); 
         ch= s.nextInt(); 
        switch(ch) { 
        case 1: 
         System.out.println("Enter Customer name: "); 
         String customerName = s1.nextLine(); 
         System.out.println("Enter Email:  "); 
         String email = s1.nextLine(); 
         System.out.println("Enter PhoneNumber:  "); 
         String phoneNumber = s1.nextLine(); 
         System.out.println("Enter Address:  "); 
         String address = s1.nextLine(); 
         c.add(new Contact(customerName,email,phoneNumber,address)); 
         System.out.println("Record inserted Sucessfully"); 
         break; 
        case 2: 
         boolean found= false; 
         System.out.println("Enter customer name to Search: "); 
         String customerName1 = s1.nextLine(); 
         Iterator<Contact> it=c.iterator(); 
         while(it.hasNext()) { 
          Contact e = it.next(); 
          System.out.println(e.getCustomerName()); 
          if(e.getCustomerName().equals(customerName1)) { 
           System.out.println(e); 
           found=true; 
          } 
         } 
         if(!found) { 
          System.out.println("Record Not Found"); 
          } 
         else { 
          System.out.println("record found"); 
         } 
         break; 
        case 3: 
         boolean found1 = false; 
         System.out.println("Enter customer name to Delete: "); 
         String customerName2 = s1.nextLine(); 
         Iterator<Contact> i1=c.iterator(); 
         while(i1.hasNext()) { 
          Contact e = i1.next(); 
          if(e.getCustomerName().equals(customerName2)) { 
           i1.remove(); 
           found1=true; 
          } 
         } 
         if(!found1) { 
          System.out.println("Record Not Found"); 
         }else { 
          System.out.println("Record is Deleted."); 
         } 
         break;  
        case 4:ch =0; 
               break; 
        } 
        
      }while(ch!=0); 
        break; 
       case 5: option =0; 
          break; 
       
      } 
      }while(option!=0); 
      s.close();
      s1.close();
    }  
}
	