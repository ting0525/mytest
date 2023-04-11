import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

public class overflow {

    public static void testStackOverFlow() {
        overflow.testStackOverFlow();
    }

    public static void testPergemOutOfMemory() {
        while (true) {
            final OOM oom = new OOM();
            Proxy.newProxyInstance(oom.getClass().getClassLoader(), oom.getClass().getInterfaces(), new InvocationHandler() {
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                    Object result = method.invoke(oom, args);
                    return result;
                }
            });
        }
    }

    public static void testStackOutOfMemory() {
        while (true) {
            Thread thread = new Thread(new Runnable() {
                public void run() {
                    while (true) {
                    }
                }
            });
            thread.start();
        }
    }


    public static void testOutOfHeapMemory() {
        List<StringBuffer> list = new ArrayList<StringBuffer>();
        while (true) {
            StringBuffer B = new StringBuffer();
            for (int i = 0; i < 10000; i++) {
                B.append(i);
            }
            list.add(B);
        }
    }


    
    public void outOfHeapMemory() {
        testOutOfHeapMemory();
    }

   
    public void outOfMemory() {
        testStackOutOfMemory();
    }

    
    public void pergemOutOfMemory() {
        testPergemOutOfMemory();
    }

    
    public void stackOverFlow() {
        testStackOverFlow();
    }

   // 其他方法的实现

   public static void main(String[] args) {
    // 创建一个 Overflow 实例
    overflow obj = new overflow();

    // 调用不同类型内存溢出错误测试的方法
    obj.stackOverFlow(); // 测试堆栈溢出错误
    obj.pergemOutOfMemory(); // 测试永久代内存溢出错误（需要JDK 7或更早版本）
    obj.outOfMemory(); // 测试堆内存溢出错误
    obj.outOfHeapMemory(); // 测试堆内存溢出错误
}
    
}

class OOM {
    String abc;

    public OOM() {
        abc = new String("testPergemOutOfMemory");
    }
}



    

