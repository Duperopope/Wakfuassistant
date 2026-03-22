/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from eYf
 */
final class eyf_1
extends eyl_1 {
    private boolean ppj = false;

    eyf_1(exz_1 exz_12) {
        super(exz_12);
    }

    @Override
    public void as(ByteBuffer byteBuffer) {
        byteBuffer.putShort(this.rJs.fPm());
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        short s = byteBuffer.getShort();
        this.ppj = s != -1 && s != this.rJs.fPm();
        this.rJs.eu(s);
    }

    @Override
    public void zm() {
        if (this.ppj) {
            super.zm();
        }
        this.ppj = false;
    }
}

