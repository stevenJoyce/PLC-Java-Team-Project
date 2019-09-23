package slaintehealth;

import java.util.ArrayList;

public class Policy {

    
    //instance variables 
    private String hospitalCover;

    private String dailyExpenses;

    private int policyId;

    private float total;

    private String policyType;
    
    //constructors 

    public Policy(int policyId) {
        this.policyId = policyId;
    }

    
    //Setter and getter methods 
    public void setHospitalCover(String hospitalCover) {
    this.hospitalCover = hospitalCover;
    }

    public void setDailyExpenses(String dailyExpenses) {
        this.dailyExpenses = dailyExpenses;
    }

    public void setPolicyId(int policyId) {
        this.policyId = policyId;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public String getHospitalCover() {
        return hospitalCover;
    }

    public String getDailyExpenses() {
       return dailyExpenses;
    }

    public int getPolicyId() {
        return policyId;
    }

    public float getTotal() {
       return total;
    }

    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    public String getPolicyType() {
        return policyType;
    }

    
    //Display policy info 
    public String toString() {
       return "\n policyId: " + policyId +"\n hospitalCover: " + hospitalCover + 
               "\n dailyExpenses: " + dailyExpenses + "\n policyType: " + policyType 
               + "\n total: " + total;
    }

    
    // Calculate insurance premium 
    
    public float calculatePolicy(Customer customer) {
        float quote = 0;
     if (!customer.getAge().matches("Over 70") ) 
     { 
  
        //check the customer gender
        if (customer.getGender().equalsIgnoreCase("male")) {
            quote= 200*2;   
        }
        else if (customer.getGender().equalsIgnoreCase("female")) {
        quote = 200/100*70;
    }//end of else if
        
    //  System.out.println("\nWIP: Gender calculation: "+quote);  
        
    //check the customer age
        if(customer.getAge().equalsIgnoreCase("Under 35")){
            quote = quote/100*20 + quote;
    }
        else if(customer.getAge().equalsIgnoreCase( "35 to 55" ))  {
        quote = quote/100*40 + quote;    
    }
        else if(customer.getAge().equalsIgnoreCase("56 to 70")) {
        quote = quote/100*65 + quote;
    }
      
       
      //  System.out.println("\n Age calculation: "+quote);  
        
        //health Conditions
        //if the list is not empty
        //then process the list
        if(customer.getHealthConditions().size()>0){ 
//            System.out.println("\n *** This customer has some health conditions: ***\n");
     
             ArrayList HealthConditions =(ArrayList)customer.getHealthConditions();
      
             for (int i = 0; i < HealthConditions.size(); i++) {
          
                 switch(HealthConditions.get((int) i).toString()){
                     case "Bone Marrow and Immune System":
//                         System.out.println("\n *** This customer has BONE MARROW conditions: ***\n");
                           quote = quote/100*20 + quote;
                            break;
                      case "Cancer":
            
                quote = quote/100*25 + quote;
              
         break;
            case "Cardiovascular Disease":
           
                quote = quote/100*30 + quote;
            
         break;
            case "Gastrointestinal":
            
               quote = quote/100*10 + quote;
              
         break;
            case "Infections":
          
               quote = quote/100*10 + quote;
             
         break;
            case "Kidneys":
           
               quote = quote/100*25 + quote;
             
         break;
            case "Lungs":
//               System.out.println("\n *** This customer has LUNGS conditions: ***\n");
               quote = quote/100*25 + quote;
            
         break;
            case "Musculoskeletal":
           
                quote = quote/100*30 + quote;
            
      break; 
            case "None":     
       
         quote = quote;
                break;
     }
    }
}
      
     //System.out.println("\nWIP: Health conditions calculation: "+quote);  
     
     
     //Other Conditions
     if(customer.getIfOther().equalsIgnoreCase("None")){
         quote = quote;
     }         
     else if(customer.getIfOther().contains("")){
         quote = quote/100*50 + quote;
     }    
         
     
       // System.out.println("\nWIP: Other calculation: "+quote);   
     
     
     //Smoker
     if (customer.getSmoker()== true ) {
         quote = quote+75 ; 
     }
     
     else if(customer.getSmoker() == false) {
         quote = quote - 100;
     }
     
      //   System.out.println("\nWIP: Smoker calculation: "+quote);  
     
     //Hospital
     //Cover
     if (hospitalCover.equalsIgnoreCase("Public Cover")) {
         quote = quote;
     }
     else if (hospitalCover.equalsIgnoreCase("Private Cover")) {
         quote = quote/100*20+quote;
     }
     else if (hospitalCover.equalsIgnoreCase("Comprehensive")) {
         quote = quote/100*30+quote;
     }
         
     
      //   System.out.println("\nWIP: Hospital Cover calculation: "+quote);  
     //Day to Day
     //Expenses
     
     if (this.getDailyExpenses().equalsIgnoreCase("Standard")) {
         quote = quote;
     }
     else if (this.getDailyExpenses().equalsIgnoreCase("Enhanced")) {
         quote = quote/100*20+quote;
     }
     else if (this.getDailyExpenses().equalsIgnoreCase("Comprehensive")) {
         quote = quote/100*30+quote;
     }
     
     }
      else {
   //Has to stop due to over the age limit
    System.out.println("I am sorry to inform you, that you are over our age limit.");
         
        }
   //  System.out.println("\nWIP: dTd  calculation: "+quote);  
     
//    if(this.getPolicyType().equalsIgnoreCase("Individual")) {
//        quote = quote;
//    } 
//    else if (this.getPolicyType().equalsIgnoreCase("Corporate")) {
//        quote = quote/10+quote;
//    } 
     
    

    
     return quote;
       
    }//Calculate Premium

}// Policy