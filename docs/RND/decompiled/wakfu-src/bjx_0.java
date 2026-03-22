/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.procedure.TIntObjectProcedure
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.procedure.TIntObjectProcedure;
import java.nio.ByteBuffer;
import java.util.HashMap;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bJx
 */
public class bjx_0
extends foV<bJr> {
    final HashMap<Integer, Integer> klU = new HashMap();
    private final HashMap<Integer, Integer> klV = new HashMap();
    private final aqd_1<aNQ> klW;
    private final aqd_1<aNQ> klX = new aqe_1<aNQ>(new aNQ());
    public static final bjx_0 klY = new bjx_0();

    private bjx_0() {
        this.klW = new aqe_1<aNQ>(new aNQ());
        this.eaO();
    }

    public boolean c(bJr bJr2) {
        aNQ aNQ2 = this.klW.tE(bJr2.d());
        if (aNQ2 == null) {
            return false;
        }
        bJE bJE2 = bjx_0.b(aNQ2);
        acd_1 acd_12 = bJE2.eap();
        bJr2.a(acd_12.getX(), acd_12.getY(), acd_12.bdi());
        for (bJC bJC2 : bJE2.eaR()) {
            bJr2.a(bJC2);
        }
        bJr2.D(bJE2.eaq());
        return super.b(bJr2);
    }

    @Nullable
    public bJr HC(int n) {
        bJr bJr2 = (bJr)super.Ym(n);
        if (bJr2 != null) {
            return bJr2;
        }
        aNQ aNQ2 = this.klX.tE(n);
        if (aNQ2 == null) {
            return null;
        }
        bJr bJr3 = bjx_0.c(aNQ2);
        bJr3.a(aNQ2.ctv(), aNQ2.ctw(), aNQ2.cjD());
        return bJr3;
    }

    @Nullable
    public bJr HD(int n) {
        if (this.klU.containsKey(n)) {
            return this.HC(this.klU.get(n));
        }
        return null;
    }

    public void dM(int n, int n2) {
        if (this.klV.containsKey(n) && this.klV.get(n) == n2) {
            return;
        }
        this.klV.put(n, n2);
        this.HF(n);
    }

    public int HE(int n) {
        this.HF(n);
        if (this.klV.containsKey(n)) {
            return this.klV.get(n);
        }
        return -1;
    }

    public int d(bJr bJr2) {
        if (this.klV.containsKey(bJr2.d())) {
            return this.klV.get(bJr2.d());
        }
        return -1;
    }

    public void HF(int n) {
        bJr bJr2 = (bJr)this.Ym(n);
        if (bJr2 == null) {
            return;
        }
        if (this.klV.containsKey(n)) {
            bJr2.s(fjt.syH.WG(this.klV.get(n)));
        }
    }

    public final void eaO() {
        this.klU.clear();
        try {
            aqb_1.bGD().a(new aNQ(), new bJy(this));
        }
        catch (Exception exception) {
            sNb.error((Object)"", (Throwable)exception);
        }
    }

    private static bJE b(aNQ aNQ2) {
        bJE bJE2 = new bJE(aNQ2.ctn());
        bJE2.a(aNQ2.ctv(), aNQ2.ctw(), aNQ2.cjD());
        for (ant_0 ant_02 : aNQ2.cty()) {
            bJE2.a(new bJC(ant_02.d(), ant_02.ctD(), ant_02.ctE(), ant_02.ctF()));
        }
        bJE2.D(aNQ2.ctx());
        return bJE2;
    }

    private static bJr c(aNQ aNQ2) {
        int n = aNQ2.ctn();
        int n2 = aNQ2.Xt();
        int n3 = aNQ2.ctt();
        int n4 = aNQ2.coQ();
        TIntObjectHashMap tIntObjectHashMap = new TIntObjectHashMap();
        for (anr_0 anr_02 : aNQ2.ctz()) {
            tIntObjectHashMap.put(anr_02.aHp(), (Object)new abm_1(anr_02.ctB(), anr_02.ctC()));
        }
        TIntObjectHashMap tIntObjectHashMap2 = new TIntObjectHashMap();
        for (aNS aNS2 : aNQ2.ctA()) {
            tIntObjectHashMap2.put(aNS2.aHp(), (Object)new abm_1(aNS2.ctB(), aNS2.ctC()));
        }
        wk_2 wk_22 = new wk_2();
        wk_22.aif = n;
        wk_22.aig = new wv_1();
        wk_22.aig.aiR = n2;
        wk_22.aig.aiS = n2;
        wk_22.aig.aiT = n3;
        wk_22.aih = new wl_1();
        wk_22.aih.ait = n4;
        wk_22.aih.aiu = -1L;
        wk_22.aiq = new wr_1();
        tIntObjectHashMap.forEachEntry((TIntObjectProcedure)new bJz(wk_22));
        wk_22.air = new wz_1();
        tIntObjectHashMap2.forEachEntry((TIntObjectProcedure)new bJA(wk_22));
        ByteBuffer byteBuffer = ByteBuffer.wrap(bJD.kmg.a(wk_22));
        bJr bJr2 = (bJr)bJG.kml.gq(byteBuffer);
        for (ant_0 ant_02 : aNQ2.cty()) {
            bJr2.a(new bJC(ant_02.d(), ant_02.ctD(), ant_02.ctE(), ant_02.ctF()));
        }
        return bJr2;
    }

    @Override
    public /* synthetic */ boolean b(foP foP2) {
        return this.c((bJr)foP2);
    }
}

