/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cva
 */
public final class cva_0
extends nr_0 {
    private long mdG;
    private fph_0 mjI;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mdG = byteBuffer.getLong();
        this.mjI = new fph_0(this.mdG);
        int n = byteBuffer.getShort();
        for (int i = 0; i < n; ++i) {
            long l = byteBuffer.getLong();
            this.mjI.a(l, fpp_0.hk(byteBuffer.get()));
            this.mjI.b(l, fpp_0.hk(byteBuffer.get()));
            this.mjI.aq(l, byteBuffer.getInt());
            this.mjI.ap(l, byteBuffer.getInt());
            this.mjI.ar(l, byteBuffer.getInt());
            this.mjI.as(l, byteBuffer.getInt());
            this.mjI.at(l, byteBuffer.getInt());
        }
        return false;
    }

    public long Tx() {
        return this.mdG;
    }

    public fph_0 eDG() {
        return this.mjI;
    }

    @Override
    public int d() {
        return 15067;
    }
}

