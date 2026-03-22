/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class coh
extends nr_0 {
    private boolean lOE;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.lOE = byteBuffer.get() == 1;
        return true;
    }

    @Override
    public int d() {
        return 12953;
    }

    public boolean evR() {
        return this.lOE;
    }

    @Override
    public String toString() {
        return "ActorSpawnProtocolMessage{m_schedulingSpawn=" + this.lOE + "}";
    }
}

