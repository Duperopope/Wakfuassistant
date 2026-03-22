/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
import java.nio.ByteBuffer;
import lombok.Generated;

/*
 * Renamed from cpE
 */
public class cpe_0
extends cph_0 {
    private int eHT;

    @Override
    void ff(ByteBuffer byteBuffer) {
        this.eHT = byteBuffer.getInt();
    }

    @Override
    public int d() {
        return 12412;
    }

    @Generated
    public int BJ() {
        return this.eHT;
    }
}

