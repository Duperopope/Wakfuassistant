/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cpU
extends nr_0 {
    private int eAf;
    private boolean asG;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.eAf = byteBuffer.getInt();
        this.asG = byteBuffer.get() == 1;
        return true;
    }

    @Override
    public int d() {
        return 12385;
    }

    public int exM() {
        return this.eAf;
    }

    public boolean aGv() {
        return this.asG;
    }
}

