/*
 * Decompiled with CFR 0.152.
 */
public final class aPz
extends Enum<aPz> {
    public static final /* enum */ aPz ezn = new aPz(1);
    public static final /* enum */ aPz ezo = new aPz(2);
    public static final /* enum */ aPz ezp = new aPz(4);
    public static final /* enum */ aPz ezq = new aPz(8);
    private final short ezr;
    private static final /* synthetic */ aPz[] ezs;

    public static aPz[] values() {
        return (aPz[])ezs.clone();
    }

    public static aPz valueOf(String string) {
        return Enum.valueOf(aPz.class, string);
    }

    private aPz(short s) {
        this.ezr = s;
    }

    public String getName() {
        switch (this.ordinal()) {
            case 0: {
                return aum_0.cWf().c("chat.friendList", new Object[0]);
            }
            case 1: {
                return aum_0.cWf().c("chat.ignoreList", new Object[0]);
            }
        }
        return this.name();
    }

    public short aIi() {
        return this.ezr;
    }

    public static aPz aP(short s) {
        for (aPz aPz2 : aPz.values()) {
            if (aPz2.aIi() != s) continue;
            return aPz2;
        }
        return null;
    }

    private static /* synthetic */ aPz[] cAH() {
        return new aPz[]{ezn, ezo, ezp, ezq};
    }

    static {
        ezs = aPz.cAH();
    }
}

