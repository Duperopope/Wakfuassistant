/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import org.apache.log4j.Logger;

class XV {
    protected static final Logger bTo = Logger.getLogger(XV.class);
    private static final TObjectProcedure<ya_0> bTp = new XW();
    private static final TObjectProcedure<ya_0> bTq = new XX();
    private final TObjectProcedure<ya_0> bTr = new XY(this);
    private final TIntObjectHashMap<ya_0> bTs = new TIntObjectHashMap();
    final ArrayList<za_0> bTt = new ArrayList();
    private final TIntObjectHashMap<ArrayList<yn_0>> bTu = new TIntObjectHashMap();

    XV() {
    }

    void a(Yd yd, aaj_0 aaj_02) {
        YY[] yYArray;
        assert (this.bTs.size() == 0);
        for (YY yY : yYArray = yd.boo()) {
            if (yY.bol() != Yc.bTH) continue;
            YX yX = (YX)yY;
            za_0 za_02 = yX.boL();
            int n = yY.boN();
            this.bTs.put(n, (Object)new ya_0(za_02));
            za_02.b(aaj_02);
            this.bTu.put(n, new ArrayList());
        }
    }

    ArrayList<za_0> b(ArrayList<XU> arrayList) {
        this.bTt.clear();
        if (arrayList.isEmpty()) {
            return this.bTt;
        }
        int n = -1;
        int n2 = arrayList.size();
        for (int i = 0; i < n2; ++i) {
            XU xU = arrayList.get(i);
            if (!xU.boc()) continue;
            float f2 = xU.bnY();
            if (n != xU.bob()) {
                n = xU.bob();
                this.bod();
            }
            ArrayList<yn_0> arrayList2 = xU.bTl.boa();
            int n3 = arrayList2.size();
            for (int j = 0; j < n3; ++j) {
                yn_0 yn_02 = arrayList2.get(j);
                if (!yn_02.apo()) continue;
                this.a(yn_02, f2);
            }
        }
        this.bod();
        this.bTs.forEachValue(this.bTr);
        return this.bTt;
    }

    private void a(yn_0 yn_02, float f2) {
        int n = yn_02.bok();
        yn_02.bO(f2);
        ((ya_0)this.bTs.get(n)).a(yn_02);
        ((ArrayList)this.bTu.get(n)).add(yn_02);
    }

    private void bod() {
        this.bTu.forEachValue((TObjectProcedure)new XZ(this));
    }

    public final void boe() {
        this.bTs.forEachValue(bTp);
    }

    public final void bof() {
        this.bTs.forEachValue(bTq);
    }
}

