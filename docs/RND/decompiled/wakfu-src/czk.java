/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class czk
extends nr_0 {
    private final ftY mnb = new ftY();

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mnb.eL(byteBuffer);
        return false;
    }

    @Override
    public int d() {
        return 22309;
    }

    public ftY etg() {
        return this.mnb;
    }
}

