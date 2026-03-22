/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from coD
 */
public class cod_0
extends nr_0 {
    private long aDh;
    private int Nf;
    private long Nh;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.aDh = byteBuffer.getLong();
        this.Nf = byteBuffer.getInt();
        this.Nh = byteBuffer.getLong();
        return true;
    }

    @Override
    public int d() {
        return 12342;
    }

    public long KU() {
        return this.aDh;
    }

    public int apw() {
        return this.Nf;
    }

    public long apx() {
        return this.Nh;
    }
}

