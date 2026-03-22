/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cqS
extends cqQ {
    private long mfE;
    private long mfF;
    private long bhR;
    private boolean hsA;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.fi(byteBuffer);
        this.hsA = byteBuffer.get() == 1;
        this.mfE = byteBuffer.getLong();
        this.mfF = byteBuffer.getLong();
        this.bhR = byteBuffer.getLong();
        return true;
    }

    @Override
    public int d() {
        return 12597;
    }

    @Override
    public int avZ() {
        return 0;
    }

    @Override
    public eui_1 eza() {
        return eui_1.rsl;
    }

    public boolean eze() {
        return this.hsA;
    }

    public long ezf() {
        return this.mfE;
    }

    public long Qy() {
        return this.bhR;
    }

    public long ezg() {
        return this.mfF;
    }
}

