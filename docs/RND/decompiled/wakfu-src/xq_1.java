/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from xQ
 */
public class xq_1
implements gs_0 {
    public long abV = 0L;
    public final ArrayList<xr_2> akF = new ArrayList(0);

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.abV);
        if (this.akF.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.akF.size());
        for (int i = 0; i < this.akF.size(); ++i) {
            xr_2 xr_22 = this.akF.get(i);
            boolean bl = xr_22.aF(byteBuffer);
            if (bl) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.abV = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        this.akF.clear();
        this.akF.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            xr_2 xr_22 = new xr_2();
            boolean bl = xr_22.aG(byteBuffer);
            if (!bl) {
                return false;
            }
            this.akF.add(xr_22);
        }
        return true;
    }

    @Override
    public void clear() {
        this.abV = 0L;
        this.akF.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        n += 8;
        n += 2;
        for (int i = 0; i < this.akF.size(); ++i) {
            xr_2 xr_22 = this.akF.get(i);
            n += xr_22.DN();
        }
        return n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.en(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void en(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("userId=").append(this.abV).append('\n');
        stringBuilder.append(string).append("vars=");
        if (this.akF.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.akF.size()).append(" elements)...\n");
            for (int i = 0; i < this.akF.size(); ++i) {
                xr_2 xr_22 = this.akF.get(i);
                xr_22.eo(stringBuilder, string + i + "/ ");
            }
        }
    }
}

