/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

class fjr
extends fkl_0 {
    final /* synthetic */ fjo_0 syG;

    fjr(fjo_0 fjo_02) {
        this.syG = fjo_02;
    }

    @Override
    public void g(ByteBuffer byteBuffer, int n) {
        this.syG.Le(byteBuffer.getInt());
    }

    @Override
    public void as(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.syG.Xt());
    }

    @Override
    public int DN() {
        return 4;
    }
}

