/*
 * Decompiled with CFR 0.152.
 */
public class cCr
extends cCs {
    public static final byte mzK = 2;
    private final cCq mzL;
    private final int mzM;

    public cCr(cCq cCq2, int n) {
        super(cCm.mzr);
        this.mzL = cCq2;
        this.mzM = n;
    }

    public cCr(agn_1 agn_12, cCq cCq2, int n) {
        super(cCm.mzr, agn_12);
        this.mzL = cCq2;
        this.mzM = n;
    }

    public cCq eJv() {
        return this.mzL;
    }

    public int bgK() {
        return this.mzM;
    }

    @Override
    public byte eJm() {
        return 2;
    }

    @Override
    public int eJn() {
        return this.mzL.mzI << 8 | 2;
    }

    @Override
    public String eJo() {
        return "Geography - " + this.mzL.name();
    }

    @Override
    public String eJp() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(" : Force = ").append(this.mzM);
        agn_1 agn_12 = this.erT();
        if (agn_12 != null) {
            stringBuilder.append(" Position = [").append(agn_12.bpl()).append(",").append(agn_12.bpm()).append("]");
        }
        return stringBuilder.toString();
    }
}

