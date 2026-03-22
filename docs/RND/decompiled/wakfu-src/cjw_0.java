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
 * Renamed from cjW
 */
public class cjw_0
extends nv_0 {
    private final long lXx;
    private final rb_0 lXy;
    private final long lXz;
    @Nullable
    private Byte lXA;
    @Nullable
    private rd_0 lXB;

    public cjw_0(long l, rb_0 rb_02, long l2) {
        this.lXx = l;
        this.lXy = rb_02;
        this.lXz = l2;
    }

    public void a(byte by, @NotNull rd_0 rd_02) {
        this.lXA = by;
        this.lXB = rd_02;
    }

    @Override
    public byte[] aVX() {
        azg_1 azg_12 = new azg_1(this.bDw());
        azg_12.gK(this.lXx);
        azg_12.aF((byte)this.lXy.ordinal());
        azg_12.gK(this.lXz);
        if (this.lXy == rb_0.bjs) {
            azg_12.aF(this.lXA);
            azg_12.aF(this.lXB.aJr());
        }
        return this.a((byte)3, azg_12.bTe());
    }

    private int bDw() {
        return 17 + (this.lXy == rb_0.bjs ? 2 : 0);
    }

    @Override
    public int d() {
        return 12568;
    }
}

