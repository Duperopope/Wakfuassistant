/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
import java.nio.ByteBuffer;
import lombok.Generated;

/*
 * Renamed from cpD
 */
public class cpd_0
extends nr_0 {
    private ekq_0 meb;
    private int eHT;
    private String lWR;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.meb = ekq_0.Qq(byteBuffer.getInt());
        this.eHT = byteBuffer.getInt();
        this.lWR = BH.eE(byteBuffer);
        return false;
    }

    @Override
    public int d() {
        return 13237;
    }

    @Generated
    public ekq_0 exv() {
        return this.meb;
    }

    @Generated
    public int BJ() {
        return this.eHT;
    }

    @Generated
    public String BN() {
        return this.lWR;
    }
}

