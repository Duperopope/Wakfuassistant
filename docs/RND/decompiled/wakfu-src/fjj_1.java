/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fJJ
 */
public class fjj_1
extends fjm_2 {
    public static final String TAG = "StringCondition";

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public boolean isValid(Object object) {
        if (this.uEh) {
            object = this.uEg;
        }
        if (!(object instanceof String) || this.cpF == null) {
            return false;
        }
        String string = (String)object;
        if (this.cpF.equalsIgnoreCase("length")) {
            return this.uEb != null && this.uEb.isValid(string.length());
        }
        if (this.cpF.equalsIgnoreCase("startsWith")) {
            if (!(this.aGT instanceof String)) {
                return false;
            }
            boolean bl = string.startsWith((String)this.aGT);
            return this.uEb == null ? bl : this.uEb.isValid(bl);
        }
        if (this.cpF.equalsIgnoreCase("endsWith")) {
            if (!(this.aGT instanceof String)) {
                return false;
            }
            boolean bl = string.endsWith((String)this.aGT);
            return this.uEb == null ? bl : this.uEb.isValid(bl);
        }
        return false;
    }

    public fjs_2 gCI() {
        fjj_1 fjj_12 = new fjj_1();
        this.a((fhi_2)fjj_12);
        return fjj_12;
    }
}

