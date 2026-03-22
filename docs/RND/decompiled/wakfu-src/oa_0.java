/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from Oa
 */
public class oa_0
extends nr_0 {
    private String aYL;
    private String aFD;
    private long aZj;
    private String aYM;
    private short aZk;
    private long aZl;
    private byte aZm;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        byte[] byArray2 = new byte[byteBuffer.get() & 0xFF];
        byteBuffer.get(byArray2);
        this.aYL = BH.dc(byArray2);
        byte[] byArray3 = new byte[byteBuffer.get() & 0xFF];
        byteBuffer.get(byArray3);
        this.aFD = BH.dc(byArray3);
        byte[] byArray4 = new byte[byteBuffer.get() & 0xFF];
        byteBuffer.get(byArray4);
        this.aYM = BH.dc(byArray4);
        this.aZj = byteBuffer.getLong();
        this.aZk = byteBuffer.getShort();
        this.aZm = byteBuffer.get();
        this.aZl = byteBuffer.getLong();
        return true;
    }

    @Override
    public int d() {
        return 684;
    }

    public String aWA() {
        return this.aYL;
    }

    public long fD() {
        return this.aZj;
    }

    public String xO() {
        return this.aFD;
    }

    public byte aWO() {
        return this.aZm;
    }

    public short aWP() {
        return this.aZk;
    }

    public String xV() {
        return this.aYM;
    }

    public long pf() {
        return this.aZl;
    }
}

