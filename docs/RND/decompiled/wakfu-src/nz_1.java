/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from NZ
 */
public class nz_1
extends nr_0 {
    private String aYL;
    private String aFD;
    private long aZj;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        byte[] byArray2 = new byte[byteBuffer.get() & 0xFF];
        byteBuffer.get(byArray2);
        this.aYL = BH.dc(byArray2);
        byte[] byArray3 = new byte[byteBuffer.get() & 0xFF];
        byteBuffer.get(byArray3);
        this.aFD = BH.dc(byArray3);
        this.aZj = byteBuffer.getLong();
        return true;
    }

    @Override
    public int d() {
        return 673;
    }

    public String aWA() {
        return this.aYL;
    }

    public String xO() {
        return this.aFD;
    }

    public long fD() {
        return this.aZj;
    }
}

