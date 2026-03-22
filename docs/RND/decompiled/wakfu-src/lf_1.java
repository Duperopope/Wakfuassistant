/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataOutput;

/*
 * Renamed from Lf
 */
public class lf_1
implements kl_2 {
    private final kc_1 aPh;

    public lf_1(kc_1 kc_12) {
        this.aPh = kc_12;
    }

    @Override
    public void b(DataOutput dataOutput) {
        dataOutput.writeShort(this.aPh.aRd().aRg());
        int[] nArray = this.aPh.aRe();
        dataOutput.writeShort(nArray[0]);
        dataOutput.writeShort(nArray[1]);
        dataOutput.writeBoolean(this.aPh.aRf());
    }
}

