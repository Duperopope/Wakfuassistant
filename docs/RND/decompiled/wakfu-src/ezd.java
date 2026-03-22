/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

class ezd
extends Va<UX> {
    final /* synthetic */ ezc pph;

    ezd(ezc ezc2, UX uX, int n) {
        this.pph = ezc2;
        super(uX, n);
    }

    @Override
    public void as(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.pph.poU);
        byteBuffer.putInt(this.pph.poV);
        byteBuffer.putInt(this.pph.iar);
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        this.pph.poU = byteBuffer.getInt();
        this.pph.poV = byteBuffer.getInt();
        this.pph.iar = byteBuffer.getInt();
    }

    @Override
    public int zt() {
        return 12;
    }

    @Override
    public void zm() {
        for (UZ uZ : ezc.a(this.pph)) {
            uZ.a(this);
        }
    }

    @Override
    public void zl() {
    }
}

