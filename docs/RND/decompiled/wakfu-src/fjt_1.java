/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fJT
 */
public abstract class fjt_1
extends fjs_2 {
    public abstract boolean isValidInt(int var1, int var2);

    public abstract boolean isValidFloat(float var1, float var2);

    public abstract boolean isValidDouble(double var1, double var3);

    public abstract boolean isValidShort(short var1, short var2);

    public abstract boolean isValidLong(long var1, long var3);

    public abstract boolean isValidByte(byte var1, byte var2);

    @Override
    public boolean isValid(Object object) {
        Object object2;
        Object object3 = object2 = this.uEh ? this.uEg : object;
        if (object2 instanceof Integer) {
            return this.isValidInt(Bw.m(object2), Bw.m(this.aGT));
        }
        if (object2 instanceof Float) {
            return this.isValidFloat(Bw.o(object2), Bw.o(this.aGT));
        }
        if (object2 instanceof Double) {
            return this.isValidDouble(Bw.n(object2), Bw.n(this.aGT));
        }
        if (object2 instanceof Short) {
            return this.isValidShort(Bw.r(object2), Bw.r(this.aGT));
        }
        if (object2 instanceof Long) {
            return this.isValidLong(Bw.p(object2), Bw.p(this.aGT));
        }
        if (object2 instanceof Byte) {
            return this.isValidByte(Bw.q(object2), Bw.q(this.aGT));
        }
        if (object2 instanceof String) {
            return this.isValidDouble(Bw.n(object2), Bw.n(this.aGT));
        }
        return false;
    }
}

