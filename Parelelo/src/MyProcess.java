public class MyProcess extends Thread{

    private long cont;
    private double n;
    private boolean flag;
    private int l;
    private final int lim;
    private final int ini;
    
    MyProcess(int lim, int ini) {
        this.cont = 0;
        this.n = 0;
        this.flag = true;
        this.l = 2;
        this.lim = lim;
        this.ini = ini;
    }
    
    @Override
    public void run() {
        for(long i = ini; i <= lim; i++){
           if(i >= 2){
               n = Math.floor(Math.sqrt(i));
               while(l <= n && flag){
                   if(i%l == 0){
                       flag = false;
                   }else{
                       l++;
                   }
               }
               if(l > n){
                   cont = cont + i;
               }
           }
           l = 2;
           flag = true;
        }
    }

    public double getCont() {
        return cont;
    }
}
