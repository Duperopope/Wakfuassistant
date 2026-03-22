/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from coF
 */
public class cof_0
extends nr_0 {
    private long aDh;
    private int Nf;
    private boolean mdj;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.aDh = byteBuffer.getLong();
        this.Nf = byteBuffer.getInt();
        this.mdj = byteBuffer.get() != 0;
        return true;
    }

    @Override
    public int d() {
        return 13154;
    }

    public long KU() {
        return this.aDh;
    }

    public int apw() {
        return this.Nf;
    }

    public boolean dcc() {
        return this.mdj;
    }
}

