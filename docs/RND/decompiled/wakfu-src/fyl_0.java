/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fyL
 */
public class fyl_0
extends fys_0 {
    public static final String TAG = "appearanceContainer";
    private fys_0 tDm;
    private String ewM;
    public static final int tDn = -1618432855;

    public String getIdentifier() {
        return this.ewM;
    }

    public void setIdentifier(String string) {
        this.ewM = string;
    }

    public fys_0 getInnerAppearance() {
        return this.tDm;
    }

    @Override
    public void setWidget(fes_2 fes_22) {
        tDG.warn((Object)String.format("%s(%s) has been set as a Widget, that's not its purpose. What happened ?", this, this.getClass()));
        super.setWidget(fes_22);
    }

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public void d(fhv_1 fhv_12) {
        if (fhv_12 instanceof fys_0) {
            this.tDm = (fys_0)fhv_12;
        }
        super.d(fhv_12);
    }

    @Override
    public void aVH() {
        super.aVH();
        this.ewM = null;
        if (this.tDm != null) {
            this.tDm.gAD();
            this.tDm = null;
        }
    }

    @Override
    public void aVI() {
        super.aVI();
    }

    @Override
    public void a(fhi_2 fhi_22) {
        super.a(fhi_22);
        fyl_0 fyl_02 = (fyl_0)fhi_22;
        fyl_02.ewM = this.ewM;
        fyl_02.tDm = this.tDm != null ? (fys_0)this.tDm.gAK() : null;
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        switch (n) {
            case -1618432855: {
                this.setIdentifier(string);
                return true;
            }
        }
        return super.setXMLAttribute(n, string, fic_12);
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        switch (n) {
            case -1618432855: {
                this.setIdentifier(String.valueOf(object));
                return true;
            }
        }
        return super.setPropertyAttribute(n, object);
    }
}

