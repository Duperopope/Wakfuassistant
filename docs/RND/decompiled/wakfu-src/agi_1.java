/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aGI
 */
public class agi_1 {
    public static float dLK = 0.4f;
    public static float dLL = 700.0f;
    private float dLM = 0.0f;
    private float dLN = dLK;
    private float dLO = dLL;
    private final agc_1 dLP;

    public agi_1(agc_1 agc_12) {
        this.dLP = agc_12;
    }

    public void cby() {
        if (this.dLP == null) {
            return;
        }
        this.dLM = this.dLP.bBt();
        this.dLP.br(this.dLN * this.dLP.bBt(), this.dLO);
    }

    public void cbz() {
        if (this.dLP == null) {
            return;
        }
        this.dLP.br(this.dLM, this.dLO);
    }

    public void dK(float f2) {
        this.dLN = f2;
    }

    public void dL(float f2) {
        this.dLO = f2;
    }

    public void cbA() {
        this.dLN = dLK;
    }

    public void cbB() {
        this.dLO = dLL;
    }
}

