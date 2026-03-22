/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from vu
 */
public class vu_1
implements gs_0 {
    public final ArrayList<vv_2> afs = new ArrayList(0);
    public long[] aft = null;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        int n;
        if (this.afs.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.afs.size());
        for (n = 0; n < this.afs.size(); ++n) {
            vv_2 vv_22 = this.afs.get(n);
            boolean bl = vv_22.aF(byteBuffer);
            if (bl) continue;
            return false;
        }
        if (this.aft != null) {
            if (this.aft.length > 65535) {
                return false;
            }
            byteBuffer.putShort((short)this.aft.length);
            for (n = 0; n < this.aft.length; ++n) {
                byteBuffer.putLong(this.aft[n]);
            }
        } else {
            byteBuffer.putShort((short)0);
        }
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.afs.clear();
        this.afs.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            vv_2 vv_22 = new vv_2();
            boolean bl = vv_22.aG(byteBuffer);
            if (!bl) {
                return false;
            }
            this.afs.add(vv_22);
        }
        n = byteBuffer.getShort() & 0xFFFF;
        if (n > 0) {
            this.aft = new long[n];
            for (int i = 0; i < n; ++i) {
                this.aft[i] = byteBuffer.getLong();
            }
        } else {
            this.aft = null;
        }
        return true;
    }

    @Override
    public void clear() {
        this.afs.clear();
        this.aft = null;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10090001) {
            vx_1 vx_12 = new vx_1(this);
            boolean bl = vx_12.b(byteBuffer, n);
            if (bl) {
                vx_12.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        n += 2;
        for (int i = 0; i < this.afs.size(); ++i) {
            vv_2 vv_22 = this.afs.get(i);
            n += vv_22.DN();
        }
        n += 2;
        return n += this.aft != null ? this.aft.length * 8 : 0;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.cK(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void cK(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("contents=");
        if (this.afs.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.afs.size()).append(" elements)...\n");
            for (int i = 0; i < this.afs.size(); ++i) {
                vv_2 vv_22 = this.afs.get(i);
                vv_22.cL(stringBuilder, string + i + "/ ");
            }
        }
        stringBuilder.append(string).append("lockedItemUids=(").append(this.aft.length).append(" bytes)\n");
    }
}

