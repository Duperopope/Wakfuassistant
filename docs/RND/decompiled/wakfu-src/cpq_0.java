/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cpQ
 */
public class cpq_0
extends nr_0 {
    private int jcr;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.jcr = byteBuffer.getInt();
        return true;
    }

    @Override
    public int d() {
        return 13075;
    }

    public int dye() {
        return this.jcr;
    }
}

