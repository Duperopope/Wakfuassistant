/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cvl
 */
public class cvl_0
extends nr_0 {
    private long aDh;
    private String aFD;
    private short iiM;
    private byte mjW;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.aDh = byteBuffer.getLong();
        byte[] byArray2 = new byte[byteBuffer.get()];
        byteBuffer.get(byArray2);
        this.aFD = BH.dc(byArray2);
        this.iiM = byteBuffer.getShort();
        this.mjW = byteBuffer.get();
        return true;
    }

    public long KU() {
        return this.aDh;
    }

    public String xO() {
        return this.aFD;
    }

    public short dpx() {
        return this.iiM;
    }

    public byte eDS() {
        return this.mjW;
    }

    @Override
    public int d() {
        return 23341;
    }
}

