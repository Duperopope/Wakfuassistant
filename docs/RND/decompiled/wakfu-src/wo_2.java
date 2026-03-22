/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Renamed from wo
 */
public class wo_2
implements gs_0 {
    public boolean ahj = false;
    public final ArrayList<wp_1> ahk = new ArrayList(0);

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.put(this.ahj ? (byte)1 : 0);
        if (this.ahk.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.ahk.size());
        for (int i = 0; i < this.ahk.size(); ++i) {
            wp_1 wp_12 = this.ahk.get(i);
            boolean bl = wp_12.aF(byteBuffer);
            if (bl) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.ahj = byteBuffer.get() == 1;
        int n = byteBuffer.getShort() & 0xFFFF;
        this.ahk.clear();
        this.ahk.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            wp_1 wp_12 = new wp_1();
            boolean bl = wp_12.aG(byteBuffer);
            if (!bl) {
                return false;
            }
            this.ahk.add(wp_12);
        }
        return true;
    }

    @Override
    public void clear() {
        this.ahj = false;
        this.ahk.clear();
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
        for (int i = 0; i < this.ahk.size(); ++i) {
            wp_1 wp_12 = this.ahk.get(i);
            n += wp_12.DN();
        }
        return n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.do(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void do(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("firstChange=").append(this.ahj).append('\n');
        stringBuilder.append(string).append("laws=");
        if (this.ahk.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.ahk.size()).append(" elements)...\n");
            for (int i = 0; i < this.ahk.size(); ++i) {
                wp_1 wp_12 = this.ahk.get(i);
                wp_12.dp(stringBuilder, string + i + "/ ");
            }
        }
    }
}

