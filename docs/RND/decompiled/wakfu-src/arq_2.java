/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.common.nio.Buffers
 */
import com.jogamp.common.nio.Buffers;
import java.nio.ShortBuffer;

/*
 * Renamed from arQ
 */
public final class arq_2 {
    public static final arq_2 cVu = new arq_2(new short[]{0, 1, 2, 3});
    public static final arq_2 cVv;
    private ShortBuffer cVw;
    private final int cVx;

    public arq_2(short[] sArray) {
        this.cVx = sArray.length;
        this.cVw = Buffers.newDirectShortBuffer((int)(this.cVx * 2));
        this.bIl().put(sArray);
    }

    public int bIj() {
        return this.cVx;
    }

    public int bIk() {
        return this.cVx;
    }

    public ShortBuffer bIl() {
        this.cVw.rewind();
        return this.cVw;
    }

    public void aZp() {
        this.cVw = null;
    }

    static {
        short[] sArray = new short[Short.MAX_VALUE];
        for (int n = 0; n < sArray.length; n = (int)((short)(n + 1))) {
            sArray[n] = n;
        }
        cVv = new arq_2(sArray);
    }
}

