/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cxJ
extends nr_0 {
    private long lKU;
    private long mmc;
    private String mmd;
    private byte bIj;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.lKU = byteBuffer.getLong();
        this.mmc = byteBuffer.getLong();
        byte[] byArray2 = new byte[byteBuffer.get()];
        byteBuffer.get(byArray2);
        this.mmd = BH.dc(byArray2);
        this.bIj = byteBuffer.get();
        return true;
    }

    public String eFb() {
        return this.mmd;
    }

    public byte bks() {
        return this.bIj;
    }

    public long esw() {
        return this.lKU;
    }

    public long eFc() {
        return this.mmc;
    }

    @Override
    public int d() {
        return 1122;
    }
}

