/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class fsS
extends fsQ<fst> {
    private static final Logger teC = Logger.getLogger(fsS.class);

    public fsS(fst fst2) {
        super(fst2);
    }

    public boolean gB(int n, int n2) {
        short s = fsq_0.ZR(n);
        short s2 = fsq_0.ZS(n2);
        for (fam_0 fam_02 : ((fst)this.teA).aj(s, s2)) {
            this.m(new fsb_0(fam_02));
        }
        this.gC(n, n2);
        this.gC(n + 1, n2);
        this.gC(n, n2 + 1);
        this.gC(n + 1, n2 + 1);
        return !this.gly();
    }

    private void gC(int n, int n2) {
        short s = ((fst)this.teA).gt(n, n2);
        if (s != 0) {
            fcb_0 fcb_02 = fbw_0.rSQ.eH(s);
            this.m(new fsG(fcb_02, n, n2));
        }
    }
}

