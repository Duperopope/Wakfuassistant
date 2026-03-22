/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cra
extends cqQ {
    private long btF;
    private abi_1 bmk;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.fi(byteBuffer);
        this.btF = byteBuffer.getLong();
        this.bmk = abi_1.wG(byteBuffer.get());
        return true;
    }

    @Override
    public int d() {
        return 12625;
    }

    public long OO() {
        return this.btF;
    }

    public abi_1 bcB() {
        return this.bmk;
    }

    @Override
    public int avZ() {
        return 0;
    }

    @Override
    public eui_1 eza() {
        return eui_1.rsj;
    }
}

