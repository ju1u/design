import com.ju1u.design.Adapter.Airconditioner;
import com.ju1u.design.Adapter.Cleaner;
import com.ju1u.design.Adapter.Electronic110V;
import com.ju1u.design.Adapter.SocketAdapter;
import com.ju1u.design.Aop.AopBrowser;
import com.ju1u.design.Proxy.Browser;
import com.ju1u.design.Proxy.BrowserProxy;
import com.ju1u.design.Proxy.IBrowser;
import com.ju1u.design.singleton.Aclazz;
import com.ju1u.design.singleton.Bclazz;
import com.ju1u.design.singleton.SocketClient;

import java.util.concurrent.atomic.AtomicLong;

public class Main{
    public static void main(String[] args){
        /**
         * Singleton pattern
         */
//        Aclazz aclazz = new Aclazz();
//        Bclazz bclazz = new Bclazz();
//
//        SocketClient socketClient1 = aclazz.getSocketClient();
//        SocketClient socketClient2 = bclazz.getSocketClient();
//
//        System.out.println("객체 비교");
//        System.out.println(socketClient1.equals(socketClient2));


        /**
         * Adapter Pattern
         */

//        Airconditioner airconditioner = new Airconditioner();
//        Cleaner cleaner = new Cleaner();
//        Electronic110V socketAdapter = new SocketAdapter(airconditioner);
//
//        connect(cleaner);
//        connect(socketAdapter);

        /**
         * Proxy Pattern
         */
        IBrowser iBrowser = new Browser("www.naver.com");
        IBrowser iBrowser2 = new BrowserProxy("www.naver.com");
        iBrowser.show();
        iBrowser.show();
        iBrowser2.show();
        iBrowser2.show();

        /**
         * AOP Proxy Pattern
         */
        AtomicLong start = new AtomicLong();
        AtomicLong end = new AtomicLong();
        IBrowser iBrowser3 = new AopBrowser("www.naver.com",
                ()->{
                    System.out.println("before");
                    start.set(System.currentTimeMillis());
                },
                ()->{
                    System.out.println("after");
                    long now = System.currentTimeMillis();
                    end.set(now - start.get());
                });
        iBrowser3.show();
        System.out.println("loading time: " + end.get());
        iBrowser3.show();
        System.out.println("loading time: " + end.get());
        iBrowser3.show();
        System.out.println("loading time: " + end.get());
    }


    /**
     * Adapter Pattern
     */
//    public static void connect(Electronic110V electronic110V){
//        electronic110V.powerOn();
//    }
}
