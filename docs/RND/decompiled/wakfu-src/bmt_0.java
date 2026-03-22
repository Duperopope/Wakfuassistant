/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
import com.google.common.base.Predicate;

/*
 * Renamed from bMt
 */
public class bmt_0
extends fqD
implements aeh_2 {
    public static final String kxa = "name";
    public static final String kxb = "description";
    public static final String kxc = "smallIconUrl";
    public static final String kxd = "bigIconUrl";
    public static final String kxe = "id";
    public static final String kxf = "unlockLevel";
    public static final String[] kxg = new String[]{"name", "description", "smallIconUrl", "bigIconUrl", "id"};
    private final int kxh;
    private final boolean kxi;
    private final boolean kxj;
    private final int kxk;
    private final boolean kxl;
    private boolean bWn;

    public bmt_0(fqR fqR2) {
        super(fqR2);
        this.kxh = fqR2.cbt();
        this.kxi = fqR2.gjq();
        this.kxj = fqR2.cvH();
        this.kxk = fqR2.aVt();
        this.kxl = fqR2.eeF();
    }

    public static Predicate<bmt_0> h(eNd eNd2) {
        return new bmu_0(eNd2);
    }

    public int cbt() {
        return this.kxh;
    }

    public String getName() {
        return aum_0.cWf().a(3, (long)this.d(), new Object[0]);
    }

    public String eeD() {
        if (aum_0.cWf().e(4, this.d())) {
            return aum_0.cWf().a(4, (long)this.d(), new Object[0]);
        }
        return null;
    }

    public boolean cvG() {
        return this.kxi;
    }

    public boolean eeE() {
        return this.kxj;
    }

    public boolean eeF() {
        return this.kxl;
    }

    public int aVt() {
        return this.kxk;
    }

    @Override
    public String[] bxk() {
        return kxg;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(kxa)) {
            return this.getName();
        }
        if (string.equals(kxb)) {
            return this.eeD();
        }
        if (string.equals(kxc)) {
            return auc_0.cVq().zA(this.kxk);
        }
        if (string.equals(kxd)) {
            return auc_0.cVq().zB(this.kxk);
        }
        if (string.equals(kxe)) {
            return this.d();
        }
        if (string.equals(kxf)) {
            return this.cvo();
        }
        return null;
    }

    public boolean equals(Object object) {
        return super.equals(object) || object instanceof bmx_0 && this.equals(((bmx_0)object).giP());
    }
}

