public class Woman extends Person {
    private Man partner;
    private Man previousLastName;

    public Woman(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    public Man getPartner() {
        return partner;
    }

    public void setPartner(Man partner) {
        this.partner = partner;
    }
    @Override
    boolean isRetired() {
        return getAge() >= 60;
    }

    public String registerPartnership(Man man) {
        if (man.getPartner() != null) {
            man.getPartner().deregisterPartnership(false);
        }
        man.setPartner(this);
        this.setPartner(man);
        this.setLastName(man.getLastName());
        return this.lastName;
    }

    public void deregisterPartnership(boolean returnToPreviousLastName) {
        if (this.partner != null) {
            if (returnToPreviousLastName) {
                this.setLastName(this.getLastName());
            }
            this.partner.setPartner(null);
            this.setPartner(null);
        }
    }
}