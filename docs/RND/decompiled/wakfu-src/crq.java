/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public final class crq
extends cqQ {
    private long bhQ = -1L;
    private int huR = -1;
    private boolean huS;
    private boolean huT;
    private ym_1 mgc;
    private int bap;
    private int baq;
    private short ban;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.fi(byteBuffer);
        this.bhQ = byteBuffer.getLong();
        this.huR = byteBuffer.getInt();
        this.huS = byteBuffer.get() == 1;
        this.huT = byteBuffer.get() == 1;
        this.mgc = new ym_1();
        if (!this.mgc.aG(byteBuffer)) {
            return false;
        }
        this.bap = byteBuffer.getInt();
        this.baq = byteBuffer.getInt();
        this.ban = byteBuffer.getShort();
        return true;
    }

    public long Qw() {
        return this.bhQ;
    }

    public int ezO() {
        return this.huR;
    }

    public boolean cWw() {
        return this.huS;
    }

    public boolean cWx() {
        return this.huT;
    }

    public ym_1 ezP() {
        return this.mgc;
    }

    public int getX() {
        return this.bap;
    }

    public int getY() {
        return this.baq;
    }

    public short bdi() {
        return this.ban;
    }

    @Override
    public int avZ() {
        return 0;
    }

    @Override
    public eui_1 eza() {
        return eui_1.rtr;
    }

    @Override
    public int d() {
        return 12096;
    }
}

