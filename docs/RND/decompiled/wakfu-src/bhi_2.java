/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.apache.commons.lang3.ArrayUtils
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Collections;
import lombok.Generated;
import org.apache.commons.lang3.ArrayUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bHi
 */
public class bhi_2
extends bhy_1 {
    public static final String jXB = "isSearchingItem";
    public static final String jXC = "item";
    public static final String jXD = "unitPrice";
    public static final String jXE = "quantity";
    public static final String jXF = "sellDuration";
    public static final String jXG = "itemHasShards";
    public static final String jXH = "itemHasXp";
    public static final String jXI = "itemLevel";
    public static final String jXJ = "slotColorsFixedOrder";
    public static final String jXK = "selectedSlotColors";
    public static final String jXL = "allSlotColors";
    public static final String jXM = "availableSublimations";
    public static final String jXN = "selectedBasicSublimation";
    public static final String jXO = "basicSublimationIsSelected";
    public static final String jXP = "itemCanHaveSpecialSublimation";
    public static final String jXQ = "specialSublimations";
    public static final String jXR = "selectedSpecialSublimation";
    public static final String jXS = "specialSublimationIsSelected";
    public static final String jXT = "offerCost";
    public static final String jXU = "remainingCash";
    public static final String jXV = "isOfferCreationValid";
    public static final String jXW = "createOfferButtonText";
    private static final String[] jXX = new String[]{"isSearchingItem", "item", "unitPrice", "quantity", "sellDuration", "itemHasShards", "itemHasXp", "slotColorsFixedOrder", "selectedSlotColors", "allSlotColors", "availableSublimations", "selectedBasicSublimation", "specialSublimations", "selectedSpecialSublimation", "offerCost", "remainingCash", "isOfferCreationValid", "createOfferButtonText", "itemCanHaveSpecialSublimation", "basicSublimationIsSelected", "specialSublimationIsSelected"};
    private static final String[] jXY = (String[])ArrayUtils.addAll((Object[])bhy_1.kaR, (Object[])new String[]{"offerCost", "remainingCash", "isOfferCreationValid", "createOfferButtonText"});
    @NotNull
    private String jXZ = "";
    private bgv_2 iDU;
    private long jYa;
    private int ejM;
    @NotNull
    private big_1 jYb = bhz_2.kbK;
    private short jYc = (short)-1;
    private boolean jYd;
    private final bhv_1 jYe = new bhv_1();

    private void u(String ... stringArray) {
        fse_1.gFu().a((aef_2)this, stringArray);
    }

    @Override
    public long akd() {
        return this.jYa;
    }

    public void mK(@NotNull String string) {
        this.jXZ = BH.aT(string);
        bdc_0.dRc().mF(this.jXZ);
        this.u(jXB);
    }

    public void o(bgv_2 bgv_22) {
        boolean bl = bgv_22 != null && this.iDU != null && bgv_22.d() == this.iDU.d();
        this.iDU = bgv_22;
        this.hG(bl);
        this.hH(bl);
        if (!bid_1.b(bsn_1.lkR)) {
            this.jYb = bhz_2.kbK;
        }
        if (!bid_1.b(bsn_1.lkT)) {
            this.bY((short)-1);
        }
        if (!bid_1.b(bsn_1.lkS)) {
            this.jYd = false;
            this.hJ(true);
            this.b(null);
            this.jYe.mM(null);
        } else {
            this.jYe.hK(this.jYd);
        }
        bhz_2.dWn().dWF().GR(this.iDU.d());
        this.u(this.bxk());
    }

    private void hG(boolean bl) {
        bic_1 bic_12 = bid_1.c(bsn_1.lkP);
        this.jYa = GC.a(switch (bic_12) {
            case bic_1.kdQ -> this.jYa;
            case bic_1.kdR -> bl ? this.jYa : 0L;
            case bic_1.kdU -> bgn_1.dUk().a(this.iDU, 0L);
            default -> 0L;
        }, 0L, 999999999999L);
    }

    private void hH(boolean bl) {
        bic_1 bic_12 = bid_1.c(bsn_1.lkQ);
        this.ejM = GC.a(switch (bic_12) {
            case bic_1.kdP -> 0;
            case bic_1.kdR -> bl ? this.ejM : 0;
            case bic_1.kdS -> 1;
            case bic_1.kdT -> this.iDU.bfe();
            default -> this.ejM;
        }, 0, 999999);
    }

    public void dUP() {
        this.u(jXD, jXE);
        this.u(jXY);
    }

    public void k(long l, boolean bl) {
        this.jYa = GC.a(l, 0L, 999999999999L);
        if (bl) {
            this.u(jXD);
        }
        this.u(jXY);
    }

    public void z(int n, boolean bl) {
        this.ejM = GC.a(n, 0, 999999);
        if (bl) {
            this.u(jXE);
        }
        this.u(jXY);
    }

    public void a(big_1 big_12) {
        this.jYb = big_12;
        this.u(jXF);
        this.u(jXY);
    }

    public void bY(short s) {
        this.jYc = GC.a(s, (short)-1, this.aVe());
        this.u(jXI);
    }

    public void hI(boolean bl) {
        this.jYd = bl;
        this.u(jXJ);
    }

    public void hJ(boolean bl) {
        this.jYd = false;
        this.jYe.dVI();
        this.dUQ();
        this.hK(false);
        if (bl) {
            this.a((bij_1)null);
            this.jYe.mL(null);
        }
        this.u(jXJ, jXK, jXL, jXM, jXN, jXO, jXQ, jXR, jXS);
    }

    public void dUQ() {
        this.jYe.dUQ();
        this.u(jXK);
    }

    public void hK(boolean bl) {
        this.jYe.hK(bl);
        this.u(jXM, jXQ);
    }

    public void a(bij_1 bij_12) {
        this.jYe.a(bij_12);
        this.u(jXN, jXO);
    }

    public void b(@Nullable bij_1 bij_12) {
        if (bij_12 == null || bij_12.dCB() != this.iDU.dwg()) {
            this.jYe.b(null);
        } else {
            this.jYe.b(bij_12);
        }
        this.u(jXR, jXS);
    }

    @Override
    @Nullable
    public Object eu(String string) {
        switch (string) {
            case "isSearchingItem": {
                return !this.jXZ.isEmpty();
            }
            case "item": {
                return this.iDU;
            }
            case "unitPrice": {
                return this.jYa > 0L ? Long.valueOf(this.jYa) : null;
            }
            case "quantity": {
                return this.ejM > 0 ? Integer.valueOf(this.ejM) : null;
            }
            case "sellDuration": {
                return this.jYb;
            }
            case "itemHasShards": {
                return this.dUS();
            }
            case "itemHasXp": {
                return this.dUT();
            }
            case "itemLevel": {
                return this.jYc >= 0 ? Short.valueOf(this.jYc) : null;
            }
            case "slotColorsFixedOrder": {
                return this.jYd;
            }
            case "selectedSlotColors": {
                return this.jYe.dVM();
            }
            case "allSlotColors": {
                return this.jYe.dVR();
            }
            case "availableSublimations": {
                return this.jYe.dVN();
            }
            case "selectedBasicSublimation": {
                return this.jYe.dVK();
            }
            case "basicSublimationIsSelected": {
                return this.jYe.dVW() != null;
            }
            case "itemCanHaveSpecialSublimation": {
                return this.dUU();
            }
            case "specialSublimations": {
                if (this.iDU == null) {
                    return Collections.emptyList();
                }
                if (this.iDU.dwg() == fgj.siF) {
                    return this.jYe.dVP();
                }
                if (this.iDU.dwg() == fgj.siH) {
                    return this.jYe.dVQ();
                }
                return Collections.emptyList();
            }
            case "selectedSpecialSublimation": {
                return this.jYe.dVL();
            }
            case "specialSublimationIsSelected": {
                return this.jYe.dVX() != null;
            }
            case "offerCost": {
                return (long)this.ejM * this.jYa;
            }
            case "remainingCash": {
                return this.dWg() - (long)this.oP() * this.akd();
            }
            case "isOfferCreationValid": {
                return this.dUR();
            }
            case "createOfferButtonText": {
                if (this.dUR()) {
                    return aum_0.cWf().c("market.create.offer", new Object[0]);
                }
                if (this.jYa <= 0L) {
                    return aum_0.cWf().c("market.sell.no.price.defined", new Object[0]);
                }
                if (this.ejM <= 0) {
                    return aum_0.cWf().c("market.sell.no.quantity.defined", new Object[0]);
                }
                return aum_0.cWf().c("market.offer.deposit.too.high", new Object[0]);
            }
        }
        return super.eu(string);
    }

    public boolean dUR() {
        return this.iDU != null && this.jYa > 0L && this.jYa <= 999999999999L && this.ejM > 0 && this.ejM <= 999999 && this.jYb != null && this.dWj() && bhz_2.dWn().dWs();
    }

    private boolean dUS() {
        return this.iDU != null && this.iDU.cpA() > 0;
    }

    private boolean dUT() {
        if (this.iDU == null) {
            return false;
        }
        if (foy_0.sLJ.XQ(this.iDU.d()) != null) {
            return true;
        }
        if (this.iDU.fUZ() instanceof bfl_1) {
            return true;
        }
        return this.iDU.fYx() > 0;
    }

    private boolean dUU() {
        if (this.iDU == null) {
            return false;
        }
        return this.iDU.dwg() == fgj.siF || this.iDU.dwg() == fgj.siH;
    }

    private short aVe() {
        if (this.iDU == null) {
            return -1;
        }
        fov_0 fov_02 = foy_0.sLJ.XQ(this.iDU.d());
        if (fov_02 != null) {
            return fov_02.aVe();
        }
        if (this.iDU.fUZ() instanceof bfl_1) {
            return 245;
        }
        if (this.iDU.fYx() > 0) {
            return 100;
        }
        return -1;
    }

    @Override
    public String[] bxk() {
        return (String[])ArrayUtils.addAll((Object[])super.bxk(), (Object[])jXX);
    }

    public fiR dUV() {
        fiR fiR2 = new fiR().Wf(this.iDU.d()).tK(this.jYa).Wg(this.ejM).b(this.jYb.dXx());
        if (this.dUT() && this.jYc != -1) {
            fiR2.fj(this.jYc);
        }
        if (this.dUS()) {
            fiR2.be(this.jYe.dVJ());
            fiR2.nw(this.jYd);
            if (this.jYe.dVW() != null) {
                fiR2.Wh(this.jYe.dVW().AK());
            }
        }
        if (this.dUU() && this.jYe.dVX() != null) {
            fiR2.Wi(this.jYe.dVX().AK());
        }
        return fiR2;
    }

    @Nullable
    public bij_1 C(String string, boolean bl) {
        return this.jYe.C(string, bl);
    }

    @NotNull
    @Generated
    public String dUW() {
        return this.jXZ;
    }

    @Generated
    public bgv_2 duo() {
        return this.iDU;
    }

    @Override
    @Generated
    public int oP() {
        return this.ejM;
    }

    @Override
    @NotNull
    @Generated
    public big_1 dUX() {
        return this.jYb;
    }

    @Generated
    public short dUY() {
        return this.jYc;
    }

    @Generated
    public boolean dUZ() {
        return this.jYd;
    }

    @Generated
    public bhv_1 dVa() {
        return this.jYe;
    }
}

