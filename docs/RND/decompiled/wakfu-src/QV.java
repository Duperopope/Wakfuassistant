/*
 * Decompiled with CFR 0.152.
 */
public final class QV
extends Enum<QV> {
    public static final /* enum */ QV biS = new QV();
    public static final /* enum */ QV biT = new QV();
    private static final /* synthetic */ QV[] biU;

    public static QV[] values() {
        return (QV[])biU.clone();
    }

    public static QV valueOf(String string) {
        return Enum.valueOf(QV.class, string);
    }

    private static /* synthetic */ QV[] bdk() {
        return new QV[]{biS, biT};
    }

    static {
        biU = QV.bdk();
    }
}

