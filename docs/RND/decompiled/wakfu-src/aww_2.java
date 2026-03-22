/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataOutput;

/*
 * Renamed from awW
 */
public class aww_2 {
    private final lm_2 dnA;

    public aww_2(lm_2 lm_22) {
        this.dnA = lm_22;
    }

    public void b(DataOutput dataOutput) {
        short[] sArray = this.dnA.aRA();
        if (sArray == null || sArray.length <= 1) {
            dataOutput.writeByte(0);
            return;
        }
        int n = sArray.length;
        dataOutput.writeByte(n);
        dataOutput.writeInt(this.dnA.aRz());
        dataOutput.writeShort(this.dnA.aRu());
        dataOutput.writeShort(this.dnA.aRv());
        dataOutput.writeShort(this.dnA.aRw());
        dataOutput.writeShort(this.dnA.aRx());
        for (int i = 0; i < n; ++i) {
            dataOutput.writeShort(sArray[i]);
        }
        short[] sArray2 = this.dnA.aRy();
        for (int i = 0; i < sArray2.length; ++i) {
            dataOutput.writeShort(sArray2[i]);
        }
    }
}

