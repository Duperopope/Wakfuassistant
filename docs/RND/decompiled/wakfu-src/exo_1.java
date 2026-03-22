/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eXo
 */
public class exo_1
implements exn_1 {
    public static final int rFM = 0;
    public static final int rFN = 1;
    protected final exa_1<exf_2> rFO;
    protected final exx_2 rFP;
    protected final int rFQ;
    protected final float rFR;

    public exo_1(exa_1<exf_2> exa_12, exx_2 exx_22, float f2, int n) {
        this.rFO = exa_12;
        this.rFR = f2;
        this.rFP = exx_22;
        this.rFQ = n;
    }

    @Override
    public void b(exg_1 exg_12, int n) {
        exf_2 exf_22 = this.rFO.b(this.rFP);
        block0 : switch (exg_12) {
            case rFA: {
                int n2 = (int)Math.floor(this.rFR * (float)n);
                if (exf_22 != null) {
                    switch (this.rFQ) {
                        case 0: {
                            exf_22.nt(n2);
                            break;
                        }
                        case 1: {
                            exf_22.ot(exf_22.fOy() + n2);
                        }
                    }
                }
                break;
            }
            case rFB: {
                if (exf_22 == null) break;
                int n3 = (int)Math.floor(this.rFR * (float)n);
                switch (this.rFQ) {
                    case 0: {
                        exf_22.oq(n3);
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

