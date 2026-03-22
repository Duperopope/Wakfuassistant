/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
import java.nio.ByteBuffer;
import lombok.Generated;

/*
 * Renamed from csr
 */
public class csr_0
extends nr_0 {
    private ffV iWZ;
    private int ejM;
    private long kVl;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        byte[] byArray2 = new byte[byteBuffer.getInt()];
        byteBuffer.get(byArray2);
        this.iWZ = new ffV();
        this.iWZ.aG(ByteBuffer.wrap(byArray2));
        this.ejM = byteBuffer.getInt();
        this.kVl = byteBuffer.getLong();
        return true;
    }

    @Override
    public int d() {
        return 12177;
    }

    @Generated
    public ffV getItem() {
        return this.iWZ;
    }

    @Generated
    public int oP() {
        return this.ejM;
    }

    @Generated
    public long eAU() {
        return this.kVl;
    }
}

