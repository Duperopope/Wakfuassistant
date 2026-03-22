/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankamagames.steam.common.SteamUtils
 *  com.ankamagames.steam.wrapper.CSteamID
 *  org.apache.log4j.Logger
 */
import com.ankamagames.steam.common.SteamUtils;
import com.ankamagames.steam.wrapper.CSteamID;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from cSn
 */
public class csn_2
implements adi_1 {
    private static final Logger nFq = Logger.getLogger(csn_2.class);
    private static final csn_2 nFr = new csn_2();
    private long lUU;
    private byte[] nFs;

    public static csn_2 eNY() {
        return nFr;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 17064: {
                if (!bMX.kAi.blc()) {
                    return false;
                }
                this.eNZ();
                return false;
            }
            case 18725: {
                daF daF2 = (daF)aam_22;
                String string = daF2.etm();
                bsg_1 bsg_12 = (bsg_1)aie_0.cfn().bmH();
                bsg_12.a((afe)bsn_1.liw, (boolean)daF2.eZX());
                bsg_12.a((afe)bsn_1.lix, daF2.eZX() != false ? string : "");
                fse_1 fse_12 = fse_1.gFu();
                fse_12.f("account.name", string == null ? "" : string);
                aue_0 aue_02 = aue_0.cVJ();
                aue_02.oi(string);
                aue_02.oj(daF2.etn());
                aue_02.ja(false);
                fiu_1.uCW.N("loginLock", false);
                if (aue_0.cVJ().cVP() != auz_0.gzk) {
                    aue_0.cVJ().a(auz_0.gzl);
                    ArrayList<oo_0> arrayList = auc_0.cVq().cVI();
                    aue_0.cVJ().B(arrayList);
                } else {
                    fyw_0.gqw().tl("steamLinkAccountDialog");
                    cam_0.mnz.en(this.nFs);
                    byte[] byArray = aue_0.iy(this.lUU);
                    cil_0 cil_02 = new cil_0();
                    cil_02.ei(byArray);
                    CSteamID cSteamID = bMX.kAi.efo();
                    cil_02.mX(SteamUtils.serializeSteamId((CSteamID)cSteamID));
                    cil_02.a(bMX.kAi.efi().getAuthTicket());
                    aue_0.cVJ().etu().d(cil_02);
                }
                return false;
            }
            case 17993: {
                crh_2.eML().cB(false).g(aum_0.cWf().c("logon.progress", new Object[0]), 0);
                daD daD2 = (daD)aam_22;
                String string = daD2.etm();
                bsg_1 bsg_13 = (bsg_1)aie_0.cfn().bmH();
                bsg_13.a((afe)bsn_1.liw, (boolean)daD2.eZX());
                bsg_13.a((afe)bsn_1.lix, daD2.eZX() != false ? string : "");
                fse_1 fse_13 = fse_1.gFu();
                fse_13.f("account.name", string == null ? "" : string);
                aue_0 aue_03 = aue_0.cVJ();
                aue_03.oi(string);
                aue_03.oj(daD2.etn());
                aue_03.ja(false);
                fiu_1.uCW.N("loginLock", false);
                aue_03.B(daD2.eZW());
                return false;
            }
            case 16834: {
                ama_1 ama_12 = (ama_1)aam_22;
                String string = ama_12.bCt();
                cij_0 cij_02 = new cij_0();
                cij_02.ot(string);
                aue_0.cVJ().etu().d(cij_02);
                return false;
            }
            case 19079: {
                daE daE2 = (daE)aam_22;
                aum_0.cWf().d(daE2.aUXX());
                aie_0.cfn().bmX();
                aie_0.cfn().start();
                dae_0.cV((short)16478);
                return false;
            }
            case 16478: {
                return false;
            }
            case 17098: {
                CSteamID cSteamID = bMX.kAi.efo();
                cig_0 cig_02 = new cig_0();
                cig_02.os(aum_0.cWf().aUXX().aUR());
                cig_02.mX(SteamUtils.serializeSteamId((CSteamID)cSteamID));
                aue_0.cVJ().etu().d(cig_02);
                return false;
            }
            case 19069: {
                crh_2.eML().bCj();
                aue_0.cVJ().kH("Cancel Steam Link");
                aue_0.cVJ().a(csn_2.eNY());
                return false;
            }
        }
        return true;
    }

    private void eNZ() {
        fiu_1.uCW.N("loginLock", false);
        aue_0.cVJ().a(auz_0.gzl);
        ArrayList<oo_0> arrayList = auc_0.cVq().cVI();
        aue_0.cVJ().B(arrayList);
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
        if (bl) {
            return;
        }
        fse_1.gFu().f("languages", aum_0.cWf().cWg());
        fse_1.gFu().f("currentLanguage", aum_0.cWf().cWh());
        fiu_1.uCW.vN("loginLock");
        if (!aue_0.cVJ().c(cvz_1.eUB())) {
            aue_0.cVJ().a(cvz_1.eUB());
        } else {
            dae_0.cV((short)17273);
        }
        if (!aie_0.cfn().cfI()) {
            czc_1.j("logonDialog", 8192L);
        }
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (ayf_22 != null && ayf_22.bSp().bSr() && bgt_02 != null && bgt_02.fgV()) {
            nFq.error((Object)"Somehow, authentication frame got pushed when we were still in game", (Throwable)new Exception("Here comes the stack trace"));
        }
        cAY.eHc().eGX();
        bon.dAK().setEnabled(false);
        if (!aue_0.cVJ().c(cyt_1.eXX())) {
            aue_0.cVJ().a(cyt_1.eXX());
        }
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            cAY.eHc().e(1.0f, 1000);
            fyw_0.gqw().tl("logonDialog");
            fiu_1.uCW.vO("loginLock");
        }
    }

    public void c(long l, byte[] byArray) {
        this.lUU = l;
        this.nFs = byArray;
    }
}

