/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public final class XQ {
    private static final Logger bSX = Logger.getLogger(XQ.class);
    public static final XQ bSY = new XQ();
    private final TIntObjectHashMap<XO> bSZ = new TIntObjectHashMap();
    private final XR bTa = new XR();

    private XQ() {
    }

    public void a(@NotNull Yd yd, aaj_0 aaj_02) {
        this.bTa.a(yd, aaj_02);
    }

    public void qF(int n) {
        this.bTa.qF(n);
    }

    public boolean a(int n, XO xO) {
        if (xO == null) {
            return false;
        }
        this.bSZ.put(n, (Object)xO);
        this.bTa.a(xO);
        return true;
    }

    public boolean qH(int n) {
        XO xO = (XO)this.bSZ.get(n);
        if (xO == null) {
            return false;
        }
        this.bTa.b(xO);
        return true;
    }

    public void clear() {
        this.bSZ.clear();
        this.bTa.clear();
    }

    public void reset() {
        this.clear();
        this.bTa.reset();
    }
}

