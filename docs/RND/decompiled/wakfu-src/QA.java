/*
 * Decompiled with CFR 0.152.
 */
public final class QA
extends Enum<QA>
implements aoq_1 {
    public static final /* enum */ QA bga = new QA(0, "L'effet n'est pas d\u00e9clench\u00e9");
    public static final /* enum */ QA bgb = new QA(1, "Le caster sera le caster original de l'effet");
    public static final /* enum */ QA bgc = new QA(2, "Le caster sera le porteur cet effet");
    public static final /* enum */ QA bgd = new QA(3, "Le caster sera la cible de cet effet");
    public static final /* enum */ QA bge = new QA(4, "Le caster sera le caster de l'effet declencheur");
    public static final /* enum */ QA bgf = new QA(5, "Le caster sera la cible de l'effet declencheur");
    private final byte bgg;
    private final String bgh;
    private static final /* synthetic */ QA[] bgi;

    public static QA[] values() {
        return (QA[])bgi.clone();
    }

    public static QA valueOf(String string) {
        return Enum.valueOf(QA.class, string);
    }

    private QA(byte by, String string2) {
        this.bgg = by;
        this.bgh = string2;
    }

    @Override
    public String aXA() {
        return Byte.toString(this.bgg);
    }

    @Override
    public String aXB() {
        return this.name();
    }

    @Override
    public String aXC() {
        return this.bgh;
    }

    public byte aJr() {
        return this.bgg;
    }

    public static QA J(byte by) {
        QA[] qAArray = QA.values();
        for (int i = 0; i < qAArray.length; ++i) {
            QA qA = qAArray[i];
            if (qA.bgg != by) continue;
            return qA;
        }
        return null;
    }

    private static /* synthetic */ QA[] baU() {
        return new QA[]{bga, bgb, bgc, bgd, bge, bgf};
    }

    static {
        bgi = QA.baU();
    }
}

