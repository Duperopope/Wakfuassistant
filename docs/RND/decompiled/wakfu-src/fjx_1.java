/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fJx
 */
public class fjx_1
extends fjm_2 {
    public static final String TAG = "ItemCondition";
    public static final int uEA = 97427706;

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public boolean isValid(Object object) {
        if (this.uEh) {
            object = this.uEg;
        }
        if (!(object instanceof fcv_1) && !(object instanceof aef_2)) {
            return false;
        }
        if (object instanceof aef_2) {
            if (this.cpF != null) {
                return this.uEb.isValid(((aef_2)object).eu(this.cpF));
            }
            return this.uEb.isValid(object);
        }
        fcv_1 fcv_12 = (fcv_1)object;
        fsc_1 fsc_12 = fcv_12.getItem();
        if (fsc_12 != null && fsc_12.getValue() instanceof aef_2 && this.cpF != null) {
            return this.uEb.isValid(fsc_12.eu(this.cpF));
        }
        Object object2 = fsc_12 == null ? null : fsc_12.getValue();
        return this.uEb.isValid(object2);
    }

    public void setField(String string) {
        this.setKey(string);
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        if (n != 97427706) {
            return super.setXMLAttribute(n, string, fic_12);
        }
        this.setField(fic_12.a(string, this.nQt));
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n != 97427706) {
            return super.setPropertyAttribute(n, object);
        }
        this.setField(String.valueOf(object));
        return true;
    }
}

