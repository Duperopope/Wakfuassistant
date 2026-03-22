/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ctz
 */
public final class ctz_0
extends nr_0 {
    private long mir;
    private String mis;

    public long awb() {
        return this.mir;
    }

    public String eCn() {
        return this.mis;
    }

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mir = byteBuffer.getLong();
        short s = byteBuffer.getShort();
        byte[] byArray2 = new byte[s];
        byteBuffer.get(byArray2);
        this.mis = BH.dc(byArray2);
        return true;
    }

    @Override
    public int d() {
        return 13150;
    }
}

