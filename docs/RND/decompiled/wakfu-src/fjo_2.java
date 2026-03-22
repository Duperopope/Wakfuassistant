/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fJo
 */
public class fjo_2
extends fjm_2 {
    public static final String TAG = "BitwiseOperation";
    public static final String uDY = "and";
    public static final String uDZ = "or";
    public static final String uEa = "not";

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public boolean isValid(Object object) {
        if (this.uEh) {
            object = this.uEg;
        }
        Number number = null;
        if (this.cpF != null) {
            if (this.cpF.equalsIgnoreCase(uDY)) {
                if (object instanceof Integer) {
                    number = Bw.m(object) & Bw.m(this.aGT);
                } else if (object instanceof Short) {
                    number = Bw.r(object) & Bw.r(this.aGT);
                } else if (object instanceof Long) {
                    number = Bw.p(object) & Bw.p(this.aGT);
                }
            }
            if (this.cpF.equalsIgnoreCase(uDZ)) {
                if (object instanceof Integer) {
                    number = Bw.m(object) | Bw.m(this.aGT);
                } else if (object instanceof Short) {
                    number = Bw.r(object) | Bw.r(this.aGT);
                } else if (object instanceof Long) {
                    number = Bw.p(object) | Bw.p(this.aGT);
                }
            }
        }
        return this.uEb.isValid(number);
    }
}

