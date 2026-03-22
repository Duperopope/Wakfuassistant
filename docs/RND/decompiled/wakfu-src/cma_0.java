/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
import java.nio.ByteBuffer;
import lombok.Generated;

/*
 * Renamed from cmA
 */
public class cma_0
extends cmy_0 {
    private int maK;

    @Override
    protected void fd(ByteBuffer byteBuffer) {
        this.maK = byteBuffer.getInt();
    }

    @Override
    public int d() {
        return 12529;
    }

    @Generated
    public int evM() {
        return this.maK;
    }
}

