/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cpk
extends nr_0 {
    private boolean mdO;
    private long brw;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mdO = byteBuffer.get() == 1;
        this.brw = byteBuffer.getLong();
        return true;
    }

    public boolean exi() {
        return this.mdO;
    }

    public long bhh() {
        return this.brw;
    }

    @Override
    public int d() {
        return 13934;
    }
}

