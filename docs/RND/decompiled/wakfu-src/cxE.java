/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cxE
extends nr_0 {
    private byte kIf;
    private long cbS;
    private long mlW;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.kIf = byteBuffer.get();
        this.cbS = byteBuffer.getLong();
        this.mlW = byteBuffer.getLong();
        return true;
    }

    public byte evi() {
        return this.kIf;
    }

    public long eEV() {
        return this.cbS;
    }

    public long eEW() {
        return this.mlW;
    }

    @Override
    public int d() {
        return 1086;
    }
}

