/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
import java.nio.ByteBuffer;
import lombok.Generated;

/*
 * Renamed from cpF
 */
public class cpf_0
extends nr_0 {
    private int eHT;
    private int lWQ;
    private String lWR;
    private boolean mec;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.eHT = byteBuffer.getInt();
        this.lWQ = byteBuffer.getInt();
        this.lWR = BH.eE(byteBuffer);
        this.mec = byteBuffer.get() == 1;
        return false;
    }

    @Override
    public int d() {
        return 12753;
    }

    @Generated
    public int BJ() {
        return this.eHT;
    }

    @Generated
    public int BL() {
        return this.lWQ;
    }

    @Generated
    public String BN() {
        return this.lWR;
    }

    @Generated
    public boolean dva() {
        return this.mec;
    }
}

