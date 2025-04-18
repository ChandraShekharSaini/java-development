public class String1{
    public static void main(String[] args){
       
      String str =  "the sky is blue";
      
      System.out.println(Reverse(str));
    }


    public static String Reverse(String str){
      String[] words = str.trim().split("\\s+");

        StringBuilder reverse = new StringBuilder();

        for(int i=words.length-1 ;i>=0;i--){
            reverse.append(words[i]);

               if (i != 0) {
                reverse.append(" ");
            }
        }

        return reverse.toString();
    }
}