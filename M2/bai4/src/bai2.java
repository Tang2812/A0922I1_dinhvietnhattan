import java.util.*;
class StopWatch{
    private long stratTime;
    private long endTime;

    public long getStratTime() {
        return stratTime;
    }

    public void setStratTime(long stratTime) {
        this.stratTime = stratTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }
    StopWatch(){
        this.stratTime=System.currentTimeMillis();
    }
    void start(){
        long a=System.currentTimeMillis();
        this.setStratTime(a);
    }
    void stop(){
        long b=System.currentTimeMillis();
        this.setEndTime(b);
    }
    long getElapsedTime(){
        long dif=this.getEndTime()-this.getStratTime();
        return dif;
    }
}
public class bai2 {
    public static void main(String[] args) {
        StopWatch ojb=new StopWatch();
        ojb.start();
        try {
            Thread.sleep(5*60*10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        ojb.stop();
        System.out.println("The Elapsed time is: "+ ojb.getElapsedTime()+" milisec");
    }
}
