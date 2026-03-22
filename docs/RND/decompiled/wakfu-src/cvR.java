/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class cvR
extends nr_0 {
    protected static final Logger mkA = Logger.getLogger(cvR.class);
    protected static final boolean mkB = false;
    private byte mkC;
    private long cwe;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mkC = byteBuffer.get();
        this.cwe = byteBuffer.getInt();
        return true;
    }

    @Override
    public int d() {
        return 13247;
    }

    public byte eEs() {
        return this.mkC;
    }

    public long Tz() {
        return this.cwe;
    }
}

