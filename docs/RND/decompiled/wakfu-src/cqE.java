/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cqE
extends cqf {
    private long btF;
    private boolean bmw;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.fg(byteBuffer);
        this.btF = byteBuffer.getLong();
        this.bmw = byteBuffer.get() == 1;
        return true;
    }

    @Override
    public int d() {
        return 13203;
    }

    public boolean aLB() {
        return this.bmw;
    }

    public long OO() {
        return this.btF;
    }
}

