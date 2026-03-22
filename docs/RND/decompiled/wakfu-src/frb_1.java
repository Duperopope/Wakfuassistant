/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fRB
 */
public class frb_1
extends frr_1 {
    public static final String TAG = "rld";
    private faa_2 tCX = faa_2.tLO;
    public static final int vae = 92903173;
    public static final int vaf = "vgap".hashCode();
    public static final int vag = "horizontal".hashCode();

    @Override
    public String getTag() {
        return TAG;
    }

    public faa_2 getAlign() {
        return this.tCX;
    }

    public void setAlign(faa_2 faa_22) {
        this.tCX = faa_22;
    }

    @Override
    public void a(fhi_2 fhi_22) {
        super.a(fhi_22);
        ((frb_1)fhi_22).setAlign(this.tCX);
    }

    @Override
    public void aVH() {
        super.aVH();
        this.tCX = null;
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        if (n != 92903173) {
            return super.setXMLAttribute(n, string, fic_12);
        }
        this.setAlign(faa_2.tI(string));
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        return super.setPropertyAttribute(n, object);
    }
}

