/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from bBD
 */
class bbd_2
extends fi_1 {
    final /* synthetic */ bbc_1 jGr;

    bbd_2(bbc_1 bbc_12) {
        this.jGr = bbc_12;
    }

    @Override
    public void as(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException("Ne devrait pas passer par ici");
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        ((bDl)this.jGr.dNj()).bV(byteBuffer.getShort());
    }
}

