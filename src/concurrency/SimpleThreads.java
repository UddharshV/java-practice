package concurrency;

public class SimpleThreads {
    public static void main(String[] args) throws InterruptedException{
        // Delay in (ms): Interrupt Message Loop (default: 1 hour -> 3600 seconds)
        long paitence = 1000*3600;
        //If command line arguments are given, get paitence from user's input in seconds
        if(args.length>0)
            try{
                paitence = Long.parseLong(args[0])*1000;
            }catch(NumberFormatException e){
                System.out.println("Argument must be an integer");
                System.exit(1);
        }
        threadMessage("Starting Message Loop Thread!");
        long startTime = System.currentTimeMillis();
        Thread t = new Thread(new MessageLoop());
        t.start();

        //Loop until Message Loop Thread exits
        while(t.isAlive()){
            threadMessage("Still waiting...");
            //wait for a max of 1 second for the Message Loop Thread to finish
            t.join(1000);
            if((System.currentTimeMillis()-startTime)>paitence && t.isAlive()) {
                threadMessage("Tired of waiting!");
                t.interrupt();
                //Wait indefinitely
                t.join();
            }
        }
        threadMessage("Finally!!!");
    }

    public static void threadMessage(String message) {
        String threadName = Thread.currentThread().getName();
        System.out.format("%s: %s%n", threadName, message);
    }

    public static class MessageLoop implements Runnable {
        public void run(){
            String[] impInfo = {"Hello, World!", "Hello there!", "What's up buttercup?!"};
            try{
                for (String str : impInfo) {
                    // Pause for 4 seconds
                    Thread.sleep(4000);
                    // Print a message
                    threadMessage(str);
                }
            }catch(InterruptedException e){
                threadMessage("I wasn't done!");
            }
        }
    }
}
