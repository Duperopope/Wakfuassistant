/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankamagames.steam.common.SteamUtils
 *  com.ankamagames.steam.wrapper.CSteamID
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.commons.lang3.ArrayUtils
 *  org.apache.log4j.Logger
 */
import com.ankamagames.steam.common.SteamUtils;
import com.ankamagames.steam.wrapper.CSteamID;
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.io.IOException;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.log4j.Logger;

/*
 * Renamed from ccv
 */
public class ccv_1
implements adi_1 {
    protected static final Logger lOT = Logger.getLogger(ccv_1.class);
    private static final ccv_1 lOU = new ccv_1();
    private static String lOV;

    public static ccv_1 etD() {
        return lOU;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 539: {
                ciy_0 ciy_02 = (ciy_0)aam_22;
                ccv_1.a(ciy_02);
                return false;
            }
            case 491: {
                ciw_0 ciw_02 = (ciw_0)aam_22;
                byte by = ciw_02.evi();
                String string = "error.connection.nicknameNotSet";
                switch (by) {
                    case 13: {
                        string = "error.connection.nicknameNotSet";
                        break;
                    }
                    case 14: {
                        string = "error.connection.nicknameInvalidContent";
                        break;
                    }
                    case 15: {
                        string = "error.connection.nicknameDuplicate";
                        break;
                    }
                    case 16: {
                        string = "error.connection.nicknameTooLong";
                        break;
                    }
                    case 17: {
                        string = "error.connection.nicknameTooShort";
                        break;
                    }
                    case 18: {
                        string = "error.connection.nicknameEqualsLogin";
                        break;
                    }
                    case 19: {
                        string = "error.connection.nicknameInvalidFormat";
                    }
                }
                ccj_2.g("nicknameChoiceDialog", 8448L);
                fiq_2.gCw().d(fik_2.gBZ().a(fin_2.uCs).l(string, new Object[0]).vG(ccp_2.mRF.byf()).abQ(2));
                return false;
            }
            case 563: {
                cit_0 cit_02 = (cit_0)aam_22;
                aue_0.cVJ().cV((byte)80);
                aue_0.cVJ().a(auz_0.gzn);
                if (cit_02.evh()) {
                    aue_0.cVJ().ja(true);
                    byte[] byArray = cit_02.evg();
                    if (byArray != null) {
                        aUQ aUQ2 = new aUQ();
                        aUQ2.as(byArray);
                        aue_0.cVJ().a(aUQ2);
                        byf_2.b(aUQ2);
                        ((bsg_1)aie_0.cfn().bmH()).a((afe)bsn_1.lkc, false);
                        aUm.cUI().p("admin", !evm_2.c(aUQ2.cWq(), evm_2.osZ));
                        fse_1.gFu().f("isAdmin", !evm_2.c(aUQ2.cWq(), evm_2.osZ));
                        boolean bl = evm_2.b(aUQ2.cWq(), evn_2.otW);
                        fse_1.gFu().f("hasDebugRights", bl);
                        if (bl) {
                            aeQ.bwP().bwR();
                        }
                    }
                    aue_0.cVJ().b(this);
                    aue_0.cVJ().b(csn_2.eNY());
                    aue_0.cVJ().a(cdT.eui());
                    ccz_1.etG().jc(false);
                    aue_0.cVJ().a(ccz_1.etG());
                    aue_0.cVJ().a(ccd_1.etO());
                    aue_0.cVJ().a(cct_1.etY());
                    aue_0.cVJ().a(ccy_1.lPa);
                    aue_0.cVJ().a(cdS.lRk);
                    aue_0.cVJ().a(ccn_1.etU());
                    aue_0.cVJ().a(aXJ.hxe);
                    bgn_1.dUk().dUl();
                } else {
                    String string;
                    Object[] objectArray = new Object[]{};
                    byte by = (byte)(cit_02.evi() & 0xFF);
                    if (by == 13 || by == 15 || by == 18 || by == 14 || by == 19 || by == 16 || by == 17) {
                        aue_0.cVJ().a(csn_2.eNY());
                        ccv_1.cW(by);
                        return false;
                    }
                    if (by == 24) {
                        this.etE();
                        return false;
                    }
                    switch (by) {
                        case 124: {
                            string = "anonymous.ip.forbidden";
                            break;
                        }
                        case 110: {
                            string = "error.connection.account.unsecured";
                            break;
                        }
                        case 113: {
                            string = "error.connection.account.no.2fa";
                            break;
                        }
                        case 111: {
                            string = "error.connection.account.unsecuredMail";
                            break;
                        }
                        case 112: {
                            string = "error.connection.account.unsecuredGsm";
                            break;
                        }
                        case 114: {
                            string = "error.connection.account.noIdentity";
                            break;
                        }
                        case 121: {
                            string = "error.connection.ip.threshold";
                            objectArray = new Object[]{cit_02.evj()};
                            break;
                        }
                        case 122: {
                            string = "error.connection.no.mac.address.provided";
                            break;
                        }
                        case 123: {
                            string = "error.connection.mac.already.in.use";
                            break;
                        }
                        case 8: {
                            string = "error.connection.account.locked";
                            break;
                        }
                        case 2: {
                            string = "error.connection.invalidLogin";
                            break;
                        }
                        case 3: {
                            string = "error.connection.alreadyConnected";
                            break;
                        }
                        case 4: {
                            string = "error.connection.saveInProgress";
                            break;
                        }
                        case 60: {
                            string = "error.connection.earlyAccess";
                            break;
                        }
                        case 61: {
                            string = "error.connection.closedBeta";
                            break;
                        }
                        case 9: {
                            string = "error.connection.locked";
                            break;
                        }
                        case 10: {
                            string = "error.connection.loginServerDown";
                            break;
                        }
                        case 11: {
                            string = "error.connection.tooManyConnection";
                            break;
                        }
                        case 12: {
                            string = "error.connection.invalidPartner";
                            break;
                        }
                        case 5: {
                            string = "error.connection.banned";
                            int n = cit_02.evj();
                            int n2 = n / 1440;
                            int n3 = (n -= n2 * 60 * 24) / 60;
                            n -= n3 * 60;
                            if (n2 > 0) {
                                objectArray = new Object[]{n2, n3, 0};
                                break;
                            }
                            objectArray = new Object[]{0, n3, n};
                            break;
                        }
                        case 20: {
                            string = "error.connection.invalidEmail";
                            try {
                                String string2 = auc_0.cVq().bS("accountValidationUrl");
                                String string3 = String.format(string2, aum_0.cWf().aUXX().aUR());
                                objectArray = new Object[]{string3};
                            }
                            catch (fu_0 fu_02) {
                                lOT.error((Object)"Impossible de r\u00e9cup\u00e9rer la propri\u00e9t\u00e9 de validation d'e-mail");
                            }
                            break;
                        }
                        case 22: {
                            string = "error.connection.OTPAuthFailed";
                            try {
                                String string4 = auc_0.cVq().bS("accountValidationUrl");
                                String string5 = String.format(string4, aum_0.cWf().aUXX().aUR());
                                objectArray = new Object[]{string5};
                            }
                            catch (fu_0 fu_03) {
                                lOT.error((Object)"Impossible de r\u00e9cup\u00e9rer la propri\u00e9t\u00e9 de validation d'e-mail");
                            }
                            break;
                        }
                        case 21: {
                            string = "error.connection.accountModeration";
                            break;
                        }
                        case 40: {
                            string = "error.connection.invalidLogin";
                            break;
                        }
                        case 42: {
                            string = "error.connection.invalidToken";
                            break;
                        }
                        case 27: 
                        case 28: 
                        case 29: 
                        case 30: 
                        case 31: 
                        case 32: 
                        case 33: 
                        case 34: 
                        case 35: 
                        case 36: 
                        case 37: 
                        case 38: 
                        case 39: 
                        case 43: {
                            string = "steam.genericError";
                            objectArray = new Object[]{String.valueOf(by)};
                            break;
                        }
                        default: {
                            string = "error.connection.invalidLogin";
                        }
                    }
                    this.a(aam_22, string, objectArray);
                    cdd_2.fadeLogonDialogBackIn();
                }
                return false;
            }
            case 430: {
                this.a(aam_22, "error.connection.worldLoading", new Object[0]);
                return false;
            }
            case 15: {
                ny_0 ny_02 = (ny_0)aam_22;
                this.a(aam_22, "error.connection.loginServerDown", ny_02.aVT());
                return false;
            }
            case 488: {
                ciC ciC2 = (ciC)aam_22;
                byte by = ciC2.evi();
                String string = ciC2.bDO();
                lOT.info((Object)("Authentication token received from dispatch server : " + string + " errorCode=" + by));
                if (by == 0) {
                    ccv_1.ok(string);
                }
                fiu_1.uCW.N("serverSelectionLock", true);
                return false;
            }
            case 559: {
                ciu_0 ciu_02 = (ciu_0)aam_22;
                byte by = ciu_02.evk();
                cCE.mAG.jI(false);
                lOT.info((Object)("Authentication result " + by));
                Object[] objectArray = null;
                switch (by) {
                    case 0: {
                        aup_0.a(ciu_02.cWj(), ciu_02.cWk(), ciu_02.cWm(), ciu_02.cWn());
                        aub_0.cVb().kr(ciu_02.etm());
                        fse_1.gFu().f("account.name", ciu_02.etm());
                        fse_1.gFu().f("account.community", new auv_0(ciu_02.cWk()));
                        bsg_1 bsg_12 = (bsg_1)aie_0.cfn().bmH();
                        boolean bl = bsg_12.a(bsn_1.liw);
                        bsg_12.a((afe)bsn_1.lix, bl ? ciu_02.etm() : "");
                        if (bsg_12.bxn() != null && ((bsy_1)bsg_12.bxn()).xl() != ciu_02.xl()) {
                            bsg_12.a((bsy_1)null);
                        }
                        if (bsg_12.bxn() == null) {
                            bsy_1 bsy_12 = new bsy_1(ciu_02.xl());
                            bsg_12.a(bsy_12);
                            try {
                                bsy_12.buq();
                            }
                            catch (IOException iOException) {
                                lOT.warn((Object)"Error occurred on load of AccountPreferenceStore", (Throwable)iOException);
                            }
                        }
                        aue_0.cVJ().kS(null);
                        ccv_1.etF();
                        return false;
                    }
                    case 13: 
                    case 14: 
                    case 15: 
                    case 16: 
                    case 17: 
                    case 18: 
                    case 19: {
                        ccv_1.cW(by);
                        return false;
                    }
                    case 20: {
                        try {
                            String string = auc_0.cVq().bS("accountValidationUrl");
                            objectArray = new String[]{String.format(string, aum_0.cWf().aUXX().aUR())};
                        }
                        catch (fu_0 fu_04) {
                            lOT.error((Object)"Impossible de r\u00e9cup\u00e9rer la propri\u00e9t\u00e9 de validation d'e-mail", (Throwable)fu_04);
                        }
                        break;
                    }
                    default: {
                        fiu_1.uCW.N("loginLock", true);
                        crh_2.eML().bCj();
                        this.a(aam_22, bNI.cD((byte)by).kIg, new Object[0]);
                        return false;
                    }
                }
                fiu_1.uCW.N("loginLock", true);
                crh_2.eML().bCj();
                this.a(aam_22, bNI.cD((byte)by).kIg, ArrayUtils.isEmpty((Object[])objectArray) ? ArrayUtils.EMPTY_STRING_ARRAY : objectArray);
                return false;
            }
            case 427: {
                cix_0 cix_02 = (cix_0)aam_22;
                TIntObjectHashMap<ezt_0> tIntObjectHashMap = cix_02.evm();
                TIntObjectHashMap<ezy_0> tIntObjectHashMap2 = cix_02.evn();
                crm_2.eMO().eMR();
                TIntObjectIterator tIntObjectIterator = tIntObjectHashMap.iterator();
                while (tIntObjectIterator.hasNext()) {
                    tIntObjectIterator.advance();
                    ezt_0 ezt_02 = (ezt_0)tIntObjectIterator.value();
                    ezy_0 ezy_02 = (ezy_0)tIntObjectHashMap2.get(ezt_02.d());
                    crm_2.eMO().d(ezt_02, ezy_02);
                }
                bgr_0.dmo().bl(cix_02.evo());
                crh_2.eML().bCj();
                if (aue_0.cVJ().c(crm_2.eMO())) {
                    crm_2.eMO().eMS();
                } else {
                    aue_0.cVJ().a(crm_2.eMO());
                }
                return false;
            }
            case 473: {
                ciB ciB2 = (ciB)aam_22;
                long l = ciB2.evp();
                byte[] byArray = ciB2.evq();
                csn_2.eNY().c(l, byArray);
                this.etE();
                return false;
            }
            case 562: {
                ciA ciA2 = (ciA)aam_22;
                btc_2.eoi().a(ciA2.evs());
                if (aue_0.cVJ().c(crm_2.eMO())) {
                    crm_2.eMO().enN();
                }
                return false;
            }
        }
        return true;
    }

    private void etE() {
        fiq_2.gCw().d(fik_2.gBY().l(aum_0.cWf().c("steamLinkAccountQuestion", new Object[0]), new Object[0]).vG(ccp_2.mRE.byf()).abQ(2).a(fil_2.gCq()).a((n, string) -> {
            if (n == 400) {
                aue_0.cVJ().a(auz_0.gzk);
                ccj_2.g("steamLinkAccountDialog", 8448L);
            } else if (n == 200) {
                CSteamID cSteamID = bMX.kAi.efo();
                cig_0 cig_02 = new cig_0();
                cig_02.os(aum_0.cWf().aUXX().aUR());
                cig_02.mX(SteamUtils.serializeSteamId((CSteamID)cSteamID));
                aue_0.cVJ().etu().d(cig_02);
            } else {
                crh_2.eML().bCj();
                aue_0.cVJ().kH("Cancel Steam Link");
                aue_0.cVJ().a(csn_2.eNY());
            }
        }));
    }

    private static void ok(String string) {
        lOV = string;
        crm_2.eMO().eMU();
    }

    private static void etF() {
        if (aue_0.cVJ().cVP() == auz_0.gzk) {
            aue_0.cVJ().a(auz_0.gzl);
        }
        aue_0.cVJ().etu().d(new cim_0());
        aue_0.cVJ().b(csn_2.eNY());
        fse_1.gFu().vX("account.password");
    }

    private static void a(ciy_0 ciy_02) {
        long l = ciy_02.evp();
        byte[] byArray = ciy_02.evq();
        cam_0.mnz.en(byArray);
        switch (aue_0.cVJ().cVP()) {
            case gzm: {
                cif_0 cif_02 = new cif_0();
                cif_02.kS(lOV);
                cif_02.or(auw_0.cUV().orElse(""));
                aue_0.cVJ().etu().d(cif_02);
                break;
            }
            case gzk: {
                lOT.error((Object)"Pouet public key receive through steam link !!!");
                break;
            }
            case gzl: {
                exu_0 exu_02 = exu_0.fft();
                boolean bl = exu_02.ffu();
                if (bl) {
                    CSteamID cSteamID = bMX.kAi.efo();
                    cih_0 cih_02 = new cih_0();
                    cih_02.mX(SteamUtils.serializeSteamId((CSteamID)cSteamID));
                    cih_02.a(bMX.kAi.efi().getAuthTicket());
                    csn_2.eNY().c(l, byArray);
                    aue_0.cVJ().etu().d(cih_02);
                    break;
                }
                ccv_1.mO(l);
                break;
            }
        }
    }

    private static void mO(long l) {
        if (fse_1.gFu().dp("demo")) {
            byte[] byArray = aue_0.iy(l);
            cii_0 cii_02 = new cii_0();
            cii_02.ei(byArray);
            aue_0.cVJ().etu().d(cii_02);
            return;
        }
        String string = aue_0.cVJ().bDO();
        if (string != null) {
            byte[] byArray = aue_0.iz(l);
            cik_0 cik_02 = new cik_0();
            cik_02.ej(byArray);
            aue_0.cVJ().etu().d(cik_02);
            return;
        }
        lOT.error((Object)"No token available. Cannot send Authentication request");
    }

    private static void cW(byte by) {
        String string = "error.connection.nicknameNotSet";
        switch (by) {
            case 13: {
                string = "error.connection.nicknameNotSet";
                break;
            }
            case 14: {
                string = "error.connection.nicknameInvalidContent";
                break;
            }
            case 15: {
                string = "error.connection.nicknameDuplicate";
                break;
            }
            case 16: {
                string = "error.connection.nicknameTooLong";
                break;
            }
            case 17: {
                string = "error.connection.nicknameTooShort";
                break;
            }
            case 18: {
                string = "error.connection.nicknameEqualsLogin";
                break;
            }
            case 19: {
                string = "error.connection.nicknameInvalidFormat";
            }
        }
        ccj_2.g("nicknameChoiceDialog", 8448L);
        fiq_2.gCw().d(fik_2.gBZ().a(fin_2.uCs).l(string, new Object[0]).vG(ccp_2.mRF.byf()).abQ(2));
    }

    protected final void a(aam_2 aam_22, String string, Object ... objectArray) {
        aue_0.cVJ().oi(null);
        aue_0.cVJ().oj(null);
        aue_0.cVJ().kS(null);
        ((aye_2)aam_22.bUg()).b(this);
        fiq_2.gCw().d(fik_2.gBZ().a(fin_2.uCs).l(string, objectArray).vG(ccp_2.mRF.byf()).abQ(2));
        aue_0.cVJ().kH("Login Error");
        if (aue_0.cVJ().c(crm_2.eMO())) {
            aue_0.cVJ().b(crm_2.eMO());
        }
        aue_0.cVJ().a(csn_2.eNY());
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            lOV = null;
        }
    }
}

