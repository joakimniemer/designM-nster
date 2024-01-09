public class TestForEmployee {

    public static void main(String[] args) {

        Role r = new Role("Konstruktör");
        Role r2 = new Role("Mekaniker");
        Employee e = new Employee("Joakim", "Volvo", r);
        e.addRole(r2);
        e.removeRole(r2);

        System.out.println(e);

    }
}
