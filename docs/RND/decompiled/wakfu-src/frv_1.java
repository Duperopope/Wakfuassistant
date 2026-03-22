/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fRV
 */
public class frv_1
extends fha_2 {
    public static final String TAG = "data";
    private Object aGT;
    public static final int vbN = 111972721;

    @Override
    public String getTag() {
        return TAG;
    }

    public Object getValue() {
        return this.aGT;
    }

    public void setValue(Object object) {
        this.aGT = object;
    }

    @Override
    public Object getElementValue() {
        return this.aGT;
    }

    @Override
    public void a(fhi_2 fhi_22) {
        frv_1 frv_12 = (frv_1)fhi_22;
        super.a(fhi_22);
        frv_12.aGT = this.aGT;
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        if (n != 111972721) {
            return super.setXMLAttribute(n, string, fic_12);
        }
        this.setValue(fic_12.a(string, this.nQt));
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n != 111972721) {
            return super.setPropertyAttribute(n, object);
        }
        this.setValue(object);
        return true;
    }
}

