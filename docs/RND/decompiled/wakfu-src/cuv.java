/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cuv
extends nr_0 {
    private long mib;
    private dn_2 mjq;

    public long eBZ() {
        return this.mib;
    }

    public dn_2 eDg() {
        return this.mjq;
    }

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mib = byteBuffer.getLong();
        byte[] byArray2 = new byte[byteBuffer.getInt()];
        byteBuffer.get(byArray2);
        this.mjq = dn_2.X(byArray2);
        return false;
    }

    @Override
    public int d() {
        return 12261;
    }
}

