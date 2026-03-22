/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

class fjq
extends fkl_0 {
    final /* synthetic */ fjo_0 syF;

    fjq(fjo_0 fjo_02) {
        this.syF = fjo_02;
    }

    @Override
    public void g(ByteBuffer byteBuffer, int n) {
        this.syF.syy = byteBuffer.getShort();
        this.syF.syz = byteBuffer.getInt();
        this.syF.syA = byteBuffer.getInt();
    }

    @Override
    public void as(ByteBuffer byteBuffer) {
        byteBuffer.putShort(this.syF.syy);
        byteBuffer.putInt(this.syF.syz);
        byteBuffer.putInt(this.syF.syA);
    }

    @Override
    public int DN() {
        return 10;
    }
}

