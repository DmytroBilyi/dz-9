public class Man extends Person {
    private Woman partner;


    public Man(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    public Woman getPartner() {
        return partner;
    }

    public void setPartner(Woman partner) {
        this.partner = partner;
    }
    @Override
    boolean isRetired() {
        return getAge() >= 65;
    }

    public String registerPartnership(Woman woman) {
        if (woman.getPartner() != null) {
            woman.getPartner().deregisterPartnership(false);
        }
        woman.setPartner(this);
        this.setPartner(woman);
        woman.setLastName(this.getLastName());
        return this.lastName;
    }

    public void deregisterPartnership(boolean returnToPreviousLastName) {
        if (this.partner != null) {
            if (returnToPreviousLastName) {
                this.partner.setLastName(this.partner.getLastName());
            }
            this.partner.setPartner(null);
            this.setPartner(null);
        }
    }

}