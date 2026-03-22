/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from NV
 */
public class nv_1
extends nr_0 {
    private Long aYQ;
    private String aYN;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.aYQ = byteBuffer.getLong();
        byte[] byArray2 = new byte[byteBuffer.get() & 0xFF];
        byteBuffer.get(byArray2);
        this.aYN = BH.dc(byArray2);
        return true;
    }

    @Override
    public int d() {
        return 730;
    }

    public String aWI() {
        return this.aYN;
    }

    public Long aWK() {
        return this.aYQ;
    }
}

