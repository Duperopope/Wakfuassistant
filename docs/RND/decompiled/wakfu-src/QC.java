/*
 * Decompiled with CFR 0.152.
 */
public final class QC
extends Enum<QC>
implements aoq_1 {
    public static final /* enum */ QC bgq = new QC(0, "L'effet n'est pas d\u00e9clench\u00e9");
    public static final /* enum */ QC bgr = new QC(1, "La cible sera la cible que l'on a d\u00e9j\u00e0 calcul\u00e9e");
    public static final /* enum */ QC bgs = new QC(2, "La cible sera le porteur cet effet");
    public static final /* enum */ QC bgt = new QC(3, "La cible sera le lanceur cet effet");
    public static final /* enum */ QC bgu = new QC(4, "La cible sera le lanceur de l'effet declencheur");
    public static final /* enum */ QC bgv = new QC(5, "La cible sera la cible de l'effet declencheur");
    private final byte bgw;
    private final String bgx;
    private static final /* synthetic */ QC[] bgy;

    public static QC[] values() {
        return (QC[])bgy.clone();
    }

    public static QC valueOf(String string) {
        return Enum.valueOf(QC.class, string);
    }

    private QC(byte by, String string2) {
        this.bgw = by;
        this.bgx = string2;
    }

    @Override
    public String aXA() {
        return Byte.toString(this.bgw);
    }

    @Override
    public String aXB() {
        return this.name();
    }

    @Override
    public String aXC() {
        return this.bgx;
    }

    public byte aJr() {
        return this.bgw;
    }

    public static QC L(byte by) {
        QC[] qCArray = QC.values();
        for (int i = 0; i < qCArray.length; ++i) {
            QC qC = qCArray[i];
            if (qC.bgw != by) continue;
            return qC;
        }
        return null;
    }

    private static /* synthetic */ QC[] baW() {
        return new QC[]{bgq, bgr, bgs, bgt, bgu, bgv};
    }

    static {
        bgy = QC.baW();
    }
}

