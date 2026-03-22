/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

class eTF
extends fi_1 {
    final /* synthetic */ eTC rpV;

    eTF(eTC eTC2) {
        this.rpV = eTC2;
    }

    @Override
    public void as(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.rpV.jfO.Lx());
        byteBuffer.putLong(this.rpV.jfO.Xi());
        byteBuffer.put(this.rpV.jfO.aFW());
        byteBuffer.put(this.rpV.jfO.eJz());
        byteBuffer.put(this.rpV.jfO.fJg() ? (byte)1 : 0);
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        if (this.rpV.jfO == null) {
            this.rpV.jfO = eTC.rpL.dFr();
        }
        this.rpV.jfO.di(byteBuffer.getLong());
        this.rpV.jfO.pi(byteBuffer.getLong());
        this.rpV.jfO.a(byteBuffer.get());
        this.rpV.jfO.bE(byteBuffer.get());
        this.rpV.jfO.mA(byteBuffer.get() == 1);
    }

    @Override
    public int zt() {
        return 19;
    }
}

