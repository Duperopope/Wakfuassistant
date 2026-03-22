/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
import java.nio.ByteBuffer;
import lombok.Generated;

/*
 * Renamed from css
 */
public class css_0
extends nr_0 {
    private int epc;
    private int ejM;
    private long kVl;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.epc = byteBuffer.getInt();
        this.ejM = byteBuffer.getInt();
        this.kVl = byteBuffer.getLong();
        return true;
    }

    @Override
    public int d() {
        return 12380;
    }

    @Generated
    public int AK() {
        return this.epc;
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

