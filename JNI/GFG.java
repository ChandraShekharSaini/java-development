// Java Hello World Program to Demonstrate
// Java Native Interface
import java.io.*;

// Driver Class
class GFG {
      public native void print_Hello();

    // Load the native library
    static {
        System.loadLibrary("hello");
    }

      // Main Method
    public static void main (String[] args) {
        System.out.println("In this Program we will learn about Java Native");
      // Create an instance of GFG and call the native method
        GFG gfg = new GFG();
        gfg.print_Hello();
    }
}