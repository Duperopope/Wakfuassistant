/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class csW
extends nr_0 {
    private int mhL = -1;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mhL = byteBuffer.getInt();
        return true;
    }

    @Override
    public int d() {
        return 12744;
    }

    public int eBJ() {
        return this.mhL;
    }

    @Override
    public String toString() {
        return "MimiSymbicResultMessage{, m_itemSkinId=" + this.mhL + "}";
    }
}

