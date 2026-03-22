/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

class UY
extends Va<UX> {
    private byte[] bxz;
    final /* synthetic */ UX bxA;

    UY(UX uX, UX uX2) {
        this.bxA = uX;
        super(uX2);
    }

    @Override
    public void as(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.bxA.bxw);
        byteBuffer.putLong(this.bxA.aDh);
        byteBuffer.put((byte)this.bxz.length);
        byteBuffer.put(this.bxz);
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        this.bxA.bxw = byteBuffer.getLong();
        this.bxA.aDh = byteBuffer.getLong();
        this.bxz = new byte[byteBuffer.get() & 0xFF];
        byteBuffer.get(this.bxz);
        this.bxA.aFD = BH.dc(this.bxz);
    }

    @Override
    public int zt() {
        this.bxz = BH.aP(this.bxA.aFD);
        return 21 + this.bxz.length;
    }

    @Override
    public void zm() {
        for (UZ uZ : this.bxA.bxv) {
            uZ.a(this);
        }
    }

    @Override
    public void zl() {
    }
}

