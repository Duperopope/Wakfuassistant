/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class NP
extends nr_0 {
    private String aYL;
    private String aFD;
    private long aYZ;
    private short aZa;
    private byte aZb;
    private long aZc;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        byte[] byArray2 = new byte[byteBuffer.get() & 0xFF];
        byteBuffer.get(byArray2);
        this.aYL = BH.dc(byArray2);
        byte[] byArray3 = new byte[byteBuffer.get() & 0xFF];
        byteBuffer.get(byArray3);
        this.aFD = BH.dc(byArray3);
        this.aYZ = byteBuffer.getLong();
        this.aZa = byteBuffer.getShort();
        this.aZb = byteBuffer.get();
        this.aZc = byteBuffer.getLong();
        return true;
    }

    @Override
    public int d() {
        return 628;
    }

    public String aWA() {
        return this.aYL;
    }

    public long aWB() {
        return this.aYZ;
    }

    public String xO() {
        return this.aFD;
    }

    public short aWC() {
        return this.aZa;
    }

    public byte aWD() {
        return this.aZb;
    }

    public long aWE() {
        return this.aZc;
    }
}

