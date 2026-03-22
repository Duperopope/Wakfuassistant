/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

class eTK
extends fi_1 {
    final /* synthetic */ eTC rqa;

    eTK(eTC eTC2) {
        this.rqa = eTC2;
    }

    @Override
    public void as(ByteBuffer byteBuffer) {
        String string = this.rqa.jfO.getDescription();
        byte[] byArray = BH.aP(string);
        byteBuffer.put((byte)byArray.length);
        byteBuffer.put(byArray);
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        short s;
        if (this.rqa.jfO == null) {
            this.rqa.jfO = eTC.rpL.dFr();
        }
        if ((s = (short)byteBuffer.get()) < 0) {
            s = (short)(s + 256);
        }
        byte[] byArray = new byte[s];
        byteBuffer.get(byArray);
        this.rqa.jfO.oA(BH.dc(byArray));
    }

    @Override
    public int zt() {
        int n = 0;
        byte[] byArray = BH.aP(this.rqa.jfO.getDescription());
        return n += 1 + byArray.length;
    }
}

