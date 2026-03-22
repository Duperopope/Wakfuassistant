/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class crj
extends cqQ {
    private long btF;
    private int htH;
    private int htI;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.fi(byteBuffer);
        this.btF = byteBuffer.getLong();
        this.htH = byteBuffer.getInt();
        this.htI = byteBuffer.getInt();
        return true;
    }

    @Override
    public int d() {
        return 13917;
    }

    public long OO() {
        return this.btF;
    }

    @Override
    public int avZ() {
        return 0;
    }

    @Override
    public eui_1 eza() {
        return eui_1.rsm;
    }

    public int ezE() {
        return this.htH;
    }

    public int ezF() {
        return this.htI;
    }
}

