/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class czm
extends nr_0 {
    private String mne;
    private String aCL;
    private boolean mnf;
    private boolean mng;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        byte[] byArray2 = new byte[byteBuffer.get() & 0xFF];
        byteBuffer.get(byArray2);
        this.mne = BH.dc(byArray2);
        byte[] byArray3 = new byte[byteBuffer.get() & 0xFF];
        byteBuffer.get(byArray3);
        this.aCL = BH.dc(byArray3);
        this.mnf = byteBuffer.get() == 0;
        this.mng = byteBuffer.get() == 0;
        return true;
    }

    @Override
    public int d() {
        return 12591;
    }

    public String getMessage() {
        return this.aCL;
    }

    public String eGe() {
        return this.mne;
    }

    public boolean eGf() {
        return this.mnf;
    }

    public boolean eGg() {
        return this.mng;
    }
}

