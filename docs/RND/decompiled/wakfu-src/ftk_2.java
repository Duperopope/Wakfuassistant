/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fTk
 */
public class ftk_2
extends ftj_2<fes_2> {
    private static final String vfG = "x";
    private static final String vfH = "y";
    private static final String vfI = "width";
    private static final String vfJ = "height";
    private boolean vfK = false;
    private boolean vfL = false;
    private boolean mST = false;
    private boolean vfM = false;

    public ftk_2(fes_2 fes_22) {
        super(fes_22);
    }

    @Override
    protected void aY(String string, String string2) {
        int n;
        int n2;
        String string3;
        String string4;
        alv_2 alv_22 = fyw_0.gqw().gqE();
        if (alv_22 == null) {
            return;
        }
        aeb_1 aeb_12 = alv_22.bCh();
        if (aeb_12 == null) {
            return;
        }
        if (this.vfK) {
            string4 = ftu_2.h(string, string2, vfG);
            string3 = ftu_2.h(string, string2, vfH);
            n2 = ((fes_2)this.vfF).getX();
            n = ((fes_2)this.vfF).getY();
            if (aeb_12.hD(string4)) {
                n2 = aeb_12.hF(string4);
            }
            if (aeb_12.hD(string3)) {
                n = aeb_12.hF(string3);
            }
            ((fes_2)this.vfF).setPosition(n2, n);
        }
        if (this.vfL) {
            string4 = ftu_2.h(string, string2, vfI);
            string3 = ftu_2.h(string, string2, vfJ);
            n2 = ((fes_2)this.vfF).getWidth();
            n = ((fes_2)this.vfF).getHeight();
            if (aeb_12.hD(string4)) {
                n2 = aeb_12.hF(string4);
            }
            if (aeb_12.hD(string3)) {
                n = aeb_12.hF(string3);
            }
            ((fes_2)this.vfF).setSize(n2, n);
        }
    }

    @Override
    protected void aZ(String string, String string2) {
        aeb_1 aeb_12 = fyw_0.gqw().gqE().bCh();
        if (aeb_12 == null) {
            return;
        }
        if (((fes_2)this.vfF).getWidth() == 0 && ((fes_2)this.vfF).getHeight() == 0) {
            return;
        }
        if (this.vfK && this.mST) {
            this.a(string, string2, aeb_12);
        }
        if (this.vfL && this.vfM) {
            String string3 = ftu_2.h(string, string2, vfI);
            String string4 = ftu_2.h(string, string2, vfJ);
            aeb_12.k(string3, ((fes_2)this.vfF).getWidth());
            aeb_12.k(string4, ((fes_2)this.vfF).getHeight());
        }
    }

    protected void a(String string, String string2, aeb_1 aeb_12) {
        String string3 = ftu_2.h(string, string2, vfG);
        String string4 = ftu_2.h(string, string2, vfH);
        aeb_12.k(string3, ((fes_2)this.vfF).getX());
        aeb_12.k(string4, ((fes_2)this.vfF).getY());
    }

    public void ba(String string, String string2) {
        aeb_1 aeb_12 = fyw_0.gqw().gqE().bCh();
        if (aeb_12 == null) {
            return;
        }
        String string3 = ftu_2.h(string, string2, vfG);
        String string4 = ftu_2.h(string, string2, vfH);
        String string5 = ftu_2.h(string, string2, vfI);
        String string6 = ftu_2.h(string, string2, vfJ);
        aeb_12.es(string3);
        aeb_12.es(string4);
        aeb_12.es(string5);
        aeb_12.es(string6);
    }

    @Override
    public void gGE() {
        fst_1.gGA().b(this);
    }

    @Override
    public void gGF() {
        fst_1.gGA().a(this);
    }

    @Override
    public boolean gGH() {
        fhs_2 fhs_22 = ((fes_2)this.vfF).getElementMap();
        if (fhs_22 == null) {
            return false;
        }
        String string = fhs_22.getId();
        String string2 = ((fes_2)this.vfF).getId();
        if (string == null) {
            return false;
        }
        aeb_1 aeb_12 = fyw_0.gqw().gqE().bCh();
        if (aeb_12 == null) {
            return false;
        }
        String string3 = ftu_2.h(string, string2, vfG);
        String string4 = ftu_2.h(string, string2, vfH);
        return aeb_12.hD(string3) || aeb_12.hD(string4);
    }

    @Override
    public boolean gGI() {
        fhs_2 fhs_22 = ((fes_2)this.vfF).getElementMap();
        if (fhs_22 == null) {
            return false;
        }
        String string = fhs_22.getId();
        String string2 = ((fes_2)this.vfF).getId();
        if (string == null) {
            return false;
        }
        aeb_1 aeb_12 = fyw_0.gqw().gqE().bCh();
        if (aeb_12 == null) {
            return false;
        }
        String string3 = ftu_2.h(string, string2, vfI);
        String string4 = ftu_2.h(string, string2, vfJ);
        return aeb_12.hD(string3) || aeb_12.hD(string4);
    }

    public boolean gGJ() {
        return this.vfK;
    }

    public void pu(boolean bl) {
        this.vfK = bl;
    }

    public boolean gGK() {
        return this.vfL;
    }

    public void pv(boolean bl) {
        this.vfL = bl;
    }

    public void gGL() {
        this.mST = true;
    }

    public void gGM() {
        this.vfM = true;
    }
}

