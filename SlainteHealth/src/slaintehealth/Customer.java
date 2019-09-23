package slaintehealth;



import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JList;


public class Customer extends Assignment  {
    
// Assigning variables to the program //
    private String firstName;

    private String surname;

    private String gender;

    private String age;

    private String IfOther;

    private boolean smoker;

    private ArrayList healthCondition;

    private Policy policy;

    // Building the Customer Constructor //
    
    
    //full constructor with Policy
    
    public Customer(String fn, String sn, String g, String a, ArrayList health, 
                    String other, boolean smoke, Policy cover) {
        
        firstName = fn;
        surname = sn;
        gender = g;
        age = a;        
        healthCondition = health;
        IfOther = other;
        smoker = smoke;
        policy = cover;
        
    }
    
      //full constructor without Policy
    public Customer(String fn, String sn, String g, String a, ArrayList health, 
                    String other, boolean smoke) {
        firstName = fn;
        surname = sn;
        gender = g;
        age = a;
        IfOther = other;
        smoker = smoke;
        healthCondition = health;}
    
    //empty constructor
        public Customer() {
            
        }

  //Setter and getter methods 

    // Allowing the program to read in a given name and storing it within the 
    //First Name variable.
    public void setFirstName(String fn) {
        
        this.firstName = fn;
        
         }


    public void setSurname(String sn) {
        this.surname = sn;
        
    }

    public void setGender(String g) {
        this.gender = g;
    }

    public void setAge(String a) {
       this.age = a;
    }

    public void setIfOther(String other) {
        this.IfOther = "";
    }

    public void setSmoker(boolean smoke) {
        this.smoker = smoke;
    }

    public void setHealthConditions(ArrayList health) {
        this.healthCondition = health;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public String getGender() {
        return gender;
    }

    public String getAge() {
        return age;
    }

    public String getIfOther() {
        return IfOther;
    }

    public boolean getSmoker() {
        return smoker;
    }

    public ArrayList getHealthConditions() {
        return healthCondition;
        
    }

    //Displays Customer details 
  
    public String toString() {
        return "Name: " + firstName + "\t Surname: " + surname
                +"\nGender: " + gender + "\t Age: " + age
                + "\nHealth Condition: " + healthCondition + "\nIf Other: " + IfOther
                + "\nSmoker: " + smoker + "\n POLICY " + policy;
        
    }

    public void assignPolicyToCustomer(Policy cover) {
        this.policy = cover;
    }
}//end of class
