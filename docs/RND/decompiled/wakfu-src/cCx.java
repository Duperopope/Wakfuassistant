/*
 * Decompiled with CFR 0.152.
 */
public class cCx
extends cCs {
    public static final byte mAj = 0;
    private final cCw mAk;

    public cCx(cCw cCw2) {
        this(cCw2, null);
    }

    public cCx(cCw cCw2, agn_1 agn_12) {
        super(cCm.mzo, agn_12);
        this.mAk = cCw2;
    }

    public cCw eJB() {
        return this.mAk;
    }

    @Override
    public byte eJm() {
        return 0;
    }

    @Override
    public int eJn() {
        return this.mAk.eJz() << 8 | 0;
    }

    @Override
    public String eJo() {
        return "Weather - " + this.mAk.getDescription();
    }

    @Override
    public String eJp() {
        StringBuilder stringBuilder = new StringBuilder();
        agn_1 agn_12 = this.erT();
        if (agn_12 != null) {
            stringBuilder.append(" Position = [").append(agn_12.bpl()).append(",").append(agn_12.bpm()).append("]");
        }
        return stringBuilder.toString();
    }
}

