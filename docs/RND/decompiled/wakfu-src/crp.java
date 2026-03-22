/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class crp
extends cqQ {
    private long bhQ;
    private ym_1 mfT;
    private int lYl;
    private int lYm;
    private short lYn;
    private boolean huS;
    private boolean huT;
    private int mgb;

    @Override
    public boolean dn(byte[] byArray) {
        if (!this.h(byArray.length, 35, false)) {
            return false;
        }
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.fi(byteBuffer);
        this.bhQ = byteBuffer.getLong();
        this.mfT = new ym_1();
        if (!this.mfT.aG(byteBuffer)) {
            return false;
        }
        this.mgb = byteBuffer.getInt();
        boolean bl = this.huT = byteBuffer.get() == 1;
        this.huS = !this.huT ? byteBuffer.get() == 1 : false;
        this.lYl = byteBuffer.getInt();
        this.lYm = byteBuffer.getInt();
        this.lYn = byteBuffer.getShort();
        return true;
    }

    @Override
    public int d() {
        return 12846;
    }

    public long Qw() {
        return this.bhQ;
    }

    public ym_1 ezy() {
        return this.mfT;
    }

    public int ezK() {
        return this.lYl;
    }

    public int ezL() {
        return this.lYm;
    }

    public short ezM() {
        return this.lYn;
    }

    public boolean cWw() {
        return this.huS;
    }

    public boolean cWx() {
        return this.huT;
    }

    public int ezN() {
        return this.mgb;
    }

    @Override
    public int avZ() {
        return 0;
    }

    @Override
    public eui_1 eza() {
        return eui_1.rsc;
    }
}

