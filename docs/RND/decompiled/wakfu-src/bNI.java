/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public final class bNI
extends Enum<bNI> {
    public static final /* enum */ bNI kHE = new bNI(0, null);
    public static final /* enum */ bNI kHF = new bNI(7, "error.connection.unknown");
    public static final /* enum */ bNI kHG = new bNI(5, "error.connection.banned");
    public static final /* enum */ bNI kHH = new bNI(8, "error.connection.account.locked");
    public static final /* enum */ bNI kHI = new bNI(22, "error.connection.OTPAuthFailed");
    public static final /* enum */ bNI kHJ = new bNI(2, "error.connection.invalidLogin");
    public static final /* enum */ bNI kHK = new bNI(3, "error.connection.alreadyConnected");
    public static final /* enum */ bNI kHL = new bNI(12, "error.connection.invalidPartner");
    public static final /* enum */ bNI kHM = new bNI(20, "error.connection.invalidEmail");
    public static final /* enum */ bNI kHN = new bNI(25, "error.connection.forbiddenCommunity");
    public static final /* enum */ bNI kHO = new bNI(23, "error.connection.external.accountLinked");
    public static final /* enum */ bNI kHP = new bNI(24, "error.connection.external.noAccount");
    public static final /* enum */ bNI kHQ = new bNI(44, "error.connection.reset.password");
    public static final /* enum */ bNI kHR = new bNI(125, "steam.error.account.link");
    public static final /* enum */ bNI kHS = new bNI(126, "steam.error.account.no.certify");
    public static final /* enum */ bNI kHT = new bNI(124, "anonymous.ip.forbidden");
    public static final /* enum */ bNI kHU = new bNI(60, "error.connection.earlyAccess");
    public static final /* enum */ bNI kHV = new bNI(61, "error.connection.closedBeta");
    public static final /* enum */ bNI kHW = new bNI(9, "error.connection.locked");
    public static final /* enum */ bNI kHX = new bNI(114, "error.connection.account.noIdentity");
    public static final /* enum */ bNI kHY = new bNI(112, "error.connection.account.unsecuredGsm");
    public static final /* enum */ bNI kHZ = new bNI(111, "error.connection.account.unsecuredMail");
    public static final /* enum */ bNI kIa = new bNI(113, "error.connection.account.no.2fa");
    public static final /* enum */ bNI kIb = new bNI(110, "error.connection.account.unsecured");
    public static final /* enum */ bNI kIc = new bNI(123, "error.connection.mac.already.in.use");
    public static final /* enum */ bNI kId = new bNI(122, "error.connection.no.mac.address.provided");
    private static final Logger kIe;
    public final byte kIf;
    public final String kIg;
    private static final /* synthetic */ bNI[] kIh;

    public static bNI[] values() {
        return (bNI[])kIh.clone();
    }

    public static bNI valueOf(String string) {
        return Enum.valueOf(bNI.class, string);
    }

    private bNI(byte by, String string2) {
        this.kIf = by;
        this.kIg = string2;
    }

    public static bNI cD(byte by) {
        for (bNI bNI2 : bNI.values()) {
            if (bNI2.kIf != by) continue;
            return bNI2;
        }
        kIe.warn((Object)String.format("No %s found with following code : %s (Return %s as fallback)", new Object[]{bNI.class, by, kHF}));
        return kHF;
    }

    private static /* synthetic */ bNI[] egn() {
        return new bNI[]{kHE, kHF, kHG, kHH, kHI, kHJ, kHK, kHL, kHM, kHN, kHO, kHP, kHQ, kHR, kHS, kHT, kHU, kHV, kHW, kHX, kHY, kHZ, kIa, kIb, kIc, kId};
    }

    static {
        kIh = bNI.egn();
        kIe = Logger.getLogger(bNI.class);
    }
}

