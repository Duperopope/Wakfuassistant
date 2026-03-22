/*
 * Decompiled with CFR 0.152.
 */
public class cCo
extends cCs {
    public static final byte mzy = 1;
    private final int mzz;
    private final short mzA;

    public cCo(cCm cCm2, int n, short s) {
        super(cCm2);
        this.mzz = n;
        this.mzA = s;
    }

    public cCo(cCm cCm2, agn_1 agn_12, int n, short s) {
        super(cCm2, agn_12);
        this.mzz = n;
        this.mzA = s;
    }

    public int cqy() {
        return this.mzz;
    }

    public short bfd() {
        return this.mzA;
    }

    @Override
    public byte eJm() {
        return 1;
    }

    @Override
    public int eJn() {
        return 1;
    }

    @Override
    public String eJo() {
        return "Family - " + this.eJw().getDescription();
    }

    @Override
    public String eJp() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("id = ").append(this.mzz).append(" quantit\u00e9 = ").append(this.mzA);
        agn_1 agn_12 = this.erT();
        if (agn_12 != null) {
            stringBuilder.append(" Position = [").append(agn_12.bpl()).append(",").append(agn_12.bpm()).append("]");
        }
        return stringBuilder.toString();
    }
}

