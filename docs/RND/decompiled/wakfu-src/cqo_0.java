/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cqO
 */
public class cqo_0
extends cqf {
    private int htq;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.fg(byteBuffer);
        this.htq = byteBuffer.getInt();
        return true;
    }

    @Override
    public int d() {
        return 13323;
    }

    public int dIB() {
        return this.htq;
    }
}

