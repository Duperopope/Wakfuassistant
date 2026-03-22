/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class crU
extends cqQ {
    private int hug;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.fi(byteBuffer);
        this.hug = byteBuffer.getInt();
        return true;
    }

    public int TP() {
        return this.hug;
    }

    @Override
    public int d() {
        return 13674;
    }

    @Override
    public int avZ() {
        return 0;
    }

    @Override
    public eui_1 eza() {
        return eui_1.rtu;
    }
}

