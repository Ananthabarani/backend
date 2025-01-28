//Write a program to calculate the sum of integers from 1 to 1,000,000 using the Fork/Join Pool.
//Create a class SumTask that extends RecursiveTask<Long>.
//Split the range of numbers into smaller tasks using the ForkJoinPool.
//Combine the results from subtasks to get the total sum.
package Day19.ForkJoin;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class SumTask extends RecursiveTask<Long> {
    private final long  start;
    private final long  end;
    private final long therShold=10000  ;

    public SumTask(long start,long end) {
       this. end =  end;
       this.start=start;
    }

    @Override
    protected Long compute() {
        long sum=0;
        if(end-start<=therShold){
            for(long i=start;i<=end;i++){
                sum+=i;
            }
            return sum;
        }
        else{
            long mid=(start+end)/2;
            SumTask lefttask=new SumTask(start,mid);
            SumTask righttask=new SumTask(mid+1,end);
              long left =lefttask.compute();
             long right= righttask.compute();
           return right+left;
        }

    }
    public static void main(String[] args) {
    long start =1;
    long end=1000000;
    ForkJoinPool fork=new ForkJoinPool();
    SumTask task=new SumTask(start,end);
    Long sum=fork.invoke(task);
        System.out.println("Sum : "+sum);
    }

}
