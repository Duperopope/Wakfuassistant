/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class fsP
extends fsQ<fst> {
    private static final Logger tew = Logger.getLogger(fsP.class);
    private final fsw_0 tex;

    public fsP(fst fst2, fsw_0 fsw_02) {
        super(fst2);
        this.tex = fsw_02;
    }

    public boolean b(short s, int n, int n2) {
        if (!((fst)this.teA).gs(n, n2)) {
            this.c(s, n, n2);
            return false;
        }
        fst fst2 = ((fst)this.teA).ers();
        fst2.aq(n, n2, s);
        if (!this.a(fst2, n, n2)) {
            this.c(s, n, n2);
            return false;
        }
        this.b(fst2, n, n2);
        return this.gly();
    }

    private void c(short s, int n, int n2) {
        fcb_0 fcb_02 = fbw_0.rSQ.eH(s);
        this.m(new fsG(fcb_02, n, n2));
    }

    private boolean a(fst fst2, int n, int n2) {
        return fsu.fL(fst2.gt(n - 1, n2)) || fsu.fL(fst2.gt(n + 1, n2)) || fsu.fL(fst2.gt(n, n2 - 1)) || fsu.fL(fst2.gt(n, n2 + 1));
    }

    private void b(fst fst2, int n, int n2) {
        short s = fsq_0.ZR(n);
        short s2 = fsq_0.ZS(n2);
        for (fam_0 fam_02 : fst2.aj(s, s2)) {
            if (this.a(fst2, fam_02)) continue;
            this.m(new fsb_0(fam_02));
        }
    }

    public boolean a(fst fst2, fam_0 fam_02) {
        aci_1 aci_12 = fam_02.fRe();
        int n = aci_12.cuQ;
        int n2 = aci_12.cuS;
        int n3 = aci_12.cuR;
        int n4 = aci_12.cuT;
        for (int i = n2; i < n4; ++i) {
            for (int j = n; j < n3; ++j) {
                if (!this.c(fst2, j, i)) continue;
                return false;
            }
        }
        return true;
    }

    private boolean c(fst fst2, int n, int n2) {
        return fsP.a(this.tex, fst2, n, n2);
    }

    static boolean a(fsw_0 fsw_02, fst fst2, int n, int n2) {
        int n3 = fsu.aae(n);
        int n4 = fsu.aaf(n2);
        short s = fst2.gt(n3, n4);
        Object p2 = fsw_02.Kh(s);
        int n5 = n3 * 9;
        int n6 = n4 * 9;
        int n7 = n - n5;
        int n8 = n2 - n6;
        return p2 == null || ((fsu)p2).ab(n7, n8) || ((fsu)p2).gx(n7, n8) != 0;
    }
}

