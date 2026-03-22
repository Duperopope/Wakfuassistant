/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataOutput;

/*
 * Renamed from KQ
 */
public class kq_2
implements kl_2 {
    private final kn_1 aOS;

    public kq_2(kn_1 kn_12) {
        this.aOS = kn_12;
    }

    @Override
    public void b(DataOutput dataOutput) {
        float[] fArray = this.aOS.aQc();
        dataOutput.writeFloat(fArray[0]);
        dataOutput.writeFloat(fArray[1]);
        int[] nArray = this.aOS.aQb();
        dataOutput.writeFloat(nArray[0]);
        dataOutput.writeFloat(nArray[1]);
        dataOutput.writeShort(this.aOS.aPA());
        float[] fArray2 = this.aOS.aPB();
        dataOutput.writeFloat(fArray2[0]);
        dataOutput.writeFloat(fArray2[1]);
        float[] fArray3 = this.aOS.aPC();
        dataOutput.writeFloat(fArray3[0]);
        dataOutput.writeFloat(fArray3[1]);
        float[] fArray4 = this.aOS.aPD();
        dataOutput.writeFloat(fArray4[0]);
        dataOutput.writeFloat(fArray4[1]);
        float[] fArray5 = this.aOS.aPE();
        dataOutput.writeFloat(fArray5[0]);
        dataOutput.writeFloat(fArray5[1]);
        float[] fArray6 = this.aOS.aPF();
        dataOutput.writeFloat(fArray6[0]);
        dataOutput.writeFloat(fArray6[1]);
        float[] fArray7 = this.aOS.aPG();
        dataOutput.writeFloat(fArray7[0]);
        dataOutput.writeFloat(fArray7[1]);
        dataOutput.writeBoolean(this.aOS.aPH());
        float[] fArray8 = this.aOS.aPI();
        dataOutput.writeFloat(fArray8[0]);
        dataOutput.writeFloat(fArray8[1]);
        float[] fArray9 = this.aOS.aPJ();
        dataOutput.writeFloat(fArray9[0]);
        dataOutput.writeFloat(fArray9[1]);
        float[] fArray10 = this.aOS.aPK();
        dataOutput.writeFloat(fArray10[0]);
        dataOutput.writeFloat(fArray10[1]);
        float[] fArray11 = this.aOS.aPM();
        dataOutput.writeFloat(fArray11[0]);
        dataOutput.writeFloat(fArray11[1]);
        float[] fArray12 = this.aOS.aPO();
        dataOutput.writeFloat(fArray12[0]);
        dataOutput.writeFloat(fArray12[1]);
        float[] fArray13 = this.aOS.aPQ();
        dataOutput.writeFloat(fArray13[0]);
        dataOutput.writeFloat(fArray13[1]);
        dataOutput.writeShort(0);
        dataOutput.writeFloat(this.aOS.aPV());
        dataOutput.writeFloat(this.aOS.aPW());
        dataOutput.writeFloat(this.aOS.aPX());
        dataOutput.writeFloat(this.aOS.aPY());
        dataOutput.writeInt(this.aOS.aQa());
        dataOutput.writeInt(this.aOS.aPZ());
        float[] fArray14 = this.aOS.aPL();
        dataOutput.writeFloat(fArray14[0]);
        dataOutput.writeFloat(fArray14[1]);
        float[] fArray15 = this.aOS.aPN();
        dataOutput.writeFloat(fArray15[0]);
        dataOutput.writeFloat(fArray15[1]);
        float[] fArray16 = this.aOS.aPP();
        dataOutput.writeFloat(fArray16[0]);
        dataOutput.writeFloat(fArray16[1]);
        float[] fArray17 = this.aOS.aPR();
        dataOutput.writeFloat(fArray17[0]);
        dataOutput.writeFloat(fArray17[1]);
        float[] fArray18 = this.aOS.aPS();
        dataOutput.writeFloat(fArray18[0]);
        dataOutput.writeFloat(fArray18[1]);
        float[] fArray19 = this.aOS.aPT();
        dataOutput.writeFloat(fArray19[0]);
        dataOutput.writeFloat(fArray19[1]);
        float[] fArray20 = this.aOS.aPU();
        dataOutput.writeFloat(fArray20[0]);
        dataOutput.writeFloat(fArray20[1]);
    }
}

