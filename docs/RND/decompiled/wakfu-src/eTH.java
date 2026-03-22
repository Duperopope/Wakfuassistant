/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

class eTH
extends fi_1 {
    final /* synthetic */ eTC rpX;

    eTH(eTC eTC2) {
        this.rpX = eTC2;
    }

    @Override
    public void as(ByteBuffer byteBuffer) {
        ux_0 ux_02 = this.rpX.jfO.bka();
        if (ux_02 != null) {
            byteBuffer.putLong(ux_02.bjB());
        } else {
            byteBuffer.putLong(0L);
        }
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        if (this.rpX.jfO == null) {
            this.rpX.jfO = eTC.rpL.dFr();
        }
        long l = byteBuffer.getLong();
        this.rpX.jfO.P(uw_0.fn(l));
    }

    @Override
    public int zt() {
        return 8;
    }
}

