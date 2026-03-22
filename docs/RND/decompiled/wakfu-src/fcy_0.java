/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from fcY
 */
public final class fcy_0
implements fcx_0 {
    private byte hOe;

    fcy_0() {
    }

    public fcy_0(byte by) {
        this.hOe = by;
    }

    public byte deO() {
        return this.hOe;
    }

    @Override
    public byte[] apI() {
        return new byte[]{this.hOe};
    }

    @Override
    public void eL(ByteBuffer byteBuffer) {
        this.hOe = byteBuffer.get();
    }

    @Override
    public short aIi() {
        return 3;
    }
}

