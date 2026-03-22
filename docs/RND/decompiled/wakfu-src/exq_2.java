/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eXq
 */
public final class exq_2
extends exo_1 {
    private final int rFT;
    private int rFU;

    public exq_2(exa_1<exf_2> exa_12, exx_2 exx_22, float f2, int n, int n2) {
        super(exa_12, exx_22, f2, n);
        this.rFT = n2;
    }

    @Override
    public void b(exg_1 exg_12, int n) {
        exf_2 exf_22 = (exf_2)this.rFO.b(this.rFP);
        if (exf_22 == null) {
            return;
        }
        block0 : switch (exg_12) {
            case rFA: {
                int n2 = (int)Math.floor(this.rFR * (float)n);
                n2 = Math.min(n2, this.rFT - this.rFU);
                if (n2 <= 0) {
                    return;
                }
                switch (this.rFQ) {
                    case 0: {
                        this.rFU += exf_22.nt(n2);
                        break;
                    }
                    case 1: {
                        exf_22.ot(exf_22.fOy() + n2);
                    }
                }
                break;
            }
            case rFB: {
                int n3 = (int)Math.floor(this.rFR * (float)n);
                n3 = Math.min(n3, this.rFU);
                if (n3 <= 0) {
                    return;
                }
                switch (this.rFQ) {
                    case 0: {
                        this.rFU -= exf_22.oq(n3);
                        break block0;
                    }
                    case 1: {
                        exf_22.ot(exf_22.fOy() - n3);
                    }
                }
            }
        }
    }
}

