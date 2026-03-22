/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class crf
extends cqf {
    private long btF;
    private acd_1 bio;

    @Override
    public boolean dn(byte[] byArray) {
        if (!this.h(byArray.length, 22, false)) {
            return false;
        }
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.fg(byteBuffer);
        this.btF = byteBuffer.getLong();
        this.bio = new acd_1(byteBuffer.getInt(), byteBuffer.getInt(), byteBuffer.getShort());
        return true;
    }

    @Override
    public int d() {
        return 12543;
    }

    public long OO() {
        return this.btF;
    }

    public acd_1 aZw() {
        return this.bio;
    }
}

