/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cuj
extends nr_0 {
    private boolean mjm;
    private tg_1 mjn;
    private boolean mjo;
    private boolean iIi = true;
    private boolean iIj = false;
    private int iIk;

    public boolean eDb() {
        return this.mjm;
    }

    public tg_1 eDc() {
        return this.mjn;
    }

    public int dyP() {
        return this.iIk;
    }

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mjm = byteBuffer.get() == 1;
        this.mjo = byteBuffer.get() == 1;
        this.iIk = byteBuffer.getInt();
        if (this.mjm) {
            if (!this.mjo) {
                this.mjn = new tg_1();
                this.mjn.aG(byteBuffer);
            } else {
                this.iIj = byteBuffer.get() == 1;
                this.iIi = byteBuffer.get() == 1;
                this.mjn = null;
            }
        }
        return true;
    }

    @Override
    public int d() {
        return 12915;
    }

    public boolean eDd() {
        return this.mjo;
    }

    public boolean dyO() {
        return this.iIj;
    }

    public boolean dyN() {
        return this.iIi;
    }
}

