/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class cjK
extends nv_0 {
    private final int lWZ;
    @Nullable
    private final fb_2 lXa;
    private final fm_1 lXb;
    private final boolean lXc;

    private cjK(int n, @Nullable fb_2 fb_22, fm_1 fm_12, boolean bl) {
        this.lWZ = n;
        this.lXa = fb_22;
        this.lXb = fm_12;
        this.lXc = bl;
    }

    public static cjK a(int n, @NotNull fb_2 fb_22, fm_1 fm_12) {
        return new cjK(n, fb_22, fm_12, true);
    }

    public static cjK b(int n, @NotNull fb_2 fb_22, fm_1 fm_12) {
        return new cjK(n, fb_22, fm_12, false);
    }

    public static cjK b(int n, fm_1 fm_12) {
        return new cjK(n, null, fm_12, false);
    }

    @Override
    public byte[] aVX() {
        azg_1 azg_12 = new azg_1(10 + (this.lXa == null ? 0 : this.lXa.getSerializedSize()));
        azg_12.vC(this.lWZ);
        azg_12.vC(this.lXb.getNumber());
        azg_12.dz(this.lXc);
        azg_12.dz(this.lXa != null);
        if (this.lXa != null) {
            azg_12.dH(this.lXa.toByteArray());
        }
        return this.a((byte)3, azg_12.bTe());
    }

    @Override
    public int d() {
        return 13028;
    }
}

