/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from but
 */
public final class but_0
extends Enum<but_0> {
    public static final /* enum */ but_0 jpq = new but_0("normal");
    public static final /* enum */ but_0 jpr = new but_0("destroy");
    public static final /* enum */ but_0 jps = new but_0("rotate");
    private final String jpt;
    private static final /* synthetic */ but_0[] jpu;

    public static but_0[] values() {
        return (but_0[])jpu.clone();
    }

    public static but_0 valueOf(String string) {
        return Enum.valueOf(but_0.class, string);
    }

    private but_0(String string2) {
        this.jpt = string2;
    }

    public String dIX() {
        return this.jpt;
    }

    public static but_0 mr(String string) {
        for (but_0 but_02 : but_0.values()) {
            if (!but_02.dIX().equals(string)) continue;
            return but_02;
        }
        return null;
    }

    private static /* synthetic */ but_0[] dIY() {
        return new but_0[]{jpq, jpr, jps};
    }

    static {
        jpu = but_0.dIY();
    }
}

