/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public abstract class fpO {
    private int mmA;
    private int iVe;

    protected fpO() {
    }

    protected fpO(int n, int n2) {
        this.mmA = n;
        this.iVe = n2;
    }

    public int eFz() {
        return this.mmA;
    }

    public void YI(int n) {
        this.mmA = n;
    }

    public int dDc() {
        return this.iVe;
    }

    public void YJ(int n) {
        this.iVe = n;
    }

    void e(azg_1 azg_12) {
        azg_12.vC(this.mmA);
        azg_12.vC(this.iVe);
    }

    void eL(ByteBuffer byteBuffer) {
        this.mmA = byteBuffer.getInt();
        this.iVe = byteBuffer.getInt();
    }

    public abstract fpl_0 ghm();
}

