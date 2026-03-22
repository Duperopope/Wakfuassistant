/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cpL
 */
public class cpl_0
extends nr_0 {
    private long meg;
    private int eIx;
    private byte lXi;
    private long cwe;
    private long meh;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.meg = byteBuffer.getLong();
        this.eIx = byteBuffer.getInt();
        this.lXi = byteBuffer.get();
        this.cwe = byteBuffer.getLong();
        this.meh = byteBuffer.getLong();
        return true;
    }

    @Override
    public int d() {
        return 12038;
    }

    public long exA() {
        return this.meg;
    }

    public int rX() {
        return this.eIx;
    }

    public byte exB() {
        return this.lXi;
    }

    public long Tz() {
        return this.cwe;
    }

    public long exC() {
        return this.meh;
    }
}

