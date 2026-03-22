/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
import java.nio.ByteBuffer;
import lombok.Generated;

public class coP
extends nr_0 {
    private long aDh;
    private pv_0 iot;
    private px_0 mdr;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.aDh = byteBuffer.getLong();
        byte by = byteBuffer.get();
        byte by2 = byteBuffer.get();
        if (by == 0) {
            this.iot = ezj_0.Pl(by2);
        } else if (by == 1) {
            this.iot = exe_1.Te(by2);
        }
        this.mdr = px_0.H(byteBuffer.get());
        return true;
    }

    @Override
    public int d() {
        return 12747;
    }

    @Generated
    public long KU() {
        return this.aDh;
    }

    @Generated
    public pv_0 ewG() {
        return this.iot;
    }

    @Generated
    public px_0 ewH() {
        return this.mdr;
    }
}

