/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from cTj
 */
public class ctj_2
implements adi_1 {
    private static final ctj_2 nIs = new ctj_2();
    public static final String nIt = "chooseItemElementsWindow";
    private final alx_2 nIu = string -> {
        if ("chooseItemElementsDialog".equals(string)) {
            aue_0.cVJ().b(nIs);
        }
    };
    private final Map<ctk_2, Byte> nIv = new HashMap<ctk_2, Byte>();
    @Nullable
    private fcv_1 nIw;

    public static ctj_2 ePr() {
        return nIs;
    }

    private ctj_2() {
    }

    public byte f(boolean bl, int n) {
        return this.a(bl, n, (byte)0);
    }

    public byte a(boolean bl, int n, byte by) {
        return this.nIv.getOrDefault(new ctk_2(bl, n), by);
    }

    @Override
    public boolean b(aam_2 aam_22) {
        if (aam_22.d() == 18278) {
            bdk_0 bdk_02 = (bdk_0)((dae_0)aam_22).bCv();
            if (!bdk_02.dRp()) {
                return false;
            }
            byte by = bdk_02.dRl();
            byte by2 = bdk_02.dRn();
            if (by > 0) {
                this.nIv.put(new ctk_2(true, bdk_02.dRm()), by);
            }
            if (by2 > 0) {
                this.nIv.put(new ctk_2(false, bdk_02.dRo()), by2);
            }
            if (!bdk_02.dBJ()) {
                aue_0.cVJ().b(this);
                return false;
            }
            ctj_2.a(bdk_02.getItem(), by, by2);
            if (this.nIw != null) {
                cfe_1.addRollElementsParticleToContainer(this.nIw);
            }
            aue_0.cVJ().b(this);
            return false;
        }
        return true;
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (bl) {
            return;
        }
        fyw_0.gqw().a(this.nIu);
        fyw_0.gqw().d("wakfu.chooseItemElements", cdr_2.class);
        aie_0.cfn().bmE().a(bdj_0.jLk, true);
        ccj_2.g("chooseItemElementsDialog", 33024L);
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (bl) {
            return;
        }
        fyw_0.gqw().b(this.nIu);
        fyw_0.gqw().tc("wakfu.chooseItemElements");
        aie_0.cfn().bmE().a(bdj_0.jLk);
        fyw_0.gqw().tl("chooseItemElementsDialog");
    }

    public static void a(@NotNull ffV ffV2, @Nullable fcv_1 fcv_12) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02.djU()) {
            return;
        }
        boolean bl = ((bsg_1)aie_0.cfn().bmH()).a(bsn_1.lkA);
        if (ffV2.dOg().fYA()) {
            if (bl) {
                ctj_2.c(ffV2, fcv_12);
            } else {
                ctj_2.b(ffV2, fcv_12);
            }
        } else {
            ctj_2.d(ffV2, fcv_12);
        }
    }

    public static void b(@NotNull ffV ffV2, @Nullable fcv_1 fcv_12) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02.djU()) {
            return;
        }
        fse_1.gFu().f("chooseItemElements", new bdk_0(ffV2));
        ctj_2.nIs.nIw = fcv_12;
        aue_0.cVJ().a(nIs);
    }

    private static void c(@NotNull ffV ffV2, @Nullable fcv_1 fcv_12) {
        int n = bez_0.d(ffV2, enf_0.qPQ.d());
        byte by = nIs.a(true, n, fgy_0.smx[n]);
        int n2 = bez_0.d(ffV2, enf_0.qPR.d());
        byte by2 = nIs.a(false, n2, fgy_0.smx[n2]);
        ctj_2.a(ffV2, by, by2);
        if (fcv_12 != null) {
            cfe_1.addRollElementsParticleToContainer(fcv_12);
        }
    }

    private static void a(@NotNull ffV ffV2, byte by, byte by2) {
        clx_0 clx_02 = new clx_0();
        clx_02.mZ(ffV2.LV());
        clx_02.ds(by);
        clx_02.dt(by2);
        aue_0.cVJ().etu().d(clx_02);
    }

    private static void d(ffV ffV2, @Nullable fcv_1 fcv_12) {
        dae_0 dae_02 = new dae_0();
        dae_02.lK(19350);
        dae_02.gj(ffV2.LV());
        aaw_1.bUq().h(dae_02);
        if (fcv_12 != null) {
            cfe_1.addRollElementsParticleToContainer(fcv_12);
        }
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }
}

