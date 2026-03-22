/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.List;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from clv
 */
public class clv_0
extends nv_0 {
    private final long lZw;
    private final long lZx;
    @NotNull
    private final List<Long> lZy;

    public clv_0(long l, long l2, @NotNull List<Long> list) {
        this.lZw = l;
        this.lZx = l2;
        this.lZy = list;
    }

    @Override
    public byte[] aVX() {
        azg_1 azg_12 = new azg_1(18 + 8 * this.lZy.size());
        azg_12.gK(this.lZw);
        azg_12.gK(this.lZx);
        azg_12.aG((short)this.lZy.size());
        this.lZy.forEach(azg_12::gK);
        return this.a((byte)3, azg_12.bTe());
    }

    @Override
    public int d() {
        return 12743;
    }
}

