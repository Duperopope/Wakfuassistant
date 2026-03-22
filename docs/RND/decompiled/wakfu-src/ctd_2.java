/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.lang.invoke.LambdaMetafactory;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from cTD
 */
public class ctd_2
implements adi_1 {
    private static final ctd_2 nJL = new ctd_2();
    private static final alx_2 nJM = string -> {
        if ("cosmeticsPreviewDialog".equals(string)) {
            aue_0.cVJ().b(nJL);
        }
    };
    private final bmo_1 nJN = new bmo_1();
    @NotNull
    private Set<Integer> nJO = Collections.emptySet();
    private bgt_0 hVo;

    public static ctd_2 eQA() {
        return nJL;
    }

    private ctd_2() {
    }

    @NotNull
    public static bgt_0 daL() {
        if (ctd_2.nJL.hVo != null) {
            return ctd_2.nJL.hVo;
        }
        return aue_0.cVJ().cVL();
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 17840: {
                bgt_0 bgt_02 = (bgt_0)((dae_0)aam_22).bCv();
                if (this.hVo.Sn() == bgt_02.Sn()) {
                    return false;
                }
                this.af(bgt_02);
                this.eQB();
                return false;
            }
            case 16111: {
                this.eQB();
                return false;
            }
            case 18240: {
                dae_0 dae_02 = (dae_0)aam_22;
                fm_1 fm_12 = (fm_1)((Object)dae_02.bCv());
                int n = dae_02.bCo();
                this.nJN.a(n, fm_12);
                return false;
            }
            case 18145: {
                fm_1 fm_13 = (fm_1)((Object)((dae_0)aam_22).bCv());
                this.nJN.u(fm_13);
                return false;
            }
        }
        return true;
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (bl) {
            return;
        }
        fyw_0.gqw().d("wakfu.cosmeticsPreview", cef_2.class);
        fse_1.gFu().f("cosmeticsPreview", this.nJN);
        cfe_1.addListener(this.nJN);
        fyw_0.gqw().a(nJM);
        ccj_2.g("cosmeticsPreviewDialog", 163840L);
        fse_1.gFu().b("characterSheet", this.hVo, "cosmeticsPreviewDialog");
        cAY.eHc().nP(600012L);
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (bl) {
            return;
        }
        fse_1.gFu().b("characterSheet", (Object)null, "cosmeticsPreviewDialog");
        fyw_0.gqw().b(nJM);
        fyw_0.gqw().tl("cosmeticsPreviewDialog");
        cfe_1.removeListener(this.nJN);
        fyw_0.gqw().tc("wakfu.cosmeticsPreview");
        fse_1.gFu().f("cosmeticsPreview", (Object)null);
        this.nJO = Collections.emptySet();
        cAY.eHc().nP(600013L);
    }

    public void v(fm_1 fm_12) {
        this.nJN.v(fm_12);
    }

    public void dvW() {
        this.nJN.dvW();
    }

    public void bB(@NotNull ffV ffV2) {
        this.a(List.of(bjf_1.h(ffV2)), aue_0.cVJ().cVL());
    }

    public void a(@NotNull ffV ffV2, bgt_0 bgt_02) {
        this.a(List.of(bjf_1.h(ffV2)), bgt_02);
    }

    public void i(@NotNull fhc_0 fhc_02) {
        this.a(List.of(fhc_02), aue_0.cVJ().cVL());
    }

    public void F(@NotNull Collection<? extends fhc_0> collection) {
        this.a(collection, aue_0.cVJ().cVL());
    }

    public void a(@NotNull Collection<? extends fhc_0> collection, @NotNull bgt_0 bgt_02) {
        List<fhc_0> list = collection.stream().filter(bjf_1::b).toList();
        if (list.isEmpty()) {
            return;
        }
        Set set = list.stream().map(fhc_0::d).collect(Collectors.toSet());
        if (this.nJO.equals(set)) {
            fyw_0.gqw().tl("cosmeticsPreviewDialog");
            return;
        }
        this.af(bgt_02);
        this.nJO = set;
        if (!aue_0.cVJ().c(this)) {
            this.nJN.t(this.hVo);
        }
        this.nJN.r(list);
        this.av(list);
        if (!aue_0.cVJ().c(this)) {
            aue_0.cVJ().a(this);
        } else {
            fse_1.gFu().a((aef_2)this.nJN, this.nJN.bxk());
        }
    }

    /*
     * Could not resolve type clashes
     * Unable to fully structure code
     */
    private void av(List<? extends fhc_0> var1_1) {
        var2_2 = false;
        var3_3 = false;
        var4_4 = false;
        var5_5 = false;
        for (fhc_0 var7_7 : var1_1) {
            var8_8 = bjf_1.a(var7_7);
            if (var2_2) ** GOTO lbl-1000
            if (var8_8.stream().anyMatch((Predicate<fm_1>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, contains(java.lang.Object ), (Lfm;)Z)(bmo_1.iAy))) lbl-1000:
            // 2 sources

            {
                v0 = true;
            } else {
                v0 = false;
            }
            var2_2 = v0;
            var3_3 = var3_3 != false || var8_8.contains((Object)fm_1.pv) != false;
            var4_4 = var4_4 != false || var8_8.contains((Object)fm_1.pu) != false;
            var5_5 = var5_5 != false || var8_8.contains((Object)fm_1.pz) != false;
        }
        if (var2_2) {
            this.nJN.u(fm_1.pw);
        }
        if (!var3_3) {
            this.nJN.dvz().duB();
        }
        if (!var4_4) {
            this.nJN.dvz().duF();
        }
        if (!var5_5) {
            this.nJN.dvz().duJ();
        }
    }

    private void af(@NotNull bgt_0 bgt_02) {
        this.hVo = bgt_02;
        bgl_0 bgl_02 = bwa_0.jwi.aj(this.hVo);
        fse_1.gFu().b("characterSheet", bgl_02, "cosmeticsPreviewDialog");
    }

    private void eQB() {
        List<bgv_2> list = this.nJO.stream().map(bEm.dSb()::Vd).filter(Objects::nonNull).toList();
        this.nJN.t(this.hVo);
        this.nJN.r(list);
        fse_1.gFu().a((aef_2)this.nJN, this.nJN.bxk());
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }
}

