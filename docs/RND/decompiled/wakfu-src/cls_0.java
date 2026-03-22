/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from cls
 */
public class cls_0
extends cll_0 {
    private final long lZq;
    private final long lZr;
    @NotNull
    private final List<Long> lZs;
    @Nullable
    private final Long lZt;

    public cls_0(long l, long l2, long l3) {
        this(l, l2, List.of(Long.valueOf(l3)), null);
    }

    public cls_0(long l, long l2, @NotNull List<Long> list) {
        this(l, l2, list, null);
    }

    public cls_0(long l, long l2, @NotNull List<Long> list, @Nullable Long l3) {
        this.lZq = l;
        this.lZr = l2;
        this.lZs = list;
        this.lZt = l3;
    }

    @Override
    public byte[] aVX() {
        azg_1 azg_12 = new azg_1(18 + 8 * this.lZs.size() + 8);
        azg_12.gK(this.lZq);
        azg_12.gK(this.lZr);
        azg_12.aG((short)this.lZs.size());
        this.lZs.forEach(azg_12::gK);
        azg_12.gK(this.lZt == null ? -1L : this.lZt);
        return this.a((byte)3, azg_12.bTe());
    }

    @Override
    public int d() {
        return 13313;
    }
}

