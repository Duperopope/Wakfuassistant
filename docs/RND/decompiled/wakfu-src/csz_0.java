/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from csz
 */
public class csz_0
extends nr_0 {
    private byte mbb;
    private uy_1 mgZ;
    private short lZm;

    @Override
    public boolean dn(byte ... byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mbb = byteBuffer.get();
        this.lZm = byteBuffer.getShort();
        if (byteBuffer.hasRemaining()) {
            this.mgZ = new uy_1();
            this.mgZ.aG(byteBuffer);
        }
        return true;
    }

    @Override
    public int d() {
        return 12857;
    }

    public uy_1 eBh() {
        return this.mgZ;
    }

    public short getDestinationPosition() {
        return this.lZm;
    }

    public byte eBi() {
        return this.mbb;
    }
}

