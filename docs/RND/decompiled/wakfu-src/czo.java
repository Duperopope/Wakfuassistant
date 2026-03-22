/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public final class czo
extends nr_0 {
    public static final byte mni = 0;
    public static final byte mnj = 1;
    private String aFD;
    private String mnk;
    private byte mnl = (byte)-1;
    private boolean mnm;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mnl = byteBuffer.get();
        this.aFD = BH.eE(byteBuffer);
        if (this.mnl == 0) {
            this.mnk = BH.eE(byteBuffer);
            this.mnm = byteBuffer.get() == 1;
        }
        return true;
    }

    @Override
    public int d() {
        return 22953;
    }

    public String xO() {
        return this.aFD;
    }

    public String eGi() {
        return this.mnk;
    }

    public boolean bSr() {
        return this.mnm;
    }

    public byte eGj() {
        return this.mnl;
    }
}

