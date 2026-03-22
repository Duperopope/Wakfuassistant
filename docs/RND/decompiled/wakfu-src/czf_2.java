/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cZF
 */
public class czf_2
implements adi_1 {
    protected static final Logger obC = Logger.getLogger(czf_2.class);
    private static final czf_2 obD = new czf_2();
    private exr_1 obE;
    private bis_1 obF;
    private final alx_2 obG = string -> {
        if (string.equals("neoRoadMapDialog")) {
            aue_0.cVJ().b(czf_2.eZv());
        }
    };

    private czf_2() {
    }

    public static czf_2 eZv() {
        return obD;
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (bl) {
            return;
        }
        fyw_0.gqw().a(this.obG);
        cAY.eHc().nP(600021L);
        ccj_2.g("neoRoadMapDialog", 256L);
        this.obF = new bis_1();
        if (!fyw_0.gqw().tb("wakfu.neo.roadmap")) {
            fyw_0.gqw().d("wakfu.neo.roadmap", chi_1.class);
        }
        fse_1.gFu().b("neoBosses", this.obF, "neoRoadMapDialog");
        this.obE = new cze_1(this.obF);
        exu_1.rJd.a(this.obE);
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (bl) {
            return;
        }
        fyw_0.gqw().tl("neoRoadMapDialog");
        fyw_0.gqw().b(this.obG);
        fyw_0.gqw().tc("wakfu.crafts");
        cAY.eHc().nP(600022L);
        exu_1.rJd.b(this.obE);
        this.obE = null;
        this.obF = null;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        return true;
    }

    public bis_1 eZw() {
        return this.obF;
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }
}

