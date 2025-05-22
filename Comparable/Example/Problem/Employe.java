
public class Employe {

    private String name;
    private Integer id;

    public Employe(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public String toString() {
        return name + " " + id;
    }

}