public class Man extends Person {
    public Man(String firstName, String lastName, int age, String partner) {
        super(firstName, lastName, age, partner);
    }

    @Override
    boolean isRetired(){
        if(age>=65) {
            return true;
        } else {
            return false;
        }
    }
    @Override
    String registerPartnership() {
        return lastName;
    }

    public int getManAge() {
        return age;
    }

    public void setManAge(Man man) {
        this.age = man.age;
    }
}