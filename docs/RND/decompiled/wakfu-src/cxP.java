/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cxP
extends nr_0 {
    private byte kIf;
    private long lKU;
    private String mmh;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.kIf = byteBuffer.get();
        this.lKU = byteBuffer.getLong();
        byte by = byteBuffer.get();
        byte[] byArray2 = new byte[by];
        byteBuffer.get(byArray2);
        this.mmh = BH.dc(byArray2);
        return true;
    }

    public byte evi() {
        return this.kIf;
    }

    public long esw() {
        return this.lKU;
    }

    public String eFg() {
        return this.mmh;
    }

    @Override
    public int d() {
        return 1016;
    }
}

