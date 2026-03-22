/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TIntObjectIterator;
import org.apache.log4j.Logger;

/*
 * Renamed from cSX
 */
public class csx_1
extends cts_1
implements eVf<exP>,
fsk_1 {
    private static final Logger nHI = Logger.getLogger(csx_1.class);
    private static final csx_1 nHJ = new csx_1();
    private static final int nHK = 400;

    public static csx_1 ePi() {
        return nHJ;
    }

    @Override
    public void eX(String string) {
        if (string != null && !string.equals("characterSheetDialog")) {
            aue_0.cVJ().b(this);
        }
    }

    @Override
    public boolean b(aam_2 aam_22) {
        return super.b(aam_22);
    }

    @Override
    public String ePj() {
        return "characterSheetDialog";
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        super.a(aye_22, bl);
        if (!bl) {
            csx_1.ePk();
            this.ePl();
            boolean bl2 = aub_0.cVb().i((byte)3, "displayAllCharacteristics") ? aub_0.cVb().b((byte)3, "displayAllCharacteristics") : true;
            csx_1.ke(bl2);
            fse_1.gFu().f("characterSheetSecondMode", ((bsg_1)aie_0.cfn().bmH()).a(bsn_1.ljk));
            fyw_0.gqw().d("wakfu.characterSheet", cda_1.class);
            cAY.eHc().nP(600054L);
        }
    }

    private static void ePk() {
        fey_2 fey_22 = (fey_2)fyw_0.gqw().th("characterSheetDialog");
        fey_22.setEnableResizeEvents(true);
        fey_22.a(fzq_0.tKh, new csy_2(fey_22), true);
    }

    private void ePl() {
        fhs_2 fhs_22 = fyw_0.gqw().gqC().uR("worldAndFightBarDialog");
        if (fhs_22 == null) {
            return;
        }
        fes_2 fes_22 = (fes_2)fhs_22.uH("fightInfoBtn");
        if (fes_22 == null) {
            return;
        }
        fes_22.getAppearance().x(fsa_2.class);
    }

    public static void ke(boolean bl) {
        fse_1.gFu().f("displayAllCharacteristics", bl);
        aub_0.cVb().b((byte)3, "displayAllCharacteristics", bl);
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            bgl_0 bgl_02;
            bsj_0 bsj_02 = aue_0.cVJ().cVK().dkZ();
            TIntObjectIterator tIntObjectIterator = nIT.iterator();
            while (tIntObjectIterator.hasNext()) {
                tIntObjectIterator.advance();
                bgl_02 = (bgl_0)tIntObjectIterator.value();
                bgl_02.dcP().dlE().dqS();
                if (bsj_02 == null || !(bgl_02 instanceof blp_0)) continue;
                ((blp_0)bgl_02).dkf();
            }
            tIntObjectIterator = nIU.iterator();
            while (tIntObjectIterator.hasNext()) {
                tIntObjectIterator.advance();
                bgl_02 = (bgl_0)tIntObjectIterator.value();
                bgl_02.dcP().dlE().dqS();
                if (bsj_02 == null || !(bgl_02 instanceof blp_0)) continue;
                ((blp_0)bgl_02).dkf();
            }
            if (bsj_02 != null) {
                bsj_02.b(this);
            }
            fse_1.gFu().vX("characterSheetSecondMode");
            fyw_0.gqw().tc("wakfu.characterSheet");
            cAY.eHc().nP(600013L);
            cfx_2.mWj.eKy();
        }
        super.b(aye_22, bl);
    }

    public void dkf() {
        bgl_0 bgl_02;
        TIntObjectIterator tIntObjectIterator = nIT.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            bgl_02 = (bgl_0)tIntObjectIterator.value();
            if (!(bgl_02 instanceof blp_0)) continue;
            fse_1.gFu().a((aef_2)bgl_02, bgy.ibP);
        }
        tIntObjectIterator = nIU.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            bgl_02 = (bgl_0)tIntObjectIterator.value();
            if (!(bgl_02 instanceof blp_0)) continue;
            fse_1.gFu().a((aef_2)bgl_02, bgy.ibP);
        }
    }

    public void t(bsj_0 bsj_02) {
        if (bsj_02 == null) {
            return;
        }
        bsj_02.a(this);
    }

    @Override
    public void B(exP exP2) {
        if (!(exP2 instanceof bhx_0)) {
            return;
        }
        bhx_0 bhx_02 = (bhx_0)exP2;
        if (!bhx_02.dkQ()) {
            return;
        }
        if (bhx_02.aFW() != 5) {
            return;
        }
        bgl_0 bgl_02 = csx_1.MC(bhx_02.aWP());
        if (bgl_02 == null) {
            return;
        }
        ((blp_0)bgl_02).dtC();
    }

    @Override
    public void G(exP exP2) {
        if (!(exP2 instanceof bhx_0)) {
            return;
        }
        bhx_0 bhx_02 = (bhx_0)exP2;
        if (!bhx_02.dkQ()) {
            return;
        }
        if (bhx_02.aFW() != 5) {
            return;
        }
        bgl_0 bgl_02 = csx_1.MC(bhx_02.aWP());
        if (bgl_02 == null) {
            return;
        }
        ((blp_0)bgl_02).dkf();
    }
}

