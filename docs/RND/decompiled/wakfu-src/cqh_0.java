/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cqh
 */
public class cqh_0
extends cqf {
    private long btF;
    private boolean mex;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.fg(byteBuffer);
        this.btF = byteBuffer.getLong();
        this.mex = byteBuffer.get() == 1;
        return true;
    }

    @Override
    public int d() {
        return 12750;
    }

    public boolean exU() {
        return this.mex;
    }

    public long OO() {
        return this.btF;
    }
}

