/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
import java.nio.ByteBuffer;
import lombok.Generated;

public class cmq
extends cmy_0 {
    private int jZU;
    private long jZV;
    private int maE;
    private int jZX;

    @Override
    protected void fd(ByteBuffer byteBuffer) {
        this.jZU = byteBuffer.getInt();
        this.jZV = byteBuffer.getLong();
        this.maE = byteBuffer.getInt();
        this.jZX = byteBuffer.getInt();
    }

    @Override
    public int d() {
        return 12571;
    }

    @Generated
    public int dVF() {
        return this.jZU;
    }

    @Generated
    public long dmi() {
        return this.jZV;
    }

    @Generated
    public int evI() {
        return this.maE;
    }

    @Generated
    public int dVH() {
        return this.jZX;
    }
}

