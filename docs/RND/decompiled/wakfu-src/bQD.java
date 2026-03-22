/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntShortHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TIntShortHashMap;
import org.apache.log4j.Logger;

public class bQD {
    private static final Logger kVY = Logger.getLogger(bQD.class);
    private static final bQD kVZ = new bQD();
    private final TIntShortHashMap kWa = new TIntShortHashMap();

    public static bQD ejE() {
        return kVZ;
    }

    private bQD() {
    }

    public String IV(int n) {
        return aum_0.cWf().a(128, (long)n, new Object[0]);
    }

    public String IW(int n) {
        return aum_0.cWf().a(129, (long)n, new Object[0]);
    }

    public void ejF() {
        this.kWa.compact();
    }

    public int IX(int n) {
        return n;
    }
}

