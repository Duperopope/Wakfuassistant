/*
 * Decompiled with CFR 0.152.
 */
import java.util.TimeZone;

public class aUQ
extends euv_1
implements aeh_2 {
    public static final String hrR = "nickname";
    public static final String hrS = "expirationDate";
    private static final String hrT = "expirationDateShort";
    public static final String[] hrU = new String[]{"nickname", "expirationDate", "expirationDateShort"};
    private an_0 hrV;
    private boolean bmT;

    @Override
    public long cWo() {
        long l = super.cWo();
        return aUQ.iA(l);
    }

    public static long iA(long l) {
        String string = ewo_0.oBF.l(ewr_0.oBQ);
        long l2 = ewo_0.oBF.j(ewr_0.oBP);
        TimeZone timeZone = TimeZone.getTimeZone(string);
        return l + (long)timeZone.getRawOffset() + l2;
    }

    @Override
    public String[] bxk() {
        return hrU;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(hrR)) {
            return this.eGs();
        }
        if (string.equals(hrS)) {
            long l = this.cWo();
            return this.iC(l);
        }
        if (string.equals(hrT)) {
            long l = this.cWo();
            StringBuilder stringBuilder = new StringBuilder().append(aum_0.cWf().c("booster.pack", new Object[0])).append(" : ");
            if (l < ue_0.bjV().bjg()) {
                return stringBuilder.append(aum_0.cWf().c("booster.pack.inactive", new Object[0])).toString();
            }
            return stringBuilder.append(this.iB(l)).toString();
        }
        return null;
    }

    public String iB(long l) {
        if (l <= 0L) {
            return null;
        }
        return aUQ.m(ue_0.bjV().bjg(), l);
    }

    public String iC(long l) {
        l = Math.max(l - ue_0.bjV().bjg(), 0L);
        short s = (short)(l / 31536000000L);
        short s2 = (short)((l -= (long)s * 31536000000L) / 2678400000L);
        short s3 = (short)((l -= (long)s2 * 2678400000L) / 86400000L);
        short s4 = (short)((l -= (long)s3 * 86400000L) / 3600000L);
        short s5 = (short)((l -= (long)s4 * 3600000L) / 60000L);
        return aum_0.cWf().c("dateFormat.yearMonthDayHourMin", s, s2, s3, s4, s5);
    }

    public void f(an_0 an_02) {
        this.hrV = an_02;
        Object object = fse_1.gFu().vY("rewardsView");
        if (object != null) {
            bls_2 bls_22 = (bls_2)object;
            fse_1.gFu().a((aef_2)bls_22, "rewards");
        }
    }

    public an_0 aCz() {
        return this.hrV;
    }

    public static fgj_0 cWp() {
        return fit_0.srO.tG(aue_0.cVJ().cVO().xl());
    }

    public static String m(long l, long l2) {
        long l3 = Math.max(l2 - l, 0L);
        short s = (short)(l3 / 2592000000L);
        short s2 = (short)((l3 -= (long)s * 86400000L * 30L) / 86400000L);
        short s3 = (short)((l3 -= (long)s2 * 86400000L) / 3600000L);
        l3 -= (long)s3 * 3600000L;
        if (s <= 0 && s2 <= 0 && s3 <= 0) {
            short s4 = (short)(l3 / 60000L);
            return aum_0.cWf().c("remainingDurationMinutes", s4);
        }
        return aum_0.cWf().c("remainingDurationShortMonthDayHour", s, s2, s > 0 ? (short)0 : s3).trim();
    }

    public boolean bfb() {
        return this.bmT;
    }

    public void bl(boolean bl) {
        this.bmT = bl;
    }

    public boolean zV(int n) {
        if (this.bmT && cri_2.eMM().tX(n)) {
            bYU.epD();
            return true;
        }
        return false;
    }
}

