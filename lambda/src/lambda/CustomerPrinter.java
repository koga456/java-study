package lambda;

import java.time.LocalDate;

public class CustomerPrinter {
    
  public static void printCustomer(Customer c) {
  
    StringBuffer printbuffer= new StringBuffer();
    printbuffer.append("���O: " + c.getName()+", ");
    printbuffer.append("����: " + c.getGender()+", ");
    printbuffer.append("�T�C�Y: " 
                 + c.getSize().toString()+", ");
    printbuffer.append("�a����: " 
                +c.getBirthday().toString());
        
    System.out.println(printbuffer.toString());
  }
  
  public static void printNameAndAge(Customer c) {

    System.out.println("���O: "+ c.getName()+ 
      ", �N��: "+ (LocalDate.now().getYear()-
                   c.getBirthday().getYear()));
  }
}