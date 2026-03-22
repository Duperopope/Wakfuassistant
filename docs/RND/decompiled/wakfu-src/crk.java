/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class crk
extends cqQ {
    private long btF;

    @Override
    public int avZ() {
        return 0;
    }

    @Override
    public eui_1 eza() {
        return eui_1.rsq;
    }

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.fi(byteBuffer);
        this.btF = byteBuffer.getLong();
        return true;
    }

    @Override
    public int d() {
        return 12867;
    }

    public long OO() {
        return this.btF;
    }
}

