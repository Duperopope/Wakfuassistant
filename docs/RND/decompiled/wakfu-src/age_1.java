/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aGE
 */
public abstract class age_1 {
    private static age_1 dLI;

    protected age_1() {
    }

    public static age_1 cbv() {
        return dLI;
    }

    public static void a(age_1 age_12) {
        dLI = age_12;
    }

    public abstract boolean f(long var1, long var3);

    public abstract void a(int var1, long var2, long var4, long var6);

    public abstract void h(int var1, boolean var2);

    public abstract boolean n(int var1, int var2, int var3, int var4);
}

