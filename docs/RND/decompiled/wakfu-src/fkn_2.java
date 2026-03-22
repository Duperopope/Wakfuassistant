/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fKn
 */
public abstract class fkn_2
extends fha_2
implements fkt_2 {
    protected fes_2 tCV;
    protected fys_0 uki;
    protected boolean cHn = false;
    protected boolean uGf = true;
    public static final int uGg = -1609594047;
    public static final int uGh = 1282258139;

    @Override
    public boolean isEnabled() {
        return this.cHn;
    }

    @Override
    public void setEnabled(boolean bl) {
        this.cHn = bl;
        if (this.uki != null) {
            this.uki.setNeedsToResetMeshes();
        }
    }

    @Override
    public void setWidget(fes_2 fes_22) {
        this.tCV = fes_22;
    }

    @Override
    public fes_2 getWidget() {
        return this.tCV;
    }

    @Override
    public void setDecoratorAppearance(fys_0 fys_02) {
        this.uki = fys_02;
    }

    @Override
    public fys_0 getDecoratorAppearance() {
        return this.uki;
    }

    @Override
    public boolean isRemovable() {
        return this.uGf;
    }

    @Override
    public void setRemovable(boolean bl) {
        this.uGf = bl;
    }

    @Override
    public void gDe() {
    }

    @Override
    public void aVH() {
        super.aVH();
        this.tCV = null;
        this.uki = null;
    }

    @Override
    public void aVI() {
        super.aVI();
        this.cHn = false;
        this.uGf = true;
    }

    @Override
    public void a(fhi_2 fhi_22) {
        fkn_2 fkn_22 = (fkn_2)fhi_22;
        super.a(fkn_22);
        fkn_22.cHn = this.cHn;
        fkn_22.uGf = this.uGf;
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        if (n == -1609594047) {
            this.setEnabled(Bw.aK(string));
        } else if (n == 1282258139) {
            this.setRemovable(Bw.aK(string));
        } else {
            return super.setXMLAttribute(n, string, fic_12);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == -1609594047) {
            this.setEnabled(Bw.l(object));
        } else if (n == 1282258139) {
            this.setRemovable(Bw.l(object));
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }
}

