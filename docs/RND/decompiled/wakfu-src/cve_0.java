/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cve
 */
public class cve_0
extends nr_0 {
    private jp_1 mjP;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        byte[] byArray2 = new byte[byteBuffer.remaining()];
        byteBuffer.get(byArray2);
        this.mjP = jp_1.bm(byArray2);
        return false;
    }

    public jp_1 eDM() {
        return this.mjP;
    }

    @Override
    public int d() {
        return 13482;
    }
}

