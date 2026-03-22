/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from cnN
 */
public class cnn_0
extends nv_0 {
    private final long mcb;
    @NotNull
    private final abi_1 mcc;
    private final int mcd;
    private final int mce;

    public cnn_0(long l, @NotNull abi_1 abi_12, int n, int n2) {
        this.mcb = l;
        this.mcc = abi_12;
        this.mcd = n;
        this.mce = n2;
    }

    @Override
    public byte[] aVX() {
        azg_1 azg_12 = new azg_1(20);
        azg_12.gK(this.mcb);
        azg_12.vC(this.mcc.wp());
        azg_12.vC(this.mcd);
        azg_12.vC(this.mce);
        return this.a((byte)3, azg_12.bTe());
    }

    @Override
    public int d() {
        return 13262;
    }
}

