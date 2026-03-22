/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

class ezj
extends Va<ezi> {
    final /* synthetic */ ezi ppp;

    ezj(ezi ezi2, ezi ezi3, int n) {
        this.ppp = ezi2;
        super(ezi3, n);
    }

    @Override
    public void as(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.ppp.ppn);
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        this.ppp.ppn = byteBuffer.getLong();
    }

    @Override
    public void zl() {
    }

    @Override
    public void zm() {
    }
}

