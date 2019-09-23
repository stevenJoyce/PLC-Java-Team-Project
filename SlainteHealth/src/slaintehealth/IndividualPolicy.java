package slaintehealth;

public class IndividualPolicy extends Policy {

    public IndividualPolicy(int policyId) {
        super(policyId);
    }

    @Override
    public float calculatePolicy(Customer customer) {
       return super.calculatePolicy(customer);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}//end of class
