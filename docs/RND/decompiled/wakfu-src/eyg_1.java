/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from eYg
 */
final class eyg_1
extends eyl_1 {
    private boolean ppj = false;

    eyg_1(exz_1 exz_12) {
        super(exz_12);
    }

    @Override
    public void as(ByteBuffer byteBuffer) {
        byteBuffer.put((byte)(this.rJs.fmm() ? 1 : 0));
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        boolean bl = byteBuffer.get() == 1;
        this.ppj = this.rJs.fmm() != bl;
        this.rJs.ly(bl);
    }

    public void zl() {
    }

    @Override
    public void zm() {
        if (this.ppj) {
            super.zm();
        }
        this.ppj = false;
    }
}

