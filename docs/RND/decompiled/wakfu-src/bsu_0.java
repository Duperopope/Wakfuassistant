/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bsu
 */
public class bsu_0
implements aeh_2,
bek_0,
ffc_2 {
    public static final String jgD = "cost";
    public static final String jgE = "kamas";
    public static final String jgF = "kamasText";
    private static final String jgG = "hasKamas";
    private static final String jgH = "hasPvpMoney";
    public static final String jgI = "result";
    public static final String jgJ = "criterion";
    public static final String jgK = "level";
    public static final String jgL = "enabled";
    public static final String jgM = "pvpMoney";
    public static final String jgN = "bind";
    public static final String jgO = "possessed";
    public static final String jgP = "totalPossessed";
    public static final String jgQ = "pvpMoneyDesc";
    public static final String[] jgR = new String[]{"cost", "kamas", "result", "criterion", "level", "pvpMoney", "pvpMoneyDesc", "kamasText", "enabled", "hasKamas", "hasPvpMoney", "possessed", "totalPossessed"};
    private static final aae_1 jgS = new aae_1();
    private static final int jgT = 13126;
    private static final int jgU = 13127;
    private static final int jgV = 13128;
    final ArrayList<bmj_2> jgW = new ArrayList();
    final ArrayList<bmj_2> jgX = new ArrayList();
    private fdt_0 jgY;

    public bsu_0(fdt_0 fdt_02) {
        fdt_02.a(new bsv_0(this));
        fdt_02.X(new bsw_0(this));
        this.jgY = fdt_02;
    }

    public bsu_0(bmj_2 bmj_22) {
        this.jgX.add(bmj_22);
    }

    @Override
    public String[] bxk() {
        return jgR;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (string.equals(jgD)) {
            return this.dFR();
        }
        if (string.equals(jgE)) {
            if (this.jgY == null) {
                return null;
            }
            int n = this.jgY.fTy();
            return n > 0 ? Integer.valueOf(n) : null;
        }
        if (string.equals(jgM)) {
            if (this.jgY == null) {
                return null;
            }
            int n = this.jgY.cnp();
            return n > 0 ? Integer.valueOf(n) : null;
        }
        if (string.equals(jgQ)) {
            return this.dFQ();
        }
        if (string.equals(jgJ)) {
            return this.dFO();
        }
        if (string.equals(jgK)) {
            bmj_2 bmj_22 = this.dFW();
            if (bmj_22 == null) {
                return null;
            }
            short s = bmj_22.duo().cmL();
            return aum_0.cWf().c("levelShort.custom", s);
        }
        if (string.equals(jgL)) {
            return this.dFS();
        }
        if (string.equals(jgI)) {
            return this.dFW();
        }
        if (string.equals(jgF)) {
            return this.dFP();
        }
        if (string.equals(jgG)) {
            return this.dFM();
        }
        if (string.equals(jgH)) {
            return this.dFN();
        }
        if (string.equals(jgN)) {
            if (this.jgY == null) {
                return null;
            }
            fgW fgW2 = this.jgY.fTz().fTB();
            if (fgW2 == fgW.smf) {
                int n = this.jgY.fTz().azv();
                ffV ffV2 = fgD.fXh().Ve(n);
                if (ffV2 == null || ffV2.fUY() == null) {
                    return null;
                }
                return aum_0.cWf().c(ffV2.fUY().fXu().clY(), new Object[0]);
            }
            return aum_0.cWf().c(fgW2.clY(), new Object[0]);
        }
        if (string.equals(jgO)) {
            bgt_0 bgt_02 = cus_2.eRQ().eRS();
            return this.u(bgt_02);
        }
        if (string.equals(jgP)) {
            Set set = fcL.rUh.sz(bbs_2.xl());
            int n = 0;
            for (bgt_0 bgt_03 : set) {
                n += this.u(bgt_03);
            }
            return n;
        }
        return null;
    }

    private int u(bgt_0 bgt_02) {
        int n = 0;
        for (ffV ffg22 : bgt_02.dno().pd(this.duo().d())) {
            n += ffg22.bfd();
        }
        fec_0 fec_02 = (fec_0)bgt_02.a(fez_0.sep);
        ffm ffm2 = fec_02.UB(this.duo().d());
        if (ffm2 != null) {
            n += ffm2.bfd();
        }
        return n;
    }

    private boolean dFM() {
        bgt_0 bgt_02 = cus_2.eRQ().eRS();
        if (this.jgY == null) {
            return true;
        }
        int n = this.jgY.fTy();
        if (n == 0) {
            return true;
        }
        return (long)n <= bgt_02.dmi();
    }

    private boolean dFN() {
        bgt_0 bgt_02 = cus_2.eRQ().eRS();
        if (this.jgY == null) {
            return true;
        }
        int n = this.jgY.cnp();
        if (n == 0) {
            return true;
        }
        return (long)n <= bgt_02.ffF().gbc();
    }

    @Nullable
    private String dFO() {
        if (this.jgY == null) {
            return null;
        }
        ang_2 ang_22 = this.jgY.bdo();
        if (ang_22 == null) {
            return null;
        }
        bgt_0 bgt_02 = cus_2.eRQ().eRS();
        boolean bl = !ang_22.b(bgt_02, this, this.jgY, bgt_02.bdV());
        String string = eLP.b(ang_22);
        ahv_2 ahv_22 = new ahv_2();
        if (bl) {
            ahv_22.ceC().e(new awx_2(0.8f, 0.0f, 0.0f, 1.0f));
        }
        ahv_22.c(string);
        if (bl) {
            ahv_22.ceD();
        }
        return ahv_22.ceL();
    }

    @Nullable
    private String dFP() {
        if (this.jgY == null) {
            return null;
        }
        bgt_0 bgt_02 = cus_2.eRQ().eRS();
        int n = this.jgY.fTy();
        if (n == 0) {
            return null;
        }
        boolean bl = (long)n < bgt_02.dmi();
        ahv_2 ahv_22 = new ahv_2();
        if (!bl) {
            ahv_22.ceC().e(new awx_2(0.8f, 0.0f, 0.0f, 1.0f));
        }
        ahv_22.yx(n);
        if (!bl) {
            ahv_22.ceD();
        }
        return ahv_22.ceL();
    }

    @Nullable
    private String dFQ() {
        if (this.jgY == null) {
            return null;
        }
        bgt_0 bgt_02 = cus_2.eRQ().eRS();
        long l = bgt_02.ffF().gbc();
        int n = this.jgY.cnp();
        if (n == 0) {
            return null;
        }
        boolean bl = (long)n < l;
        ahv_2 ahv_22 = new ahv_2();
        if (!bl) {
            ahv_22.ceC().e(new awx_2(0.8f, 0.0f, 0.0f, 1.0f));
        }
        ahv_22.c(n + "x " + aum_0.cWf().c("pvpCoins", new Object[0]));
        if (!bl) {
            ahv_22.ceD();
        }
        return ahv_22.ceL();
    }

    public ArrayList<bmj_2> dFR() {
        return this.jgW;
    }

    public boolean dFS() {
        boolean bl;
        if (this.jgY == null) {
            return true;
        }
        bgt_0 bgt_02 = cus_2.eRQ().eRS();
        ang_2 ang_22 = this.jgY.bdo();
        if (ang_22 != null && !ang_22.b(bgt_02, this, this.jgY, bgt_02.bdV())) {
            return false;
        }
        Optional optional = evx_2.feo().b(bgt_02.aZj(), eva_1.owu);
        boolean bl2 = bl = !this.jgY.a(new bsx_0(this, bgt_02, optional));
        if (bl) {
            return false;
        }
        if (bgt_02.cWp().exS() < (long)this.jgY.fTy()) {
            return false;
        }
        return bgt_02.ffF().gbc() >= (long)this.jgY.cnp();
    }

    public long dFT() {
        int n;
        long l;
        if (this.jgY == null) {
            return 0L;
        }
        bgt_0 bgt_02 = cus_2.eRQ().eRS();
        ang_2 ang_22 = this.jgY.bdo();
        if (ang_22 != null && !ang_22.b(bgt_02, this, this.jgY, bgt_02.bdV())) {
            return 0L;
        }
        Optional optional = evx_2.feo().b(bgt_02.aZj(), eva_1.owu);
        long l2 = Long.MAX_VALUE;
        bdl_0 bdl_02 = bgt_02.dno();
        for (Map.Entry<Integer, Short> entry : this.jgY.fTx().entrySet()) {
            fec_0 fec_02;
            ffm ffm2;
            l = entry.getValue().shortValue();
            if (l <= 0L) continue;
            Integer n2 = entry.getKey();
            long l3 = bdl_02.Go(n2) ? (long)bdl_02.UN(n2) / l : (optional.isPresent() && ((feb_0)optional.get()).Qe(n2) != 0 ? (long)((feb_0)optional.get()).Qe(n2) / l : ((ffm2 = (fec_02 = (fec_0)bgt_02.a(fez_0.sep)).UB(n2)) != null ? (long)ffm2.bfd() / l : 0L));
            l2 = Math.min(l2, l3);
        }
        int n3 = this.jgY.fTy();
        if (n3 > 0) {
            long l4 = bgt_02.cWp().exS() / (long)n3;
            l2 = Math.min(l2, l4);
        }
        if ((n = this.jgY.cnp()) > 0) {
            l = bgt_02.ffF().gbc() / (long)n;
            l2 = Math.min(l2, l);
        }
        return l2;
    }

    public boolean dFU() {
        if (this.jgY == null) {
            return false;
        }
        bgt_0 bgt_02 = cus_2.eRQ().eRS();
        LP lP = new LP(false);
        this.jgY.X((TObjectProcedure<fdu>)((TObjectProcedure)fdu2 -> {
            Object r = fgD.fXh().Vd(fdu2.azv());
            fgl_0 fgl_02 = ((fhc_0)r).fUZ();
            if (fgl_02 == null) {
                return true;
            }
            if (!(fgl_02 instanceof bgf_1)) {
                return true;
            }
            if (!((bgf_1)((Object)fgl_02)).a(bgt_02, (fhc_0)r)) {
                lP.aH(true);
                return false;
            }
            return true;
        }));
        return lP.aTe();
    }

    public boolean dFV() {
        if (this.jgY == null) {
            return false;
        }
        LP lP = new LP(false);
        this.jgY.X((TObjectProcedure<fdu>)((TObjectProcedure)fdu2 -> {
            Object r = fgD.fXh().Vd(fdu2.azv());
            fgl_0 fgl_02 = ((fhc_0)r).fUZ();
            if (fgl_02 == null) {
                return true;
            }
            if (fgl_02 instanceof bgf_1) {
                lP.aH(true);
                return false;
            }
            return true;
        }));
        return lP.aTe();
    }

    @Nullable
    public bmj_2 dFW() {
        if (this.jgX.isEmpty()) {
            return null;
        }
        return this.jgX.get(0);
    }

    public fdt_0 dFX() {
        return this.jgY;
    }

    public int aYs() {
        return this.jgY.aYs();
    }

    public int dFY() {
        int n = 0;
        for (bmj_2 bmj_22 : this.jgW) {
            int n2 = jgS.pF(bmj_22.duo().d());
            n += bmj_22.bfd() * (n2 == 0 ? 1 : n2);
        }
        return n;
    }

    @Override
    public String cUG() {
        if (this.jgX.size() <= 0) {
            return "";
        }
        bmj_2 bmj_22 = this.jgX.get(0);
        if (bmj_22.duo() == null) {
            return "";
        }
        return bmj_22.duo().dah();
    }

    @Override
    public bgv_2 duo() {
        bmj_2 bmj_22 = this.dFW();
        return bmj_22 != null ? bmj_22.duo() : null;
    }

    public fhy_0 dFZ() {
        bgv_2 bgv_22 = this.duo();
        if (bgv_22 == null) {
            return null;
        }
        fhy_0 fhy_02 = bgv_22.dGh();
        if (fhy_02 == null) {
            return null;
        }
        fhy_0 fhy_03 = fhy_02.fZm();
        if (fhy_03 != null) {
            return fhy_03;
        }
        return fhy_02;
    }

    static {
        jgS.cA(13126, 1);
        jgS.cA(13127, 10);
        jgS.cA(13128, 100);
    }
}

