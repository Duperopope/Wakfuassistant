/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.stream.Collectors;
import lombok.Generated;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from boN
 */
public class bon_0
implements aeh_2 {
    public static final String iSz = "currentPanel";
    public static final String iSA = "isInEnchantmentOccupation";
    public static final String iSB = "selectedItem";
    public static final String iSC = "itemsListSearchPopup";
    public static final String iSD = "itemsList";
    public static final String iSE = "slots";
    public static final String iSF = "sacrifice";
    public static final String iSG = "slotActions";
    public static final String iSH = "selectedSlotAction";
    public static final String iSI = "slotActionButtonText";
    public static final String iSJ = "sublimations";
    public static final String[] iSK = new String[]{"currentPanel", "isInEnchantmentOccupation", "selectedItem", "itemsListSearchPopup", "itemsList", "sacrifice", "slots", "slotActions", "selectedSlotAction", "slotActionButtonText", "sublimations"};
    @NotNull
    private bov_1 iSL;
    @Nullable
    private ffV eeM;
    @Nullable
    private bom_0 iSM;
    @Nullable
    private boz_0 iSN;
    @Nullable
    private bog_0 iSO;
    @Nullable
    private rc_0 iSP;
    @NotNull
    private final bop_1 iSQ = new bop_1(this::dBM);
    @NotNull
    private final bpb_0 iSR = new bpb_0();

    public bon_0(@NotNull bov_1 bov_12) {
        this.iSL = bov_12;
    }

    private void u(String ... stringArray) {
        fse_1.gFu().a((aef_2)this, stringArray);
    }

    @Override
    @Nullable
    public Object eu(String string) {
        return switch (string) {
            case iSz -> this.iSL.d();
            case iSA -> cui_1.eRA();
            case iSB -> this.eeM;
            case iSC -> bon_0.dBQ();
            case iSD -> this.iSQ;
            case iSE -> this.iSM;
            case iSF -> this.iSN;
            case iSG -> this.iSO;
            case iSH -> {
                if (this.iSP == null) {
                    yield null;
                }
                yield this.iSP.ordinal();
            }
            case iSI -> {
                if (this.eeM == null) {
                    yield null;
                }
                if (this.eeM.dXg() && this.eeM.eAZ().fYJ() == 0) {
                    yield aum_0.cWf().c("enchantment.slot.action.button.no.charges", new Object[0]);
                }
                yield aum_0.cWf().c("enchantment.slot.action.button.ok", 1);
            }
            case iSJ -> this.iSR;
            default -> null;
        };
    }

    public void a(@Nullable bon_0 bon_02) {
        if (bon_02 != null) {
            this.iSQ.a(bon_02.iSQ);
        }
        this.iSQ.dCb();
        this.iSR.gL(false);
    }

    private void dBM() {
        if (this.eeM != null && !this.iSQ.F(this.eeM)) {
            this.y(null);
        }
    }

    public void dBk() {
        if (!cui_1.eRA() && this.iSL == bov_1.iPF) {
            this.b(bov_1.iPE);
        }
        this.u(iSz, iSA);
        if (this.iSM != null) {
            this.iSM.dBL().forEach(bok_0::dBk);
        }
    }

    public void dBN() {
        if (this.eeM == null) {
            return;
        }
        bej_1.li(this.eeM.LV()).ifPresent(ffV2 -> {
            if (this.eeM != ffV2) {
                this.eeM = ffV2;
                this.u(iSK);
            }
        });
    }

    public void y(@Nullable ffV ffV2) {
        if (this.eeM != null && ffV2 != null && this.eeM.LV() == ffV2.LV()) {
            this.eeM = ffV2;
            this.u(iSK);
            return;
        }
        ffV ffV3 = this.eeM;
        this.eeM = ffV2;
        if (this.eeM == null) {
            if (ffV3 != null) {
                this.iSQ.H(ffV3);
            }
            this.b(bov_1.iPD);
            this.iSM = null;
            this.iSN = null;
            this.iSP = null;
        } else {
            if (!this.dBO()) {
                if (this.eeM.fVX() > 0) {
                    this.b(cui_1.eRA() ? bov_1.iPF : bov_1.iPE);
                } else {
                    this.b(bov_1.iPG);
                }
            }
            this.iSM = new bom_0(this.eeM);
            this.iSM.dBG();
            this.iSO = new bog_0(this.eeM, this.iSO);
            this.iSN = new boz_0(this.eeM, this.iSN);
            this.iSR.Q(ffV2);
        }
        this.u(iSK);
    }

    private boolean dBO() {
        boolean bl;
        if (this.eeM == null) {
            return false;
        }
        if (this.iSL == bov_1.iPG) {
            return true;
        }
        boolean bl2 = bl = this.eeM.fVX() > 0;
        if (this.iSL == bov_1.iPF) {
            return cui_1.eRA() && bl;
        }
        if (this.iSL == bov_1.iPE) {
            return bl;
        }
        return false;
    }

    public void a(bov_1 bov_12) {
        if (this.eeM == null) {
            return;
        }
        if (this.eeM.fVX() == 0 && bov_12 != bov_1.iPG) {
            return;
        }
        if (!cui_1.eRA() && bov_12 == bov_1.iPF) {
            return;
        }
        this.b(bov_12);
        this.u(iSz);
    }

    private void b(@NotNull bov_1 bov_12) {
        if (this.iSL == bov_12) {
            return;
        }
        this.iSL = bov_12;
        bqm_0.jbp.b(new brm_1(this.iSL.name()));
    }

    public void b(@Nullable rc_0 rc_02) {
        this.iSP = rc_02;
        this.u(iSH, iSI);
    }

    public void z(@NotNull ffV ffV2) {
        if (this.iSN != null) {
            this.iSN.dAY();
        }
        this.A(ffV2);
    }

    public void A(@NotNull ffV ffV2) {
        if (this.eeM == null) {
            return;
        }
        if (ffV2.LV() != this.eeM.LV()) {
            return;
        }
        this.dBP();
        this.iSM = new bom_0(this.eeM);
        this.iSM.dBG();
        this.iSN = new boz_0(this.eeM, this.iSN);
        this.iSR.dCq();
        this.u(iSB, iSG, iSH, iSI, iSF, iSE);
    }

    public void B(@NotNull ffV ffV2) {
        if (this.eeM == null) {
            return;
        }
        if (ffV2.LV() != this.eeM.LV()) {
            return;
        }
        this.dBP();
        this.iSM = new bom_0(this.eeM);
        this.iSM.dBG();
        this.iSN = new boz_0(this.eeM, this.iSN);
        this.u(iSB, iSG, iSH, iSI, iSF, iSE);
    }

    public void a(@NotNull ffV ffV2, boolean bl, boolean bl2) {
        if (this.eeM == null) {
            return;
        }
        if (ffV2.LV() != this.eeM.LV()) {
            return;
        }
        this.dBP();
        if (bl) {
            this.iSR.b(ffV2, bl2);
        } else {
            this.iSR.R(ffV2);
        }
        this.u(iSB, iSG, iSH, iSI, iSJ);
        fse_1.gFu().a((aef_2)this.iSR, bpb_0.iTY);
    }

    public void C(@NotNull ffV ffV2) {
        if (this.eeM == null) {
            return;
        }
        if (ffV2.LV() != this.eeM.LV()) {
            return;
        }
        this.dBP();
        this.iSN = new boz_0(this.eeM, this.iSN);
        this.u(iSB, iSF, iSG, iSH, iSI, iSJ);
        fse_1.gFu().a((aef_2)this.iSR, bpb_0.iTY);
    }

    private void dBP() {
        this.iSO = new bog_0(this.eeM, this.iSO);
        if (this.iSP != null) {
            this.iSP = this.iSO.a(this.iSP) ? this.iSP : null;
        }
    }

    private static String dBQ() {
        String string = aum_0.cWf().c("enchantment.sublimation.search.popup", new Object[0]);
        String string2 = bon_0.dBR();
        return string + "\n\n" + string2;
    }

    public static String dBR() {
        String[] stringArray = new String[2 * rd_0.bjH.size() + 1];
        for (int i = 0; i < rd_0.bjH.size(); ++i) {
            rd_0 rd_02 = rd_0.bjH.get(i);
            stringArray[2 * i] = new ahv_2().a(bon_0.mk("shard" + BH.aQ(rd_02.name().toLowerCase()) + "Empty"), 24, 24, null).ceL();
            stringArray[2 * i + 1] = bul_0.c(rd_02).stream().map(String::valueOf).map(String::toUpperCase).collect(Collectors.joining("/"));
        }
        stringArray[stringArray.length - 1] = ":RGBW";
        return aum_0.cWf().c("enchantment.slot.colors.search.popup", stringArray);
    }

    @NotNull
    private static String mk(String string) {
        try {
            return String.format(auc_0.cVq().bS("imagesPath"), string);
        }
        catch (fu_0 fu_02) {
            return "";
        }
    }

    @Override
    public String[] bxk() {
        return iSK;
    }

    public boolean dBS() {
        if (this.eeM == null || this.iSP == null || this.iSO == null) {
            return false;
        }
        if (!this.eeM.dXg() || this.eeM.eAZ().fYJ() <= 0) {
            return false;
        }
        return this.iSO.a(this.iSP);
    }

    @NotNull
    @Generated
    public bov_1 dBT() {
        return this.iSL;
    }

    @Nullable
    @Generated
    public ffV dBU() {
        return this.eeM;
    }

    @Nullable
    @Generated
    public bom_0 dBV() {
        return this.iSM;
    }

    @Nullable
    @Generated
    public boz_0 dBW() {
        return this.iSN;
    }

    @Nullable
    @Generated
    public bog_0 dBX() {
        return this.iSO;
    }

    @Nullable
    @Generated
    public rc_0 dBY() {
        return this.iSP;
    }

    @NotNull
    @Generated
    public bop_1 dBZ() {
        return this.iSQ;
    }

    @NotNull
    @Generated
    public bpb_0 dCa() {
        return this.iSR;
    }
}

