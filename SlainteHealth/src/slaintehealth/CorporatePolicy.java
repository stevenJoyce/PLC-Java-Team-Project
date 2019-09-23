package slaintehealth;

public class CorporatePolicy extends Policy {

    private float corpAmount;
            float corpDiscount;
            float finalAmount;
            
    public CorporatePolicy(int policyId) {
        super(policyId);
    }

    public void setCorpAmount(float corpTotal) {
        this.corpAmount = corpTotal;
        
    }

    public float getCorpAmount() {
        return corpAmount;
    }

    @Override
    public float calculatePolicy(Customer customer) {
        System.out.println("Calc corp policy");
        corpAmount = super.calculatePolicy(customer);
        System.out.println("subtotal: "+corpAmount);
        corpDiscount = corpAmount/10;
        System.out.println("discount: "+corpDiscount);
        finalAmount = corpAmount - corpDiscount;
        System.out.println("final amount: "+finalAmount);
        return finalAmount;
    }

    @Override
    public String toString() {
            return super.toString();
      
    }
}
