/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fJG
 */
public class fjg_2
extends fjz_1 {
    public static final String TAG = "Or";

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
            if (!fjs_22.isValid(object)) continue;
            return true;
        }
        return false;
    }

    public fjs_2 gCI() {
        fjg_2 fjg_22 = new fjg_2();
        this.a((fhi_2)fjg_22);
        return fjg_22;
    }
}

