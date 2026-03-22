/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from coV
 */
public class cov_0
extends nr_0 {
    private long mcA;
    private int bap;
    private int baq;
    private short iIp;
    private boolean mdA;
    private boolean mdB;

    @Override
    public boolean dn(byte[] byArray) {
        if (!this.h(byArray.length, 20, true)) {
            return false;
        }
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mcA = byteBuffer.getLong();
        this.bap = byteBuffer.getInt();
        this.baq = byteBuffer.getInt();
        this.iIp = byteBuffer.getShort();
        this.mdA = byteBuffer.get() == 1;
        this.mdB = byteBuffer.get() == 1;
        return true;
    }

    @Override
    public int d() {
        return 12876;
    }

    public long evP() {
        return this.mcA;
    }

    public int getX() {
        return this.bap;
    }

    public int getY() {
        return this.baq;
    }

    public short bsy() {
        return this.iIp;
    }

    public boolean ewP() {
        return this.mdA;
    }

    public boolean ewQ() {
        return this.mdB;
    }
}

