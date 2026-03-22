/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class ago
implements agn {
    private static final Logger ctC = Logger.getLogger(ago.class);
    private agk ctD;
    private int bYe;
    private int bYf;
    private final int ctE;
    private final int ctF;
    private final float ctG;
    private final float ctH;

    public ago(aag_0 aag_02, int n, int n2) {
        this.ctG = aag_02.bsh();
        this.ctH = aag_02.bsi();
        this.ctE = n;
        this.ctF = n2;
        this.bE(n, n2);
    }

    public void a(agk agk2) {
        this.ctD = agk2;
    }

    public void bE(int n, int n2) {
        this.bYe = n;
        this.bYf = n2;
    }

    @Override
    public acb_1 a(afV afV2, agf agf2) {
        float f2 = 1.0f / agf2.getZoomFactor();
        acb_1 acb_12 = this.cE(f2);
        float f3 = 500.0f;
        acb_12.aPY = GC.b(acb_12.aPY, -500.0f, 500.0f);
        acb_12.aPZ = GC.b(acb_12.aPZ, -500.0f, 500.0f);
        acb_12.aPY += this.ctG;
        acb_12.aPZ += this.ctH;
        return acb_12;
    }

    private acb_1 cE(float f2) {
        float f3 = this.bYe - this.ctE;
        float f4 = -(this.bYf - this.ctF);
        f3 = -f3;
        f4 = -f4;
        return new acb_1(f3 *= f2, f4 *= f2);
    }
}

