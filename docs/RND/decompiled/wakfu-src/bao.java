/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

public class bao
implements fqW {
    private static final Logger hyP = Logger.getLogger(bao.class);
    private final aqd_1<aOB> hyQ;

    public bao() {
        this(new aqe_1<aOB>(new aOB()));
    }

    public bao(aqd_1<aOB> aqd_12) {
        this.hyQ = aqd_12;
    }

    @Override
    @Nullable
    public fqU Al(int n) {
        if (n <= 0) {
            return null;
        }
        bmq_0 bmq_02 = this.cZf();
        aOB aOB2 = this.hyQ.tE(n);
        if (aOB2 == null) {
            hyP.error((Object)("Impossible de charger l'\u00e9tat " + n));
            return null;
        }
        bao.a(bmq_02, aOB2);
        return bmq_02;
    }

    protected bmq_0 cZf() {
        return new bmq_0();
    }

    static void a(bmq_0 bmq_02, aOB aOB2) {
        bMS bMS2 = new bMS(bmq_02);
        bMS2.dP(aOB2.aXE());
        bMS2.ie(aOB2.cwF());
        bMS2.if(aOB2.cwE());
        bMS2.fH((short)aOB2.d());
        bMS2.fG(aOB2.aVe());
        bMS2.fI(aOB2.cwm());
        bMS2.Zo(aOB2.cwo());
        bMS2.on(aOB2.cwq());
        bMS2.Zp(aOB2.cwn());
        bMS2.Zq(aOB2.cwp());
        bMS2.oo(aOB2.cwt());
        bMS2.op(aOB2.cwr());
        bMS2.oq(aOB2.cws());
        bMS2.or(aOB2.cww());
        bMS2.W(aOB2.cwy());
        bMS2.sT(aOB2.cwv());
        bMS2.X(aOB2.cwk());
        bMS2.sU(aOB2.cwu());
        bMS2.os(aOB2.aZW());
        bMS2.ou(aOB2.cwz());
        bMS2.ot(aOB2.cwA());
        bMS2.hx(aOB2.cwB());
        bMS2.hy(aOB2.cwC());
        bMS2.ov(aOB2.cwD());
        bMS2.ok(aOB2.cwx());
        bMS2.h(aOB2.aHb());
        bMS2.sU(aOB2.cwu());
        bao.b(bmq_02, aOB2);
    }

    private static void b(bmq_0 bmq_02, aOB aOB2) {
        int[] nArray = aOB2.cjX();
        if (nArray == null || nArray.length == 0) {
            return;
        }
        for (int n : nArray) {
            enk_0 enk_02 = bat_2.cZD().Ay(n);
            if (enk_02 != null) {
                bmq_02.v(enk_02);
                continue;
            }
            hyP.error((Object)("Probl\u00e8me de chargmeent de State " + aOB2.d()));
        }
    }

    public static TIntObjectHashMap<fqU> cZg() {
        TIntObjectHashMap tIntObjectHashMap = new TIntObjectHashMap();
        try {
            aqb_1.bGD().a(new aOB(), new bap(tIntObjectHashMap));
        }
        catch (Exception exception) {
            hyP.error((Object)"", (Throwable)exception);
        }
        return tIntObjectHashMap;
    }
}

