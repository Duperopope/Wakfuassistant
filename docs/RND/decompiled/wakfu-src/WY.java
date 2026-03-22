/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TShortObjectHashMap
 *  gnu.trove.procedure.TShortObjectProcedure
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TShortObjectHashMap;
import gnu.trove.procedure.TShortObjectProcedure;
import java.io.IOException;
import java.nio.ByteOrder;
import org.apache.log4j.Logger;

public class WY {
    private static final Logger bQH = Logger.getLogger(WY.class);
    private static final WY bQI = new WY();
    private azh_2 bQJ;
    private int bQK = 0;
    private String awN = "./";

    public static WY bnm() {
        return bQI;
    }

    public final void bnn() {
        this.bQJ = null;
        this.bQK = 0;
    }

    public final void dI(String string) {
        this.awN = string;
    }

    public final void fB(long l) {
        this.bnn();
        String string = String.format(this.awN, l);
        try {
            this.dJ(string);
        }
        catch (IOException iOException) {
            bQH.error((Object)("Probl\u00e9me lors du chargement des infos de group " + string), (Throwable)iOException);
        }
    }

    private void dJ(String string) {
        apl_1 apl_12 = apl_1.dw(apr_1.by(string));
        apl_12.a(ByteOrder.LITTLE_ENDIAN);
        this.bQK = 1 + apl_12.bFO();
        this.bQJ = new azh_2(this.bQK * this.bQK);
        int n = apl_12.bFO();
        for (int i = 0; i < n; ++i) {
            short s = apl_12.aIz();
            short s2 = apl_12.aIz();
            short[] sArray = apl_12.mw(s2);
            this.a(s, sArray, true);
        }
    }

    void a(int n, short[] sArray, boolean bl) {
        int n2 = Math.abs(n) * this.bQK;
        for (int i = 0; i < sArray.length; ++i) {
            this.bQJ.j(n2 + Math.abs(sArray[i]), bl);
        }
    }

    public final boolean aW(int n, int n2) {
        if (n == 0) {
            return n2 <= 0;
        }
        int n3 = n < 0 ? -n : n;
        int n4 = n2 < 0 ? -n2 : n2;
        return this.bQJ.vE(n3 * this.bQK + n4);
    }

    public final int bno() {
        return this.bQK;
    }

    public void a(int n, TShortObjectHashMap<short[]> tShortObjectHashMap) {
        this.bQK = n + 1;
        this.bQJ = new azh_2(this.bQK * this.bQK);
        this.bQJ.j(0, true);
        tShortObjectHashMap.forEachEntry((TShortObjectProcedure)new WZ(this));
    }
}

