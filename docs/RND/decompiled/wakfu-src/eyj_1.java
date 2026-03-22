/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from eYj
 */
final class eyj_1
extends eyl_1 {
    private boolean ppj = false;

    eyj_1(exz_1 exz_12) {
        super(exz_12);
    }

    @Override
    public void as(ByteBuffer byteBuffer) {
        byteBuffer.putShort(this.rJs.cmL());
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        short s = byteBuffer.getShort();
        this.ppj = this.rJs.cmL() != 0 && this.rJs.cmL() != s;
        this.rJs.bw(s);
    }

    @Override
    public void zm() {
        if (this.ppj) {
            super.zm();
        }
        this.ppj = false;
    }
}

