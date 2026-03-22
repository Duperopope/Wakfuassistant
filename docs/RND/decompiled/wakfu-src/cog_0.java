/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from coG
 */
public class cog_0
extends nr_0 {
    private long aDh;
    private int jbV;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.aDh = byteBuffer.getLong();
        this.jbV = byteBuffer.getInt();
        return true;
    }

    @Override
    public int d() {
        return 12545;
    }

    public long KU() {
        return this.aDh;
    }

    public int ewy() {
        return this.jbV;
    }
}

