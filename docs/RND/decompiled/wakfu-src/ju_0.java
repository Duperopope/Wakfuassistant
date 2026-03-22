/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;

/*
 * Renamed from Ju
 */
public class ju_0
implements jf_0 {
    private final kx_0 aKp;

    public ju_0(kx_0 kx_02) {
        this.aKp = kx_02;
    }

    @Override
    public void b(DataInput dataInput) {
        this.aKp.G(dataInput.readUnsignedShort(), dataInput.readUnsignedShort());
        this.aKp.H(dataInput.readUnsignedShort(), dataInput.readUnsignedShort());
    }
}

