/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 */
import com.google.common.base.Charsets;
import java.nio.ByteBuffer;

/*
 * Renamed from ur
 */
public class ur_2
implements gs_0 {
    public String add = null;
    public int Th = 0;
    public short aaa = 0;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        if (this.add != null) {
            byte[] byArray = this.add.getBytes(Charsets.UTF_8);
            if (byArray.length > 65535) {
                return false;
            }
            byteBuffer.putShort((short)byArray.length);
            byteBuffer.put(byArray);
        } else {
            byteBuffer.putShort((short)0);
        }
        byteBuffer.putInt(this.Th);
        byteBuffer.putShort(this.aaa);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.add = new String(byArray, Charsets.UTF_8);
        this.Th = byteBuffer.getInt();
        this.aaa = byteBuffer.getShort();
        return true;
    }

    @Override
    public void clear() {
        this.add = null;
        this.Th = 0;
        this.aaa = 0;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        n += 2;
        n += this.add != null ? this.add.getBytes(Charsets.UTF_8).length : 0;
        n += 4;
        return n += 2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.ca(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void ca(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("guid=").append(this.add).append('\n');
        stringBuilder.append(string).append("referenceId=").append(this.Th).append('\n');
        stringBuilder.append(string).append("quantity=").append(this.aaa).append('\n');
    }
}

