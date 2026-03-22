/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from fcV
 */
public final class fcv_0
implements fcx_0 {
    public long rUJ;
    public byte rUK;

    fcv_0() {
    }

    public fcv_0(long l, byte by) {
        this.rUJ = l;
        this.rUK = by;
    }

    @Override
    public byte[] apI() {
        azg_1 azg_12 = new azg_1();
        azg_12.gK(this.rUJ);
        azg_12.aF(this.rUK);
        return azg_12.bTe();
    }

    @Override
    public void eL(ByteBuffer byteBuffer) {
        this.rUJ = byteBuffer.getLong();
        this.rUK = byteBuffer.get();
    }

    public long fST() {
        return this.rUJ;
    }

    public byte fSU() {
        return this.rUK;
    }

    @Override
    public short aIi() {
        return 1;
    }
}

