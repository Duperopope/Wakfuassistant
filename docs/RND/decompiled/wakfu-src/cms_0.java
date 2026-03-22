/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
import java.nio.ByteBuffer;
import lombok.Generated;

/*
 * Renamed from cms
 */
public class cms_0
extends cmy_0 {
    private na maF;

    @Override
    protected void fd(ByteBuffer byteBuffer) {
        byte[] byArray = new byte[byteBuffer.getInt()];
        byteBuffer.get(byArray);
        this.maF = na.cf(byArray);
    }

    @Override
    public int d() {
        return 13516;
    }

    @Generated
    public na evJ() {
        return this.maF;
    }
}

