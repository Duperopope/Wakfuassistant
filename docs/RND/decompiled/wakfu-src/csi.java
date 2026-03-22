/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class csi
extends nr_0 {
    private ffS jzu;
    private boolean bmT;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.jzu = ffS.gj(byteBuffer.get());
        this.bmT = byteBuffer.get() == 1;
        return true;
    }

    public ffS dMQ() {
        return this.jzu;
    }

    public boolean bfb() {
        return this.bmT;
    }

    @Override
    public int d() {
        return 13298;
    }

    @Override
    public String toString() {
        return "EquipmentPositionLockedMessage{m_position=" + String.valueOf(this.jzu) + ", m_locked=" + this.bmT + "}";
    }
}

