/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from fsN
 */
public class fsn_0
extends fsQ<fst> {
    private static final Logger tet = Logger.getLogger(fsn_0.class);
    private final fsw_0 teu;

    public fsn_0(fst fst2, fsw_0 fsw_02) {
        super(fst2);
        this.teu = fsw_02;
    }

    public boolean b(far_0 far_02) {
        this.c(far_02);
        this.d(far_02);
        return !this.gly();
    }

    private void c(far_0 far_02) {
        Object t = far_02.fRg();
        fbk_0 fbk_02 = far_02.erN();
        boolean bl = fbk_02.coy();
        int n = far_02.fRc();
        int n2 = far_02.fRd();
        int n3 = ((fsx_0)t).getWidth();
        int n4 = ((fsx_0)t).getHeight();
        fam_0[] fam_0Array = null;
        int s = Short.MIN_VALUE;
        int n5 = Short.MIN_VALUE;
        for (int i = n2; i < n2 + n4; ++i) {
            for (int j = n; j < n + n3; ++j) {
                short s2;
                short s3;
                boolean bl2 = ((fsx_0)t).fI(j - n, i - n2);
                if (bl && bl2) continue;
                short s4 = (short)vz_0.qd(j);
                short s5 = (short)vz_0.qe(i);
                if (fam_0Array == null || s3 != s4 || s2 != s5) {
                    fam_0Array = ((fst)this.teA).aj(s4, s5);
                    s3 = s4;
                    s2 = s5;
                }
                for (fam_0 fam_02 : fam_0Array) {
                    if (fam_02.ZC() == far_02.ZC()) continue;
                    fbk_0 fbk_03 = fam_02.erN();
                    if (!fam_02.fH(j, i)) continue;
                    if (!bl && !fbk_03.coy()) {
                        this.m(new fsb_0(fam_02));
                        continue;
                    }
                    if (bl2 || !fam_02.aq(j, i) || bl && fam_02.fI(j, i)) continue;
                    this.m(new fsb_0(fam_02));
                }
            }
        }
    }

    private void d(far_0 far_02) {
        aci_1 aci_12 = far_02.fRe();
        for (int i = aci_12.cuS; i < aci_12.cuT; ++i) {
            for (int j = aci_12.cuQ; j < aci_12.cuR; ++j) {
                short s = fsq_0.ZP(j);
                short s2 = fsq_0.ZQ(i);
                short s3 = ((fst)this.teA).gt(s, s2);
                if (!((fst)this.teA).gs(s, s2)) {
                    this.c(s3, s, s2);
                    continue;
                }
                if (!fsP.a(this.teu, (fst)this.teA, j, i)) continue;
                this.c(s3, s, s2);
            }
        }
    }

    private void c(short s, short s2, short s3) {
        fcb_0 fcb_02 = fbw_0.rSQ.eH(s);
        this.m(new fsG(fcb_02, s2, s3));
    }
}

