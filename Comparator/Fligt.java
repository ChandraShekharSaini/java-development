public class Fligt implements Comparable<Fligt> {

    private String name;
    private Integer price;
    private Double duration;
    private String department;

    public Fligt(String name, int price, Double duration, String department) {
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

    public void setDepatment(String department) {
        this.department = department;
    }

    public String getDepatment() {
        return department;
    }

    public void setname(String name) {
        this.name = name;
    }
   
    public String getname() {
        return name;
    }
    

    public String toString() {
        return name + " " + price + " " + duration + " " + department;
    }
    
    @Override
    public int compareTo(Fligt o) {
        return this.price.compareTo(o.price);
    }

}