import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ProductionEnvironment {

    public static void main(String[] args) throws Exception {
       
        ServerSocket serverSocket = new ServerSocket(8080);
        System.out.println("start：" + serverSocket.getLocalPort());

        
        overflow obj = new overflow();

        
        new Thread(() -> obj.stackOverFlow()).start(); 
        new Thread(() -> obj.pergemOutOfMemory()).start(); 
        new Thread(() -> obj.outOfMemory()).start(); 
        new Thread(() -> obj.outOfHeapMemory()).start(); 

        
        while (true) {
            Socket socket = serverSocket.accept();
            System.out.println("catch：" + socket.getRemoteSocketAddress());

            
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}

class overflow {
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
}

class OOM {
    String abc;

    public OOM() {
        abc = new String("testPergemOutOfMemory");
    }
}
