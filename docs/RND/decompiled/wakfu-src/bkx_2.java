/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bKx
 */
public class bkx_2
implements aeh_2 {
    public static final String koJ = "typeName";
    public static final String koK = "victories";
    public static final String koL = "defeats";
    public static final String koM = "matchDesc";
    public static final String koN = "fullMatchDesc";
    private final fpo_0 koO;
    private fpq_0 kod;

    public bkx_2(fpo_0 fpo_02, fpq_0 fpq_02) {
        this.koO = fpo_02;
        this.kod = fpq_02;
    }

    public void c(fpq_0 fpq_02) {
        this.kod = fpq_02;
        fse_1.gFu().a((aef_2)this, koK, koL, koM, koN);
    }

    public void ebw() {
        fse_1.gFu().a((aef_2)this, koK, koL, koM, koN);
    }

    @Override
    public String[] bxk() {
        return dGM;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (koJ.equals(string)) {
            return this.ebz();
        }
        if (koK.equals(string)) {
            return this.eby();
        }
        if (koL.equals(string)) {
            return this.ebx();
        }
        if (koN.equals(string)) {
            return this.hT(true);
        }
        if (koM.equals(string)) {
            return this.hT(false);
        }
        return null;
    }

    private int ebx() {
        return this.kod.b(this.koO);
    }

    private int eby() {
        return this.kod.c(this.koO);
    }

    private String ebz() {
        return aum_0.cWf().c("matchType." + this.koO.ordinal(), new Object[0]);
    }

    private String hT(boolean bl) {
        ahv_2 ahv_22 = new ahv_2();
        if (bl) {
            ahv_22.c(this.ebz()).c(aum_0.cWf().c("colon", new Object[0]));
        }
        ahv_22.ceC().e(awx_2.dnL).c(aum_0.cWf().c(koK, this.eby())).ceD();
        ahv_22.c(" / ");
        ahv_22.e(awx_2.dnJ).c(aum_0.cWf().c(koL, this.ebx()));
        return ahv_22.ceL();
    }
}

