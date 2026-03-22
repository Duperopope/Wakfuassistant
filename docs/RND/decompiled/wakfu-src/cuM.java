/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cuM
extends nr_0 {
    private int epK;
    private int epQ;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.epK = byteBuffer.getInt();
        this.epQ = byteBuffer.getInt();
        return true;
    }

    public int ctn() {
        return this.epK;
    }

    public int Xt() {
        return this.epQ;
    }

    @Override
    public int d() {
        return 13675;
    }
}

