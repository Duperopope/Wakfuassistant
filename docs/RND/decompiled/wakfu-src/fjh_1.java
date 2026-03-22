/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fJH
 */
public class fjh_1
extends fjs_2
implements fsn_2 {
    public static final String TAG = "propertyExists";
    private boolean uEL;
    private String p;
    private boolean uEM;
    public static final int uEN = 103145323;
    public static final int uEO = 3373707;

    @Override
    public String getTag() {
        return TAG;
    }

    public String getName() {
        return this.p;
    }

    public boolean getLocal() {
        return this.uEM;
    }

    public void setName(String string) {
        if (this.p != null && !this.p.equalsIgnoreCase(string) || string != null && !string.equalsIgnoreCase(this.p)) {
            this.p = string;
            this.setNeedsToPreProcess();
        }
    }

    public void setLocal(boolean bl) {
        if (this.uEM != bl) {
            this.uEM = bl;
            this.setNeedsToPreProcess();
        }
    }

    @Override
    public boolean isValid(Object object) {
        if (this.uEh) {
            object = this.uEg;
        }
        return this.uEL;
    }

    @Override
    public boolean LZ(int n) {
        boolean bl = super.LZ(n);
        boolean bl2 = this.uEL;
        fsf_1 fsf_12 = fse_1.gFu().j(this.p, this.uEM ? this.getElementMap() : null);
        boolean bl3 = this.uEL = fsf_12 != null && fsf_12.gFy();
        if (bl2 != this.uEL) {
            this.gCJ();
        }
        return bl;
    }

    @Override
    public void a(fhi_2 fhi_22) {
        super.a(fhi_22);
        fjh_1 fjh_12 = (fjh_1)fhi_22;
        fjh_12.p = this.p;
        fjh_12.uEM = this.uEM;
    }

    @Override
    public void a(fsl_2 fsl_22) {
        fsf_1 fsf_12 = fsl_22.getProperty();
        if (fsf_12 != null && fsf_12.getName().equalsIgnoreCase(this.p) && (!this.uEM || fsf_12.getElementMap() == this.nQt)) {
            switch (fsl_22.gFS()) {
                case vdL: {
                    this.uEL = true;
                    this.gCJ();
                    break;
                }
                case vdK: {
                    this.uEL = false;
                    this.gCJ();
                    break;
                }
            }
        }
    }

    @Override
    public void aVI() {
        super.aVI();
        this.uEL = false;
        this.uEM = false;
        fse_1.gFu().a(this);
    }

    @Override
    public void aVH() {
        super.aVH();
        fse_1.gFu().b(this);
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        if (n == 103145323) {
            this.setLocal(Bw.aK(string));
        } else if (n == 3373707) {
            this.setName(fic_12.a(string, this.nQt));
        } else {
            return super.setXMLAttribute(n, string, fic_12);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == 103145323) {
            this.setLocal(Bw.l(object));
        } else if (n == 3373707) {
            this.setName(String.valueOf(object));
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }
}

