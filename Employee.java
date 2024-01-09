import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private List<Role> roles;
    private String department;

    public Employee(String name, String department, Role initialRole) {
        this.name = name;
        this.department = department;
        this.roles = new ArrayList<>();
        this.roles.add(initialRole);

    }

    public void addRole(Role role) {
        this.roles.add(role);
    }

    public void removeRole(Role role){
        this.roles.remove(role);
    }

    public String toString() {
        return String.format("%s works att department %s and have these roles: %s", name, department, roles);
    }

}
