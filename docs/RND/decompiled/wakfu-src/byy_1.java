/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

/*
 * Renamed from bYy
 */
final class byy_1
extends Record {
    final short lzJ;
    private final int lzK;
    final boolean lzL;

    byy_1(short s, int n, boolean bl) {
        this.lzJ = s;
        this.lzK = n;
        this.lzL = bl;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{byy_1.class, "currentLevel;levelDiff;wasNewPlayer", "lzJ", "lzK", "lzL"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{byy_1.class, "currentLevel;levelDiff;wasNewPlayer", "lzJ", "lzK", "lzL"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{byy_1.class, "currentLevel;levelDiff;wasNewPlayer", "lzJ", "lzK", "lzL"}, this, object);
    }

    public short epc() {
        return this.lzJ;
    }

    public int epd() {
        return this.lzK;
    }

    public boolean epe() {
        return this.lzL;
    }
}

