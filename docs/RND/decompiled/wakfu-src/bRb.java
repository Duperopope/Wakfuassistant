/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class bRb {
    private static final Logger kYQ = Logger.getLogger(bRb.class);
    private static final TObjectProcedure<bQW> kYR = new bRc();
    public static final bRb kYS = new bRb();
    private final TIntObjectHashMap<bQI> kYT = new TIntObjectHashMap();
    private final TIntObjectHashMap<bRd> kYU = new TIntObjectHashMap();
    private final TIntObjectHashMap<bRh> kYV = new TIntObjectHashMap();
    private final TLongObjectHashMap<bQW> kYW = new TLongObjectHashMap();
    private final cal_1 kYX = cal_1.lFY;
    private long kYY;

    public void b(faz_0 faz_02) {
        fby fby2;
        ArrayList<fas_0> arrayList = new ArrayList<fas_0>();
        this.kYY = faz_02.Ya();
        try {
            fby2 = fbz.rRR.sa(this.kYY);
        }
        catch (fbt fbt2) {
            kYQ.error((Object)"Exception raised", (Throwable)fbt2);
            return;
        }
        int n = fby2.fRR();
        fby2 = fbz.rRR.sb(this.kYY);
        fby2.TU(n);
        faz_02.O((TObjectProcedure<fas_0>)((TObjectProcedure)fas_02 -> {
            arrayList.add((fas_0)fas_02);
            if (fas_02.erN().coy()) {
                return true;
            }
            fbn_0 fbn_02 = (fbn_0)fas_02.erN();
            fbn_02.e(n -> {
                fbu fbu2 = bvw_0.jvO.FQ(n);
                if (fbu2 == null) {
                    return true;
                }
                fbu2.Y(this.kYY, fas_02.Lx());
                return true;
            });
            return true;
        }));
        this.O(arrayList);
    }

    public void O(ArrayList<fas_0> arrayList) {
        this.ekw();
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        arrayList.forEach(this::a);
    }

    public long ekv() {
        return this.kYY;
    }

    public void mb(long l) {
        this.kYY = l;
    }

    private void ekw() {
        this.kYW.forEachValue(kYR);
        this.kYW.clear();
    }

    public void clear() {
        this.kYT.clear();
        this.kYX.erg();
        this.ekw();
    }

    public bQI a(fbk_0 fbk_02) {
        return this.cs(fbk_02.aIi());
    }

    public bQI cs(short s) {
        bQI bQI2 = (bQI)this.kYT.get((int)s);
        if (bQI2 == null) {
            bQI2 = new bQI(fbw_0.rSQ.eE(s), this.kYX);
            this.kYT.put((int)s, (Object)bQI2);
        }
        return bQI2;
    }

    private bRd a(fby_0 fby_02) {
        bRd bRd2 = (bRd)this.kYU.get((int)fby_02.fSr());
        if (bRd2 == null) {
            bRd2 = new bRd(fby_02);
            this.kYU.put((int)fby_02.fSr(), (Object)bRd2);
        }
        return bRd2;
    }

    public bRd ct(short s) {
        return this.a(fbw_0.rSQ.eG(s));
    }

    public bRh b(fcb_0 fcb_02) {
        short s = fcb_02.fRN();
        bRh bRh2 = (bRh)this.kYV.get((int)s);
        if (bRh2 == null) {
            bRh2 = new bRh(fbw_0.rSQ.eH(s), this.kYX);
            this.kYV.put((int)s, (Object)bRh2);
        }
        return bRh2;
    }

    private bRg a(fca_0 fca_02) {
        return new bRg(fca_02);
    }

    public bQW mc(long l) {
        return (bQW)this.kYW.get(l);
    }

    public bRf b(fbz_0 fbz_02) {
        if (fbz_02 instanceof fby_0) {
            return this.a((fby_0)fbz_02);
        }
        if (fbz_02 instanceof fcb_0) {
            return this.b((fcb_0)fbz_02);
        }
        if (fbz_02 instanceof fca_0) {
            return this.a((fca_0)fbz_02);
        }
        return null;
    }

    public bQW a(fas_0 fas_02) {
        long l = fas_02.Lx();
        bQW bQW2 = bQW.a(this.a(fas_02.erN()), l, fas_02.fRk(), uw_0.fn(fas_02.fRi()));
        if (bQW2 != null) {
            this.kYW.put(l, (Object)bQW2);
            bQW2.dJK();
        }
        return bQW2;
    }
}

