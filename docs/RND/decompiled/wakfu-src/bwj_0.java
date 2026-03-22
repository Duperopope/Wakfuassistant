/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.jetbrains.annotations.Nullable
 */
import lombok.Generated;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bwJ
 */
final class bwj_0 {
    final bwK jzL;
    final bmx_0 jzM;
    final bmd_0 jzN;
    @Nullable
    frd jzO;

    @Generated
    public bwj_0(bwK bwK2, bmx_0 bmx_02, bmd_0 bmd_02) {
        this.jzL = bwK2;
        this.jzM = bmx_02;
        this.jzN = bmd_02;
    }

    @Generated
    public String toString() {
        return "SpellDeckModifications.Modification(m_type=" + String.valueOf((Object)this.jzL) + ", m_spell=" + String.valueOf(this.jzM) + ", m_slot=" + String.valueOf(this.jzN) + ", m_fullDeck=" + String.valueOf(this.jzO) + ")";
    }
}

