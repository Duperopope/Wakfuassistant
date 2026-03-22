/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class coz
extends nr_0 {
    private long mdb;
    private byte mdc;
    private float bMl;
    private float mdd;
    private float mde;
    private float mdf;
    private float mdg;
    private float mdh;
    private wg_0 bMF;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mdb = byteBuffer.getLong();
        this.mdc = byteBuffer.get();
        this.bMl = byteBuffer.getFloat();
        this.mdd = byteBuffer.getFloat();
        this.mde = byteBuffer.getFloat();
        this.mdf = byteBuffer.getFloat();
        this.mdg = byteBuffer.getFloat();
        this.mdh = byteBuffer.getFloat();
        this.bMF = wg_0.qk(byteBuffer.getInt());
        return true;
    }

    @Override
    public int d() {
        return 12048;
    }

    public long ewq() {
        return this.mdb;
    }

    public int ewr() {
        return this.mdc;
    }

    public float blv() {
        return this.bMl;
    }

    public float ews() {
        return this.mdd;
    }

    public float ewt() {
        return this.mde;
    }

    public float ewu() {
        return this.mdf;
    }

    public float ewv() {
        return this.mdg;
    }

    public float eww() {
        return this.mdh;
    }

    public wg_0 blE() {
        return this.bMF;
    }
}

