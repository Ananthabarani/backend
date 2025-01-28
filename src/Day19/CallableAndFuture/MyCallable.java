package Day19.CallableAndFuture;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Long> {

    @Override
    public Long call() throws Exception {
        int n=5;
        long result=1;
        if(n<0){
            throw new IllegalArgumentException("Not Vallid");
        }
        else{
            for(int i=1;i<=n;i++){
                result*=i;
            }
        }
        return result;
    }
}
