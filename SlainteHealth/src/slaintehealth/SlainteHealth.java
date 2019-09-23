
package slaintehealth;

import java.util.ArrayList;
import java.util.Scanner;

public class SlainteHealth {

    public static void main(String[] args) {
        
        //Test the Customer Class
        //************************
        
        //Create an empty arraylist for the health conditions
        ArrayList health = new ArrayList();
        
            health.add("Bone Marrow and Immune System");
            health.add("Lungs");
              
         Policy p1 = new IndividualPolicy(1);
         p1.setHospitalCover("Public Cover");
         p1.setDailyExpenses("Standard");
         p1.setPolicyType("Individual");
        //Test Customer 1 
        Customer c1 = new Customer("Emmet", "Daly", "Male", "under 35" ,health, "none", true);

      
    
        float finalAmount = p1.calculatePolicy(c1);
//        System.out.println(finalAmount);
        p1.setTotal(finalAmount);
        c1.assignPolicyToCustomer(p1);
        
          //Test the toString method
        System.out.println(c1.toString());
        
                //Clear the arraylist - reset for Customer 2 
        health.clear();

//        
//          Test Customer 2 
        
         Policy p2 = new IndividualPolicy(2);
         p2.setHospitalCover("Comprehensive Cover");
         p2.setDailyExpenses("Enhanced");
         p2.setPolicyType("Individual");
        //Test Customer 2
        Customer c2 = new Customer("Patricia", "Folan", "Female", "35 to 55", health,"back", false);
        
        finalAmount = p2.calculatePolicy(c2);
//        System.out.println(finalAmount);
        p2.setTotal(finalAmount);
        c2.assignPolicyToCustomer(p2);
        
          //Test the toString method
        System.out.println(c2.toString());
        
                //Clear the arraylist - reset for Customer 2 
        health.clear();
        
       //          Test Customer 3 
        //Add health conditions only for customer 3 
        health.add("Cancer");
         
         Policy p3 = new IndividualPolicy(3);
         p3.setHospitalCover("Private Cover");
         p3.setDailyExpenses("Standard");
         p3.setPolicyType("Individual");
        //Test Customer 2
        Customer c3 = new Customer("Donal", "Russell", "Male", "Under 35", health,"none", false);
      
        finalAmount = p3.calculatePolicy(c3);
//        System.out.println(finalAmount);
        p3.setTotal(finalAmount);
        c3.assignPolicyToCustomer(p3);
        
          //Test the toString method
        System.out.println(c3.toString());
        
                //Clear the arraylist - reset for Customer 3 
        health.clear();
         
        
         //          Test Customer 4 
        //Add health conditions only for customer 4 
        health.add("lungs");
         
         Policy p4 = new IndividualPolicy(4);
         p4.setHospitalCover("Public Cover");
         p4.setDailyExpenses("Standard");
         p4.setPolicyType("Individual");
        //Test Customer 3
        Customer c4 = new Customer("Paul", "Kelly", "Male","Over 70", health,"none", false,p4);
        
        
        finalAmount = p4.calculatePolicy(c4);
//        System.out.println(finalAmount);
        p4.setTotal(finalAmount);
        c4.assignPolicyToCustomer(p4);
        
          //Test the toString method
        System.out.println(c4.toString());
        
                //Clear the arraylist - reset for Customer 4 
        health.clear();        
     
          //  Test Customer 5 
         health.add("Kidneys");
         
         Policy p5 = new CorporatePolicy(5);
         p5.setHospitalCover("Comprehensive Cover");
         p5.setDailyExpenses("Comprehensive");
         p5.setPolicyType("Corporate");
        //Test Customer 5
        Customer c5 = new Customer("Michelle", "Hogan", "Female","56 to 70", health,"none", true, p5);
        
        finalAmount = p5.calculatePolicy(c5);
//        System.out.println(finalAmount);
        p5.setTotal(finalAmount);
        c5.assignPolicyToCustomer(p5);
        
          //Test the toString method
        System.out.println(c5.toString());
        
                //Clear the arraylist - reset for Customer 5 
        health.clear();     
   
            //          Test Customer 6 
         health.add("Infections");
         health.add("Kidneys");
         Policy p6 = new IndividualPolicy(6);
         p6.setHospitalCover("Private Cover");
         p6.setDailyExpenses("Enhanced");
         p6.setPolicyType("Individual");
        //Test Customer 2
        Customer c6 = new Customer("Chuck", "Norris", "Male","Under 35", health,"Hips", false, p6);
        
        finalAmount = p6.calculatePolicy(c6);
//        System.out.println(finalAmount);
        p6.setTotal(finalAmount);
        c6.assignPolicyToCustomer(p6);
        
          //Test the toString method
        System.out.println(c6.toString());
        
         //Clear the arraylist - reset for Customer 6 
        health.clear();  
        
         // Test Customer 7 
        //Add health conditions only for customer 7 
        health.add("None");
         Policy p7 = new CorporatePolicy(7);
         p7.setHospitalCover("Public Cover");
         p7.setDailyExpenses("Standard");
         p7.setPolicyType("Corporate");
        //Test Customer 7
        Customer c7 = new Customer("Daniel", "Kiely", "Male","35 to 55" , health,"None", true, p7);
        
        finalAmount = p7.calculatePolicy(c7);
//        System.out.println(finalAmount);
        p7.setTotal(finalAmount);
        c7.assignPolicyToCustomer(p7);
        
          //Test the toString method
        System.out.println(c7.toString());
          //Clear the arraylist - reset for Customer 8 
        health.clear();  
        
                //          Test Customer 8 
         health.add("None");
         Policy p8 = new IndividualPolicy(8);
         p8.setHospitalCover("Public Cover");
         p8.setDailyExpenses("Comprehensive");
         p8.setPolicyType("Individual");
        //Test Customer 2
        Customer c8 = new Customer("Daniel", "Cooper", "Male","35 to 55" , health,"None", true, p8);
      
        // Test full customer constructor without policy 
        
        finalAmount = p8.calculatePolicy(c8);
//        System.out.println(finalAmount);
        p8.setTotal(finalAmount);
        c8.assignPolicyToCustomer(p8);
        
          //Test the toString method
        System.out.println(c8.toString());
        
                //Clear the arraylist - reset for Customer 8 
        health.clear();  
    
    }
}