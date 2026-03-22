/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from eYi
 */
final class eyi_1
extends eyl_1 {
    private byte[] bxz;

    public eyi_1(exz_1 exz_12) {
        super(exz_12);
    }

    @Override
    public void as(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.rJs.aZj());
        byteBuffer.putLong(this.rJs.KU());
        byteBuffer.put((byte)this.bxz.length);
        byteBuffer.put(this.bxz);
        byteBuffer.putShort(this.rJs.aWP());
        byteBuffer.put((byte)(this.rJs.dmc() ? 1 : 0));
        byteBuffer.put(this.rJs.aWO());
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        this.rJs.fr(byteBuffer.getLong());
        this.rJs.db(byteBuffer.getLong());
        this.bxz = new byte[byteBuffer.get() & 0xFF];
        byteBuffer.get(this.bxz);
        this.rJs.setName(BH.dc(this.bxz));
        this.rJs.aT(byteBuffer.getShort());
        this.rJs.mM(byteBuffer.get() == 1);
        this.rJs.aQ(byteBuffer.get());
    }

    @Override
    public int zt() {
        this.bxz = BH.aP(this.rJs.getName());
        return 21 + this.bxz.length + 2 + 1;
    }
}

