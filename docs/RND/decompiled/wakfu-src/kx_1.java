/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataOutput;
import java.util.List;

/*
 * Renamed from KX
 */
public class kx_1
implements kl_2 {
    private final ku_1 aOZ;

    public kx_1(ku_1 ku_12) {
        this.aOZ = ku_12;
    }

    @Override
    public void b(DataOutput dataOutput) {
        dataOutput.writeBoolean(this.aOZ.aQM());
        dataOutput.writeBoolean(this.aOZ.aQO());
        dataOutput.writeBoolean(this.aOZ.aQP());
        int[] nArray = this.aOZ.aQN();
        dataOutput.writeShort(nArray[0]);
        dataOutput.writeShort(nArray[1]);
        dataOutput.writeByte(this.aOZ.aQQ());
        dataOutput.writeInt(this.aOZ.aQR());
        dataOutput.writeInt(this.aOZ.aQS());
        ig_1.a(dataOutput, this.aOZ.getName());
        ig_1.a(dataOutput, this.aOZ.getDescription());
        dataOutput.writeByte(this.aOZ.aQT());
        dataOutput.writeByte(this.aOZ.aQU());
        List<kh_1> list = this.aOZ.aPi().aPl();
        for (kh_1 kh_12 : list) {
            kn_2 kn_22 = new kn_2(kh_12);
            kn_22.b(dataOutput);
        }
    }
}

