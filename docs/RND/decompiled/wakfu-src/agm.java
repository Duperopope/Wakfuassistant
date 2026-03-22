/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class agm
implements agk {
    private static final Logger ctz = Logger.getLogger(agm.class);
    private final aag_0 ctA;
    private final ZC ctB;

    public agm(ZC zC, aag_0 aag_02) {
        this.ctB = zC;
        this.ctA = aag_02;
    }

    @Override
    public void a(float f2, float f3, acb_1 acb_12) {
        aci_1 aci_12 = agm.a(this.ctA, f2, f3, acb_12);
        if (aci_12 == null) {
            return;
        }
        int n = (int)f2;
        this.ctB.getScreenX();
        int n2 = (int)f3;
        this.ctB.getScreenY();
        if (n < aci_12.cuQ) {
            acb_12.aPY -= (float)(aci_12.cuQ - n);
        }
        if (n > aci_12.cuR) {
            acb_12.aPY -= (float)(aci_12.cuR - n);
        }
        if (n2 < aci_12.cuS) {
            acb_12.aPZ -= (float)(aci_12.cuS - n2);
        }
        if (n2 > aci_12.cuT) {
            acb_12.aPZ -= (float)(aci_12.cuT - n2);
        }
    }

    static aci_1 a(aag_0 aag_02, float f2, float f3, acb_1 acb_12) {
        aci_1 aci_12 = new aci_1();
        float f4 = f2 + acb_12.aPY;
        float f5 = f3 + acb_12.aPZ;
        aag_02.a(f4, f5, aci_12);
        if (aci_12.bWJ() < 100 && aci_12.bWK() < 100) {
            ctz.error((Object)"la vue est trop petite)");
            acb_12.bj(0.0f, 0.0f);
            return null;
        }
        return aci_12;
    }
}

