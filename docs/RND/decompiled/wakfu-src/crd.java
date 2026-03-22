/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class crd
extends cqQ {
    private long aZj;
    private int epc;
    private boolean mfP;
    private int mfQ;
    private int mfR;
    private short mfS;
    private boolean huS;
    private boolean huT;
    private short ejt;
    private ym_1 mfT;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.fi(byteBuffer);
        this.aZj = byteBuffer.getLong();
        this.epc = byteBuffer.getInt();
        this.ejt = byteBuffer.getShort();
        boolean bl = this.mfP = byteBuffer.get() == 1;
        if (this.mfP) {
            this.mfT = new ym_1();
            if (!this.mfT.aG(byteBuffer)) {
                return false;
            }
        }
        boolean bl2 = this.huT = byteBuffer.get() == 1;
        if (!this.huT) {
            this.huS = byteBuffer.get() == 1;
            this.mfQ = byteBuffer.getInt();
            this.mfR = byteBuffer.getInt();
            this.mfS = byteBuffer.getShort();
        } else {
            this.huS = false;
        }
        return true;
    }

    @Override
    public int d() {
        return 13004;
    }

    public boolean cWx() {
        return this.huT;
    }

    public boolean cWw() {
        return this.huS;
    }

    public int dut() {
        return this.epc;
    }

    public int ezu() {
        return this.mfQ;
    }

    public int ezv() {
        return this.mfR;
    }

    public short ezw() {
        return this.mfS;
    }

    public long fD() {
        return this.aZj;
    }

    public boolean ezx() {
        return this.mfP;
    }

    public ym_1 ezy() {
        return this.mfT;
    }

    @Override
    public int avZ() {
        return 0;
    }

    public short cmL() {
        return this.ejt;
    }

    @Override
    public eui_1 eza() {
        return eui_1.rst;
    }
}

