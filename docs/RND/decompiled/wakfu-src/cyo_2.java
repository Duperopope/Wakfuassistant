/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.Optional;
import org.apache.log4j.Logger;

/*
 * Renamed from cYo
 */
public class cyo_2
implements adi_1 {
    private static final Logger nYg = Logger.getLogger(cyo_2.class);
    private static final cyo_2 nYh = new cyo_2();
    private alx_2 ikv;
    private eMV nYi;
    private boj nYj;
    private ni_1 nYk;
    private fdg_0 nmh;

    public static cyo_2 eXQ() {
        return nYh;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 19008: {
                if (aue_0.cVJ().cVO().bfb()) {
                    bYU.epD();
                    return false;
                }
                fdg_0 fdg_02 = new fdg_0(this.nmh);
                bgt_0 bgt_02 = aue_0.cVJ().cVK();
                bvi_0 bvi_02 = bgt_02.dnQ();
                if (!bvi_02.dfG() || bvi_02.dKM()) {
                    fdg_02.Kl(this.nYj.dAB());
                    fdg_02.jo(this.nYj.dAA());
                }
                ((bCd)this.nYk).a((RG)bvz_0.dLl(), fdg_02);
                boi.iMT.k(this.nYj.dAD().d(), this.nYj.dAB(), this.nYj.dAA());
                fyw_0.gqw().tl("stasisDungeonDialog");
                return false;
            }
            case 17962: {
                bgt_0 bgt_03 = bvz_0.dLl();
                if (bgt_03 == null) {
                    nYg.info((Object)"Can't change dungeon difficulty, player null");
                    return false;
                }
                bvi_0 bvi_03 = bgt_03.dnQ();
                if (bvi_03.dfG() && !bvi_03.dKM()) {
                    return false;
                }
                int n = this.nYj.dAD().d();
                if (this.nYi.b(bgt_03.Sn(), this.nmh.bdL(), n, this.nYj.dAB())) {
                    cjT cjT2 = new cjT();
                    cjT2.db(bgt_03.Sn());
                    cjT2.Kl(this.nYj.dAB());
                    cjT2.fK(bgt_03.doa().get().bhh());
                    aue_0.cVJ().etu().d(cjT2);
                    fyw_0.gqw().tl("stasisDungeonDialog");
                }
                return false;
            }
            case 18721: {
                dae_0 dae_02 = (dae_0)aam_22;
                int n = dae_02.bCo();
                bgt_0 bgt_04 = aue_0.cVJ().cVK();
                if (bgt_04 == null) {
                    nYg.info((Object)"Can't change dungeon difficulty, player null");
                    return false;
                }
                bvi_0 bvi_04 = bgt_04.dnQ();
                if (bvi_04.dfG() && !bvi_04.dKM()) {
                    fse_1.gFu().a((aef_2)this.nYj, boj.iNx);
                    return false;
                }
                int n2 = this.nYj.dAD().d();
                Optional<fte_0> optional = bgt_04.doa();
                boolean bl = optional.isPresent() && optional.get().bhh() == (long)this.nmh.bdL() ? this.nYi.b(bgt_04.Sn(), this.nmh.bdL(), n2, n) : this.nYi.c(bgt_04.Sn(), n, n2, this.nYj.dAA());
                if (bl) {
                    this.nYj.EP(n);
                    fse_1.gFu().f("stasisDungeonJauge", n);
                }
                fse_1.gFu().a((aef_2)this.nYj, boj.iNx);
                boi.iMT.k(this.nYj.dAD().d(), this.nYj.dAB(), this.nYj.dAA());
                return false;
            }
            case 16115: {
                dae_0 dae_03 = (dae_0)aam_22;
                boolean bl = dae_03.bCu();
                bgt_0 bgt_05 = bvz_0.dLl();
                if (bgt_05 == null) {
                    return false;
                }
                bvi_0 bvi_05 = bgt_05.dnQ();
                if (bvi_05.dfG() && !bvi_05.dKM()) {
                    fse_1.gFu().a((aef_2)this.nYj, boj.iNx);
                    return false;
                }
                this.nYj.gK(bl);
                if (!bl && this.nYj.dAB() > 10) {
                    this.nYj.EP(10);
                }
                fse_1.gFu().a((aef_2)this.nYj, boj.iNx);
                return false;
            }
            case 16257: {
                return false;
            }
        }
        return true;
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (!bl) {
            this.ikv = new cyp_1(this);
            this.nYi = new eMV();
            cua_2.eRq().Lr(this.IO());
            cua_2.eRq().kl(true);
            fse_1.gFu().f("stasisDungeonView", this.nYj);
            fse_1.gFu().f("stasisDungeonSlider", this.nYj.dAB());
            fse_1.gFu().f("stasisDungeonJauge", this.nYj.dAB());
            fyw_0.gqw().a(this.ikv);
            ccj_2.g("stasisDungeonDialog", 256L);
            fyw_0.gqw().d("wakfu.stasisDungeon", chf_2.class);
        }
    }

    public void a(ni_1 ni_12, fdg_0 fdg_02) {
        boolean bl;
        boolean bl2;
        int n;
        boolean bl3;
        if (ni_12 == null || fdg_02 == null) {
            nYg.info((Object)"Can't open dungeon UI, invalid parameters");
            return;
        }
        this.nYk = ni_12;
        this.nmh = fdg_02;
        bgt_0 bgt_02 = bvz_0.dLl();
        if (bgt_02 == null) {
            return;
        }
        short s = fdg_02.bdL();
        Optional<eIb> optional = eId.quO.pC(s);
        if (optional.isEmpty()) {
            nYg.error((Object)("[DUNGEON] No dungeon information found for id " + s));
            return;
        }
        eIb eIb2 = optional.get();
        boolean bl4 = bl3 = !bgt_02.dnQ().dfG() || bgt_02.dnQ().dKM();
        if (bl3) {
            var11_8 = boi.iMT.EM(eIb2.d());
            n = var11_8.isPresent() ? ((boh)var11_8.get()).GN() : 2;
            bl2 = var11_8.isPresent() && ((boh)var11_8.get()).dAA() || eMQ.RD(eIb2.d());
            bl = true;
        } else {
            var11_8 = bvo_0.jvG.FP(s);
            bl2 = var11_8.isPresent() && ((eMW)var11_8.get()).Fq() > 0 || eMQ.RD(eIb2.d());
            bl = !var11_8.isPresent() || ((eMW)var11_8.get()).erC();
            int n2 = n = var11_8.isPresent() ? ((eMW)var11_8.get()).Fs() : 2;
        }
        if (!eIb2.cmT() || eMQ.RD(eIb2.d())) {
            n = 2;
        }
        int n3 = bgt_02.dpV().RE(eIb2.d());
        this.nYj = new boj(eIb2, n, bl2, bl, n3);
        this.nYj.setReadOnly(!bl3);
        aue_0.cVJ().a(this);
    }

    public void eXR() {
        bgt_0 bgt_02 = bvz_0.dLl();
        if (bgt_02 == null) {
            return;
        }
        Optional<fte_0> optional = bgt_02.doa();
        if (optional.isEmpty()) {
            return;
        }
        fte_0 fte_02 = optional.get();
        fse_0 fse_02 = ((fsf)fsf.gkM()).mC(fte_02.bhh());
        if (!fse_02.eqx()) {
            return;
        }
        Optional<eIb> optional2 = eId.quO.pC(fte_02.bhh());
        if (optional2.isEmpty()) {
            nYg.error((Object)("[DUNGEON] No dungeon information found for id " + fte_02.bhh()));
            return;
        }
        eIb eIb2 = optional2.get();
        bvi_0 bvi_02 = bgt_02.dnQ();
        boolean bl = fte_02.Fq() > 0 || eMQ.RD(eIb2.d());
        int n = bgt_02.dpV().RE(eIb2.d());
        this.nYj = new boj(eIb2, fte_02.GN(), bl, fte_02.erC(), n);
        this.nYj.setReadOnly(bvi_02.dfG() && !bvi_02.dKM());
        if (!fte_02.erC()) {
            this.nYj.EO(fte_02.GN());
        }
        aue_0.cVJ().a(this);
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            fyw_0.gqw().b(this.ikv);
            fyw_0.gqw().tl("stasisDungeonDialog");
            fyw_0.gqw().tc("wakfu.stasisDungeon");
            fse_1.gFu().vX("stasisDungeonView");
            cua_2.eRq().Lr(-1);
            cua_2.eRq().kl(false);
            this.nYi = null;
        }
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }

    public int IO() {
        return this.nYj.dAD().d();
    }
}

