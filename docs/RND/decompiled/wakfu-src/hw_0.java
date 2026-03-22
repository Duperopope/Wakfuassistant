/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataOutput;

/*
 * Renamed from HW
 */
public class hw_0
implements id_1 {
    private final ky_0 aJM;

    public hw_0(ky_0 ky_02) {
        this.aJM = ky_02;
    }

    @Override
    public void b(DataOutput dataOutput) {
        dataOutput.writeByte(2);
        dataOutput.writeFloat(this.aJM.aQY()[0]);
        dataOutput.writeFloat(this.aJM.aQY()[1]);
        dataOutput.writeFloat(this.aJM.aQZ()[0]);
        dataOutput.writeFloat(this.aJM.aQZ()[1]);
        dataOutput.writeFloat(this.aJM.aRa()[0]);
        dataOutput.writeFloat(this.aJM.aRa()[1]);
        dataOutput.writeFloat(this.aJM.aPt()[0]);
        dataOutput.writeFloat(this.aJM.aPt()[1]);
        dataOutput.writeFloat(this.aJM.aRb()[0]);
        dataOutput.writeFloat(this.aJM.aRb()[1]);
    }
}

