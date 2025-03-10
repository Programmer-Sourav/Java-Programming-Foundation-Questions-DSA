public class ThreadSimple  extends Thread{

   public static volatile Boolean threadStop = true;

    @Override
    public void run(){
        while(threadStop){
            System.out.print("Thread running...");
        }
    }
    public static void main(String [] args){
          ThreadSimple threadSimple = new ThreadSimple();
          threadSimple.start();
          try{
              Thread.sleep(0);
          }
          catch (InterruptedException e) {
              throw new RuntimeException(e);
          }
         threadStop = false;
    }
}


