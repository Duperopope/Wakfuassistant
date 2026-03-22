/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import java.awt.event.KeyEvent;

/*
 * Renamed from fII
 */
public class fii_2 {
    private static final fii_2 uBS = new fii_2();
    private final TIntObjectHashMap<KeyEvent> uBT = new TIntObjectHashMap();
    private final TIntObjectHashMap<KeyEvent> uBU = new TIntObjectHashMap();

    private fii_2() {
    }

    public static fii_2 gBX() {
        return uBS;
    }

    public boolean hf(int n, int n2) {
        if (n != 0) {
            return this.uBT.containsKey(n);
        }
        return this.uBU.containsKey(n2);
    }

    public void keyPressed(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 0) {
            this.uBT.put(keyEvent.getKeyCode(), (Object)keyEvent);
        } else {
            this.uBU.put(keyEvent.getExtendedKeyCode(), (Object)keyEvent);
        }
    }

    public void keyReleased(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 0) {
            this.uBT.remove(keyEvent.getKeyCode());
        } else {
            this.uBU.remove(keyEvent.getExtendedKeyCode());
        }
    }
}

