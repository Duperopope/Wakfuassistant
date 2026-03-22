/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class ctb
extends nr_0 {
    private fpP mhP;
    private ot mhR;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mhP = fpP.hm(byteBuffer.get());
        if (this.mhP.aHz()) {
            return true;
        }
        byte[] byArray2 = new byte[byteBuffer.remaining()];
        byteBuffer.get(byArray2);
        this.mhR = ot.ct(byArray2);
        return true;
    }

    @Override
    public int d() {
        return 12981;
    }

    public ot eBP() {
        return this.mhR;
    }

    public fpP eBN() {
        return this.mhP;
    }
}

