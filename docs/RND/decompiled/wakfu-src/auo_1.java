/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;

/*
 * Renamed from auo
 */
public abstract class auo_1<T> {
    protected abstract byte aJr();

    public abstract T c(DataInput var1, float var2);

    protected abstract boolean equals(T var1, T var2);

    public static int t(DataInput dataInput, float f2) {
        short s = dataInput.readShort();
        short s2 = dataInput.readShort();
        return Math.round(GC.a((float)s, (float)s2, f2)) & 0xFFFF;
    }

    public static float u(DataInput dataInput, float f2) {
        float f3 = dataInput.readFloat();
        float f4 = dataInput.readFloat();
        return GC.a(f3, f4, f2);
    }

    public static int v(DataInput dataInput, float f2) {
        int n = dataInput.readInt();
        int n2 = dataInput.readInt();
        return (int)GC.a((float)n, (float)n2, f2);
    }
}

