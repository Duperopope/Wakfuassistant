/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
import java.nio.ByteBuffer;
import lombok.Generated;

/*
 * Renamed from cmG
 */
public class cmg_0
extends cmy_0 {
    private mz_0 maP;

    @Override
    protected void fd(ByteBuffer byteBuffer) {
        byte[] byArray = new byte[byteBuffer.getInt()];
        byteBuffer.get(byArray);
        this.maP = mz_0.bZ(byArray);
    }

    @Override
    public int d() {
        return 13303;
    }

    @Generated
    public mz_0 evN() {
        return this.maP;
    }
}

