/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from NU
 */
public class nu_0
extends nr_0 {
    private long aZf;
    private String aYN;
    private String aFD;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.aZf = byteBuffer.getLong();
        byte[] byArray2 = new byte[byteBuffer.get() & 0xFF];
        byteBuffer.get(byArray2);
        this.aYN = BH.dc(byArray2);
        byte[] byArray3 = new byte[byteBuffer.get() & 0xFF];
        byteBuffer.get(byArray3);
        this.aFD = BH.dc(byArray3);
        return true;
    }

    @Override
    public int d() {
        return 664;
    }

    public String aWI() {
        return this.aYN;
    }

    public String xO() {
        return this.aFD;
    }

    public long aWJ() {
        return this.aZf;
    }
}

