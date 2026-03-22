/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cqW
extends cqf {
    private boolean mfK = false;
    private boolean mfL = false;
    private long btk = -1L;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.fg(byteBuffer);
        this.mfK = byteBuffer.get() == 1;
        boolean bl = this.mfL = byteBuffer.get() == 1;
        if (this.mfK) {
            this.btk = byteBuffer.getLong();
        }
        return true;
    }

    @Override
    public int d() {
        return 13124;
    }

    public boolean ezm() {
        return this.mfK;
    }

    public long bhu() {
        return this.btk;
    }

    public boolean ezn() {
        return this.mfL;
    }
}

