/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bmJ
 */
public class bmj_2
implements aeh_2,
bek_0 {
    public static final String iDH = "quantity";
    public static final String iDI = "isPossessed";
    public static final String iDJ = "nameAndQuantity";
    public static final String iDK = "nameAndQuantityWithRarity";
    public static final String iDL = "rewardContainer";
    public static final String iDM = "reward";
    public static final String iDN = "quantityReward";
    public static final String iDO = "categoryName";
    public static final String iDP = "isNotItemReward";
    public static final String iDQ = "linkToCharacter";
    public static final String iDR = "ownerName";
    private final short iDS;
    private final short iDT;
    private final bgv_2 iDU;
    private final AS iDV;
    private final Ab iDW;

    public bmj_2(short s, bgv_2 bgv_22) {
        this.iDS = s;
        this.iDT = (short)-1;
        this.iDU = bgv_22;
        this.iDV = null;
        this.iDW = null;
    }

    public bmj_2(short s, short s2, bgv_2 bgv_22) {
        this.iDS = s;
        this.iDT = s2;
        this.iDU = bgv_22;
        this.iDV = null;
        this.iDW = null;
    }

    public bmj_2(int n, fhc_0 fhc_02, AS aS, Ab ab) {
        this.iDS = (short)n;
        this.iDT = (short)-1;
        this.iDU = (bgv_2)fhc_02;
        this.iDV = aS;
        this.iDW = ab;
    }

    @Override
    public String[] bxk() {
        return null;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (string.equals(iDH)) {
            return this.iDS;
        }
        if (string.equals(iDI)) {
            return this.dxj();
        }
        if (string.equals(iDJ)) {
            ahv_2 ahv_22 = new ahv_2();
            return ahv_22.aN(this.iDS).c("x ").c(this.iDU.getName()).ceL();
        }
        if (string.equals(iDK)) {
            ahv_2 ahv_23 = new ahv_2();
            ahv_23.aN(this.iDS).c("x ").c(this.iDU.getName());
            return new ahv_2().ceC().ih(beo_0.e(this.iDU.dwg())).af(ahv_23).ceD().ceL();
        }
        if (string.equals(iDL)) {
            return this.iDV;
        }
        if (string.equals(iDM)) {
            return this.iDW;
        }
        if (string.equals(iDN)) {
            if (this.iDW == null) {
                return null;
            }
            ahv_2 ahv_24 = new ahv_2();
            ahv_24.c(aum_0.cWf().c(iDH, new Object[0])).c(" : ").hY(this.iDW.aBF());
            return ahv_24.ceL();
        }
        if (string.equals(iDO)) {
            if (this.iDV == null) {
                return null;
            }
            ahv_2 ahv_25 = new ahv_2();
            aq_0 aq_02 = this.iDV.aFc().aEd();
            blq_2 blq_22 = blq_2.HT(aq_02.getNumber());
            ahv_25.c(aum_0.cWf().c("rewards.category.name." + blq_22.d(), new Object[0]));
            return new ahv_2().ceC().e(blq_22.getColor()).af(ahv_25).ceD().ceL();
        }
        if (string.equals(iDP)) {
            if (this.iDW == null) {
                return false;
            }
            return this.iDW.aBE() != ax_0.arQ;
        }
        if (string.equals(iDQ)) {
            if (this.iDV == null) {
                return false;
            }
            return this.iDV.KU() == aue_0.cVJ().cVK().Sn();
        }
        if (string.equals(iDR)) {
            if (this.iDV == null) {
                return null;
            }
            if (this.iDV.KU() != aue_0.cVJ().cVK().Sn()) {
                return null;
            }
            return aum_0.cWf().c("rewards.owner", aue_0.cVJ().cVK().getName());
        }
        return this.iDU.eu(string);
    }

    @Override
    public bgv_2 duo() {
        return this.iDU;
    }

    public short bfd() {
        return this.iDS;
    }

    public short aHb() {
        return this.iDT;
    }

    public boolean dxj() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02.e(this.iDU.d(), this.iDS)) {
            return true;
        }
        fec_0 fec_02 = (fec_0)bgt_02.a(fez_0.sep);
        ffm ffm2 = fec_02.UB(this.iDU.d());
        return ffm2 != null && ffm2.bfd() >= this.iDS;
    }

    public AS aDK() {
        return this.iDV;
    }

    public Ab aEv() {
        return this.iDW;
    }
}

