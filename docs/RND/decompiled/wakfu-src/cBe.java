/*
 * Decompiled with CFR 0.152.
 */
class cBe
implements Runnable {
    private static final byte mtz = 0;
    private static final byte mtA = 1;
    private static final byte mtB = 2;
    private final byte mtC;
    private final float mtD;
    private final float mtE;
    private final int mtF;
    private int mtG;
    float mtH;
    final /* synthetic */ cAY mtI;

    cBe(cAY cAY2, byte by, float f2, float f3, int n) {
        this.mtI = cAY2;
        this.mtC = by;
        this.mtD = f2;
        this.mtE = f3;
        this.mtF = n;
    }

    @Override
    public void run() {
        this.mtH = GC.a(this.mtD, this.mtE, (float)(++this.mtG) / (float)this.mtF);
        switch (this.mtC) {
            case 0: {
                cAN.mpo.eGT().dO(this.mtH);
                cAN.mpo.eGS().dO(this.mtH);
                cAN.mpo.eGU().dO(this.mtH);
                break;
            }
            case 1: {
                cAN.mpp.eGS().dO(this.mtH);
                cAN.mpp.eGT().dO(this.mtH);
                cAN.mpp.eGU().dO(this.mtH);
                cAN.mpq.eGU().dO(this.mtH);
                cAN.mpu.eGT().dO(this.mtH);
                cAN.mpu.eGU().dO(this.mtH);
                cAN.mpr.eGT().dO(this.mtH);
                cAN.mpr.eGU().dO(this.mtH);
                cAN.mpt.eGT().dO(this.mtH);
                cAN.mpt.eGU().dO(this.mtH);
                cAN.mpw.eGT().dO(this.mtH);
                cAN.mpw.eGU().dO(this.mtH);
                cAN.mpv.eGT().dO(this.mtH);
                cAN.mpv.eGU().dO(this.mtH);
                break;
            }
            case 2: {
                cAN.mps.eGT().dO(this.mtH);
            }
        }
        if (this.mtG == this.mtF) {
            switch (this.mtC) {
                case 0: {
                    this.mtI.mtf = null;
                    break;
                }
                case 1: {
                    this.mtI.mtg = null;
                    break;
                }
                case 2: {
                    this.mtI.mth = null;
                }
            }
        }
    }
}

