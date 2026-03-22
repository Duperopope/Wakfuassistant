/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from Ob
 */
public class ob_0
extends nr_0 {
    private String aYN;
    private long aZj;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        byte[] byArray2 = new byte[byteBuffer.get() & 0xFF];
        byteBuffer.get(byArray2);
        this.aYN = BH.dc(byArray2);
        this.aZj = byteBuffer.getLong();
        return true;
    }

    @Override
    public int d() {
        return 688;
    }

    public String aWI() {
        return this.aYN;
    }

    public long fD() {
        return this.aZj;
    }
}

