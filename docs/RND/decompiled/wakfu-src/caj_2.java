/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.assistedinject.Assisted
 *  javax.inject.Inject
 */
import com.google.inject.assistedinject.Assisted;
import java.nio.ByteBuffer;
import javax.inject.Inject;

/*
 * Renamed from caJ
 */
public class caj_2
extends far_0<cal_2> {
    private static int lHp = 0;
    private int lHq;

    public caj_2(long l, int n, int n2, int n3) {
        this(l, n, 0, (short)n2, (short)n3);
    }

    @Inject
    public caj_2(@Assisted(value="uid") long l, @Assisted(value="id") int n, @Assisted(value="itemId") int n2, @Assisted(value="cellX") short s, @Assisted(value="cellY") short s2) {
        super(cam_2.lHu, l, n, n2, s, s2);
    }

    public caj_2(fas_0 fas_02) {
        super(cam_2.lHu, fas_02);
    }

    public caj_2(short s, int n, int n2) {
        this(--lHp, s, 0, (short)n, (short)n2);
    }

    public int bKF() {
        return this.lHq;
    }

    public void us(int n) {
        this.lHq = n;
    }

    public static far_0 fc(ByteBuffer byteBuffer) {
        long l = byteBuffer.getLong();
        short s = byteBuffer.getShort();
        int n = byteBuffer.getInt();
        short s2 = byteBuffer.getShort();
        short s3 = byteBuffer.getShort();
        return new caj_2(l, s, n, s2, s3);
    }
}

