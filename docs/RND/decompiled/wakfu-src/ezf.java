/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

class ezf
extends Va<UX> {
    private boolean ppj;
    final /* synthetic */ ezc ppk;

    ezf(ezc ezc2, UX uX, int n) {
        this.ppk = ezc2;
        super(uX, n);
        this.ppj = false;
    }

    @Override
    public void as(ByteBuffer byteBuffer) {
        byteBuffer.putShort(this.ppk.ejt);
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        short s = byteBuffer.getShort();
        this.ppj = this.ppk.ejt != 0 && this.ppk.ejt != s;
        this.ppk.ejt = s;
    }

    @Override
    public void zl() {
    }

    @Override
    public void zm() {
        if (this.ppj) {
            for (UZ uZ : ezc.c(this.ppk)) {
                uZ.a(this);
            }
        }
        this.ppj = false;
    }
}

