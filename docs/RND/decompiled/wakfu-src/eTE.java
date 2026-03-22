/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

class eTE
extends fi_1 {
    final /* synthetic */ eTC rpU;

    eTE(eTC eTC2) {
        this.rpU = eTC2;
    }

    @Override
    public void as(ByteBuffer byteBuffer) {
        String string = this.rpU.jfO.bAD();
        byte[] byArray = BH.aP(string);
        if (byArray.length > 32) {
            return;
        }
        byteBuffer.put((byte)byArray.length);
        byteBuffer.put(byArray);
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        if (this.rpU.jfO == null) {
            this.rpU.jfO = eTC.rpL.dFr();
        }
        byte by = byteBuffer.get();
        byte[] byArray = new byte[by];
        byteBuffer.get(byArray);
        this.rpU.jfO.eQ(BH.dc(byArray));
    }

    @Override
    public int zt() {
        byte[] byArray = BH.aP(this.rpU.jfO.bAD());
        int n = 1 + byArray.length;
        return n;
    }
}

