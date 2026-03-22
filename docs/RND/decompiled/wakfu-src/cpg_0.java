/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
import java.nio.ByteBuffer;
import lombok.Generated;

/*
 * Renamed from cpG
 */
public class cpg_0
extends nr_0 {
    private ekq_0 meb;
    private fp_1 med;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.meb = ekq_0.Qq(byteBuffer.getInt());
        this.med = fp_1.aA(byteBuffer);
        return false;
    }

    @Override
    public int d() {
        return 13222;
    }

    @Generated
    public ekq_0 exv() {
        return this.meb;
    }

    @Generated
    public fp_1 exw() {
        return this.med;
    }
}

