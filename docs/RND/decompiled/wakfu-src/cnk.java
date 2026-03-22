/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

public class cnk
extends nv_0 {
    private byte[] mbD;

    @Override
    public byte[] aVX() {
        azg_1 azg_12 = new azg_1();
        azg_12.vC(this.mbD.length);
        azg_12.dH(this.mbD);
        return this.a((byte)3, azg_12.bTe());
    }

    @Override
    public int d() {
        return 12391;
    }

    public void h(@NotNull dn_2 dn_22) {
        this.mbD = dn_22.toByteArray();
    }
}

