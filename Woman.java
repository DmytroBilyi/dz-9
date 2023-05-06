public class Woman extends Person {
    public Woman(String firstName, String lastName, int age, String partner) {
        super(firstName, lastName, age, partner);
    }
    @Override
    boolean isRetired(){
        if(age>=60) {
            return true;
        } else {
            return false;
        }
    }
    @Override
    String registerPartnership() {
        this.lastName=partner;
        return partner;
    }

    public int getAge() {
        return age;
    }
    public int getWomanAge() {
        return age;
    }
    public void setWomanAge(Woman woman) {
        this.age = woman.age;
    }

}
