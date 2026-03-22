/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fJn
 */
public class fjn_2
extends fjz_1 {
    public static final String TAG = "And";

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public boolean isValid(Object object) {
        if (this.uEh) {
            object = this.uEg;
        }
        for (fjs_2 fjs_22 : this.uEK) {
            if (fjs_22.isValid(object)) continue;
            return false;
        }
        return true;
    }

    public fjs_2 gCI() {
        fjn_2 fjn_22 = new fjn_2();
        this.a((fhi_2)fjn_22);
        return fjn_22;
    }

    public Object getEncapsulatedObject() {
        return null;
    }
}

