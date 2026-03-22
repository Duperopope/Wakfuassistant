/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from blJ
 */
public final class blj_1
implements aeh_2 {
    public static final String ivO = "nationId";
    public static final String ivP = "guildId";
    public static final String ivQ = "chiefId";
    public static final String ivR = "level";
    public static final String ivS = "levelProgress";
    public static final String ivT = "chiefView";
    public static final String ivU = "nation";
    public static final String ivV = "nationName";
    public static final String ivW = "guildName";
    public static final String ivX = "guildBlazon";
    public static final String ivY = "chiefName";
    public static final String ivZ = "levelDesc";
    public static final String iwa = "ratioXp";
    public static final String iwb = "rankDesc";
    public static final String iwc = "rankNumber";
    public static final String iwd = "isActivated";
    public static final String[] iwe = new String[]{"nationId", "guildId", "chiefId", "level", "levelProgress", "rankNumber", "rankDesc", "chiefView", "levelDesc", "ratioXp", "guildBlazon", "guildName", "nationName"};
    private final eKd iwf;

    public blj_1(eKd eKd2) {
        this.iwf = eKd2;
    }

    @Override
    public String[] bxk() {
        return iwe;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (ivO.equals(string)) {
            return this.iwf.Xt();
        }
        if (ivP.equals(string)) {
            return this.iwf.Ya();
        }
        if (ivQ.equals(string)) {
            return this.iwf.dua();
        }
        if (iwd.equals(string)) {
            return this.iwf.aOY();
        }
        if (ivR.equals(string)) {
            return this.iwf.fxH();
        }
        if (ivS.equals(string)) {
            eKg eKg2 = eKi.pZ(this.iwf.fxH());
            short s = eKg2.aVe();
            short s2 = (short)(eKg2.aVf() - 1);
            return Float.valueOf((float)(this.iwf.fxH() - s2) / (float)(s - s2));
        }
        if (ivU.equals(string)) {
            int n = this.iwf.Xt();
            return auc_0.cVq().a("nationFlagIconsPath", "defaultIconPath", n != 0 ? n : -1);
        }
        if (ivV.equals(string)) {
            String string2 = aum_0.cWf().a(39, (long)this.iwf.Xt(), new Object[0]);
            return aum_0.cWf().c("company.shortDesc.nationName", string2);
        }
        if (ivW.equals(string)) {
            long l = this.iwf.Ya();
            String string3 = l == 0L ? aum_0.cWf().c("company.shortDesc.noGuild", new Object[0]) : this.iwf.HR();
            return aum_0.cWf().c("company.shortDesc.guildName", string3);
        }
        if (ivX.equals(string)) {
            bgt_0 bgt_02 = (bgt_0)fcL.rUh.sw(this.iwf.dua());
            if (bgt_02 == null || !bgt_02.dpO()) {
                return null;
            }
            long l = bgt_02.HP();
            ezb ezb2 = l != 0L ? new ezb(l) : new ezb(bgt_02.dpI().Yc());
            if (ezb2 == null) {
                return null;
            }
            buJ buJ2 = new buJ(ezb2.fmd(), ezb2.fmf(), buH.dJn().Fz(ezb2.fmg()), buH.dJn().Fz(ezb2.fme()));
            awk_1 awk_12 = buK.dJw().a(buJ2);
            buJ2.bmX();
            return awk_12;
        }
        if (ivY.equals(string)) {
            Object t = fcL.rUh.sw(this.iwf.dua());
            if (t != null) {
                return aum_0.cWf().c("company.shortDesc.chiefName", ((exP)t).getName());
            }
            return aum_0.cWf().c("company.shortDesc.chiefName", aum_0.cWf().c("company.shortDesc.noChief", new Object[0]));
        }
        if (iwa.equals(string)) {
            StringBuilder stringBuilder = new StringBuilder();
            eKg eKg3 = eKi.pZ(this.iwf.fxH());
            short s = eKg3.aVe();
            if (eKh.qBm.fxP().cmr() != eKg3.cmr()) {
                s = (short)(s + 1);
            }
            short s3 = (short)(eKg3.aVf() - 1);
            stringBuilder.append(aum_0.cWf().c("xpRatio", aum_0.cWf().cQ(this.iwf.fxH() - s3), aum_0.cWf().cQ(s - s3)));
            return stringBuilder.toString();
        }
        if (ivZ.equals(string)) {
            StringBuilder stringBuilder = new StringBuilder();
            short s = eKi.pZ(this.iwf.fxH()).aVe();
            if (eKi.pZ(this.iwf.fxH()).cmr() != eKh.qBm.fxP().cmr()) {
                s = (short)(s + 1);
            }
            stringBuilder.append(aum_0.cWf().c("company.shortDesc.level", aum_0.cWf().cQ(this.iwf.fxH()), aum_0.cWf().cQ(s)));
            return stringBuilder.toString();
        }
        if (iwb.equals(string)) {
            eKg eKg4 = eKi.pZ(this.iwf.fxH());
            if (eKg4 == null) {
                return aum_0.cWf().c("company.shortDesc.noRank", new Object[0]);
            }
            String string4 = aum_0.cWf().a(148, (long)eKg4.d(), new Object[0]);
            return aum_0.cWf().c("company.shortDesc.rank", string4);
        }
        if (iwc.equals(string)) {
            eKg eKg5 = eKi.pZ(this.iwf.fxH());
            if (eKg5 == null) {
                return 0;
            }
            return eKg5.cmr() + 1;
        }
        if (ivT.equals(string)) {
            return bly_0.ivl.kb(this.iwf.dua());
        }
        return null;
    }
}

