/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntIntHashMap
 *  gnu.trove.procedure.TIntIntProcedure
 */
import gnu.trove.map.hash.TIntIntHashMap;
import gnu.trove.procedure.TIntIntProcedure;
import java.io.File;

/*
 * Renamed from apM
 */
public class apm_1 {
    private static final int cOT = 4096;
    private final TIntIntHashMap cOU = new TIntIntHashMap(0, 1.0f);
    private final String cOV;
    private final int cOW;

    public apm_1(String string) {
        this(string, 4096);
    }

    public apm_1(String string, int n) {
        int n2 = 4;
        byte[] byArray = fo_0.c(string, 4);
        apl_1 apl_12 = apl_1.dw(byArray);
        int n3 = apl_12.aIA();
        int n4 = n3 + 4;
        apl_1 apl_13 = apl_1.dw(fo_0.c(string, n4));
        apl_13.tv(4);
        int n5 = apl_13.aIA();
        this.cOU.ensureCapacity(n5);
        for (int i = 0; i < n5; ++i) {
            this.cOU.put(apl_13.aIA(), apl_13.aIA() + n4);
        }
        this.cOV = string.replace('\\', '/');
        this.cOW = n;
    }

    public String bFU() {
        return this.cOV;
    }

    public apn_1 fA(String string) {
        int n = this.cOU.get(string.hashCode());
        return this.tx(n);
    }

    public apn_1 tx(int n) {
        apk_1 apk_12 = new apk_1(new File(this.cOV), this.cOW);
        apk_12.gt(n);
        byte[] byArray = new byte[8];
        for (int i = 0; i != 8; i += apk_12.read(byArray, i, 8 - i)) {
        }
        long l = apl_1.dw(byArray).bFQ();
        return new apn_1(apk_12, n + 8, l);
    }

    public boolean fB(String string) {
        return this.cOU.containsKey(string.hashCode());
    }

    public void a(TIntIntProcedure tIntIntProcedure) {
        this.cOU.forEachEntry(tIntIntProcedure);
    }
}

