/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class eLh {
    private final long qFs;
    private final long qFt;
    private elo_0 qFu;
    private final uw_0 qFv = new uw_0(uw_0.bvJ);

    public eLh(long l, long l2) {
        this.qFs = l;
        this.qFt = l2;
    }

    public long LV() {
        return this.qFs;
    }

    public elo_0 fzw() {
        return this.qFu;
    }

    public void a(elo_0 elo_02) {
        this.qFu = elo_02;
    }

    public uw_0 eEh() {
        return this.qFv;
    }

    public void D(ux_0 ux_02) {
        this.qFv.f(ux_02);
    }

    public long fzt() {
        return this.qFt;
    }

    public void as(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.qFs);
        byteBuffer.put(this.qFu.aJr());
        byteBuffer.putLong(this.qFv.bjB());
    }
}

