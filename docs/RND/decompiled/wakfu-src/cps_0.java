/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cpS
 */
public class cps_0
extends nr_0 {
    private long aDh;
    private int ejK;
    private int iMR;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.aDh = byteBuffer.getLong();
        this.ejK = byteBuffer.getInt();
        this.iMR = byteBuffer.getInt();
        return false;
    }

    public long KU() {
        return this.aDh;
    }

    @Override
    public int d() {
        return 13087;
    }

    public int IO() {
        return this.ejK;
    }

    public int GN() {
        return this.iMR;
    }
}

