public class Main {
    public static void main(String[] args) {
        Man man = new Man("Dmytro","Bilyi", 63,"New");
        Woman woman = new Woman("Olha", "New",61,"Bilyi");
        boolean s = man.isRetired();
        boolean s1 = woman.isRetired();
        System.out.println("Вік більший пенсійного порогу? - " +s);
        System.out.println("Вік більший пенсійного порогу? - "+ s1);
        String s3 = man.registerPartnership();
        String s4 = woman.registerPartnership();
        System.out.println("Прізвище після реєстрації браку у чоловіка - " + s3);
        System.out.println("Прізвище після реєстрації браку у жінки - " + s4);
        String s5 = man.deregisterPartnership();
        String s6 = woman.deregisterPartnership();
        System.out.println("Прізвище після розлучення у чоловіка - "+s5);
        System.out.println("Прізвище після розлучення у жінки - "+s6);
    }
}
