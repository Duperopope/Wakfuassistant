/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from cTU
 */
public class ctu_1
implements adi_1 {
    public static final ctu_1 nKS = new ctu_1();
    public static final int nKT = -10;
    public static final int nKU = 10;
    public static final fzw_0 nKV = fzw_0.tLo;
    private afx_1 cEq;
    private String nKW;
    private afq_2[] cEr;
    private boolean nKX = true;
    private String nKY;
    private final cpt_1 nKZ = new cpt_1("scenario.endKinematic");
    private final alx_2 nLa = new ctv_1(this);

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (!bl) {
            fse_1.gFu().f("displayButton", this.nKZ);
            fyw_0.gqw().a(this.nLa);
            ccj_2.g("displayButtonDialog", 139280L);
            fyw_0.gqw().d("wakfu.displayButton", cep_2.class);
        }
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            fyw_0.gqw().b(this.nLa);
            if (fyw_0.gqw().to("displayButtonDialog")) {
                fyw_0.gqw().tl("displayButtonDialog");
            }
            fse_1.gFu().vX("displayButton");
            fyw_0.gqw().tc("wakfu.displayButton");
        }
    }

    @Override
    public boolean b(aam_2 aam_22) {
        return true;
    }

    @Override
    public long Sn() {
        return 0L;
    }

    public void qu(@Nullable String string) {
        this.nKY = string;
    }

    public String eRi() {
        return this.nKY;
    }

    @Override
    public void dC(long l) {
    }

    public void pW(@NotNull String string) {
        this.nKZ.pW(string);
    }

    public void setXOffset(int n) {
        this.nKZ.setXOffset(n);
    }

    public void setYOffset(int n) {
        this.nKZ.setYOffset(n);
    }

    public void setAlignment(fzw_0 fzw_02) {
        this.nKZ.setAlignment(fzw_02);
    }

    public void f(afx_1 afx_12) {
        this.cEq = afx_12;
    }

    public void qv(String string) {
        this.nKW = string;
    }

    public void kk(boolean bl) {
        this.nKX = bl;
    }

    public boolean eRj() {
        return this.nKX;
    }

    public void eRk() {
        this.cEq.a(this.nKW, this.cEr, new afp_2[0]);
        aue_0.cVJ().b(this);
    }

    public void b(afq_2[] afq_2Array) {
        this.cEr = afq_2Array;
    }
}

