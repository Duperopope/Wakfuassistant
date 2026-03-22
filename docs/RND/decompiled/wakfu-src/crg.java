/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class crg
extends cqQ {
    private long btF;
    private int mfW;
    private boolean htG;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.fi(byteBuffer);
        this.btF = byteBuffer.getLong();
        this.mfW = byteBuffer.getInt();
        this.htG = byteBuffer.get() == 1;
        return true;
    }

    @Override
    public int d() {
        return 13328;
    }

    public long OO() {
        return this.btF;
    }

    public int ezB() {
        return this.mfW;
    }

    public boolean cuz() {
        return this.htG;
    }

    @Override
    public int avZ() {
        return 0;
    }

    @Override
    public eui_1 eza() {
        return eui_1.rsX;
    }
}

