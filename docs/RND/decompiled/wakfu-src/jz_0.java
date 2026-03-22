/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;

/*
 * Renamed from Jz
 */
public class jz_0
implements jf_0 {
    private final kc_1 aKu;

    public jz_0(kc_1 kc_12) {
        this.aKu = kc_12;
    }

    @Override
    public void b(DataInput dataInput) {
        this.aKu.a(kd_1.nm(dataInput.readUnsignedShort()));
        this.aKu.I(dataInput.readUnsignedShort(), dataInput.readUnsignedShort());
        this.aKu.aG(dataInput.readBoolean());
    }
}

