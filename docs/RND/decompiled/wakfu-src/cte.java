/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cte
extends nr_0 {
    private fpP mhP;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mhP = fpP.hm(byteBuffer.get());
        return true;
    }

    @Override
    public int d() {
        return 13470;
    }

    public fpP eBN() {
        return this.mhP;
    }
}

