/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cWt
 */
public class cwt_1
implements adi_1 {
    public static final cwt_1 nSF = new cwt_1();
    protected static final Logger nSG = Logger.getLogger(cwt_1.class);
    private bcq_2 nSH;
    private alx_2 ikv;

    private cwt_1() {
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 19860: {
                dae_0 dae_02 = (dae_0)aam_22;
                this.nSH.a((bct_2)dae_02.bCv());
                return false;
            }
            case 16838: {
                dae_0 dae_03 = (dae_0)aam_22;
                this.nSH.b((bci_1)dae_03.bCv());
                return false;
            }
            case 18333: {
                this.nSH.dbd();
                return false;
            }
        }
        return true;
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (!bl) {
            this.ikv = new cwu_1(this);
            fyw_0.gqw().a(this.ikv);
            fse_1.gFu().f("mercenaries", this.nSH);
            ccj_2.g("mercenaryDialog", 32768L);
            fse_1.gFu().b("displayedAchievement", this.nSH.dbe(), "mercenaryDialog");
            fyw_0.gqw().d("wakfu.mercenaries", cfr_1.class);
            fyw_0.gqw().d("wakfu.achievements", cdc_2.class);
        }
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            fse_1.gFu().vX("mercenaries");
            fyw_0.gqw().b(this.ikv);
            fyw_0.gqw().tl("mercenaryDialog");
            fyw_0.gqw().tc("wakfu.mercenaries");
            fyw_0.gqw().tc("wakfu.achievements");
        }
    }

    public void Nz(int n) {
        this.nSH = new bcq_2(n);
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }
}

