/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataOutput;

/*
 * Renamed from KP
 */
public class kp_2
implements kl_2 {
    private final km_1 aOR;

    public kp_2(km_1 km_12) {
        this.aOR = km_12;
    }

    @Override
    public void b(DataOutput dataOutput) {
        dataOutput.writeShort(this.aOR.aPA());
        float[] fArray = this.aOR.aPB();
        dataOutput.writeFloat(fArray[0]);
        dataOutput.writeFloat(fArray[1]);
        float[] fArray2 = this.aOR.aPC();
        dataOutput.writeFloat(fArray2[0]);
        dataOutput.writeFloat(fArray2[1]);
        float[] fArray3 = this.aOR.aPD();
        dataOutput.writeFloat(fArray3[0]);
        dataOutput.writeFloat(fArray3[1]);
        float[] fArray4 = this.aOR.aPE();
        dataOutput.writeFloat(fArray4[0]);
        dataOutput.writeFloat(fArray4[1]);
        float[] fArray5 = this.aOR.aPF();
        dataOutput.writeFloat(fArray5[0]);
        dataOutput.writeFloat(fArray5[1]);
        float[] fArray6 = this.aOR.aPG();
        dataOutput.writeFloat(fArray6[0]);
        dataOutput.writeFloat(fArray6[1]);
        dataOutput.writeBoolean(this.aOR.aPH());
        float[] fArray7 = this.aOR.aPI();
        dataOutput.writeFloat(fArray7[0]);
        dataOutput.writeFloat(fArray7[1]);
        float[] fArray8 = this.aOR.aPJ();
        dataOutput.writeFloat(fArray8[0]);
        dataOutput.writeFloat(fArray8[1]);
        float[] fArray9 = this.aOR.aPK();
        dataOutput.writeFloat(fArray9[0]);
        dataOutput.writeFloat(fArray9[1]);
        float[] fArray10 = this.aOR.aPM();
        dataOutput.writeFloat(fArray10[0]);
        dataOutput.writeFloat(fArray10[1]);
        float[] fArray11 = this.aOR.aPO();
        dataOutput.writeFloat(fArray11[0]);
        dataOutput.writeFloat(fArray11[1]);
        float[] fArray12 = this.aOR.aPQ();
        dataOutput.writeFloat(fArray12[0]);
        dataOutput.writeFloat(fArray12[1]);
        dataOutput.writeShort(0);
        dataOutput.writeFloat(this.aOR.aPV());
        dataOutput.writeFloat(this.aOR.aPW());
        dataOutput.writeFloat(this.aOR.aPX());
        dataOutput.writeFloat(this.aOR.aPY());
        dataOutput.writeInt(this.aOR.aQa());
        dataOutput.writeInt(this.aOR.aPZ());
        float[] fArray13 = this.aOR.aPL();
        dataOutput.writeFloat(fArray13[0]);
        dataOutput.writeFloat(fArray13[1]);
        float[] fArray14 = this.aOR.aPN();
        dataOutput.writeFloat(fArray14[0]);
        dataOutput.writeFloat(fArray14[1]);
        float[] fArray15 = this.aOR.aPP();
        dataOutput.writeFloat(fArray15[0]);
        dataOutput.writeFloat(fArray15[1]);
        float[] fArray16 = this.aOR.aPR();
        dataOutput.writeFloat(fArray16[0]);
        dataOutput.writeFloat(fArray16[1]);
        float[] fArray17 = this.aOR.aPS();
        dataOutput.writeFloat(fArray17[0]);
        dataOutput.writeFloat(fArray17[1]);
        float[] fArray18 = this.aOR.aPT();
        dataOutput.writeFloat(fArray18[0]);
        dataOutput.writeFloat(fArray18[1]);
        float[] fArray19 = this.aOR.aPU();
        dataOutput.writeFloat(fArray19[0]);
        dataOutput.writeFloat(fArray19[1]);
    }
}

