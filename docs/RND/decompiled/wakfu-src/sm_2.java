/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 */
import com.google.common.base.Charsets;
import java.nio.ByteBuffer;

/*
 * Renamed from sm
 */
final class sm_2 {
    private int Yk = 0;
    private int[] Yl = null;
    private int[] Ym = null;
    private String Vk = null;
    private int Yn = 0;

    sm_2(sl_1 sl_12) {
    }

    public void avW() {
    }

    private boolean dM(ByteBuffer byteBuffer) {
        int n;
        this.Yk = byteBuffer.getInt();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        if (n2 > 0) {
            this.Yl = new int[n2];
            for (n = 0; n < n2; ++n) {
                this.Yl[n] = byteBuffer.getInt();
            }
        } else {
            this.Yl = null;
        }
        if ((n = byteBuffer.getShort() & 0xFFFF) > 0) {
            this.Ym = new int[n];
            for (int i = 0; i < n; ++i) {
                this.Ym[i] = byteBuffer.getInt();
            }
        } else {
            this.Ym = null;
        }
        return true;
    }

    private boolean dO(ByteBuffer byteBuffer) {
        int n;
        int n2;
        this.Yk = byteBuffer.getInt();
        int n3 = byteBuffer.getShort() & 0xFFFF;
        if (n3 > 0) {
            this.Yl = new int[n3];
            for (n2 = 0; n2 < n3; ++n2) {
                this.Yl[n2] = byteBuffer.getInt();
            }
        } else {
            this.Yl = null;
        }
        if ((n2 = byteBuffer.getShort() & 0xFFFF) > 0) {
            this.Ym = new int[n2];
            for (n = 0; n < n2; ++n) {
                this.Ym[n] = byteBuffer.getInt();
            }
        } else {
            this.Ym = null;
        }
        n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.Vk = new String(byArray, Charsets.UTF_8);
        this.Yn = byteBuffer.getInt();
        return true;
    }

    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10043003) {
            return false;
        }
        if (n < 10047000) {
            boolean bl = this.dM(byteBuffer);
            return bl;
        }
        if (n < 10056000) {
            boolean bl = this.dO(byteBuffer);
            return bl;
        }
        return false;
    }
}

