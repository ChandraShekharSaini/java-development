package Papa;

import Papa.Father;

public class Son {
    public static void main(String[] args) {
        Father f = new Father();
        f.cycle(); // public
       // f.atm(); // private
        f.car(); // protected
        f.bike(); // default
    }
}
