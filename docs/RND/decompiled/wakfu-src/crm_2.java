/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.time.Duration;
import java.util.Optional;
import java.util.OptionalInt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from cRM
 */
public class crm_2
implements adi_1 {
    private static final crm_2 nDv = new crm_2();
    private static final Duration nDw = Duration.ofSeconds(10L);
    private static final Runnable nDx = () -> aue_0.cVJ().etu().d(new cim_0());
    @NotNull
    private btx_1 nDy = new btx_1(null);
    private ezt_0 nDz;

    public static crm_2 eMO() {
        return nDv;
    }

    private crm_2() {
    }

    @NotNull
    public btx_1 eMP() {
        return this.nDy;
    }

    public ezx_0 eMQ() {
        return this.nDy.enH();
    }

    public void eMR() {
        this.nDy = new btx_1(this.nDy);
    }

    public void d(@NotNull ezt_0 ezt_02, @Nullable ezy_0 ezy_02) {
        this.nDy.b(ezt_02, ezy_02);
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 17182: {
                ezx_0 ezx_02 = (ezx_0)((Object)((dae_0)aam_22).bCv());
                czc_1.b("serverModeChoiceDialog", () -> {
                    fyw_0.gqw().tl("serverModeChoiceDialog");
                    czc_1.j("newServerChoiceDialog", 8192L);
                    this.nDy.a(ezx_02);
                    this.nDy.enP();
                });
                return false;
            }
            case 19451: {
                bty_1 bty_12 = (bty_1)((dae_0)aam_22).bCv();
                this.nDy.d(bty_12);
                return false;
            }
            case 17317: {
                bta_2 bta_22 = (bta_2)((dae_0)aam_22).bCv();
                this.nDy.a(bta_22);
                this.nDy.enQ();
                this.nDy.enM();
                return false;
            }
            case 17198: {
                int n = ((dae_0)aam_22).bCo();
                this.a(n, null);
                return false;
            }
            case 19676: {
                dae_0 dae_02 = (dae_0)aam_22;
                this.a(dae_02.bCo(), (Long)dae_02.bCp());
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
        abg_2.bUP().a(nDx, nDw);
        fse_1.gFu().f("serverChoiceView", this.nDy);
        fyw_0.gqw().d("wakfu.newServerChoice", cfe_2.class);
        cvz_1.eUC();
        fiu_1.uCW.vN("serverSelectionLock");
        int n = ((bsg_1)aie_0.cfn().bmH()).d(bsn_1.ljV);
        Optional<bta_2> optional = this.nDy.enI().stream().filter(bta_22 -> bta_22.enY().d() == n).findFirst();
        if (this.nDy.enJ().size() == 1) {
            czc_1.j("newServerChoiceDialog", 8192L);
            this.nDy.a(this.nDy.enJ().firstKey());
            this.nDy.enP();
        } else if (n == 0 || optional.isEmpty()) {
            czc_1.j("serverModeChoiceDialog", 8192L);
        } else {
            czc_1.j("newServerChoiceDialog", 8192L);
            this.nDy.a(optional.get().enY().enC());
            this.nDy.enP();
        }
        aie_0.cfn().bmE().a(btw_1.loA, true);
        this.nDy.enO();
        if (!aue_0.cVJ().c(cyt_1.eXX())) {
            aue_0.cVJ().a(cyt_1.eXX());
        }
        cAY.eHc().eGX();
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (bl) {
            return;
        }
        abg_2.bUP().h(nDx);
        fse_1.gFu().f("serverChoiceView", (Object)null);
        fiu_1.uCW.vO("serverSelectionLock");
        fyw_0.gqw().tc("wakfu.newServerChoice");
        aie_0.cfn().bmE().a(btw_1.loA);
        fyw_0.gqw().tl("newServerChoiceDialog");
        fyw_0.gqw().tl("serverModeChoiceDialog");
        if (aue_0.cVJ().cVP() == auz_0.gzl) {
            aue_0.cVJ().kH("Dispatch");
        }
    }

    public void eMS() {
        fse_1.gFu().f("serverChoiceView", this.nDy);
    }

    public OptionalInt eMT() {
        bta_2 bta_22 = this.nDy.enL();
        if (bta_22 == null) {
            return OptionalInt.empty();
        }
        return OptionalInt.of(bta_22.enY().d());
    }

    public void enN() {
        this.nDy.enN();
    }

    private void a(int n, @Nullable Long l) {
        if (!fiu_1.uCW.fd("serverSelectionLock")) {
            return;
        }
        this.nDy.JA(n).ifPresent(bta_22 -> {
            fiu_1.uCW.N("serverSelectionLock", false);
            czc_1.b("newServerChoiceDialog", () -> {
                crh_2.eML().cB(true).g(aum_0.cWf().c("loadingWaitingWorldNotFull.progress", new Object[0]), 0);
                this.nDz = bta_22.enY();
                cir_0 cir_02 = new cir_0();
                cir_02.zS(bta_22.enY().d());
                cir_02.G(l);
                aue_0.cVJ().etu().d(cir_02);
            });
        });
    }

    public void eMU() {
        ccz_1.etG().jc(false);
        aue_0.cVJ().b(this);
        aub_0.cVb().ks(this.nDz.getName());
        fse_1.gFu().f("worldName", this.nDz.getName());
        aue_0.cVJ().kH("Dispatch");
        aue_0.cVJ().zS(this.nDz.d());
        aue_0.cVJ().a(auz_0.gzm);
        aue_0.cVJ().a(this.nDz);
        aue_0.cVJ().cVS();
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }
}

