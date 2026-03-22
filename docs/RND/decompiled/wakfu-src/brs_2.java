/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bRS
 */
public class brs_2
implements aeh_2,
Comparable {
    public static final String lcX = "name";
    public static final String lcY = "categoryName";
    public static final String lcZ = "points";
    public static final String lda = "percentPoints";
    public static final String ldb = "iconUrl";
    public static final String ldc = "cost";
    public static final String ldd = "description";
    public static final String lde = "activated";
    public static final String ldf = "isRight";
    public static final String ldg = "locked";
    public static final String[] ldh = new String[]{"name", "categoryName", "points", "percentPoints", "iconUrl", "cost", "description", "activated", "isRight", "locked"};
    private flv_0 ldi;
    private brt_2 ldj = brt_2.ldk;

    public int compareTo(@NotNull Object object) {
        if (object instanceof brs_2) {
            brs_2 brs_22;
            int n;
            int n2 = this.elD().csT();
            return n2 == (n = (brs_22 = (brs_2)object).elD().csT()) ? this.getName().compareTo(brs_22.getName()) : n2 - n;
        }
        return 0;
    }

    public brs_2(flv_0 flv_02) {
        this.ldi = flv_02;
    }

    @Override
    public String[] bxk() {
        return ldh;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(lcX)) {
            return this.getName();
        }
        if (string.equals(lcY)) {
            if (this.ldi.csT() >= -5) {
                return aum_0.cWf().c("nation.lawMinorDeliquency", new Object[0]);
            }
            if (this.ldi.csT() >= -20) {
                return aum_0.cWf().c("nation.lawMajorDeliquency", new Object[0]);
            }
            return aum_0.cWf().c("nation.lawCrimeDeliquency", new Object[0]);
        }
        if (string.equals(lcZ)) {
            int n = this.ldi.csT();
            return n > 0 ? "+" + n : Integer.valueOf(n);
        }
        if (string.equals(lda)) {
            int n = this.ldi.csU();
            if (n == 0) {
                return null;
            }
            return n + "%";
        }
        if (string.equals(ldb)) {
            return auc_0.cVq().ix(this.ldi.Sn());
        }
        if (string.equals(ldc)) {
            return this.ldi.csV();
        }
        if (string.equals(ldd)) {
            return aum_0.cWf().a(98, (long)((int)this.ldi.Sn()), new Object[0]);
        }
        if (string.equals(lde)) {
            if (brt_2.ldk == this.ldj) {
                return this.aOY();
            }
            return this.elE();
        }
        if (string.equals(ldg)) {
            return this.ldi.bfb();
        }
        if (string.equals(ldf)) {
            return this.ldi.csT() > 0;
        }
        return null;
    }

    private String getName() {
        return aum_0.cWf().a(97, (long)((int)this.ldi.Sn()), new Object[0]);
    }

    private boolean aOY() {
        return brx_1.elI().ems().gbo().uo(this.ldi.Sn());
    }

    public flv_0 elD() {
        return this.ldi;
    }

    public void a(flv_0 flv_02) {
        this.ldi = flv_02;
    }

    public boolean elE() {
        return this.ldj == brt_2.ldm || this.ldj == brt_2.ldk && this.aOY();
    }

    public void iz(boolean bl) {
        this.ldj = bl ? brt_2.ldm : brt_2.ldl;
        fse_1.gFu().a((aef_2)this, lde);
    }

    public void clean() {
        this.ldj = brt_2.ldk;
        fse_1.gFu().a((aef_2)this, lde);
    }
}

