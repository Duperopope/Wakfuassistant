/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from yj
 */
public class yj_2
implements gs_0 {
    public byte Us = 0;
    public final ArrayList<yk_2> alz = new ArrayList(0);

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.put(this.Us);
        if (this.alz.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.alz.size());
        for (int i = 0; i < this.alz.size(); ++i) {
            yk_2 yk_22 = this.alz.get(i);
            boolean bl = yk_22.aF(byteBuffer);
            if (bl) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.Us = byteBuffer.get();
        int n = byteBuffer.getShort() & 0xFFFF;
        this.alz.clear();
        this.alz.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            yk_2 yk_22 = new yk_2();
            boolean bl = yk_22.aG(byteBuffer);
            if (!bl) {
                return false;
            }
            this.alz.add(yk_22);
        }
        return true;
    }

    @Override
    public void clear() {
        this.Us = 0;
        this.alz.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        ++n;
        n += 2;
        for (int i = 0; i < this.alz.size(); ++i) {
            yk_2 yk_22 = this.alz.get(i);
            n += yk_22.DN();
        }
        return n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.ez(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void ez(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("type=").append(this.Us).append('\n');
        stringBuilder.append(string).append("contents=");
        if (this.alz.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.alz.size()).append(" elements)...\n");
            for (int i = 0; i < this.alz.size(); ++i) {
                yk_2 yk_22 = this.alz.get(i);
                yk_22.eA(stringBuilder, string + i + "/ ");
            }
        }
    }
}

