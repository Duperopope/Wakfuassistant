/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TIntHashSet
 *  org.apache.log4j.Logger
 */
import gnu.trove.set.hash.TIntHashSet;
import org.apache.log4j.Logger;

/*
 * Renamed from cYK
 */
public class cyk_2
implements adi_1,
Runnable {
    protected static final Logger nZg = Logger.getLogger(cyk_2.class);
    private static final cyk_2 nZh = new cyk_2();
    private adp_0 nRy;
    private int nZi;
    private alx_2 ikv;
    private final bre_2 nZj = bre_2.elb();
    private final TIntHashSet nZk = new TIntHashSet();

    public static cyk_2 eYu() {
        return nZh;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 16430: {
                dca_0 dca_02 = (dca_0)aam_22;
                bgt_0 bgt_02 = aue_0.cVJ().cVK();
                bri_2 bri_22 = (bri_2)bgt_02.ffF();
                if (bgt_02.dnG() < 1) {
                    String string = aum_0.cWf().c("nation.vote.not.level.required", (short)1);
                    aPh.czg().jb(string);
                    return false;
                }
                if (!this.nZj.b(bri_22)) {
                    String string = aum_0.cWf().c("nation.rank.unauthorized.for.vote", new Object[0]);
                    aPh.czg().jb(string);
                    return false;
                }
                fof_0 fof_02 = (fof_0)evx_2.feo().a(bgt_02.Xi(), eva_1.owH).orElse(new fof_0());
                if (fof_02.gfG()) {
                    String string = aum_0.cWf().c("nation.error.alreadyVoted", new Object[0]);
                    aPh.czg().jb(string);
                    return false;
                }
                fjo_0 fjo_02 = bri_22.ems();
                fjo_02.E(bri_22.gaS(), dca_02.fbl().ela().Sn());
                fkw fkw2 = (fkw)dca_02.fbl().ela();
                String string = bgt_02.Sn() == fkw2.Sn() ? aum_0.cWf().c("nation.vote.voteFor.voteDoneForMe", new Object[0]) : aum_0.cWf().c("nation.vote.voteFor.voteDoneForSomeone", fkw2.getName());
                aPh.czg().jb(string);
                bri_22.iu(true);
                this.eYw();
                return false;
            }
            case 19103: {
                int n;
                bri_2 bri_23 = (bri_2)aue_0.cVJ().cVK().ffF();
                fjo_0 fjo_03 = bri_23.ems();
                --this.nZi;
                int n2 = n = fjo_03.gbx() ? fjo_03.ekU() : fjo_03.gbA().ekU();
                if (n < 3) {
                    return false;
                }
                if (this.nZi < 0) {
                    this.nZi = (int)Math.floor(((float)n - 1.0f) / 3.0f);
                }
                if (!fjo_03.gbx() && this.nZk.contains(this.nZi)) {
                    brx_1.elI().dhh();
                    return false;
                }
                this.nZk.add(this.nZi);
                this.eYw();
                return false;
            }
            case 19779: {
                int n;
                bri_2 bri_24 = (bri_2)aue_0.cVJ().cVK().ffF();
                fjo_0 fjo_04 = bri_24.ems();
                ++this.nZi;
                int n3 = n = fjo_04.gbx() ? fjo_04.ekU() : fjo_04.gbA().ekU();
                if (n < 3) {
                    return false;
                }
                if (n <= this.eYx() * 3) {
                    this.nZi = 0;
                }
                if (!fjo_04.gbx() && this.nZk.contains(this.nZi)) {
                    brx_1.elI().dhh();
                    return false;
                }
                this.nZk.add(this.nZi);
                this.eYw();
                return false;
            }
            case 17030: {
                dae_0 dae_02 = (dae_0)aam_22;
                bgt_0 bgt_03 = aue_0.cVJ().cVK();
                bri_2 bri_25 = (bri_2)bgt_03.ffF();
                if (!this.nZj.a(bri_25)) {
                    String string = aum_0.cWf().c("nation.rank.unauthorized.for.registration", new Object[0]);
                    aPh.czg().jb(string);
                    return false;
                }
                fjo_0 fjo_05 = bri_25.ems();
                String string = dae_02.bCt().replace("\r\n", " ").replace("\n", " ");
                fjo_05.o(bgt_03.Sn(), string);
                bri_25.elh();
                this.eYw();
                return false;
            }
        }
        return true;
    }

    public int eYv() {
        return 3 + (this.nZi == 0 ? 1 : 0);
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (!bl) {
            bgt_0 bgt_02 = aue_0.cVJ().cVK();
            this.nRy = new cyl_1(this);
            bgt_02.ddI().a(this.nRy);
            this.ikv = new cym_2(this);
            fyw_0.gqw().a(this.ikv);
            ccj_2.g("voteInformationDialog", 32768L);
            bri_2 bri_22 = (bri_2)bgt_02.ffF();
            fjo_0 fjo_02 = bri_22.ems();
            if (fjo_02.gbx()) {
                abg_2.bUP().a((Runnable)this, 1000L);
                fse_1.gFu().f("electionSloganDirty", false);
            }
            fse_1.gFu().f("voteInscription.feeWarning", aum_0.cWf().c("nation.vote.eligible.warning", fjo_02.emh()));
            this.nZi = 0;
            this.nZk.add(this.nZi);
            this.eYw();
            fyw_0.gqw().d("wakfu.voteInformation", cht_1.class);
        }
    }

    private void eYw() {
        cxp_0 cxp_02 = new cxp_0();
        cxp_02.setOffset(this.eYx() * 3);
        aue_0.cVJ().etu().d(cxp_02);
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            brx_1.elI().emk();
            bgt_0 bgt_02 = aue_0.cVJ().cVK();
            bgt_02.ddI().b(this.nRy);
            this.nRy = null;
            this.nZk.clear();
            fjo_0 fjo_02 = bgt_02.ffF().ems();
            if (!fjo_02.gbx()) {
                fjo_02.gbA().clear();
            } else {
                fse_1.gFu().vX("voteInscription.feeWarning");
                fse_1.gFu().vX("electionSloganDirty");
            }
            abg_2.bUP().h(this);
            fyw_0.gqw().b(this.ikv);
            fyw_0.gqw().tl("voteInformationDialog");
            fse_1.gFu().vX("voteList");
            fyw_0.gqw().tc("wakfu.voteInformation");
        }
    }

    @Override
    public void run() {
        fse_1.gFu().a((aef_2)brx_1.elI(), "electionClosureDescription");
    }

    public int eYx() {
        return this.nZi;
    }
}

