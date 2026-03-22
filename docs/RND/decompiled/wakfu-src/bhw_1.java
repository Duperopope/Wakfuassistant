/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.List;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bHw
 */
public class bhw_1
implements aeh_2 {
    public static final String kak = "similarEntriesSearch";
    public static final String kal = "similarOffersSearch";
    private final bif_1 kam = new bif_1(5);
    private final fiu_0 kan = new fiP();
    private final bif_1 kao = new bif_1(5);
    private final fiS kap = new fiS();
    private final bhn_2 kaq = new bhn_2();

    public void GR(int n) {
        this.kan.We(n);
        if (this.kan.fbg() == fje.swW) {
            this.kan.c(fje.swR).nx(true);
        }
        this.kap.bf(List.of(Integer.valueOf(n)));
        if (this.kap.fbg() == fje.swW) {
            this.kap.c(fje.swR).nx(false);
        }
        this.GS(0);
        this.GT(0);
    }

    public void dVY() {
        this.GS(0);
        this.GT(0);
    }

    public void a(fje fje2) {
        cwl_1.a(this.kan, fje2);
        this.GS(this.kan.eEQ());
    }

    public void b(fje fje2) {
        cwl_1.a(this.kap, fje2);
        this.GT(this.kap.eEQ());
    }

    public void dVZ() {
        this.GS(this.kam.dXt());
    }

    public void dWa() {
        this.GT(this.kao.dXt());
    }

    public void dWb() {
        this.GS(this.kam.dXu());
    }

    public void dWc() {
        this.GT(this.kao.dXu());
    }

    public void dWd() {
        this.GS(this.kam.GW(1));
    }

    public void dWe() {
        this.GT(this.kao.GW(1));
    }

    private void GS(int n) {
        this.kan.Wj(n);
        if (!this.kaq.as(this.kan)) {
            return;
        }
        fiu_1.uCW.N("marketSearchesLock", false);
        clW clW2 = new clW(fjc.swv);
        clW2.e(this.kan);
        aue_0.cVJ().etu().d(clW2);
    }

    private void GT(int n) {
        this.kap.Wj(n);
        if (!this.kaq.as(this.kap)) {
            return;
        }
        fiu_1.uCW.N("marketSearchesLock", false);
        clV clV2 = new clV(fjc.swx);
        clV2.e(this.kap);
        aue_0.cVJ().etu().d(clV2);
    }

    public void d(mg mg2) {
        this.kam.a(mg2.akE(), mg2.Ve().stream().map(mc2 -> new bhu_1((mc)mc2, mg2.akH())).toList());
        fse_1.gFu().a((aef_2)this, kak);
    }

    public void d(mi_0 mi_02) {
        this.kao.a(mi_02.akE(), mi_02.anv().stream().map(mE2 -> new bhz_1((mE)mE2, mi_02.akH())).toList());
        fse_1.gFu().a((aef_2)this, kal);
    }

    public void reset() {
        this.kan.reset();
        this.kao.reset();
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (kak.equals(string)) {
            return this.kam;
        }
        if (kal.equals(string)) {
            return this.kao;
        }
        return null;
    }

    @Override
    public String[] bxk() {
        return new String[]{kak, kal};
    }
}

