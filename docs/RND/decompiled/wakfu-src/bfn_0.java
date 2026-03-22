/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from bFn
 */
public class bfn_0
extends bfc_1 {
    private static final Logger jTj = Logger.getLogger(bfn_0.class);
    private long jTk;
    private acd_1 bio;

    public bfn_0(int n) {
        super(n);
    }

    @Override
    public void v(String[] stringArray) {
        this.jTk = Long.parseLong(stringArray[0]);
    }

    @Override
    public boolean aQ(ffV ffV2) {
        return bDr.a(this.jTk, ffV2, this::a);
    }

    public void a(long l, acd_1 acd_12) {
        this.bio = acd_12;
        this.jU(l);
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        super.aF(byteBuffer);
        byteBuffer.putInt(this.bio.getX());
        byteBuffer.putInt(this.bio.getY());
        byteBuffer.putShort(this.bio.bdi());
        return true;
    }

    @Override
    public int DN() {
        return super.DN() + 4 + 4 + 2;
    }

    @Override
    public void clear() {
        this.bio = null;
    }

    @Override
    public fgM dTl() {
        return fgM.skn;
    }

    public long dTo() {
        return this.jTk;
    }
}

