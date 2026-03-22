/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from eYd
 */
final class eyd_1
extends eyl_1 {
    eyd_1(exz_1 exz_12) {
        super(exz_12);
    }

    @Override
    public void as(ByteBuffer byteBuffer) {
        if (!(this.rJs instanceof exy_1)) {
            return;
        }
        eJS eJS2 = ((exy_1)this.rJs).fPk();
        byteBuffer.put(eJU.w(eJS2));
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        if (!(this.rJs instanceof exy_1)) {
            return;
        }
        eJS eJS2 = eJU.fs(byteBuffer);
        ((exy_1)this.rJs).C(eJS2);
    }

    @Override
    public int zt() {
        return eJU.v(((exy_1)this.rJs).fPk());
    }
}

