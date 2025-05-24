
public class Employe implements Comparable<Employe> {

    private String name;
    private Integer id;

    public Employe(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return name + " " + id;
    }

    // now if want to sort acc to name
    // i have to change id to name
    // and this is disadvantage
    public int compareTo(Employe o) {
        return this.id.compareTo(o.id);
    }

}