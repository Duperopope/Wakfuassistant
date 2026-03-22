/*
 * Decompiled with CFR 0.152.
 */
public final class QF
extends Enum<QF> {
    public static final /* enum */ QF bhB = new QF();
    public static final /* enum */ QF bhC = new QF();
    public static final /* enum */ QF bhD = new QF();
    private static final /* synthetic */ QF[] bhE;

    public static QF[] values() {
        return (QF[])bhE.clone();
    }

    public static QF valueOf(String string) {
        return Enum.valueOf(QF.class, string);
    }

    private static /* synthetic */ QF[] bcl() {
        return new QF[]{bhB, bhC, bhD};
    }

    static {
        bhE = QF.bcl();
    }
}

