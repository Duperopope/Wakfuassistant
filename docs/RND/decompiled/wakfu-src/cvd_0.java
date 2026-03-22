/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cvd
 */
public class cvd_0
extends nr_0 {
    private int ehW;
    private int mjL;
    private int mjM;
    private short mjN;
    private short mjO;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.ehW = byteBuffer.getInt();
        this.mjL = byteBuffer.getInt();
        this.mjM = byteBuffer.getInt();
        this.mjN = byteBuffer.getShort();
        this.mjO = byteBuffer.getShort();
        return true;
    }

    @Override
    public int d() {
        return 12782;
    }

    public int cln() {
        return this.ehW;
    }

    public int eDI() {
        return this.mjL;
    }

    public int eDJ() {
        return this.mjM;
    }

    public short eDK() {
        return this.mjN;
    }

    public short eDL() {
        return this.mjO;
    }
}

