/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class coQ
extends nr_0 {
    private long mcA;
    private int bfF;
    private int hKf;
    private int hKg;
    private byte mds;
    private byte mdt;
    private long htO;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mcA = byteBuffer.getLong();
        this.bfF = byteBuffer.getInt();
        this.hKf = byteBuffer.getInt();
        this.hKg = byteBuffer.getInt();
        this.mds = byteBuffer.get();
        this.mdt = byteBuffer.get();
        this.htO = byteBuffer.getLong();
        return true;
    }

    @Override
    public int d() {
        return 13946;
    }

    public long evP() {
        return this.mcA;
    }

    public int avZ() {
        return this.bfF;
    }

    public int ewI() {
        return this.hKf;
    }

    public int ewJ() {
        return this.hKg;
    }

    public boolean ewK() {
        return this.mds == 1;
    }

    public boolean ewL() {
        return this.mdt == 1;
    }

    public long evy() {
        return this.htO;
    }
}

