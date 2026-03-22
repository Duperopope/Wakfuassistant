/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cri
extends cqQ {
    private long btF;
    private long btk;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.fi(byteBuffer);
        this.btF = byteBuffer.getLong();
        this.btk = byteBuffer.getLong();
        return true;
    }

    @Override
    public int d() {
        return 12120;
    }

    public long OO() {
        return this.btF;
    }

    public long bhu() {
        return this.btk;
    }

    @Override
    public int avZ() {
        return 0;
    }

    @Override
    public eui_1 eza() {
        return eui_1.rsn;
    }
}

