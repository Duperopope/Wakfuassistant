/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from uc
 */
public class uc_1
implements gs_0 {
    public short acj = 0;
    public byte ack = 0;
    public byte acl = 0;
    public byte acm = 0;
    public byte acn = 0;
    public static final int aco = 6;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putShort(this.acj);
        byteBuffer.put(this.ack);
        byteBuffer.put(this.acl);
        byteBuffer.put(this.acm);
        byteBuffer.put(this.acn);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.acj = byteBuffer.getShort();
        this.ack = byteBuffer.get();
        this.acl = byteBuffer.get();
        this.acm = byteBuffer.get();
        this.acn = byteBuffer.get();
        return true;
    }

    @Override
    public void clear() {
        this.acj = 0;
        this.ack = 0;
        this.acl = 0;
        this.acm = 0;
        this.acn = 0;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        return 6;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.bP(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void bP(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("referenceId=").append(this.acj).append('\n');
        stringBuilder.append(string).append("step=").append(this.ack).append('\n');
        stringBuilder.append(string).append("x=").append(this.acl).append('\n');
        stringBuilder.append(string).append("y=").append(this.acm).append('\n');
        stringBuilder.append(string).append("z=").append(this.acn).append('\n');
    }
}

