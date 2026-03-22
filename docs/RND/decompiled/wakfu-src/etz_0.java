/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from eTZ
 */
class etz_0
extends fi_1 {
    final /* synthetic */ ety_0 rrJ;

    etz_0(ety_0 ety_02) {
        this.rrJ = ety_02;
    }

    @Override
    public void as(ByteBuffer byteBuffer) {
        byte[] byArray = this.rrJ.baf().bhm();
        byteBuffer.putShort((short)byArray.length);
        byteBuffer.put(byArray);
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        byte[] byArray = new byte[byteBuffer.getShort()];
        byteBuffer.get(byArray);
        this.rrJ.eF(byArray);
    }

    @Override
    public int zt() {
        return 2 + this.rrJ.baf().DN();
    }
}

