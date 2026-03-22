/*
 * Decompiled with CFR 0.152.
 */
public class fza
extends fys_0
implements fyo_0 {
    public static final String TAG = "ListAppearance";
    public static final String tEq = "selection";
    private axb_2 tEr;

    @Override
    public void d(fhv_1 fhv_12) {
        super.d(fhv_12);
        if (fhv_12 instanceof fyp_0) {
            this.setColor(((fyp_0)fhv_12).getColor(), null);
        }
    }

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public void setColor(axb_2 axb_22, String string) {
        if (string == null || string.equalsIgnoreCase(tEq)) {
            this.tEr = axb_22;
            if (this.tCV instanceof fbz_2) {
                ((fbz_2)this.tCV).setMouseOverColor(this.tEr);
                ((fbz_2)this.tCV).setSelectedColor(this.tEr);
            }
        } else {
            super.setColor(axb_22, string);
        }
    }

    @Override
    public void aVH() {
        super.aVH();
        this.tEr = null;
    }
}

