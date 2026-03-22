/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntProcedure
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.procedure.TIntProcedure;
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bfe
 */
public class bfe_0
implements aeh_2 {
    public static final String hQy = "nationsList";
    public static final String hQz = "isDefender";
    public static final String hQA = "score";
    public static final String hQB = "nbPlayer";
    public static final String hQC = "maxPlace";
    public static final String hQD = "placeText";
    public static final String hQE = "hasWin";
    private final ArrayList<bso_2> hQF = new ArrayList();
    private boolean hQG;
    private final fpv hQH;
    public static final String[] hQI = new String[]{"nationsList", "isDefender", "score", "nbPlayer", "maxPlace", "placeText", "hasWin"};

    public bfe_0(fpv fpv2, boolean bl) {
        this.hQH = fpv2;
        if (bl) {
            fpv2.ggL().forEach((TIntProcedure)new bff_0(this));
        } else {
            fpv2.ggK().forEach((TIntProcedure)new bfg_0(this));
        }
        this.hQG = bl;
    }

    public void BI(int n) {
        bso_2 bso_22 = bss_2.lgz.Jt(n);
        if (bso_22 == null) {
            return;
        }
        this.hQF.add(bso_22);
    }

    @Override
    public String[] bxk() {
        return hQI;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (string.equals(hQy)) {
            return this.hQF;
        }
        if (string.equals(hQz)) {
            return this.hQG;
        }
        if (string.equals(hQA)) {
            return this.hQG ? this.hQH.eDJ() : this.hQH.eDI();
        }
        if (string.equals(hQB)) {
            return this.dfE();
        }
        if (string.equals(hQC)) {
            return this.hQH.dfF().ghc();
        }
        if (string.equals(hQD)) {
            ahv_2 ahv_22 = new ahv_2();
            ahv_22.c(this.dfE() + "/" + this.hQH.dfF().ghc());
            return new ahv_2().ceC().e(this.dfE() == this.hQH.dfF().ghc() ? awx_2.dnJ : awx_2.dnF).af(ahv_22).ceD().ceL();
        }
        if (string.equals(hQE)) {
            return this.hQG ? this.hQH.ggL().contains(this.hQH.atC()) : this.hQH.ggK().contains(this.hQH.atC());
        }
        return null;
    }

    public short dfE() {
        return this.hQG ? this.hQH.eDL() : this.hQH.eDK();
    }

    public void fw(boolean bl) {
        this.hQG = bl;
    }

    boolean BJ(int n) {
        return this.hQF.contains(bss_2.lgz.Jt(n));
    }
}

