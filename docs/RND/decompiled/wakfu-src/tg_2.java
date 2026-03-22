/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 */
import com.google.common.base.Charsets;
import java.nio.ByteBuffer;

/*
 * Renamed from tg
 */
public class tg_2
implements gs_0 {
    public byte Rv = 0;
    public short ZZ = 0;
    public short aaa = 0;
    public String Vk = null;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.put(this.Rv);
        byteBuffer.putShort(this.ZZ);
        byteBuffer.putShort(this.aaa);
        if (this.Vk != null) {
            byte[] byArray = this.Vk.getBytes(Charsets.UTF_8);
            if (byArray.length > 65535) {
                return false;
            }
            byteBuffer.putShort((short)byArray.length);
            byteBuffer.put(byArray);
        } else {
            byteBuffer.putShort((short)0);
        }
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.Rv = byteBuffer.get();
        this.ZZ = byteBuffer.getShort();
        this.aaa = byteBuffer.getShort();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.Vk = new String(byArray, Charsets.UTF_8);
        return true;
    }

    @Override
    public void clear() {
        this.Rv = 0;
        this.ZZ = 0;
        this.aaa = 0;
        this.Vk = null;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10013) {
            th_1 th_12 = new th_1(this);
            boolean bl = th_12.b(byteBuffer, n);
            if (bl) {
                th_12.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        ++n;
        n += 2;
        n += 2;
        n += 2;
        return n += this.Vk != null ? this.Vk.getBytes(Charsets.UTF_8).length : 0;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.bk(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void bk(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("index=").append(this.Rv).append('\n');
        stringBuilder.append(string).append("typeId=").append(this.ZZ).append('\n');
        stringBuilder.append(string).append("quantity=").append(this.aaa).append('\n');
        stringBuilder.append(string).append("name=").append(this.Vk).append('\n');
    }
}

