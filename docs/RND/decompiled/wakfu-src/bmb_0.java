/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.HashMap;
import java.util.Map;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bMB
 */
public class bmb_0
extends fqF<bmt_0> {
    private final aqd_1<aOx> kyO = new aqe_1<aOx>(new aOx());

    @Nullable
    public bmt_0 If(int n) {
        if (n == 0) {
            return null;
        }
        bmt_0 bmt_02 = (bmt_0)this.sUO.get(n);
        if (bmt_02 == null && !this.sUO.contains(n)) {
            aOx aOx2 = this.kyO.tE(n);
            if (aOx2 == null) {
                return null;
            }
            bmt_02 = this.c(aOx2);
            if (bmt_02 != null) {
                this.c(bmt_02);
            }
        }
        return bmt_02;
    }

    public static bmb_0 eeV() {
        if (sUM == null) {
            sUM = new bmb_0();
        }
        return (bmb_0)sUM;
    }

    private bmb_0() {
    }

    public bmx_0 h(int n, short s) {
        long l = fqE.O(n, s);
        bmx_0 bmx_02 = (bmx_0)this.sUP.get(l);
        if (bmx_02 == null) {
            bmx_02 = new bmx_0(this.If(n), s, l, new bgo_0());
            this.sUP.put(l, (Object)bmx_02);
        }
        return bmx_02;
    }

    public void b(aOx aOx2) {
        assert (aOx2 != null);
        bmt_0 bmt_02 = this.c(aOx2);
        this.c(bmt_02);
    }

    private bmt_0 c(aOx aOx2) {
        bfo_2 bfo_22;
        assert (aOx2 != null);
        bmt_0 bmt_02 = new bmt_0(bmb_0.d(aOx2));
        short s = aOx2.aWP();
        if (s == eym.phU.aWP()) {
            for (bfo_2 bfo_23 : bfq_2.dge().dgj()) {
                bfo_23.a(bmt_02);
            }
        } else if (s != 0 && s != eym.phV.aWP() && (bfo_22 = bfq_2.dge().BO(s)) != null) {
            bfo_22.a(bmt_02);
        }
        bmb_0.a(bmt_02, aOx2.cjX(), bat_2.cZD());
        return bmt_02;
    }

    public static fqR d(aOx aOx2) {
        Object object;
        fqR fqR2 = new fqR();
        fqR2.lK(aOx2.d());
        fqR2.Zj(aOx2.cbt());
        fqR2.CV(aOx2.aVt());
        fqR2.dO(aOx2.aVe());
        fqR2.sS(aOx2.aWP());
        fqR2.hp((byte)aOx2.cvb());
        fqR2.fl(aOx2.cvc());
        fqR2.hq((byte)aOx2.cve());
        fqR2.nX(aOx2.cvf());
        fqR2.nU(aOx2.cvg());
        fqR2.nW(aOx2.cvi());
        fqR2.nY(aOx2.cvj());
        fqR2.oa(aOx2.cvk());
        fqR2.nZ(aOx2.cvl());
        fqR2.Zi(aOx2.cvm());
        ang_2 ang_22 = null;
        try {
            object = aOx2.cvn();
            ang_22 = ehu_0.rY((String)object);
        }
        catch (Exception exception) {
            sUN.error((Object)("Erreur lors de la compilation des crit\u00e8res du sort " + aOx2.d()), (Throwable)exception);
        }
        fqR2.n(ang_22);
        fqR2.fC(aOx2.cvo());
        bmb_0.a(aOx2, fqR2);
        fqR2.fm(aOx2.cvx());
        fqR2.fn(aOx2.cvy());
        fqR2.fo(aOx2.cvv());
        fqR2.fp(aOx2.cvw());
        fqR2.hs((byte)aOx2.cvz());
        fqR2.hr((byte)aOx2.cvA());
        fqR2.fD(aOx2.cvB());
        fqR2.hv((byte)aOx2.cvC());
        fqR2.fE(aOx2.cvD());
        object = null;
        try {
            object = ehu_0.rY(aOx2.cuh());
        }
        catch (Exception exception) {
            sUN.error((Object)("Erreur lors de la compilation des crit\u00e8res d'apprentissage du sort " + aOx2.d()), (Throwable)exception);
        }
        ang_2 ang_23 = null;
        try {
            ang_23 = ehu_0.rY(aOx2.cvE());
        }
        catch (Exception exception) {
            sUN.error((Object)("Erreur lors de la compilation des crit\u00e8res d'apprentissage du sort " + aOx2.d()), (Throwable)exception);
        }
        fqR2.l((ang_2)object);
        fqR2.m(ang_23);
        fqR2.hu(aOx2.cvF());
        fqR2.og(aOx2.cvG());
        fqR2.if(aOx2.cvH());
        fqR2.oc(aOx2.cvI());
        fqR2.od(aOx2.cvK());
        fqR2.oe(aOx2.cvL());
        fqR2.of(aOx2.cvM());
        fqR2.oh(aOx2.cvN());
        fqR2.nR(aOx2.cvO());
        fqR2.fq(aOx2.cvd());
        HashMap<String, aoy_0> hashMap = aOx2.cvS();
        if (hashMap != null && !hashMap.isEmpty()) {
            for (Map.Entry<String, aoy_0> entry : hashMap.entrySet()) {
                try {
                    String string = entry.getKey();
                    aoy_0 aoy_02 = entry.getValue();
                    ang_2 ang_24 = ehu_0.rY(string);
                    fqR2.a(ang_24, bmb_0.a(aoy_02));
                }
                catch (Exception exception) {
                    sUN.error((Object)("Erreur lors de la compilation des crit\u00e8res d'apprentissage du sort " + aOx2.d()), (Throwable)exception);
                }
            }
        }
        fqR2.V(aOx2.ckm());
        return fqR2;
    }

    private static fqN a(aoy_0 aoy_02) {
        fqN fqN2 = new fqN(aoy_02.cvp(), aoy_02.cvq(), aoy_02.cvt(), aoy_02.cvu(), aoy_02.cvr(), aoy_02.cvs());
        fqN2.nK(aoy_02.cvV());
        fqN2.nL(aoy_02.cvW());
        fqN2.nM(aoy_02.cvX());
        fqN2.nN(aoy_02.cvY());
        fqN2.bE(aoy_02.cvv(), aoy_02.cvw());
        fqN2.bD(aoy_02.cvx(), aoy_02.cvU());
        fqN2.fh(aoy_02.cvZ());
        fqN2.fi(aoy_02.cwa());
        fqN2.fj(aoy_02.cwb());
        fqN2.fk(aoy_02.cwc());
        fqN2.nO(aoy_02.cwd());
        fqN2.nP(aoy_02.cwe());
        fqN2.nQ(aoy_02.cwf());
        fqN2.nR(aoy_02.cvO());
        HashMap<Integer, aoz_0> hashMap = aoy_02.cvT();
        if (hashMap != null && !hashMap.isEmpty()) {
            for (Map.Entry<Integer, aoz_0> entry : hashMap.entrySet()) {
                aoz_0 aoz_02 = entry.getValue();
                Integer n = entry.getKey();
                fqN2.a(exx_2.c(GC.ct(n.intValue())), aoz_02.cwg(), aoz_02.cwh());
            }
        }
        return fqN2;
    }

    private static void a(aOx aOx2, fqR fqR2) {
        HashMap<Byte, aoz_0> hashMap = aOx2.cvQ();
        fqR2.b(exx_2.rGj, aOx2.cvp(), aOx2.cvq());
        fqR2.b(exx_2.rGk, aOx2.cvr(), aOx2.cvs());
        fqR2.b(exx_2.rGl, aOx2.cvt(), aOx2.cvu());
        if (hashMap != null && !hashMap.isEmpty()) {
            for (Map.Entry<Byte, aoz_0> entry : hashMap.entrySet()) {
                Byte by = entry.getKey();
                aoz_0 aoz_02 = entry.getValue();
                fqR2.b(exx_2.c(by), aoz_02.cwg(), aoz_02.cwh());
            }
        }
    }

    public static void a(fqD fqD2, int[] nArray, bat_2 bat_22) {
        for (int n : nArray) {
            enk_0 enk_02 = bat_22.Ay(n);
            if (enk_02 != null) {
                fqD2.v(enk_02);
                continue;
            }
            sUN.error((Object)("Probl\u00e8me de chargmeent de Spell " + fqD2.d()));
        }
    }

    public TIntObjectHashMap<bmt_0> cZg() {
        TIntObjectHashMap tIntObjectHashMap = new TIntObjectHashMap();
        try {
            aqb_1.bGD().a(new aOx(), new bmc_0(this, tIntObjectHashMap));
        }
        catch (Exception exception) {
            sUN.error((Object)"", (Throwable)exception);
        }
        return tIntObjectHashMap;
    }

    @Override
    public /* synthetic */ fqE i(int n, short s) {
        return this.h(n, s);
    }

    @Override
    @Nullable
    public /* synthetic */ fqD Ig(int n) {
        return this.If(n);
    }

    static /* synthetic */ Logger aGh() {
        return sUN;
    }
}

