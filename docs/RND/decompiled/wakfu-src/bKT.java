/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.HashMap;
import java.util.Map;
import org.apache.log4j.Logger;

public class bKT
extends fpW<bLc> {
    protected static final Logger kqT = Logger.getLogger(bKT.class);
    private final short kqU;
    private final Map<Long, String[]> kqV;
    private final int kqW;
    private final boolean kqX;

    public bKT(int n, short s, short s2, short s3, fqa_0 fqa_02, boolean bl, short s4, Map<Long, int[]> map, int n2, boolean bl2) {
        super(n, s, s2, s3, fqa_02, bl);
        this.eqX = bl;
        this.kqU = s4;
        this.kqV = new HashMap<Long, String[]>(map.size());
        this.kqW = n2;
        this.kqX = bl2;
        this.z(map);
    }

    private void z(Map<Long, int[]> map) {
        try {
            String string = auc_0.cVq().bS("ANMResourcePath");
            for (Map.Entry<Long, int[]> entry : map.entrySet()) {
                int[] nArray = entry.getValue();
                String[] stringArray = new String[nArray.length];
                for (int i = 0; i < nArray.length; ++i) {
                    stringArray[i] = String.format(string, nArray[i]);
                }
                long l = entry.getKey();
                this.kqV.put(l, stringArray);
            }
        }
        catch (fu_0 fu_02) {
            kqT.error((Object)"Erreur \u00e0 la r\u00e9cup\u00e9ration du chemin des anms de ressources", (Throwable)fu_02);
        }
    }

    public String b(int n, int n2, long l) {
        if (this.kqV.isEmpty()) {
            kqT.error((Object)("La resource " + this.d() + " n'a pas de gfxId"));
            return null;
        }
        String[] stringArray = this.kqV.get(l);
        if (stringArray == null && (stringArray = this.kqV.get(-1L)) == null) {
            kqT.error((Object)("Pas de gfxIds par d\u00e9faut pour la resource " + this.d()));
            return null;
        }
        int n3 = (int)(Math.abs(GC.s(n, n2)) % (long)stringArray.length);
        return stringArray[n3];
    }

    public String ebZ() {
        return aum_0.cWf().a(12, (long)this.d(), new Object[0]);
    }

    public boolean cuA() {
        return this.kqX;
    }

    public boolean cuz() {
        return this.eqX;
    }

    public short aKu() {
        return this.kqU;
    }

    public boolean ca(byte by) {
        return this.a((bLc)this.hn(by));
    }

    public boolean a(bLc bLc2) {
        eki_0 eki_02 = baj_2.hzf.cZr();
        int n = bLc2.ghG();
        for (int i = 0; i < n; ++i) {
            bmv_2 bmv_22 = (bmv_2)bLc2.YQ(i);
            if (bmv_22.cms() == 0) {
                return true;
            }
            if (!eki_02.tX(bmv_22.cms())) continue;
            return true;
        }
        return false;
    }

    public int cuG() {
        return this.kqW;
    }
}

