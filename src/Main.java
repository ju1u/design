import com.ju1u.design.Adapter.Airconditioner;
import com.ju1u.design.Adapter.Cleaner;
import com.ju1u.design.Adapter.Electronic110V;
import com.ju1u.design.Adapter.SocketAdapter;
import com.ju1u.design.singleton.Aclazz;
import com.ju1u.design.singleton.Bclazz;
import com.ju1u.design.singleton.SocketClient;

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

        Airconditioner airconditioner = new Airconditioner();
        Cleaner cleaner = new Cleaner();
        Electronic110V socketAdapter = new SocketAdapter(airconditioner);

        connect(cleaner);
        connect(socketAdapter);

    }

    /**
     * Adapter Pattern
     */
    public static void connect(Electronic110V electronic110V){
        electronic110V.powerOn();
    }
}
