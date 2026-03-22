/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class bQJ
implements aeh_2 {
    private static final Logger kWL = Logger.getLogger(bQJ.class);
    public static final String kWM = "baseBuilding";
    public static final String kWN = "evolvedBuilding";
    public static final String kWO = "canBeEvolved";
    public static final String kWP = "canPay";
    public static final String kWQ = "guildName";
    public static final String kWR = "buildingDate";
    public static final String kWS = "hasRightToPay";
    public static final String[] kWT = new String[]{"baseBuilding", "evolvedBuilding", "canPay", "guildName", "buildingDate"};
    private uw_0 kWU;
    private long kWV;
    private final bQI kWW;
    private final bRd kWX;

    public bQJ(long l, fbk_0 fbk_02, fby_0 fby_02, fsm_0 fsm_02) {
        this(fbk_02, fby_02, fsm_02);
        this.kWV = l;
    }

    @Override
    public String[] bxk() {
        return kWT;
    }

    public bQJ(fbk_0 fbk_02, fby_0 fby_02, fsm_0 fsm_02) {
        this.kWW = bRb.kYS.a(fbk_02);
        this.kWX = new bRd(fby_02);
        if (fsm_02 != null) {
            fsK fsK2 = new fsK(fsm_02);
            int n = this.kWX.ekC();
            this.kWX.it(fsK2.k(new caj_2(0L, n, 0, Short.MIN_VALUE, Short.MIN_VALUE)));
            this.kWX.a(fsK2);
        }
    }

    @Override
    public Object eu(String string) {
        if (string.equals(kWM)) {
            return this.kWW;
        }
        if (string.equals(kWN)) {
            return this.kWX;
        }
        if (string.equals(kWP)) {
            bgt_0 bgt_02 = aue_0.cVJ().cVK();
            bjn_1 bjn_12 = bgt_02.dpI();
            ezz_1 ezz_12 = bjn_12.jP(bgt_02.Sn());
            if (ezz_12 == null) {
                return false;
            }
            fab fab2 = bjn_12.jR(ezz_12.Xm());
            if (fab2 == null) {
                return false;
            }
            return this.kWX.ekx() && this.kWX.ein() && fab2.b(eyh_2.rKM);
        }
        if (string.equals(kWQ)) {
            return "-";
        }
        if (string.equals(kWR)) {
            return this.kWU == null ? null : this.kWU.bjM();
        }
        return null;
    }

    public void b(uw_0 uw_02) {
        this.kWU = uw_02;
    }

    public bQI ejV() {
        return this.kWW;
    }

    public bRd ejW() {
        return this.kWX;
    }

    public long ejX() {
        return this.kWV;
    }
}

