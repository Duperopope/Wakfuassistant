/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

class ezg
extends Va<UX> {
    private boolean ppj;
    final /* synthetic */ ezc ppl;

    ezg(ezc ezc2, UX uX, int n) {
        this.ppl = ezc2;
        super(uX, n);
        this.ppj = false;
    }

    @Override
    public void as(ByteBuffer byteBuffer) {
        byteBuffer.put((byte)(this.ppl.poX ? 1 : 0));
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        boolean bl = byteBuffer.get() == 1;
        this.ppj = this.ppl.poX != bl;
        this.ppl.poX = bl;
    }

    @Override
    public void zl() {
    }

    @Override
    public void zm() {
        if (this.ppj) {
            for (UZ uZ : ezc.d(this.ppl)) {
                uZ.a(this);
            }
        }
        this.ppj = false;
    }
}

