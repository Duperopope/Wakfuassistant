/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.List;
import org.jetbrains.annotations.Nullable;

public class bHw
implements aEH {
    public static final String kak = "similarEntriesSearch";
    public static final String kal = "similarOffersSearch";
    private final bIf kam = new bIf(5);
    private final fiU kan = new fiP();
    private final bIf kao = new bIf(5);
    private final fiS kap = new fiS();
    private final bHn kaq = new bHn();

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
        cWl.a(this.kan, fje2);
        this.GS(this.kan.eEQ());
    }

    public void b(fje fje2) {
        cWl.a(this.kap, fje2);
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
        fIU.uCW.N("marketSearchesLock", false);
        clW clW2 = new clW(fjc.swv);
        clW2.e(this.kan);
        aUE.cVJ().etu().d(clW2);
    }

    private void GT(int n) {
        this.kap.Wj(n);
        if (!this.kaq.as(this.kap)) {
            return;
        }
        fIU.uCW.N("marketSearchesLock", false);
        clV clV2 = new clV(fjc.swx);
        clV2.e(this.kap);
        aUE.cVJ().etu().d(clV2);
    }

    public void d(mg mg2) {
        this.kam.a(mg2.akE(), mg2.Ve().stream().map(mc2 -> new bHU((mc)mc2, mg2.akH())).toList());
        fSe.gFu().a((aEF)this, kak);
    }

    public void d(mI mI2) {
        this.kao.a(mI2.akE(), mI2.anv().stream().map(mE2 -> new bHZ((mE)mE2, mI2.akH())).toList());
        fSe.gFu().a((aEF)this, kal);
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
