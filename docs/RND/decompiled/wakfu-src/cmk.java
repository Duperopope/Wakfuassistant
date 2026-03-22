/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
import java.nio.ByteBuffer;
import lombok.Generated;

public class cmk
extends cmy_0 {
    private int jZr;
    private int jZs;
    private int jZt;
    private int jZu;
    private long jZv;

    @Override
    protected void fd(ByteBuffer byteBuffer) {
        this.jZr = byteBuffer.getInt();
        this.jZs = byteBuffer.getInt();
        this.jZt = byteBuffer.getInt();
        this.jZu = byteBuffer.getInt();
        this.jZv = byteBuffer.getLong();
    }

    @Override
    public int d() {
        return 12706;
    }

    @Generated
    public int aop() {
        return this.jZr;
    }

    @Generated
    public int dVv() {
        return this.jZs;
    }

    @Generated
    public int dVw() {
        return this.jZt;
    }

    @Generated
    public int dVx() {
        return this.jZu;
    }

    @Generated
    public long dVy() {
        return this.jZv;
    }
}

