/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
import java.nio.ByteBuffer;
import lombok.Generated;

/*
 * Renamed from cmb
 */
public class cmb_0
extends cmy_0 {
    private long jZV;

    @Override
    protected void fd(ByteBuffer byteBuffer) {
        this.jZV = byteBuffer.getLong();
    }

    @Override
    public int d() {
        return 12171;
    }

    @Generated
    public long dmi() {
        return this.jZV;
    }
}

