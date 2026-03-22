/*
 * Decompiled with CFR 0.152.
 */
public abstract class Vx {
    public boolean a(String string, long l) {
        if (string == null) {
            return false;
        }
        String string2 = string.trim();
        if (string2.length() == 0) {
            return false;
        }
        for (VI vI : VI.values()) {
            if (!vI.dz(string2)) continue;
            return this.i(vI.ordinal(), l);
        }
        return false;
    }

    protected abstract boolean i(int var1, long var2);
}

