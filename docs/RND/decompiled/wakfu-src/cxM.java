/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cxM
extends nr_0 {
    private byte kIf;
    private eTw jfO;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.kIf = byteBuffer.get();
        eTC eTC2 = new eTC();
        eTC2.eL(byteBuffer);
        this.jfO = eTC2.dFm();
        return true;
    }

    public byte evi() {
        return this.kIf;
    }

    public eTw dFm() {
        return this.jfO;
    }

    @Override
    public int d() {
        return 1193;
    }
}

