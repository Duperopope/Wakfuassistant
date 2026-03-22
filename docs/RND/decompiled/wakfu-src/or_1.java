/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from OR
 */
class or_1
extends fi_1 {
    static final /* synthetic */ boolean bai;
    final /* synthetic */ op_1 baj;

    or_1(op_1 op_12) {
        this.baj = op_12;
    }

    @Override
    public void as(ByteBuffer byteBuffer) {
        byteBuffer.putShort(this.baj.bas);
        byteBuffer.putInt(this.baj.bap);
        byteBuffer.putInt(this.baj.baq);
        byteBuffer.putShort(this.baj.bar);
        byte[] byArray = BH.aP(this.baj.baB);
        if (!bai && byArray.length >= 65535) {
            throw new AssertionError((Object)"chaine des parametres trop longue");
        }
        byteBuffer.putShort((short)(byArray.length & 0xFFFF));
        byteBuffer.put(byArray);
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int zt() {
        return 14 + BH.aP(this.baj.baB).length;
    }

    static {
        bai = !op_1.class.desiredAssertionStatus();
    }
}

