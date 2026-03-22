/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

/*
 * Renamed from Fl
 */
public final class fl_0
extends Enum<fl_0> {
    public static final /* enum */ fl_0 aAM = new fl_0(1);
    public static final /* enum */ fl_0 aAN = new fl_0(2);
    public static final /* enum */ fl_0 aAO = new fl_0(3);
    public static final /* enum */ fl_0 aAP = new fl_0(4);
    private final int aAQ;
    private static final /* synthetic */ fl_0[] aAR;

    public static fl_0[] values() {
        return (fl_0[])aAR.clone();
    }

    public static fl_0 valueOf(String string) {
        return Enum.valueOf(fl_0.class, string);
    }

    private fl_0(int n2) {
        this.aAQ = n2;
    }

    public int d() {
        return this.aAQ;
    }

    public static Optional<fl_0> mL(int n) {
        fl_0[] fl_0Array;
        for (fl_0 fl_02 : fl_0Array = fl_0.values()) {
            if (fl_02.aAQ != n) continue;
            return Optional.of(fl_02);
        }
        return Optional.empty();
    }

    private static /* synthetic */ fl_0[] aKI() {
        return new fl_0[]{aAM, aAN, aAO, aAP};
    }

    static {
        aAR = fl_0.aKI();
    }
}

