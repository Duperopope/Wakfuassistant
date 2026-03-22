/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from eYn
 */
final class eyn_1
extends eyl_1 {
    eyn_1(exz_1 exz_12) {
        super(exz_12);
    }

    @Override
    public void as(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.rJs.aqZ());
        acd_1 acd_12 = this.rJs.aZw();
        byteBuffer.putInt(acd_12.getX());
        byteBuffer.putInt(acd_12.getY());
        byteBuffer.putShort(acd_12.bdi());
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        this.rJs.fK(byteBuffer.getLong());
        acd_1 acd_12 = new acd_1(byteBuffer.getInt(), byteBuffer.getInt(), byteBuffer.getShort());
        this.rJs.b(acd_12);
    }

    @Override
    public int zt() {
        return 18;
    }
}

