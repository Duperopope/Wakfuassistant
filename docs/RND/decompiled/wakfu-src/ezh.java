/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

class ezh
extends Va<UX> {
    private boolean ppj;
    final /* synthetic */ ezc ppm;

    ezh(ezc ezc2, UX uX, int n) {
        this.ppm = ezc2;
        super(uX, n);
        this.ppj = false;
    }

    @Override
    public void as(ByteBuffer byteBuffer) {
        byteBuffer.put((byte)(this.ppm.poY ? 1 : 0));
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        boolean bl = byteBuffer.get() == 1;
        this.ppj = this.ppm.poY != bl;
        this.ppm.poY = bl;
    }

    @Override
    public void zl() {
    }

    @Override
    public void zm() {
        if (this.ppj) {
            for (UZ uZ : ezc.e(this.ppm)) {
                uZ.a(this);
            }
        }
        this.ppj = false;
    }
}

