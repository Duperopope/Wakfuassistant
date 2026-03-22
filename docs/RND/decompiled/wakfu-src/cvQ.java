/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class cvQ
extends nr_0 {
    protected static final Logger mkx = Logger.getLogger(cvQ.class);
    protected static final boolean mky = false;
    private long mkz;
    private int ejM;
    private boolean hXv;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mkz = byteBuffer.getLong();
        this.ejM = byteBuffer.getInt();
        byte by = byteBuffer.get();
        this.hXv = by == 1;
        return true;
    }

    @Override
    public int d() {
        return 13488;
    }

    public long eEr() {
        return this.mkz;
    }

    public int oP() {
        return this.ejM;
    }

    public boolean aGv() {
        return this.hXv;
    }
}

