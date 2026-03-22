/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from bZS
 */
public class bzs_2 {
    final int lES;
    final int[] lET;
    final int[] lEU;

    public bzs_2(int n, int[] nArray, int[] nArray2) {
        this.lES = n;
        this.lET = nArray;
        this.lEU = nArray2;
    }

    bzs_2(ByteBuffer byteBuffer) {
        int n;
        this.lES = byteBuffer.getInt();
        this.lET = new int[byteBuffer.getInt()];
        for (n = 0; n < this.lET.length; ++n) {
            this.lET[n] = byteBuffer.getInt();
        }
        this.lEU = new int[byteBuffer.getInt()];
        for (n = 0; n < this.lEU.length; ++n) {
            this.lEU[n] = byteBuffer.getInt();
        }
    }

    public void a(fs_0 fs_02) {
        fs_02.mz(this.lES);
        fs_02.mz(this.lET.length);
        for (int n : this.lET) {
            fs_02.mz(n);
        }
        fs_02.mz(this.lEU.length);
        for (int n : this.lEU) {
            fs_02.mz(n);
        }
    }

    public int[] eqH() {
        return this.lET;
    }

    public int[] eqI() {
        return this.lEU;
    }
}

