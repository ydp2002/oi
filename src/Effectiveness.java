public class Effectiveness {

    public static void main(String [] args){
        long startTime=System.currentTimeMillis();
        long currentTime=0;

        long i;
        long j=9;
        for(i=10;i>0;i--){
            j=1;
            currentTime=System.currentTimeMillis();
        }
        System.out.println("valve "+j);
        long endTime=System.currentTimeMillis();
        System.out.println("程序运行时间："+(endTime-startTime)+"ms");
    }
}
