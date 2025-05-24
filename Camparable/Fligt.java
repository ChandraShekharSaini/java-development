public class Fligt implements Comparable<Fligt> {

    private String name;
    private Integer price;
    private Double duration;
    private String department;

    public Fligt(String name, Integer price, Double duration, String department) {
        this.name = name;
        this.price = price;
        this.duration = duration;
        this.department = department;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }

    public Double getDuration() {
        return duration;
    }

    public void setDepatment(String depatment) {
        this.department = depatment;
    }

    public String getDepartment() {
        return department;
    }

    public String toString() {
        return name + " " + price + " " + duration + " " + department;
    }

    public int compareTo(Fligt ol) {

        // String il1 = this.name;
        // String il2 = ol.name;
        // return il1.compareTo(il2);

        return this.name.compareTo(ol.name);
    }

}