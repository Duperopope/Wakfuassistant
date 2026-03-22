/*
 * Decompiled with CFR 0.152.
 */
import java.util.stream.Stream;

/*
 * Renamed from eIa
 */
public final class eia_0
extends Enum<eia_0> {
    public static final /* enum */ eia_0 qug = new eia_0(0);
    public static final /* enum */ eia_0 quh = new eia_0(1);
    public static final /* enum */ eia_0 qui = new eia_0(2);
    public static final /* enum */ eia_0 quj = new eia_0(3);
    public static final /* enum */ eia_0 quk = new eia_0(4);
    public static final /* enum */ eia_0 qul = new eia_0(5);
    public static final /* enum */ eia_0 qum = new eia_0(6);
    public static final /* enum */ eia_0 qun = new eia_0(7);
    private final int quo;
    private static final /* synthetic */ eia_0[] qup;

    public static eia_0[] values() {
        return (eia_0[])qup.clone();
    }

    public static eia_0 valueOf(String string) {
        return Enum.valueOf(eia_0.class, string);
    }

    private eia_0(int n2) {
        this.quo = n2;
    }

    public int d() {
        return this.quo;
    }

    public static eia_0 PL(int n) {
        return Stream.of(eia_0.values()).filter(eia_02 -> eia_02.quo == n).findAny().orElse(qug);
    }

    private static /* synthetic */ eia_0[] fwh() {
        return new eia_0[]{qug, quh, qui, quj, quk, qul, qum, qun};
    }

    static {
        qup = eia_0.fwh();
    }
}

