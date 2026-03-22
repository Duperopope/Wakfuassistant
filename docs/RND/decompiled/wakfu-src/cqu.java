/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cqu
extends nr_0 {
    private int mfe;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mfe = byteBuffer.getInt();
        return true;
    }

    public int eyx() {
        return this.mfe;
    }

    @Override
    public int d() {
        return 13169;
    }
}

