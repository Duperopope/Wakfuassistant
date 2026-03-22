/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bLy
 */
public class bly_2
implements aeh_2 {
    public static final int ktj = 6;
    public static final String ktk = "pageDescription";
    public static final String ktl = "hasPreviousPage";
    public static final String ktm = "hasNextPage";
    public static final String ktn = "secrets";
    private byte kto;
    private final byte ktp;
    final ArrayList<blx_2> ktq = new ArrayList();
    private final ArrayList<blx_2> ktr = new ArrayList();

    public bly_2() {
        blw_2.kta.v(new blz_2(this));
        this.ktq.sort(new bla_2(this));
        this.kto = 0;
        this.ktp = (byte)Math.ceil((float)this.ktq.size() / 6.0f);
        this.ecJ();
    }

    private void ecJ() {
        int n = GC.a(this.kto * 6, 0, this.ktq.size() - 1);
        int n2 = GC.a(n + 6, 0, this.ktq.size());
        this.ktr.clear();
        for (int i = n; i < n2; ++i) {
            this.ktr.add(this.ktq.get(i));
        }
        fse_1.gFu().a((aef_2)this, ktn);
    }

    @Override
    public String[] bxk() {
        return dGM;
    }

    public void dxo() {
        if (this.ecL()) {
            this.kto = (byte)(this.kto - 1);
            this.ecJ();
            this.ecK();
        }
    }

    public void dxp() {
        if (this.ecM()) {
            this.kto = (byte)(this.kto + 1);
            this.ecJ();
            this.ecK();
        }
    }

    private void ecK() {
        fse_1.gFu().a((aef_2)this, ktl, ktm, ktk);
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (string.equals(ktk)) {
            return this.dfB();
        }
        if (string.equals(ktm)) {
            return this.ecM();
        }
        if (string.equals(ktl)) {
            return this.ecL();
        }
        if (string.equals(ktn)) {
            return this.ktr;
        }
        return null;
    }

    private boolean ecL() {
        return this.kto > 0;
    }

    private boolean ecM() {
        return this.kto + 1 < this.ktp;
    }

    private String dfB() {
        return aum_0.cWf().c("pageNumber", this.kto + 1, this.ktp);
    }
}

