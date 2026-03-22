/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Ho
 */
public abstract class ho_2 {
    private static ho_2 aIB = null;

    protected static <T extends ho_2> void a(T t) {
        aIB = t;
    }

    public static ho_2 aOV() {
        return aIB;
    }

    public abstract void a(Long var1, long var2, long var4);
}

