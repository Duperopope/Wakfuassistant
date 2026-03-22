/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cSK
 */
public class csk_2
implements adi_1 {
    protected static final Logger nGv = Logger.getLogger(csk_2.class);
    private static final csk_2 nGw = new csk_2();
    private bgq nGx;
    private alx_2 ikv;

    public static csk_2 eOu() {
        return nGw;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        return true;
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }

    public void e(bfT bfT2) {
        this.nGx = new bgq(bfT2.dif());
        this.nGx.dhq();
        this.cAN();
    }

    private void cAN() {
        fse_1.gFu().b("displayedAchievement", this.nGx, "challengeResultDialog");
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (!bl) {
            this.ikv = new csl_2(this);
            fyw_0.gqw().a(this.ikv);
            ccj_2.pd("challengeResultDialog");
            this.cAN();
        }
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            fyw_0.gqw().b(this.ikv);
            fyw_0.gqw().tl("challengeResultDialog");
            this.nGx = null;
        }
    }
}

