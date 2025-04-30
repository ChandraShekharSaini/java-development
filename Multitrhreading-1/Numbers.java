public class Numbers {
    public void number(){
        System.out.println("-------------number is executing-------------");
        for(int i = 1; i <= 10; i++){
            System.out.println(i);

            try{
                Thread.sleep(2000);
            }
            catch(InterruptedException e){
                System.out.println(e);
                e.printStackTrace();
            }
        }
    }
}
