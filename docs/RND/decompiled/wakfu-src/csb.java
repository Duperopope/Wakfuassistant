/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class csb
extends nr_0 {
    private int brR;
    private int ejM;

    public int avr() {
        return this.brR;
    }

    public int oP() {
        return this.ejM;
    }

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.brR = byteBuffer.getInt();
        this.ejM = byteBuffer.getInt();
        return true;
    }

    @Override
    public int d() {
        return 12755;
    }

    @Override
    public String toString() {
        return "AccountInventoryChangeMessage{m_referenceId=" + this.brR + ", m_quantity=" + this.ejM + "}";
    }
}

