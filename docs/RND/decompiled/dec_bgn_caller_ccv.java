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

public class ccv
implements aDI {
    protected static final Logger lOT = Logger.getLogger(ccv.class);
    private static final ccv lOU = new ccv();
    private static String lOV;

    public static ccv etD() {
        return lOU;
    }

    @Override
    public boolean b(aAM aAM2) {
        switch (aAM2.d()) {
            case 539: {
                ciy ciy2 = (ciy)aAM2;
                ccv.a(ciy2);
                return false;
            }
            case 491: {
                ciw ciw2 = (ciw)aAM2;
                byte by = ciw2.evi();
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
                cCJ.g("nicknameChoiceDialog", 8448L);
                fIQ.gCw().d(fIK.gBZ().a(fIN.uCs).l(string, new Object[0]).vG(cCP.mRF.byf()).abQ(2));
                return false;
            }
            case 563: {
                cit cit2 = (cit)aAM2;
                aUE.cVJ().cV((byte)80);
                aUE.cVJ().a(aUz.gzn);
                if (cit2.evh()) {
                    aUE.cVJ().ja(true);
                    byte[] byArray = cit2.evg();
                    if (byArray != null) {
                        aUQ aUQ2 = new aUQ();
                        aUQ2.as(byArray);
                        aUE.cVJ().a(aUQ2);
                        bYf.b(aUQ2);
                        ((bSG)aIe.cfn().bmH()).a((afe)bSN.lkc, false);
                        aUm.cUI().p("admin", !evm.c(aUQ2.cWq(), evm.osZ));
                        fSe.gFu().f("isAdmin", !evm.c(aUQ2.cWq(), evm.osZ));
                        boolean bl = evm.b(aUQ2.cWq(), evn.otW);
                        fSe.gFu().f("hasDebugRights", bl);
                        if (bl) {
                            aeQ.bwP().bwR();
                        }
                    }
                    aUE.cVJ().b(this);
                    aUE.cVJ().b(cSn.eNY());
                    aUE.cVJ().a(cdT.eui());
                    ccz.etG().jc(false);
                    aUE.cVJ().a(ccz.etG());
                    aUE.cVJ().a(ccD.etO());
                    aUE.cVJ().a(ccT.etY());
                    aUE.cVJ().a(ccy.lPa);
                    aUE.cVJ().a(cdS.lRk);
                    aUE.cVJ().a(ccN.etU());
                    aUE.cVJ().a(aXJ.hxe);
                    bGN.dUk().dUl();
                } else {
                    String string;
                    Object[] objectArray = new Object[]{};
                    byte by = (byte)(cit2.evi() & 0xFF);
                    if (by == 13 || by == 15 || by == 18 || by == 14 || by == 19 || by == 16 || by == 17) {
                        aUE.cVJ().a(cSn.eNY());
                        ccv.cW(by);
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
                            objectArray = new Object[]{cit2.evj()};
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
                            int n = cit2.evj();
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
                                String string2 = aUC.cVq().bS("accountValidationUrl");
                                String string3 = String.format(string2, aUM.cWf().aUXX().aUR());
                                objectArray = new Object[]{string3};
                            }
                            catch (Fu fu) {
                                lOT.error((Object)"Impossible de r\u00e9cup\u00e9rer la propri\u00e9t\u00e9 de validation d'e-mail");
                            }
                            break;
                        }
                        case 22: {
                            string = "error.connection.OTPAuthFailed";
                            try {
                                String string4 = aUC.cVq().bS("accountValidationUrl");
                                String string5 = String.format(string4, aUM.cWf().aUXX().aUR());
                                objectArray = new Object[]{string5};
                            }
                            catch (Fu fu) {
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
                    this.a(aAM2, string, objectArray);
                    cDd.fadeLogonDialogBackIn();
                }
                return false;
            }
            case 430: {
                this.a(aAM2, "error.connection.worldLoading", new Object[0]);
                return false;
            }
            case 15: {
                Ny ny = (Ny)aAM2;
                this.a(aAM2, "error.connection.loginServerDown", ny.aVT());
                return false;
            }
            case 488: {
                ciC ciC2 = (ciC)aAM2;
                byte by = ciC2.evi();
                String string = ciC2.bDO();
                lOT.info((Object)("Authentication token received from dispatch server : " + string + " errorCode=" + by));
                if (by == 0) {
                    ccv.ok(string);
                }
                fIU.uCW.N("serverSelectionLock", true);
                return false;
            }
            case 559: {
                ciu ciu2 = (ciu)aAM2;
                byte by = ciu2.evk();
                cCE.mAG.jI(false);
                lOT.info((Object)("Authentication result " + by));
                Object[] objectArray = null;
                switch (by) {
                    case 0: {
                        aUP.a(ciu2.cWj(), ciu2.cWk(), ciu2.cWm(), ciu2.cWn());
                        aUB.cVb().kr(ciu2.etm());
                        fSe.gFu().f("account.name", ciu2.etm());
                        fSe.gFu().f("account.community", new aUv(ciu2.cWk()));
                        bSG bSG2 = (bSG)aIe.cfn().bmH();
                        boolean bl = bSG2.a(bSN.liw);
                        bSG2.a((afe)bSN.lix, bl ? ciu2.etm() : "");
                        if (bSG2.bxn() != null && ((bSy)bSG2.bxn()).xl() != ciu2.xl()) {
                            bSG2.a((bSy)null);
                        }
                        if (bSG2.bxn() == null) {
                            bSy bSy2 = new bSy(ciu2.xl());
                            bSG2.a(bSy2);
                            try {
                                bSy2.buq();
                            }
                            catch (IOException iOException) {
                                lOT.warn((Object)"Error occurred on load of AccountPreferenceStore", (Throwable)iOException);
                            }
                        }
                        aUE.cVJ().kS(null);
                        ccv.etF();
                        return false;
                    }
                    case 13: 
                    case 14: 
                    case 15: 
                    case 16: 
                    case 17: 
                    case 18: 
                    case 19: {
                        ccv.cW(by);
                        return false;
                    }
                    case 20: {
                        try {
                            String string = aUC.cVq().bS("accountValidationUrl");
                            objectArray = new String[]{String.format(string, aUM.cWf().aUXX().aUR())};
                        }
                        catch (Fu fu) {
                            lOT.error((Object)"Impossible de r\u00e9cup\u00e9rer la propri\u00e9t\u00e9 de validation d'e-mail", (Throwable)fu);
                        }
                        break;
                    }
                    default: {
                        fIU.uCW.N("loginLock", true);
                        cRH.eML().bCj();
                        this.a(aAM2, bNI.cD((byte)by).kIg, new Object[0]);
                        return false;
                    }
                }
                fIU.uCW.N("loginLock", true);
                cRH.eML().bCj();
                this.a(aAM2, bNI.cD((byte)by).kIg, ArrayUtils.isEmpty((Object[])objectArray) ? ArrayUtils.EMPTY_STRING_ARRAY : objectArray);
                return false;
            }
            case 427: {
                cix cix2 = (cix)aAM2;
                TIntObjectHashMap<ezT> tIntObjectHashMap = cix2.evm();
                TIntObjectHashMap<ezY> tIntObjectHashMap2 = cix2.evn();
                cRM.eMO().eMR();
                TIntObjectIterator tIntObjectIterator = tIntObjectHashMap.iterator();
                while (tIntObjectIterator.hasNext()) {
                    tIntObjectIterator.advance();
                    ezT ezT2 = (ezT)tIntObjectIterator.value();
                    ezY ezY2 = (ezY)tIntObjectHashMap2.get(ezT2.d());
                    cRM.eMO().d(ezT2, ezY2);
                }
                bgR.dmo().bl(cix2.evo());
                cRH.eML().bCj();
                if (aUE.cVJ().c(cRM.eMO())) {
                    cRM.eMO().eMS();
                } else {
                    aUE.cVJ().a(cRM.eMO());
                }
                return false;
            }
            case 473: {
                ciB ciB2 = (ciB)aAM2;
                long l = ciB2.evp();
                byte[] byArray = ciB2.evq();
                cSn.eNY().c(l, byArray);
                this.etE();
                return false;
            }
            case 562: {
                ciA ciA2 = (ciA)aAM2;
                bTC.eoi().a(ciA2.evs());
                if (aUE.cVJ().c(cRM.eMO())) {
                    cRM.eMO().enN();
                }
                return false;
            }
        }
        return true;
    }

    private void etE() {
        fIQ.gCw().d(fIK.gBY().l(aUM.cWf().c("steamLinkAccountQuestion", new Object[0]), new Object[0]).vG(cCP.mRE.byf()).abQ(2).a(fIL.gCq()).a((n, string) -> {
            if (n == 400) {
                aUE.cVJ().a(aUz.gzk);
                cCJ.g("steamLinkAccountDialog", 8448L);
            } else if (n == 200) {
                CSteamID cSteamID = bMX.kAi.efo();
                cig cig2 = new cig();
                cig2.os(aUM.cWf().aUXX().aUR());
                cig2.mX(SteamUtils.serializeSteamId((CSteamID)cSteamID));
                aUE.cVJ().etu().d(cig2);
            } else {
                cRH.eML().bCj();
                aUE.cVJ().kH("Cancel Steam Link");
                aUE.cVJ().a(cSn.eNY());
            }
        }));
    }

    private static void ok(String string) {
        lOV = string;
        cRM.eMO().eMU();
    }

    private static void etF() {
        if (aUE.cVJ().cVP() == aUz.gzk) {
            aUE.cVJ().a(aUz.gzl);
        }
        aUE.cVJ().etu().d(new cim());
        aUE.cVJ().b(cSn.eNY());
        fSe.gFu().vX("account.password");
    }

    private static void a(ciy ciy2) {
        long l = ciy2.evp();
        byte[] byArray = ciy2.evq();
        cAm.mnz.en(byArray);
        switch (aUE.cVJ().cVP()) {
            case gzm: {
                cif cif2 = new cif();
                cif2.kS(lOV);
                cif2.or(aUw.cUV().orElse(""));
                aUE.cVJ().etu().d(cif2);
                break;
            }
            case gzk: {
                lOT.error((Object)"Pouet public key receive through steam link !!!");
                break;
            }
            case gzl: {
                exu exu2 = exu.fft();
                boolean bl = exu2.ffu();
                if (bl) {
                    CSteamID cSteamID = bMX.kAi.efo();
                    cih cih2 = new cih();
                    cih2.mX(SteamUtils.serializeSteamId((CSteamID)cSteamID));
                    cih2.a(bMX.kAi.efi().getAuthTicket());
                    cSn.eNY().c(l, byArray);
                    aUE.cVJ().etu().d(cih2);
                    break;
                }
                ccv.mO(l);
                break;
            }
        }
    }

    private static void mO(long l) {
        if (fSe.gFu().dp("demo")) {
            byte[] byArray = aUE.iy(l);
            cii cii2 = new cii();
            cii2.ei(byArray);
            aUE.cVJ().etu().d(cii2);
            return;
        }
        String string = aUE.cVJ().bDO();
        if (string != null) {
            byte[] byArray = aUE.iz(l);
            cik cik2 = new cik();
            cik2.ej(byArray);
            aUE.cVJ().etu().d(cik2);
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
        cCJ.g("nicknameChoiceDialog", 8448L);
        fIQ.gCw().d(fIK.gBZ().a(fIN.uCs).l(string, new Object[0]).vG(cCP.mRF.byf()).abQ(2));
    }

    protected final void a(aAM aAM2, String string, Object ... objectArray) {
        aUE.cVJ().oi(null);
        aUE.cVJ().oj(null);
        aUE.cVJ().kS(null);
        ((ayE)aAM2.bUg()).b(this);
        fIQ.gCw().d(fIK.gBZ().a(fIN.uCs).l(string, objectArray).vG(cCP.mRF.byf()).abQ(2));
        aUE.cVJ().kH("Login Error");
        if (aUE.cVJ().c(cRM.eMO())) {
            aUE.cVJ().b(cRM.eMO());
        }
        aUE.cVJ().a(cSn.eNY());
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }

    @Override
    public void b(ayE ayE2, boolean bl) {
        if (!bl) {
            lOV = null;
        }
    }
}
