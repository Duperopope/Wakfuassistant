/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from cjX
 */
public class cjx_0
extends nv_0 {
    private final long lXC;
    @NotNull
    private final rc_0 lXD;

    public cjx_0(long l, @NotNull rc_0 rc_02) {
        this.lXC = l;
        this.lXD = rc_02;
    }

    @Override
    public byte[] aVX() {
        azg_1 azg_12 = new azg_1(9);
        azg_12.gK(this.lXC);
        azg_12.aF((byte)this.lXD.ordinal());
        return this.a((byte)3, azg_12.bTe());
    }

    @Override
    public int d() {
        return 12890;
    }
}

