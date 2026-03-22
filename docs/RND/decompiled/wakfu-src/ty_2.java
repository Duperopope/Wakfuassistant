/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from ty
 */
public class ty_2
implements gs_0 {
    public final ArrayList<tz_2> aaO = new ArrayList(0);
    public int aaP = 0;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        if (this.aaO.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.aaO.size());
        for (int i = 0; i < this.aaO.size(); ++i) {
            tz_2 tz_22 = this.aaO.get(i);
            boolean bl = tz_22.aF(byteBuffer);
            if (bl) continue;
            return false;
        }
        byteBuffer.putInt(this.aaP);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.aaO.clear();
        this.aaO.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            tz_2 tz_22 = new tz_2();
            boolean bl = tz_22.aG(byteBuffer);
            if (!bl) {
                return false;
            }
            this.aaO.add(tz_22);
        }
        this.aaP = byteBuffer.getInt();
        return true;
    }

    @Override
    public void clear() {
        this.aaO.clear();
        this.aaP = 0;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10048001) {
            tb_2 tb_22 = new tb_2(this);
            boolean bl = tb_22.b(byteBuffer, n);
            if (bl) {
                tb_22.avW();
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
        for (int i = 0; i < this.aaO.size(); ++i) {
            tz_2 tz_22 = this.aaO.get(i);
            n += tz_22.DN();
        }
        return n += 4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.bw(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void bw(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("items=");
        if (this.aaO.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.aaO.size()).append(" elements)...\n");
            for (int i = 0; i < this.aaO.size(); ++i) {
                tz_2 tz_22 = this.aaO.get(i);
                tz_22.bx(stringBuilder, string + i + "/ ");
            }
        }
        stringBuilder.append(string).append("activeRefId=").append(this.aaP).append('\n');
    }
}

