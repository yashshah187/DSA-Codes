class FooBar {
    private int n;
    Semaphore s1=new Semaphore(1);
    Semaphore s2=new Semaphore(0);
    
    public FooBar(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {

        for (int i = 0; i < n; i++) {
           
            s1.acquire();
        	printFoo.run();
            s2.release();    
            
        }
        
    }

    public void bar(Runnable printBar) throws InterruptedException {
       
        for (int i = 0; i < n; i++) {
            s2.acquire();
        	printBar.run();
            s1.release();
            
        }
         
    }
}