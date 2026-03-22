/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

public class bok
implements aeh_2 {
    private static final Logger iNy = Logger.getLogger(bok.class);
    public static final String iNz = "name";
    public static final String iNA = "smiley";
    public static final String iNB = "guildBlazon";
    public static final String iNC = "team";
    public static final String iND = "hasRecord";
    public static final String iNE = "blazonId";
    public static final String iNF = "breedIconUrl";
    public static final String iNG = "laurel";
    public static final String iNH = "shards";
    public static final String iNI = "shardsQuantity";
    public static final String iNJ = "mysteryBoxQuantity";
    public static final String iNK = "guildName";
    public static final String iNL = "mysteryBox";
    private final long iNM;
    private String p;
    private short aZk;
    private byte aZm;
    private final long iNN;
    private final String iNO;
    private bom iNP;

    public bok(long l, hm_1 hm_12, bom bom2) {
        this.iNM = l;
        this.p = hm_12.getName();
        this.aZk = (short)hm_12.xT();
        this.iNN = hm_12.HP();
        this.iNO = hm_12.HR();
        this.aZm = (byte)hm_12.sY();
        this.iNP = bom2;
    }

    public bok(bhJ bhJ2) {
        this.iNM = bhJ2.Sn();
        this.p = bhJ2.getName();
        this.aZk = bhJ2.aWP();
        this.iNN = bhJ2.dmc() ? bhJ2.HP() : bhJ2.dpI().Yc();
        this.iNO = bhJ2.dmc() ? null : bhJ2.dpI().getName();
        this.aZm = bhJ2.aWO();
    }

    @Override
    public String[] bxk() {
        return new String[0];
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (string.equals(iNz)) {
            Object object;
            if (this.iNM < 0L && (object = bja_1.drJ().bC(this.aZk)) != null) {
                return ((bjz_1)object).getName();
            }
            if (this.p == null || this.p.isEmpty()) {
                object = aum_0.cWf().c("dungeon.ladder.empty.name", new Object[0]);
                if (evm_2.b(aue_0.cVJ().cVO().cWq(), evn_2.ouF)) {
                    return (String)object + " - " + this.iNM;
                }
                return object;
            }
            return this.p;
        }
        if (string.equals(iNA)) {
            if (this.iNP == null) {
                return bue_0.a(this.aZk, this.aZm, VI.bJM.d());
            }
            int n = this.iNP.dAJ();
            return n == 0 ? bue_0.a(this.aZk, this.aZm, VI.bJI.d()) : bue_0.a(this.aZk, this.aZm, VI.bJF.d());
        }
        if (string.equals(iNB)) {
            ezb ezb2 = new ezb(this.iNN);
            buJ buJ2 = new buJ(ezb2.fmd(), ezb2.fmf(), buH.dJn().Fz(ezb2.fmg()), buH.dJn().Fz(ezb2.fme()));
            awk_1 awk_12 = buK.dJw().a(buJ2);
            buJ2.bmX();
            return awk_12;
        }
        if (string.equals(iNC)) {
            return this.iNP;
        }
        if (string.equals(iND)) {
            return this.iNP != null;
        }
        if (string.equals(iNE)) {
            return this.iNN;
        }
        if (string.equals(iNF)) {
            try {
                return this.iNM < 0L ? String.format(auc_0.cVq().bS("companionIconsPath"), this.aZk) : String.format(auc_0.cVq().bS("breedPortraitIllustrationPath"), this.aZk + String.valueOf(this.aZm));
            }
            catch (fu_0 fu_02) {
                iNy.error((Object)"PropertyException during getFieldValue for BREED_ICON_URL", (Throwable)fu_02);
            }
        }
        if (string.equals(iNG)) {
            if (this.iNP == null) {
                auc_0.cVq();
                return auc_0.kA(String.valueOf(0));
            }
            return this.iNP.dAH();
        }
        if (string.equals(iNH)) {
            bgv_2 bgv_22 = (bgv_2)fgD.fXh().Vd(27083);
            return new beg_1(bgv_22);
        }
        if (string.equals(iNI)) {
            if (this.iNP == null) {
                return "0";
            }
            bny_0 bny_02 = cua_2.eRq().eRr().dzV();
            short s = eIi.dB(bny_02.aVf());
            int n = eMP.fz(s, this.iNP.dAJ());
            return "x" + n;
        }
        if (string.equals(iNJ)) {
            if (this.iNP == null) {
                return "0";
            }
            bny_0 bny_03 = cua_2.eRq().eRr().dzV();
            return "x" + bny_03.a(this.iNP);
        }
        if (string.equals(iNK)) {
            return this.iNO;
        }
        if (iNL.equals(string)) {
            short s = this.iNP == null ? (short)1 : this.iNP.cnb();
            bny_0 bny_04 = cua_2.eRq().eRr().dzV();
            return bny_04.EH(s);
        }
        return null;
    }

    public String getName() {
        return this.p;
    }

    public long Sn() {
        return this.iNM;
    }

    public void setName(String string) {
        this.p = string;
    }

    public short aWP() {
        return this.aZk;
    }

    public void aT(short s) {
        this.aZk = s;
    }

    public byte aWO() {
        return this.aZm;
    }

    public void aQ(byte by) {
        this.aZm = by;
    }

    public bom dAF() {
        return this.iNP;
    }

    public void b(bom bom2) {
        this.iNP = bom2;
    }
}

