/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from cnM
 */
public class cnm_0
extends nv_0 {
    private final int mbX;
    @NotNull
    private final abi_1 mbY;
    private final int mbZ;
    private final int mca;

    public cnm_0(int n, @NotNull abi_1 abi_12, int n2, int n3) {
        this.mbX = n;
        this.mbY = abi_12;
        this.mbZ = n2;
        this.mca = n3;
    }

    @Override
    public byte[] aVX() {
        azg_1 azg_12 = new azg_1(16);
        azg_12.vC(this.mbX);
        azg_12.vC(this.mbY.wp());
        azg_12.vC(this.mbZ);
        azg_12.vC(this.mca);
        return this.a((byte)3, azg_12.bTe());
    }

    @Override
    public int d() {
        return 12964;
    }
}

