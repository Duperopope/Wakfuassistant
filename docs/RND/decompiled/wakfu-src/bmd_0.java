/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bMD
 */
public class bmd_0
implements aeh_2 {
    public static final String kyR = "spell";
    public static final String kyS = "isLocked";
    public static final String kyT = "isSelected";
    public static final String kyU = "lockText";
    public static final String[] kyV = new String[]{"spell", "isLocked", "isSelected", "lockText"};
    private final byte kyW;
    private final int kyX;
    private final boolean kyY;
    private boolean izO;
    private bmx_0 jzM;

    public bmd_0(byte by, int n, boolean bl) {
        this.kyW = by;
        this.kyX = n;
        this.kyY = bl;
    }

    public bmd_0(byte by, bmx_0 bmx_02, int n, boolean bl) {
        this.kyW = by;
        this.jzM = bmx_02;
        this.kyX = n;
        this.kyY = bl;
    }

    @Override
    public String[] bxk() {
        return kyV;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (string.equals(kyR)) {
            return this.jzM;
        }
        if (string.equals(kyS)) {
            return this.bfb();
        }
        if (string.equals(kyU)) {
            return aum_0.cWf().c("levelShort.custom", this.kyX);
        }
        if (string.equals(kyT)) {
            return this.izO;
        }
        return null;
    }

    public boolean bfb() {
        if (cvu_2.eUn() != null) {
            return false;
        }
        bgt_0 bgt_02 = cvu_2.eUm();
        if (bgt_02 == null) {
            bgt_02 = aue_0.cVJ().cVK();
        }
        if (bgt_02 != null) {
            frd frd2 = bgt_02.dnM();
            if (frd2 == null || frd2.tL() < 0) {
                return this.kyX > bgt_02.dnG();
            }
            return this.kyX > frd2.tL();
        }
        return true;
    }

    public void g(bmx_0 bmx_02) {
        this.jzM = bmx_02;
        fse_1.gFu().a((aef_2)this, kyR);
    }

    public bmx_0 eeW() {
        return this.jzM;
    }

    public byte eeX() {
        return this.kyW;
    }

    public boolean eeY() {
        return this.kyY;
    }

    public void setSelected(boolean bl) {
        this.izO = bl;
    }

    public boolean h(@NotNull bmx_0 bmx_02) {
        if (this.jzM == null) {
            return false;
        }
        return this.jzM.axA() == bmx_02.axA();
    }

    public String toString() {
        return "SpellSlotView{m_slotIndex=" + this.kyW + ", m_isPassive=" + this.kyY + ", m_spell=" + String.valueOf(this.jzM == null ? "null" : Integer.valueOf(this.jzM.axA())) + "}";
    }
}

