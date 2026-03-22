/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 */
import com.google.common.base.Charsets;
import java.nio.ByteBuffer;

/*
 * Renamed from wG
 */
public class wg_2
implements gs_0 {
    public int WB = 0;
    public String Vk = null;
    public int ahS = 0;
    public int WD = 0;
    public int WF = 0;
    public int ahT = 0;
    public long ahU = 0L;
    public long ahV = 0L;
    public int WE = 0;
    public long ahW = 0L;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.WB);
        if (this.Vk != null) {
            byte[] byArray = this.Vk.getBytes(Charsets.UTF_8);
            if (byArray.length > 65535) {
                return false;
            }
            byteBuffer.putShort((short)byArray.length);
            byteBuffer.put(byArray);
        } else {
            byteBuffer.putShort((short)0);
        }
        byteBuffer.putInt(this.ahS);
        byteBuffer.putInt(this.WD);
        byteBuffer.putInt(this.WF);
        byteBuffer.putInt(this.ahT);
        byteBuffer.putLong(this.ahU);
        byteBuffer.putLong(this.ahV);
        byteBuffer.putInt(this.WE);
        byteBuffer.putLong(this.ahW);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.WB = byteBuffer.getInt();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.Vk = new String(byArray, Charsets.UTF_8);
        this.ahS = byteBuffer.getInt();
        this.WD = byteBuffer.getInt();
        this.WF = byteBuffer.getInt();
        this.ahT = byteBuffer.getInt();
        this.ahU = byteBuffer.getLong();
        this.ahV = byteBuffer.getLong();
        this.WE = byteBuffer.getInt();
        this.ahW = byteBuffer.getLong();
        return true;
    }

    @Override
    public void clear() {
        this.WB = 0;
        this.Vk = null;
        this.ahS = 0;
        this.WD = 0;
        this.WF = 0;
        this.ahT = 0;
        this.ahU = 0L;
        this.ahV = 0L;
        this.WE = 0;
        this.ahW = 0L;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10048000) {
            wh_1 wh_12 = new wh_1(this);
            boolean bl = wh_12.b(byteBuffer, n);
            if (bl) {
                wh_12.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        n += 4;
        n += 2;
        n += this.Vk != null ? this.Vk.getBytes(Charsets.UTF_8).length : 0;
        n += 4;
        n += 4;
        n += 4;
        n += 4;
        n += 8;
        n += 8;
        n += 4;
        return n += 8;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.dv(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void dv(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("definitionId=").append(this.WB).append('\n');
        stringBuilder.append(string).append("name=").append(this.Vk).append('\n');
        stringBuilder.append(string).append("colorItemRefId=").append(this.ahS).append('\n');
        stringBuilder.append(string).append("equippedRefItemId=").append(this.WD).append('\n');
        stringBuilder.append(string).append("health=").append(this.WF).append('\n');
        stringBuilder.append(string).append("xp=").append(this.ahT).append('\n');
        stringBuilder.append(string).append("lastMealDate=").append(this.ahU).append('\n');
        stringBuilder.append(string).append("lastHungryDate=").append(this.ahV).append('\n');
        stringBuilder.append(string).append("sleepRefItemId=").append(this.WE).append('\n');
        stringBuilder.append(string).append("sleepDate=").append(this.ahW).append('\n');
    }
}

