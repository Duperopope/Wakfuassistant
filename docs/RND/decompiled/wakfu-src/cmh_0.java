/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
import java.nio.ByteBuffer;
import lombok.Generated;

/*
 * Renamed from cmh
 */
public class cmh_0
extends cmy_0 {
    private mg maz;

    @Override
    protected void fd(ByteBuffer byteBuffer) {
        byte[] byArray = new byte[byteBuffer.getInt()];
        byteBuffer.get(byArray);
        this.maz = mg.bV(byArray);
    }

    @Override
    public int d() {
        return 12594;
    }

    @Generated
    public mg evE() {
        return this.maz;
    }
}

