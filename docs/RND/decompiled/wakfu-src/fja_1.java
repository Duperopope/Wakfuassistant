/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fJA
 */
public class fja_1
extends fjm_2 {
    public static final String TAG = "Not";

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public boolean isValid(Object object) {
        if (this.uEh) {
            object = this.uEg;
        }
        if (this.uEb != null) {
            return !this.uEb.isValid(object);
        }
        return false;
    }

    public fjs_2 gCI() {
        fja_1 fja_12 = new fja_1();
        this.a((fhi_2)fja_12);
        return fja_12;
    }
}

