/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 */
import com.google.common.base.Charsets;
import java.nio.ByteBuffer;

/*
 * Renamed from vT
 */
public class vt_1
implements gs_0 {
    public String add = null;
    public int ago = 0;
    public int agp = 0;
    public long agq = 0L;
    public String agr = null;
    public boolean ags = false;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byte[] byArray;
        if (this.add != null) {
            byArray = this.add.getBytes(Charsets.UTF_8);
            if (byArray.length > 65535) {
                return false;
            }
            byteBuffer.putShort((short)byArray.length);
            byteBuffer.put(byArray);
        } else {
            byteBuffer.putShort((short)0);
        }
        byteBuffer.putInt(this.ago);
        byteBuffer.putInt(this.agp);
        byteBuffer.putLong(this.agq);
        if (this.agr != null) {
            byArray = this.agr.getBytes(Charsets.UTF_8);
            if (byArray.length > 65535) {
                return false;
            }
            byteBuffer.putShort((short)byArray.length);
            byteBuffer.put(byArray);
        } else {
            byteBuffer.putShort((short)0);
        }
        byteBuffer.put(this.ags ? (byte)1 : 0);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.add = new String(byArray, Charsets.UTF_8);
        this.ago = byteBuffer.getInt();
        this.agp = byteBuffer.getInt();
        this.agq = byteBuffer.getLong();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray2 = new byte[n2];
        byteBuffer.get(byArray2);
        this.agr = new String(byArray2, Charsets.UTF_8);
        this.ags = byteBuffer.get() == 1;
        return true;
    }

    @Override
    public void clear() {
        this.add = null;
        this.ago = 0;
        this.agp = 0;
        this.agq = 0L;
        this.agr = null;
        this.ags = false;
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
        n += 4;
        n += 8;
        n += 2;
        n += this.agr != null ? this.agr.getBytes(Charsets.UTF_8).length : 0;
        return ++n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.cY(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void cY(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("guid=").append(this.add).append('\n');
        stringBuilder.append(string).append("character=").append(this.ago).append('\n');
        stringBuilder.append(string).append("pedestal=").append(this.agp).append('\n');
        stringBuilder.append(string).append("acquiredOn=").append(this.agq).append('\n');
        stringBuilder.append(string).append("note=").append(this.agr).append('\n');
        stringBuilder.append(string).append("bound=").append(this.ags).append('\n');
    }
}

