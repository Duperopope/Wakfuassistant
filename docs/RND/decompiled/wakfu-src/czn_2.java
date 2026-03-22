/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from cZn
 */
public class czn_2 {
    private static boolean oaN = false;
    private ago oaO;
    private agk ctD;
    private final ArrayList<czo_2> oaP = new ArrayList(1);
    public static final czn_2 oaQ = new czn_2();

    private czn_2() {
    }

    public void a(agk agk2) {
        this.ctD = agk2;
        if (this.oaO != null) {
            this.oaO.a(agk2);
        }
    }

    public void a(czo_2 czo_22) {
        if (!this.oaP.contains(czo_22)) {
            this.oaP.add(czo_22);
        }
    }

    public void eZb() {
        this.oaP.clear();
    }

    public void b(czo_2 czo_22) {
        this.oaP.remove(czo_22);
    }

    public boolean b(aam_2 aam_22) {
        if (!czn_2.eZc()) {
            if (this.oaO != null) {
                this.oaO = null;
            }
            return true;
        }
        switch (aam_22.d()) {
            case 16990: {
                dcm_0 dcm_02 = (dcm_0)aam_22;
                int n = dcm_02.bqM();
                int n2 = dcm_02.bqN();
                if (this.oaO != null) {
                    this.oaO.bE(n, n2);
                } else {
                    bsj_0 bsj_02;
                    bsj_0 bsj_03 = bsj_02 = aue_0.cVJ().cVK().dnC() ? cui_2.nNq.cXk() : cub_1.eSi().cXk();
                    if (bsj_02 == null) {
                        return false;
                    }
                    if (crt_2.a(n, n2, bsj_02)) {
                        this.eU(n, n2);
                    }
                }
                return false;
            }
            case 16902: {
                this.reset();
                return true;
            }
        }
        return true;
    }

    private static boolean eZc() {
        if (dcm_0.fcl()) {
            return true;
        }
        return oaN;
    }

    public static boolean eZd() {
        return oaN;
    }

    public void eZe() {
        this.reset();
        this.oaP.clear();
    }

    public void reset() {
        aag_0 aag_02 = this.eZf();
        aag_02.a(new agp());
        aag_02.a(agj_0.cuH);
        this.oaO = null;
        oaN = false;
        for (int i = 0; i < this.oaP.size(); ++i) {
            this.oaP.get(i).dTZ();
        }
    }

    private void eU(int n, int n2) {
        aag_0 aag_02 = this.eZf();
        this.oaO = new ago(aag_02, n, n2);
        this.oaO.a(this.ctD);
        aag_02.a(this.oaO);
        aag_02.a(agj_0.cuH);
        for (int i = 0; i < this.oaP.size(); ++i) {
            this.oaP.get(i).cby();
        }
    }

    private aag_0 eZf() {
        aIs aIs2 = (aIs)aie_0.cfn().bmC();
        return aIs2.bqL();
    }

    public static void eZg() {
        oaN = !oaN;
    }
}

