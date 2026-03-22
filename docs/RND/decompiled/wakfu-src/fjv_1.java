/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fJv
 */
public class fjv_1
extends fjs_2 {
    public static final String TAG = "isEqual";

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public boolean isValid(Object object) {
        if (this.uEh) {
            object = this.uEg;
        }
        if (object == null && (this.aGT == null || this.aGT.equals("null"))) {
            return true;
        }
        if (object instanceof String) {
            String string = (String)object;
            return string.equalsIgnoreCase((String)this.aGT);
        }
        if (object instanceof Integer) {
            return Bw.m(object) == Bw.m(this.aGT);
        }
        if (object instanceof Float) {
            return Bw.o(object) == Bw.o(this.aGT);
        }
        if (object instanceof Double) {
            return Bw.n(object) == Bw.n(this.aGT);
        }
        if (object instanceof Short) {
            return Bw.r(object) == Bw.r(this.aGT);
        }
        if (object instanceof Long) {
            return Bw.p(object) == Bw.p(this.aGT);
        }
        if (object instanceof Byte) {
            return Bw.q(object) == Bw.q(this.aGT);
        }
        return object == this.aGT;
    }
}

