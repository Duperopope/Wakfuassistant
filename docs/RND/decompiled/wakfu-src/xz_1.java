/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from xz
 */
public class xz_1
implements gs_0 {
    public byte aka = 0;
    public final ArrayList<xa_2> akb = new ArrayList(0);
    public yl_2 akc = null;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        int n;
        byteBuffer.put(this.aka);
        if (this.akb.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.akb.size());
        for (n = 0; n < this.akb.size(); ++n) {
            xa_2 xa_22 = this.akb.get(n);
            boolean bl = xa_22.aF(byteBuffer);
            if (bl) continue;
            return false;
        }
        if (this.akc == null) {
            return false;
        }
        byteBuffer.put(this.akc.avV());
        n = this.akc.aF(byteBuffer) ? 1 : 0;
        return n != 0;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.aka = byteBuffer.get();
        int n = byteBuffer.getShort() & 0xFFFF;
        this.akb.clear();
        this.akb.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            xa_2 xa_22 = new xa_2();
            boolean bl = xa_22.aG(byteBuffer);
            if (!bl) {
                return false;
            }
            this.akb.add(xa_22);
        }
        this.akc = yl_2.ed(byteBuffer);
        return this.akc != null;
    }

    @Override
    public void clear() {
        this.aka = 0;
        this.akb.clear();
        this.akc = null;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10085001) {
            xc_1 xc_12 = new xc_1(this);
            boolean bl = xc_12.b(byteBuffer, n);
            if (bl) {
                xc_12.avW();
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
        for (int i = 0; i < this.akb.size(); ++i) {
            xa_2 xa_22 = this.akb.get(i);
            n += xa_22.DN();
        }
        ++n;
        return n += this.akc.DN();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.ed(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void ed(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("layoutPosition=").append(this.aka).append('\n');
        stringBuilder.append(string).append("interactiveElements=");
        if (this.akb.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.akb.size()).append(" elements)...\n");
            for (int i = 0; i < this.akb.size(); ++i) {
                xa_2 xa_22 = this.akb.get(i);
                xa_22.ee(stringBuilder, string + i + "/ ");
            }
        }
        stringBuilder.append(string).append("roomSpecificData=<");
        if (this.akc == null) {
            stringBuilder.append(">\n");
        } else {
            stringBuilder.append(this.akc.getClass().getSimpleName()).append(">...\n");
            this.akc.a(stringBuilder, string + "  ");
        }
    }
}

