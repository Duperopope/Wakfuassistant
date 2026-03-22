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
 * Renamed from cmz
 */
public class cmz_0
extends nv_0 {
    private final boolean maI;
    @Nullable
    private final mc maJ;

    public cmz_0() {
        this.maI = true;
        this.maJ = null;
    }

    public cmz_0(@NotNull mc mc2) {
        this.maI = false;
        this.maJ = mc2;
    }

    @Override
    public byte[] aVX() {
        azg_1 azg_12 = new azg_1(1 + (this.maI ? 0 : 4 + this.maJ.getSerializedSize()));
        azg_12.dz(this.maI);
        if (!this.maI) {
            azg_12.vC(this.maJ.getSerializedSize());
            azg_12.dH(this.maJ.toByteArray());
        }
        return this.a((byte)3, azg_12.bTe());
    }

    @Override
    public int d() {
        return 13411;
    }
}

