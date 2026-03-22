/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Contract
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class bmi
implements aeh_2,
bek_0,
ejl_0 {
    private static final Logger izx = Logger.getLogger(bmi.class);
    public static final String izy = "iconUrl";
    public static final String izz = "typeIconContainerStyle";
    public static final String izA = "isSelected";
    public static final String izB = "additionalBorder";
    public static final String izC = "disabled";
    public static final String izD = "itemsCount";
    public static final String izE = "rarityBorderStyle";
    public static final String izF = "hoverRarityBorderStyle";
    public static final String izG = "pressedRarityBorderStyle";
    public static final String izH = "usedForIcon";
    public static final String izI = "canBeUsedAsIcon";
    public static final String[] izJ = new String[]{"iconUrl", "typeIconContainerStyle", "isSelected", "additionalBorder", "disabled", "itemsCount", "rarityBorderStyle", "hoverRarityBorderStyle", "pressedRarityBorderStyle", "usedForIcon", "canBeUsedAsIcon"};
    public static final int izK = 4729667;
    @NotNull
    private final fm_1 izL;
    @NotNull
    private List<ekp_0> izM;
    @Nullable
    private String crF;
    private boolean izN = false;
    private boolean izO;
    private boolean cHn = true;
    private boolean izP;

    bmi(@NotNull fm_1 fm_12, @Nullable List<ekp_0> arrayList, int n) {
        this.izL = fm_12;
        this.izM = arrayList == null ? new ArrayList() : arrayList;
        this.dvF();
        this.izN = !this.izM.isEmpty() && this.izM.get(0).AK() == n;
    }

    private void dvF() {
        if (this.izM.isEmpty()) {
            this.crF = null;
        } else if (this.izL == fm_1.pA) {
            this.crF = auc_0.cVq().zx(4729667);
        } else {
            int n = this.izM.get(0).AK();
            this.crF = auc_0.cVq().a((fjm)ctb_2.eQw(), n);
        }
    }

    @Override
    @Nullable
    public Object eu(String string) {
        switch (string) {
            case "iconUrl": {
                return this.crF;
            }
            case "typeIconContainerStyle": {
                return bjf_1.k(this.izL);
            }
            case "isSelected": {
                return this.izO;
            }
            case "additionalBorder": {
                return this.izP ? "positiveBorder" : null;
            }
            case "disabled": {
                return !this.cHn;
            }
            case "itemsCount": {
                return this.izM.size();
            }
            case "rarityBorderStyle": {
                byo_2 byo_22;
                if (this.izL == fm_1.pA && (byo_22 = byp_2.lyZ.JE(this.dvH())) != null) {
                    return byo_22.egk().gkb().fWN();
                }
                return fgj.siB.fWN();
            }
            case "hoverRarityBorderStyle": {
                byo_2 byo_23;
                if (this.izL == fm_1.pA && (byo_23 = byp_2.lyZ.JE(this.dvH())) != null) {
                    return byo_23.egk().gkb().fWO();
                }
                return fgj.siB.fWO();
            }
            case "pressedRarityBorderStyle": {
                byo_2 byo_24;
                if (this.izL == fm_1.pA && (byo_24 = byp_2.lyZ.JE(this.dvH())) != null) {
                    return byo_24.egk().gkb().fWP();
                }
                return fgj.siB.fWP();
            }
            case "usedForIcon": {
                return this.izN;
            }
            case "canBeUsedAsIcon": {
                return bjf_1.l(this.izL);
            }
        }
        return null;
    }

    @NotNull
    public fm_1 duf() {
        return this.izL;
    }

    public int zT() {
        return this.izM.size();
    }

    @Contract(pure=true)
    @Nullable
    public ekp_0 dvG() {
        return this.izM.isEmpty() ? null : this.izM.get(0);
    }

    public Optional<ekp_0> DU(int n) {
        for (ekp_0 ekp_02 : this.izM) {
            if (ekp_02.AK() != n) continue;
            return Optional.of(ekp_02);
        }
        return Optional.empty();
    }

    public int dvH() {
        return this.izM.isEmpty() ? 0 : this.izM.get(0).AK();
    }

    public void e(@NotNull ekp_0 ekp_02) {
        if (!ekj_0.z(this.izL)) {
            this.izM.clear();
        }
        this.izM.add(ekp_02);
        this.dvF();
        fse_1.gFu().a((aef_2)this, izy, izz, izD);
    }

    public void DV(int n) {
        this.izM.removeIf(ekp_02 -> ekp_02.AK() == n);
        this.dvF();
        fse_1.gFu().a((aef_2)this, izy, izz, izD);
    }

    public boolean aaz() {
        return !this.izM.isEmpty();
    }

    public boolean DW(int n) {
        return this.izM.stream().anyMatch(ekp_02 -> ekp_02.AK() == n);
    }

    public boolean dvI() {
        return this.izN;
    }

    public void gy(boolean bl) {
        if (bl == this.izN) {
            return;
        }
        this.izN = bl;
        fse_1.gFu().a((aef_2)this, izH);
    }

    public boolean bqr() {
        return this.izO;
    }

    public void setSelected(boolean bl) {
        if (bl == this.izO) {
            return;
        }
        this.izO = bl;
        fse_1.gFu().a((aef_2)this, izA);
    }

    public void setEnabled(boolean bl) {
        if (bl == this.cHn) {
            return;
        }
        this.cHn = bl;
        fse_1.gFu().a((aef_2)this, izC);
    }

    public void gz(boolean bl) {
        if (bl == this.izP) {
            return;
        }
        this.izP = bl;
        fse_1.gFu().a((aef_2)this, izB);
    }

    @Override
    public bgv_2 duo() {
        if (this.izM.isEmpty()) {
            return null;
        }
        return (bgv_2)fgD.fXh().Vd(this.izM.get(0).AK());
    }

    @Override
    @Nullable
    public ejm_0 drG() {
        return ejm_0.qyV;
    }

    @Override
    @Nullable
    public Object drH() {
        return this.izM.isEmpty() ? null : Integer.valueOf(this.izM.get(0).AK());
    }

    @Override
    public String drI() {
        if (this.izM.isEmpty()) {
            return "";
        }
        return bgv_2.Dm(this.izM.get(0).AK());
    }

    @Override
    public String[] bxk() {
        return izJ;
    }

    public String toString() {
        return "CosmeticSlotView{m_type=" + String.valueOf((Object)this.izL) + ", m_cosmeticItem=" + String.valueOf(this.izM) + "}";
    }
}

