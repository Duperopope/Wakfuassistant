/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cqD
extends cqf {
    long btF;
    int mfk;
    int mfl;
    int mfm;

    @Override
    public boolean dn(byte[] byArray) {
        if (byArray.length != 24) {
            return false;
        }
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.fg(byteBuffer);
        this.btF = byteBuffer.getLong();
        this.mfk = byteBuffer.getInt();
        this.mfl = byteBuffer.getInt();
        this.mfm = byteBuffer.getInt();
        return true;
    }

    public int eyI() {
        return this.mfl;
    }

    public long OO() {
        return this.btF;
    }

    public int eyJ() {
        return this.mfk;
    }

    public int eyK() {
        return this.mfm;
    }

    @Override
    public int d() {
        return 12930;
    }
}

