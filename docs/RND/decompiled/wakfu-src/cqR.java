/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cqR
extends cqQ {
    private long aDh;
    private int mfC;
    private int[][] mfD;

    @Override
    public int avZ() {
        return 0;
    }

    @Override
    public eui_1 eza() {
        return null;
    }

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.aDh = byteBuffer.getLong();
        this.mfC = byteBuffer.getInt();
        this.mfD = new int[this.mfC][3];
        for (int i = 0; i < this.mfC; ++i) {
            this.mfD[i][0] = byteBuffer.getInt();
            this.mfD[i][1] = byteBuffer.getInt();
            this.mfD[i][2] = byteBuffer.getInt();
        }
        return true;
    }

    @Override
    public int d() {
        return 12683;
    }

    public long KU() {
        return this.aDh;
    }

    public int ezc() {
        return this.mfC;
    }

    public int[][] ezd() {
        return this.mfD;
    }
}

