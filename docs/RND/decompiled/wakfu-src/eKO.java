/*
 * Decompiled with CFR 0.152.
 */
public class eKO {
    private final int qDQ;
    private final int qDR;
    private final int qDS;
    private final int qDT;
    private final int qDU;
    private final int qDV;
    private final int qDW;
    private final float qDX;
    private final eKP qDY;
    private final ang_2 qDZ;

    protected eKO(int n, int n2, int n3, int n4, int n5, int n6, ang_2 ang_22, int n7, eKP eKP2, float f2) {
        this.qDQ = n;
        this.qDS = n2;
        this.qDT = n3;
        this.qDU = n4;
        this.qDV = n6;
        this.qDZ = ang_22;
        this.qDW = n5;
        this.qDR = n7;
        this.qDY = eKP2;
        this.qDX = f2;
    }

    public int d() {
        return this.qDQ;
    }

    public int clf() {
        return this.qDV;
    }

    public ang_2 bdo() {
        return this.qDZ;
    }

    public int fyP() {
        return this.qDU;
    }

    public int dwb() {
        return this.qDT;
    }

    public int cms() {
        return this.qDS;
    }

    public int fyQ() {
        return this.qDW;
    }

    public int cuO() {
        return this.qDR;
    }

    public boolean fyR() {
        return this.qDR == 0 || this.qDR == 16;
    }

    public <Info extends eKP> Info fyS() {
        return (Info)this.qDY;
    }

    public float cmu() {
        return this.qDX;
    }

    public String toString() {
        return "AbstractCollectAction{m_id=" + this.qDQ + ", m_craftId=" + this.qDS + ", m_levelMin=" + this.qDT + ", m_nbPlayerMin=" + this.qDU + "}";
    }
}

