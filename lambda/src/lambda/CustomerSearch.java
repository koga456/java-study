package lambda;

import java.util.HashMap;
import java.util.List;
import java.util.OptionalDouble;


public class CustomerSearch {
   
 public static void main(String[] args) {
           
   List<Customer> customers = Customer.listCustomers();
       
    if (args.length > 0) {
      
      switch (args[0]) {
        
        case "filter":
          customers.stream().filter(c->(c.getAge() >29))
            .filter(c->(c.getAge()<40))
            .forEach(CustomerPrinter::printNameAndAge);
          break;
          
        case "sorted":

          customers.stream()
            .sorted((c1,c2)->c1.getName().compareTo(c2.getName()))
            .forEach((c)->System.out.println(c.getName()));
          break;
          
        case "anymatch":

          if (customers.stream()
            .anyMatch((c)->(c.getAge()<20))){
             System.out.println("���l�������͒��~");
          } else {
             System.out.println("���Ȃ�");
         }
         break;
         
        case "count":

          for(Size s: Size.values()){

            long sizecount = customers.stream()
              .filter(c->c.getSize()==s).count();

            System.out.println(s.toString()+": "+sizecount);
          }
        break;
        
        case "sum":

          HashMap<Size, Integer> point = new HashMap<>();
            point.put(Size.SMALL, 1);
            point.put(Size.MIDDLE,3);
            point.put(Size.LARGE, 5);
            point.put(Size.XLARGE,10);
                        
          int allpoints = customers.stream()
            .mapToInt(c->point.get(c.getSize())).sum();
                       
          System.out.println(
            "���������|�C���g�̑��v�F"+allpoints+"�_");
          break;
          
        case "average":

          OptionalDouble averageAge = customers.stream()
            .filter(c->c.getGender()==Gender.MAN)
            .mapToDouble(c->c.getAge()).average();
          
          String outString = String.format(
           "�j���̕��ϔN��F %.1f��", averageAge.getAsDouble());
               
          System.out.println(outString);
         break;
        }
      
    } else {
      customers.forEach(CustomerPrinter::printCustomer);
    }
 }   
}