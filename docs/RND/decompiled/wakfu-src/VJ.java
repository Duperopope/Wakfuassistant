/*
 * Decompiled with CFR 0.152.
 */
public class VJ {
    public static int bt(float f2) {
        double d2 = Math.floor(f2);
        double d3 = (double)f2 - d2;
        if (GD.aNP().l(d3)) {
            d2 += 1.0;
        }
        return (int)d2;
    }

    public static Bu<Integer, Integer> bu(float f2) {
        return new Bu<Integer, Integer>(GC.B(f2), GC.C(f2));
    }
}

