public class Person {
    String firstName;
    String lastName;
    int age;
    String partner;

    boolean isRetired(){
        if(this.age>=100) {
            return true;
        } else {
            return false;
        }
    }
    String registerPartnership() {
        return null;
    }
    String deregisterPartnership() {
        return this.lastName;
    }

    public Person(String firstName, String lastName, int age, String partner) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.partner = partner;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPartner() {
        return partner;
    }

    public void setPartner(String partner) {
        this.partner = partner;
    }
}
