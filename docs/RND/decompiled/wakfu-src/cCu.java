/*
 * Decompiled with CFR 0.152.
 */
public class cCu
extends cCs {
    public static final byte mzU = 4;
    private final int mzV;

    public cCu(int n) {
        super(cCm.mzt);
        this.mzV = n;
    }

    public cCu(agn_1 agn_12, int n) {
        super(cCm.mzt, agn_12);
        this.mzV = n;
    }

    public int cax() {
        return this.mzV;
    }

    @Override
    public byte eJm() {
        return 4;
    }

    @Override
    public int eJn() {
        return 4;
    }

    @Override
    public String eJo() {
        return "Time - " + this.eJw().getDescription();
    }

    @Override
    public String eJp() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("time = ").append(this.mzV);
        agn_1 agn_12 = this.erT();
        if (agn_12 != null) {
            stringBuilder.append(" Position = [").append(agn_12.bpl()).append(",").append(agn_12.bpm()).append("]");
        }
        return stringBuilder.toString();
    }
}

