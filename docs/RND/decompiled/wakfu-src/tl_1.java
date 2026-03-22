/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from tL
 */
public class tl_1
implements gs_0 {
    public final ArrayList<tn_1> abs = new ArrayList(0);
    public int abq = 0;
    public int abf = 0;
    public final yl_1 abt = new yl_1();
    public final tw_1 abu = new tw_1();
    public final te_1 abv = new te_1();
    public short abc = 0;
    public long abd = 0L;
    public boolean abi = false;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        if (this.abs.size() > 255) {
            return false;
        }
        byteBuffer.put((byte)this.abs.size());
        for (n = 0; n < this.abs.size(); ++n) {
            tn_1 tn_12 = this.abs.get(n);
            bl = tn_12.aF(byteBuffer);
            if (bl) continue;
            return false;
        }
        byteBuffer.putInt(this.abq);
        byteBuffer.putInt(this.abf);
        n = this.abt.aF(byteBuffer) ? 1 : 0;
        if (n == 0) {
            return false;
        }
        boolean bl2 = this.abu.aF(byteBuffer);
        if (!bl2) {
            return false;
        }
        bl = this.abv.aF(byteBuffer);
        if (!bl) {
            return false;
        }
        byteBuffer.putShort(this.abc);
        byteBuffer.putLong(this.abd);
        byteBuffer.put(this.abi ? (byte)1 : 0);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        int n2 = byteBuffer.get() & 0xFF;
        this.abs.clear();
        this.abs.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            tn_1 tn_12 = new tn_1();
            bl = tn_12.aG(byteBuffer);
            if (!bl) {
                return false;
            }
            this.abs.add(tn_12);
        }
        this.abq = byteBuffer.getInt();
        this.abf = byteBuffer.getInt();
        n = this.abt.aG(byteBuffer) ? 1 : 0;
        if (n == 0) {
            return false;
        }
        boolean bl2 = this.abu.aG(byteBuffer);
        if (!bl2) {
            return false;
        }
        bl = this.abv.aG(byteBuffer);
        if (!bl) {
            return false;
        }
        this.abc = byteBuffer.getShort();
        this.abd = byteBuffer.getLong();
        this.abi = byteBuffer.get() == 1;
        return true;
    }

    @Override
    public void clear() {
        this.abs.clear();
        this.abq = 0;
        this.abf = 0;
        this.abt.clear();
        this.abu.clear();
        this.abv.clear();
        this.abc = 0;
        this.abd = 0L;
        this.abi = false;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 0x99F9F8) {
            tm_1 tm_12 = new tm_1(this);
            boolean bl = tm_12.b(byteBuffer, n);
            if (bl) {
                tm_12.avW();
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
        for (int i = 0; i < this.abs.size(); ++i) {
            tn_1 tn_12 = this.abs.get(i);
            n += tn_12.DN();
        }
        n += 4;
        n += 4;
        n += this.abt.DN();
        n += this.abu.DN();
        n += this.abv.DN();
        n += 2;
        n += 8;
        return ++n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.bE(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void bE(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("rooms=");
        if (this.abs.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.abs.size()).append(" elements)...\n");
            for (int i = 0; i < this.abs.size(); ++i) {
                tn_1 tn_12 = this.abs.get(i);
                tn_12.bF(stringBuilder, string + i + "/ ");
            }
        }
        stringBuilder.append(string).append("cash=").append(this.abq).append('\n');
        stringBuilder.append(string).append("customViewModelId=").append(this.abf).append('\n');
        stringBuilder.append(string).append("transactionLog=...\n");
        this.abt.eO(stringBuilder, string + "  ");
        stringBuilder.append(string).append("permissions=...\n");
        this.abu.bL(stringBuilder, string + "  ");
        stringBuilder.append(string).append("ecosystem=...\n");
        this.abv.bz(stringBuilder, string + "  ");
        stringBuilder.append(string).append("playListId=").append(this.abc).append('\n');
        stringBuilder.append(string).append("musicId=").append(this.abd).append('\n');
        stringBuilder.append(string).append("leaveFleaAtDisconnection=").append(this.abi).append('\n');
    }
}

