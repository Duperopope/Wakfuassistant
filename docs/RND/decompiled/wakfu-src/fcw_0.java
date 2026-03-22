/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from fcW
 */
public final class fcw_0
implements fcx_0 {
    private long rUL;
    public static final int rUM = 647;
    public static final int rUN = 646;

    fcw_0() {
    }

    public fcw_0(long l) {
        this.rUL = l;
    }

    @Override
    public byte[] apI() {
        azg_1 azg_12 = new azg_1();
        azg_12.gK(this.rUL);
        return azg_12.bTe();
    }

    @Override
    public void eL(ByteBuffer byteBuffer) {
        this.rUL = byteBuffer.getLong();
    }

    @Override
    public short aIi() {
        return 2;
    }

    public long fSV() {
        return this.rUL;
    }
}

