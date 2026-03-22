/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Arrays;

public abstract class bDz
extends bDy
implements bdz_0 {
    public static final boolean jKx = false;
    public static final String jKy = "collapsible";
    public static final String jKz = "collapsed";
    public static final String jKA = "collapsingIgnoreSize";
    public static final String[] jKB;
    protected boolean jKC = false;
    protected boolean jKD = false;
    protected boolean hFE = false;
    protected final afg jKE = new bda_0(this);
    protected final aea_1 jKF = aez_12 -> {
        boolean bl = aez_12.bZP();
        if (bl == this.hFE) {
            return;
        }
        this.l(bl, false);
    };

    protected abstract afh dQT();

    protected abstract String getKey();

    protected bgt_0 dQU() {
        throw new UnsupportedOperationException("Please implement this method if you need to retrieve the associated character");
    }

    public bDz() {
        this.dQV();
    }

    protected void dQV() {
        if (this.jKD) {
            return;
        }
        bsg_1 bsg_12 = (bsg_1)aie_0.cfn().bmH();
        if (bsg_12 != null) {
            bsg_12.a(this.jKE);
            this.jKD = true;
        }
    }

    protected void dQW() {
        if (!this.jKD) {
            return;
        }
        bsg_1 bsg_12 = (bsg_1)aie_0.cfn().bmH();
        if (bsg_12 != null) {
            bsg_12.b(this.jKE);
            this.jKD = false;
        }
    }

    protected void dQX() {
        aeb_1 aeb_12 = this.bCh();
        if (aeb_12 == null) {
            return;
        }
        this.d(aeb_12);
    }

    protected void d(aeb_1 aeb_12) {
        if (this.jKC) {
            return;
        }
        aeb_12.a(this.getKey(), this.jKF);
        this.jKC = true;
    }

    protected void dQY() {
        aeb_1 aeb_12 = this.bCh();
        if (aeb_12 == null) {
            return;
        }
        this.e(aeb_12);
    }

    protected void e(aeb_1 aeb_12) {
        if (!this.jKC) {
            return;
        }
        aeb_12.b(this.getKey(), this.jKF);
        this.jKC = false;
    }

    protected aeb_1 bCh() {
        afh afh2 = this.dQT();
        if (afh2 == null) {
            return null;
        }
        bsg_1 bsg_12 = (bsg_1)aie_0.cfn().bmH();
        if (afh2 == afh.cpW) {
            bgt_0 bgt_02 = this.dQU();
            if (bgt_02 == null) {
                return null;
            }
            return bsg_12.fO(bgt_02.Sn());
        }
        return bsg_12.b(afh2);
    }

    protected void f(aeb_1 aeb_12) {
        this.a(aeb_12, this.getKey());
    }

    protected void a(aeb_1 aeb_12, String string) {
        boolean bl = aeb_12.aK(string);
        if (bl == this.hFE) {
            return;
        }
        this.l(bl, false);
    }

    protected void dQZ() {
        aeb_1 aeb_12 = this.bCh();
        if (aeb_12 == null) {
            return;
        }
        this.f(aeb_12);
    }

    protected void dRa() {
        if (this.jKC) {
            return;
        }
        aeb_1 aeb_12 = this.bCh();
        if (aeb_12 == null) {
            return;
        }
        this.d(aeb_12);
        this.f(aeb_12);
    }

    @Override
    public String[] bxk() {
        return jKB;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(jKz)) {
            return this.dbK();
        }
        return null;
    }

    protected void hx(boolean bl) {
        aeb_1 aeb_12 = this.bCh();
        if (aeb_12 == null) {
            return;
        }
        aeb_12.d(this.getKey(), bl);
    }

    public void dRb() {
        aeb_1 aeb_12 = this.bCh();
        if (aeb_12 == null) {
            return;
        }
        aeb_12.es(this.getKey());
    }

    @Override
    public boolean dbK() {
        return this.hFE;
    }

    public void l(boolean bl, boolean bl2) {
        this.hFE = bl;
        fse_1.gFu().a((aef_2)this, jKz);
        if (bl2) {
            this.hx(bl);
        }
    }

    @Override
    public void fm(boolean bl) {
        this.l(bl, true);
    }

    static {
        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(bDy.jKw));
        arrayList.add(jKy);
        arrayList.add(jKz);
        arrayList.add(jKA);
        jKB = arrayList.toArray(new String[0]);
    }
}

