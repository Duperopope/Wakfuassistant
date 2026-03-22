/*
 * Decompiled with CFR 0.152.
 */
import java.awt.AWTEvent;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.AWTEventListener;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Map;
import javax.swing.Timer;

/*
 * Renamed from aBB
 */
public class abb_1
implements AWTEventListener {
    private static abb_1 dyR;
    final Map<Integer, abc_1> dyS = new HashMap<Integer, abc_1>();

    public static void bVy() {
        dyR = new abb_1();
        Toolkit.getDefaultToolkit().addAWTEventListener(dyR, 8L);
    }

    public static void remove() {
        Toolkit.getDefaultToolkit().removeAWTEventListener(dyR);
    }

    @Override
    public void eventDispatched(AWTEvent aWTEvent) {
        assert (aWTEvent instanceof KeyEvent) : "Shall only listen to KeyEvents, so no other events shall come here";
        assert (abb_1.bVz());
        if (aWTEvent instanceof abd_1) {
            return;
        }
        if (aWTEvent.getID() == 400) {
            return;
        }
        KeyEvent keyEvent = (KeyEvent)aWTEvent;
        if (keyEvent.isConsumed()) {
            return;
        }
        if (keyEvent.getID() == 402) {
            Timer timer = new Timer(2, null);
            abc_1 abc_12 = new abc_1(this, keyEvent, timer);
            timer.addActionListener(abc_12);
            timer.start();
            this.dyS.put(keyEvent.getKeyCode(), abc_12);
            keyEvent.consume();
        } else if (keyEvent.getID() == 401) {
            abc_1 abc_13 = this.dyS.remove(keyEvent.getKeyCode());
            if (abc_13 != null) {
                abc_13.cancel();
            }
        } else {
            throw new AssertionError((Object)"All IDs should be covered.");
        }
    }

    static boolean bVz() {
        if (!EventQueue.isDispatchThread()) {
            throw new AssertionError((Object)("Not EDT, but [" + String.valueOf(Thread.currentThread()) + "]."));
        }
        return true;
    }
}

