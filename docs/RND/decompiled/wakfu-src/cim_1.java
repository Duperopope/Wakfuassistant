/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from cIm
 */
public class cim_1
extends cir_1 {
    private static final Logger ndy = Logger.getLogger(cim_1.class);
    private final cpg_1 ndz;
    private final int ndA;

    public cim_1(cpg_1 cpg_12, int n) {
        super(new cis_1(true, true));
        this.ndz = cpg_12;
        this.ndA = n;
    }

    @Override
    public fsc_0 eLc() {
        return fsc_0.tdX;
    }

    @Override
    protected void ey(int n, int n2) {
        this.nae.eLa();
        acc_1 acc_12 = this.nae.getPatchCoordFromMouse(n, n2);
        short s = fsq_0.ZR(acc_12.bWx());
        short s2 = fsq_0.ZS(acc_12.bWy());
        if (cim_1.b(this.nae, s, s2)) {
            acc_12.cG(fsq_0.ZT(s), fsq_0.ZU(s2));
            fsf_0 fsf_02 = this.nae.a(this.ndA, acc_12);
            civ_1[] civ_1Array = this.ez(s, s2);
            this.kWd = new ciu_1(fsf_02, civ_1Array);
        } else {
            this.nae.setTool(this.ndz);
        }
    }

    private civ_1[] ez(int n, int n2) {
        ArrayList<civ_1> arrayList = new ArrayList<civ_1>();
        this.c(n, n2, arrayList);
        this.b(n, n2, arrayList);
        civ_1[] civ_1Array = new civ_1[arrayList.size()];
        arrayList.toArray(civ_1Array);
        return civ_1Array;
    }

    private void b(int n, int n2, ArrayList<civ_1> arrayList) {
        short s = fsq_0.ZT(n);
        short s2 = fsq_0.ZU(n2);
        fst fst2 = this.nae.getWorkingHavenWorld();
        short[][] sArray = fst2.erq();
        for (int i = s2 - 1; i <= s2 + 2; ++i) {
            for (int j = s - 1; j <= s + 2; ++j) {
                short s3;
                if ((j == s || j == s + 1) && (i == s2 || i == s2 + 1) || (s3 = fst2.d(sArray, j, i)) == 0) continue;
                fcb_0 fcb_02 = fbw_0.rSQ.eH(s3);
                arrayList.add(this.c(fcb_02, j, i));
            }
        }
    }

    private void c(int n, int n2, ArrayList<civ_1> arrayList) {
        fcb_0 fcb_02 = fbw_0.rSQ.eH((short)0);
        short s = fsq_0.ZT(n);
        short s2 = fsq_0.ZU(n2);
        arrayList.add(this.c(fcb_02, (int)s, s2));
        arrayList.add(this.c(fcb_02, s + 1, s2));
        arrayList.add(this.c(fcb_02, (int)s, s2 + 1));
        arrayList.add(this.c(fcb_02, s + 1, s2 + 1));
    }

    private civ_1 c(fcb_0 fcb_02, int n, int n2) {
        fsG fsG2 = this.nae.getGround(n, n2);
        fsG fsG3 = this.nae.b(fcb_02, n, n2);
        short s = fsG2 != null ? fsG2.fRN() : fsu.tdo;
        return new civ_1(fsG3, s);
    }

    public static boolean b(cie_1 cie_12, int n, int n2) {
        fst fst2 = cie_12.getWorkingHavenWorld();
        return new fsO(fst2).gB(n, n2);
    }
}

