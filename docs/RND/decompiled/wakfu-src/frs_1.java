/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from fRs
 */
public abstract class frs_1
extends fhp_1
implements fry_2 {
    private static Logger oO = Logger.getLogger(frs_1.class);
    protected boolean uZB = false;

    public boolean gEI() {
        return true;
    }

    @Override
    public boolean isStandAlone() {
        return this.uZB;
    }

    @Override
    public fsm_1 getContentGreedySize(faw_2 faw_22, fes_2 fes_22, fsm_1 fsm_12) {
        return this.getContentPreferedSize(faw_22);
    }

    @Override
    public boolean gAa() {
        return false;
    }

    @Override
    public void b(faw_2 faw_22, fes_2 fes_22) {
    }

    @Override
    public void aVI() {
        super.aVI();
        this.uZB = false;
    }

    public frs_1 gEJ() {
        return null;
    }

    public /* synthetic */ Object clone() {
        return this.gEJ();
    }
}

