/*
 * Decompiled with CFR 0.152.
 */
public abstract class cCs {
    private final cCm mzN;
    private final agn_1 mzO;

    protected cCs(cCm cCm2) {
        this.mzN = cCm2;
        this.mzO = null;
    }

    public cCs(cCm cCm2, agn_1 agn_12) {
        this.mzN = cCm2;
        this.mzO = agn_12;
    }

    public cCm eJw() {
        return this.mzN;
    }

    public byte aZv() {
        return this.mzN.aJr();
    }

    public boolean ckv() {
        return this.mzO != null;
    }

    public agn_1 erT() {
        return this.mzO;
    }

    public abstract byte eJm();

    public abstract int eJn();

    public abstract String eJo();

    public abstract String eJp();

    public String toString() {
        return this.eJo() + " : " + this.eJp();
    }
}

