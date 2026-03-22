/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cxI
extends nr_0 {
    private byte mbU;
    private long lKU;
    private long mma;
    private String mmb;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mbU = byteBuffer.get();
        this.lKU = byteBuffer.getLong();
        this.mma = byteBuffer.getLong();
        byte by = byteBuffer.get();
        byte[] byArray2 = new byte[by];
        byteBuffer.get(byArray2);
        this.mmb = BH.dc(byArray2);
        return true;
    }

    public long esw() {
        return this.lKU;
    }

    public String eEY() {
        return this.mmb;
    }

    public long eEZ() {
        return this.mma;
    }

    public byte eFa() {
        return this.mbU;
    }

    @Override
    public int d() {
        return 1013;
    }
}

