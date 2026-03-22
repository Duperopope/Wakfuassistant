/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bMN
 */
public class bmn_0
implements aeh_2 {
    public static final String kzi = "hasSomeBonuses";
    public static final String kzj = "applicationBonuses";
    public static final String kzk = "resistanceBonuses";
    private final aah_1<bmo_0> kzl = new aah_1();
    private final aah_1<bmo_0> kzm = new aah_1();

    @Override
    public String[] bxk() {
        return null;
    }

    public void reset() {
        this.kzl.clear();
        this.kzm.clear();
        fse_1.gFu().a((aef_2)this, kzi, kzj, kzk);
    }

    @Override
    public Object eu(String string) {
        if (string.equals(kzi)) {
            return this.kzl.bTR() > 0 || this.kzm.bTR() > 0;
        }
        if (string.equals(kzj)) {
            return this.kzl;
        }
        if (string.equals(kzk)) {
            return this.kzm;
        }
        return null;
    }

    public void b(short s, int n) {
        bmo_0 bmo_02 = this.kzl.vK(s);
        if (bmo_02 == null) {
            if (n != 0) {
                this.kzl.b(s, new bmo_0(s, n));
                fse_1.gFu().a((aef_2)this, kzi, kzj);
            }
        } else if (n == 0) {
            this.kzl.wp(s);
            fse_1.gFu().a((aef_2)this, kzi, kzj);
        } else {
            bmo_02.setValue(n);
        }
    }

    public void c(short s, int n) {
        bmo_0 bmo_02 = this.kzm.vK(s);
        if (bmo_02 == null) {
            if (n != 0) {
                this.kzm.b(s, new bmo_0(s, n));
                fse_1.gFu().a((aef_2)this, kzi, kzk);
            }
        } else if (n == 0) {
            this.kzm.wp(s);
            fse_1.gFu().a((aef_2)this, kzi, kzk);
        } else {
            bmo_02.setValue(n);
        }
    }
}

