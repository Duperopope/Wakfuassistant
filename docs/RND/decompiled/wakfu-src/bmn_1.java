/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.lang.runtime.SwitchBootstraps;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bmn
 */
public class bmn_1
implements aeh_2,
bek_0 {
    public static final int iAn = -1;
    public static final String iAo = "iconUrl";
    public static final String iAp = "typeIconContainerStyle";
    public static final String iAq = "additionalBorder";
    public static final String iAr = "disabled";
    public static final String iAs = "rarityBorderStyle";
    public static final String iAt = "hoverRarityBorderStyle";
    public static final String iAu = "pressedRarityBorderStyle";
    public static final String[] iAv = new String[]{"iconUrl", "typeIconContainerStyle", "additionalBorder", "rarityBorderStyle", "hoverRarityBorderStyle", "pressedRarityBorderStyle"};
    @NotNull
    private final fm_1 iAw;
    private int epc = -1;
    private boolean cHn = true;
    private boolean izP = false;

    public bmn_1(@NotNull fm_1 fm_12) {
        this.iAw = fm_12;
    }

    @NotNull
    public fm_1 duf() {
        return this.iAw;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        String string2 = string;
        int n = 0;
        return switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{iAo, iAp, iAq, iAr, iAs, iAt, iAu}, (Object)string2, n)) {
            case 0 -> {
                if (this.epc == -1) {
                    yield null;
                }
                yield auc_0.cVq().a((fjm)ctd_2.daL(), this.epc);
            }
            case 1 -> bjf_1.k(this.iAw);
            case 2 -> {
                if (this.izP) {
                    yield "positiveBorder";
                }
                yield null;
            }
            case 3 -> !this.cHn;
            case 4 -> fgj.siB.fWN();
            case 5 -> fgj.siB.fWO();
            case 6 -> fgj.siB.fWP();
            default -> null;
        };
    }

    public int AK() {
        return this.epc;
    }

    public void Ec(int n) {
        this.epc = n;
        fse_1.gFu().a((aef_2)this, iAo);
    }

    public boolean aaz() {
        return this.epc != -1;
    }

    public void setEnabled(boolean bl) {
        this.cHn = bl;
        fse_1.gFu().a((aef_2)this, iAr);
    }

    public void gz(boolean bl) {
        if (bl == this.izP) {
            return;
        }
        this.izP = bl;
        fse_1.gFu().a((aef_2)this, iAq);
    }

    @Override
    public bgv_2 duo() {
        return (bgv_2)bEm.dSb().Vd(this.epc);
    }

    @Override
    public String[] bxk() {
        return iAv;
    }

    public String toString() {
        return "CosmeticsPreviewSlotView{m_type=" + String.valueOf((Object)this.iAw) + ", m_itemRefId=" + this.epc + "}";
    }
}

