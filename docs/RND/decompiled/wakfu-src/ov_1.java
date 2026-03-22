/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from OV
 */
class ov_1
extends fi_1 {
    static final /* synthetic */ boolean baJ;
    final /* synthetic */ ou_1 baK;

    ov_1(ou_1 ou_12) {
        this.baK = ou_12;
    }

    @Override
    public void as(ByteBuffer byteBuffer) {
        byteBuffer.putShort(this.baK.bas);
        byteBuffer.putInt(this.baK.bap);
        byteBuffer.putInt(this.baK.baq);
        byteBuffer.putShort(this.baK.bar);
        byteBuffer.putShort(this.baK.bat);
        byteBuffer.put(this.baK.bau ? (byte)1 : 0);
        byteBuffer.put(this.baK.bav ? (byte)1 : 0);
        byteBuffer.put(this.baK.bay);
        byteBuffer.putShort(this.baK.baz);
        byteBuffer.putShort((short)this.baK.baA.size());
        for (acd_1 acd_12 : this.baK.baA) {
            byteBuffer.putInt(acd_12.getX());
            byteBuffer.putInt(acd_12.getY());
            byteBuffer.putShort(acd_12.bdi());
        }
        Object object = BH.aP(this.baK.baB);
        if (!baJ && ((Object)object).length >= 65535) {
            throw new AssertionError((Object)"chaine des parametres trop longue");
        }
        byteBuffer.putShort((short)(((Object)object).length & 0xFFFF));
        byteBuffer.put((byte[])object);
        byteBuffer.put((byte)this.baK.baD.length);
        for (int i = 0; i < this.baK.baD.length; ++i) {
            byteBuffer.put((byte)this.baK.baD[i]);
        }
        byteBuffer.putInt(this.baK.baC);
        byteBuffer.put((byte)(this.baK.baw ? 1 : 0));
        byteBuffer.put((byte)(this.baK.bax ? 1 : 0));
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int zt() {
        byte[] byArray = BH.aP(this.baK.baB);
        return 23 + (2 + 10 * this.baK.baA.size()) + (2 + byArray.length) + (1 + this.baK.baD.length) + 2;
    }

    static {
        baJ = !ou_1.class.desiredAssertionStatus();
    }
}

