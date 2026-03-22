/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class csZ
extends nr_0 {
    private fpP mhP;
    private ol mhQ;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mhP = fpP.hm(byteBuffer.get());
        if (this.mhP.aHz()) {
            return true;
        }
        byte[] byArray2 = new byte[byteBuffer.remaining()];
        byteBuffer.get(byArray2);
        this.mhQ = ol.cr(byArray2);
        return true;
    }

    @Override
    public int d() {
        return 13092;
    }

    public fpP eBN() {
        return this.mhP;
    }

    public ol eBO() {
        return this.mhQ;
    }
}

