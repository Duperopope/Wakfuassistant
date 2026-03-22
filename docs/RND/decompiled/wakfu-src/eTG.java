/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

class eTG
extends fi_1 {
    final /* synthetic */ eTC rpW;

    eTG(eTC eTC2) {
        this.rpW = eTC2;
    }

    @Override
    public void as(ByteBuffer byteBuffer) {
        ux_0 ux_02 = this.rpW.jfO.dis();
        if (ux_02 != null) {
            byteBuffer.putLong(ux_02.bjB());
        } else {
            byteBuffer.putLong(0L);
        }
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        if (this.rpW.jfO == null) {
            this.rpW.jfO = eTC.rpL.dFr();
        }
        long l = byteBuffer.getLong();
        this.rpW.jfO.D(uw_0.fn(l));
    }

    @Override
    public int zt() {
        return 8;
    }
}

