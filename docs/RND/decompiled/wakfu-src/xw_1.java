/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from xw
 */
public class xw_1
implements gs_0 {
    public final ArrayList<xx_2> ajV = new ArrayList(0);

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        if (this.ajV.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.ajV.size());
        for (int i = 0; i < this.ajV.size(); ++i) {
            xx_2 xx_22 = this.ajV.get(i);
            boolean bl = xx_22.aF(byteBuffer);
            if (bl) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.ajV.clear();
        this.ajV.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            xx_2 xx_22 = new xx_2();
            boolean bl = xx_22.aG(byteBuffer);
            if (!bl) {
                return false;
            }
            this.ajV.add(xx_22);
        }
        return true;
    }

    @Override
    public void clear() {
        this.ajV.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        n += 2;
        for (int i = 0; i < this.ajV.size(); ++i) {
            xx_2 xx_22 = this.ajV.get(i);
            n += xx_22.DN();
        }
        return n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.ea(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void ea(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("items=");
        if (this.ajV.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.ajV.size()).append(" elements)...\n");
            for (int i = 0; i < this.ajV.size(); ++i) {
                xx_2 xx_22 = this.ajV.get(i);
                xx_22.eb(stringBuilder, string + i + "/ ");
            }
        }
    }
}

