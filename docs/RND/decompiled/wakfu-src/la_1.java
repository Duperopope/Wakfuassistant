/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataOutput;

/*
 * Renamed from La
 */
public class la_1
implements kl_2 {
    private final kx_0 aPc;

    public la_1(kx_0 kx_02) {
        this.aPc = kx_02;
    }

    @Override
    public void b(DataOutput dataOutput) {
        int[] nArray = this.aPc.aQW();
        dataOutput.writeShort(nArray[0]);
        dataOutput.writeShort(nArray[1]);
        int[] nArray2 = this.aPc.aQX();
        dataOutput.writeShort(nArray2[0]);
        dataOutput.writeShort(nArray2[1]);
    }
}

