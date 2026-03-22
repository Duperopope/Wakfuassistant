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
 * Renamed from cmD
 */
public class cmd_0
extends nv_0 {
    private final boolean maM;
    @Nullable
    private final mn_0 maN;

    public cmd_0() {
        this.maM = true;
        this.maN = null;
    }

    public cmd_0(@NotNull mn_0 mn_02) {
        this.maM = false;
        this.maN = mn_02;
    }

    @Override
    public byte[] aVX() {
        azg_1 azg_12 = new azg_1(1 + (this.maM ? 0 : 4 + this.maN.getSerializedSize()));
        azg_12.dz(this.maM);
        if (!this.maM) {
            azg_12.vC(this.maN.getSerializedSize());
            azg_12.dH(this.maN.toByteArray());
        }
        return this.a((byte)3, azg_12.bTe());
    }

    @Override
    public int d() {
        return 12709;
    }
}

