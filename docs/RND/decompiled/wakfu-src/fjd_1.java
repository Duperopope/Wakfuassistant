/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fJD
 */
public class fjd_1
extends fjs_2 {
    public static final String TAG = "isNotNull";

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public boolean isValid(Object object) {
        if (this.uEh) {
            object = this.uEg;
        }
        return object != null;
    }

    public fjs_2 gCI() {
        fjd_1 fjd_12 = new fjd_1();
        this.a(fjd_12);
        return fjd_12;
    }
}

