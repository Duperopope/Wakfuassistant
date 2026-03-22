/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from clr
 */
public class clr_0
extends nv_0 {
    private short elG;
    private long aDh;

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(10);
        byteBuffer.putShort(this.elG);
        byteBuffer.putLong(this.aDh);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 13110;
    }

    public void cC(short s) {
        this.elG = s;
    }

    public void db(long l) {
        this.aDh = l;
    }

    @Override
    public String toString() {
        return "MergeIntoItemSetRequestMessage{m_itemSetId=" + this.elG + "}";
    }
}

