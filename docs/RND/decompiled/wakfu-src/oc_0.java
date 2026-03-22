/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from Oc
 */
public class oc_0
extends nr_0 {
    private String aYN;
    private String aZn;
    private long aZj;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        byte[] byArray2 = new byte[byteBuffer.get() & 0xFF];
        byteBuffer.get(byArray2);
        this.aYN = BH.dc(byArray2);
        byte[] byArray3 = new byte[byteBuffer.get() & 0xFF];
        byteBuffer.get(byArray3);
        this.aZn = BH.dc(byArray3);
        this.aZj = byteBuffer.getLong();
        return true;
    }

    @Override
    public int d() {
        return 773;
    }

    public String aWI() {
        return this.aYN;
    }

    public String aWQ() {
        return this.aZn;
    }

    public long fD() {
        return this.aZj;
    }
}

