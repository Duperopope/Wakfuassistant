/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from qt
 */
public class qt_2
extends go_0
implements gs_0 {
    public final ArrayList<qv_2> UK = new ArrayList(0);
    private final fi_1 UL = new qu_2(this);

    @Override
    public fi_1 DM() {
        return this.UL;
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        if (this.UK.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.UK.size());
        for (int i = 0; i < this.UK.size(); ++i) {
            qv_2 qv_22 = this.UK.get(i);
            boolean bl = qv_22.aF(byteBuffer);
            if (bl) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.UK.clear();
        this.UK.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            qv_2 qv_22 = new qv_2();
            boolean bl = qv_22.aG(byteBuffer);
            if (!bl) {
                return false;
            }
            this.UK.add(qv_22);
        }
        return true;
    }

    @Override
    public void clear() {
        this.UK.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        n += 2;
        for (int i = 0; i < this.UK.size(); ++i) {
            qv_2 qv_22 = this.UK.get(i);
            n += qv_22.DN();
        }
        return n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.S(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void S(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("landMarks=");
        if (this.UK.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.UK.size()).append(" elements)...\n");
            for (int i = 0; i < this.UK.size(); ++i) {
                qv_2 qv_22 = this.UK.get(i);
                qv_22.T(stringBuilder, string + i + "/ ");
            }
        }
    }
}

