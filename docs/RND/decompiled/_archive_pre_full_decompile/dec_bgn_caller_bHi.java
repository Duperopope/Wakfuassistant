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

public class bHi
extends bHy {
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
    private static final String[] jXY = (String[])ArrayUtils.addAll((Object[])bHy.kaR, (Object[])new String[]{"offerCost", "remainingCash", "isOfferCreationValid", "createOfferButtonText"});
    @NotNull
    private String jXZ = "";
    private bGV iDU;
    private long jYa;
    private int ejM;
    @NotNull
    private bIg jYb = bHz.kbK;
    private short jYc = (short)-1;
    private boolean jYd;
    private final bHv jYe = new bHv();

    private void u(String ... stringArray) {
        fSe.gFu().a((aEF)this, stringArray);
    }

    @Override
    public long akd() {
        return this.jYa;
    }

    public void mK(@NotNull String string) {
        this.jXZ = BH.aT(string);
        bDC.dRc().mF(this.jXZ);
        this.u(jXB);
    }

    public void o(bGV bGV2) {
        boolean bl = bGV2 != null && this.iDU != null && bGV2.d() == this.iDU.d();
        this.iDU = bGV2;
        this.hG(bl);
        this.hH(bl);
        if (!bId.b(bSN.lkR)) {
            this.jYb = bHz.kbK;
        }
        if (!bId.b(bSN.lkT)) {
            this.bY((short)-1);
        }
        if (!bId.b(bSN.lkS)) {
            this.jYd = false;
            this.hJ(true);
            this.b(null);
            this.jYe.mM(null);
        } else {
            this.jYe.hK(this.jYd);
        }
        bHz.dWn().dWF().GR(this.iDU.d());
        this.u(this.bxk());
    }

    private void hG(boolean bl) {
        bIc bIc2 = bId.c(bSN.lkP);
        this.jYa = GC.a(switch (bIc2) {
            case bIc.kdQ -> this.jYa;
            case bIc.kdR -> bl ? this.jYa : 0L;
            case bIc.kdU -> bGN.dUk().a(this.iDU, 0L);
            default -> 0L;
        }, 0L, 999999999999L);
    }

    private void hH(boolean bl) {
        bIc bIc2 = bId.c(bSN.lkQ);
        this.ejM = GC.a(switch (bIc2) {
            case bIc.kdP -> 0;
            case bIc.kdR -> bl ? this.ejM : 0;
            case bIc.kdS -> 1;
            case bIc.kdT -> this.iDU.bfe();
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

    public void a(bIg bIg2) {
        this.jYb = bIg2;
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
            this.a((bIj)null);
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

    public void a(bIj bIj2) {
        this.jYe.a(bIj2);
        this.u(jXN, jXO);
    }

    public void b(@Nullable bIj bIj2) {
        if (bIj2 == null || bIj2.dCB() != this.iDU.dwg()) {
            this.jYe.b(null);
        } else {
            this.jYe.b(bIj2);
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
                    return aUM.cWf().c("market.create.offer", new Object[0]);
                }
                if (this.jYa <= 0L) {
                    return aUM.cWf().c("market.sell.no.price.defined", new Object[0]);
                }
                if (this.ejM <= 0) {
                    return aUM.cWf().c("market.sell.no.quantity.defined", new Object[0]);
                }
                return aUM.cWf().c("market.offer.deposit.too.high", new Object[0]);
            }
        }
        return super.eu(string);
    }

    public boolean dUR() {
        return this.iDU != null && this.jYa > 0L && this.jYa <= 999999999999L && this.ejM > 0 && this.ejM <= 999999 && this.jYb != null && this.dWj() && bHz.dWn().dWs();
    }

    private boolean dUS() {
        return this.iDU != null && this.iDU.cpA() > 0;
    }

    private boolean dUT() {
        if (this.iDU == null) {
            return false;
        }
        if (foy.sLJ.XQ(this.iDU.d()) != null) {
            return true;
        }
        if (this.iDU.fUZ() instanceof bFl) {
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
        fov fov2 = foy.sLJ.XQ(this.iDU.d());
        if (fov2 != null) {
            return fov2.aVe();
        }
        if (this.iDU.fUZ() instanceof bFl) {
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
    public bIj C(String string, boolean bl) {
        return this.jYe.C(string, bl);
    }

    @NotNull
    @Generated
    public String dUW() {
        return this.jXZ;
    }

    @Generated
    public bGV duo() {
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
    public bIg dUX() {
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
    public bHv dVa() {
        return this.jYe;
    }
}
