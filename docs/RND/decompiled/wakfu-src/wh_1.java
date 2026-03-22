/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 */
import com.google.common.base.Charsets;
import java.nio.ByteBuffer;

/*
 * Renamed from wH
 */
final class wh_1 {
    private int WB = 0;
    private String Vk = null;
    private int ahS = 0;
    private int WD = 0;
    private int WF = 0;
    private int ahT = 0;
    private byte ahX = 0;
    private long ahY = 0L;
    private int ahZ = 0;
    private long ahU = 0L;
    private long ahV = 0L;
    private int WE = 0;
    private long ahW = 0L;
    private int aia = 0;
    final /* synthetic */ wg_2 aib;

    wh_1(wg_2 wg_22) {
        this.aib = wg_22;
    }

    public void avW() {
        this.aib.WB = this.WB;
        this.aib.Vk = this.Vk;
        this.aib.ahS = this.ahS;
        this.aib.WD = this.WD;
        this.aib.WF = this.WF;
        this.aib.ahT = this.ahT;
        this.aib.ahU = this.ahU;
        this.aib.ahV = this.ahV;
        this.aib.WE = this.WE;
        this.aib.ahW = this.ahW;
    }

    private boolean cG(ByteBuffer byteBuffer) {
        this.WB = byteBuffer.getInt();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.Vk = new String(byArray, Charsets.UTF_8);
        this.ahS = byteBuffer.getInt();
        this.WD = byteBuffer.getInt();
        this.WF = byteBuffer.getInt();
        this.ahT = byteBuffer.getInt();
        this.ahX = byteBuffer.get();
        this.ahY = byteBuffer.getLong();
        this.ahZ = byteBuffer.getInt();
        this.ahU = byteBuffer.getLong();
        this.ahV = byteBuffer.getLong();
        return true;
    }

    private boolean cI(ByteBuffer byteBuffer) {
        this.WB = byteBuffer.getInt();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.Vk = new String(byArray, Charsets.UTF_8);
        this.ahS = byteBuffer.getInt();
        this.WD = byteBuffer.getInt();
        this.WF = byteBuffer.getInt();
        this.ahT = byteBuffer.getInt();
        this.ahX = byteBuffer.get();
        this.ahY = byteBuffer.getLong();
        this.ahU = byteBuffer.getLong();
        this.ahV = byteBuffer.getLong();
        this.WE = byteBuffer.getInt();
        this.ahW = byteBuffer.getLong();
        return true;
    }

    private boolean cP(ByteBuffer byteBuffer) {
        this.WB = byteBuffer.getInt();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.Vk = new String(byArray, Charsets.UTF_8);
        this.ahS = byteBuffer.getInt();
        this.WD = byteBuffer.getInt();
        this.WF = byteBuffer.getInt();
        this.ahT = byteBuffer.getInt();
        this.ahX = byteBuffer.get();
        this.ahY = byteBuffer.getLong();
        this.ahU = byteBuffer.getLong();
        this.ahV = byteBuffer.getLong();
        this.WE = byteBuffer.getInt();
        this.ahW = byteBuffer.getLong();
        this.aia = byteBuffer.getInt();
        return true;
    }

    private boolean cQ(ByteBuffer byteBuffer) {
        this.WB = byteBuffer.getInt();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.Vk = new String(byArray, Charsets.UTF_8);
        this.ahS = byteBuffer.getInt();
        this.WD = byteBuffer.getInt();
        this.WF = byteBuffer.getInt();
        this.ahT = byteBuffer.getInt();
        this.ahX = byteBuffer.get();
        this.ahY = byteBuffer.getLong();
        this.ahU = byteBuffer.getLong();
        this.ahV = byteBuffer.getLong();
        this.WE = byteBuffer.getInt();
        this.ahW = byteBuffer.getLong();
        return true;
    }

    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 313) {
            return false;
        }
        if (n < 315) {
            boolean bl = this.cG(byteBuffer);
            return bl;
        }
        if (n < 10035004) {
            boolean bl = this.cI(byteBuffer);
            return bl;
        }
        if (n < 10035007) {
            boolean bl = this.cP(byteBuffer);
            return bl;
        }
        if (n < 10048000) {
            boolean bl = this.cQ(byteBuffer);
            return bl;
        }
        return false;
    }
}

