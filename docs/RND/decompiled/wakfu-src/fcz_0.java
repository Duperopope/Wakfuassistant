/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from fcZ
 */
public final class fcz_0
implements fcx_0 {
    private byte hOe;
    private byte rUO;

    fcz_0() {
    }

    public fcz_0(byte by, byte by2) {
        this.hOe = by;
        this.rUO = by2;
    }

    public byte deO() {
        return this.hOe;
    }

    public byte fSW() {
        return this.rUO;
    }

    @Override
    public byte[] apI() {
        return new byte[]{this.hOe, this.rUO};
    }

    @Override
    public void eL(ByteBuffer byteBuffer) {
        this.hOe = byteBuffer.get();
        this.rUO = byteBuffer.get();
    }

    @Override
    public short aIi() {
        return 4;
    }
}

