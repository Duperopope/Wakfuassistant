/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from eYh
 */
final class eyh_1
extends eyl_1 {
    eyh_1(exz_1 exz_12) {
        super(exz_12);
    }

    @Override
    public void as(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.rJs.fmi());
        byteBuffer.putInt(this.rJs.fmj());
        byteBuffer.putInt(this.rJs.fml());
        byteBuffer.putInt(this.rJs.fmk());
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        this.rJs.OZ(byteBuffer.getInt());
        this.rJs.Pa(byteBuffer.getInt());
        this.rJs.Pc(byteBuffer.getInt());
        this.rJs.Pb(byteBuffer.getInt());
        this.zm();
    }

    @Override
    public int zt() {
        return 16;
    }
}

