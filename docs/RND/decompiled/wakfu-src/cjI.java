/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class cjI
extends nv_0 {
    private final int lWU;
    @Nullable
    private Integer lWV;
    @Nullable
    private String lWR;
    @Nullable
    private Boolean lWW;

    public cjI(int n) {
        this.lWU = n;
    }

    public void KT(int n) {
        this.lWV = n;
    }

    public void ov(@NotNull String string) {
        this.lWR = string;
    }

    public void gx(boolean bl) {
        this.lWW = bl;
    }

    @Override
    public byte[] aVX() {
        azg_1 azg_12 = new azg_1(10 + (this.lWR == null ? 0 : this.lWR.getBytes().length + 1) + 1 + 1);
        azg_12.vC(this.lWU);
        azg_12.dz(this.lWV != null);
        if (this.lWV != null) {
            azg_12.vC(this.lWV);
        }
        azg_12.dz(this.lWR != null);
        if (this.lWR != null) {
            azg_12.gW(this.lWR);
        }
        azg_12.dz(this.lWW != null);
        if (this.lWW != null) {
            azg_12.dz(this.lWW);
        }
        return this.a((byte)3, azg_12.bTe());
    }

    @Override
    public int d() {
        return 13268;
    }
}

