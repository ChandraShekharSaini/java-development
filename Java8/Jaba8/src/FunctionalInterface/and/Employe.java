package FunctionalInterface.and;

public class Employe {

    private int id;
    private String name;
    private String location;
    private String role;

    public Employe() {

    }

    public Employe(int id, String name, String location, String role) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.role = role;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return id + " " + name + " " + location + " " + role;
    }
}
