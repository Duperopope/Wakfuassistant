/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cpc
extends nr_0 {
    private long aDh;
    private int mdE;
    private int mdF;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.aDh = byteBuffer.getLong();
        this.mdE = byteBuffer.getInt();
        this.mdF = byteBuffer.getInt();
        return true;
    }

    @Override
    public int d() {
        return 13091;
    }

    public long KU() {
        return this.aDh;
    }

    public int ewU() {
        return this.mdE;
    }

    public int ewV() {
        return this.mdF;
    }
}

