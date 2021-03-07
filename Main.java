public class Main {

    public static void main(String[] args) {

        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();
        Person p4 = new Person();
        Person p5 = new Person();

        p1.setFirstname("George");
        p2.setFirstname("Cierra");
        p3.setFirstname("Thomas");
        p4.setFirstname("Moby");
        p5.setFirstname("Tom");

        p1.setLastname("Shelby");
        p2.setLastname("Green");
        p3.setLastname("Walker");
        p4.setLastname("Holland");
        p5.setLastname("Roca");

        System.out.print("First: " + p1.getFirstname() + " " + p1.getLastname() + "\n");
        System.out.print("Second: " + p2.getFirstname() + " " + p2.getLastname() + "\n");
        System.out.print("Third: " + p3.getFirstname() + " " + p3.getLastname() + "\n");
        System.out.print("Fourth: " + p4.getFirstname() + " " + p4.getLastname() + "\n");
        System.out.print("Fifth: " + p5.getFirstname() + " " + p5.getLastname() + "\n");

    }
}