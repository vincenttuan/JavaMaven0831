package day09_gc;

import java.util.Random;
import java.util.stream.IntStream;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

class BigData {
    private StringBuilder data = new StringBuilder();

    public BigData() {
        IntStream.rangeClosed(1, 10_0000).forEach(i->{
            data.append(new Random().nextInt());
        });
    }

    @Override
    public String toString() {
        return "BigData{" + "data=" + data + '}';
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("再見");
    }
    
    
    
}

public class GC {
    public static void main(String[] args) {
        System.out.println("begin freeMemory: " + Runtime.getRuntime().freeMemory());
        BigData bigData1 = new BigData();
        System.out.println(bigData1);
        System.out.println("end freeMemory: " + Runtime.getRuntime().freeMemory());
        bigData1 = null;
        System.gc();
        System.out.println("after gc() freeMemory: " + Runtime.getRuntime().freeMemory());
    }
}
