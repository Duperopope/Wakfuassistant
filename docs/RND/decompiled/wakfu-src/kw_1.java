/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataOutput;
import java.util.List;

/*
 * Renamed from KW
 */
public class kw_1
implements kl_2 {
    private final kt_1 aOY;

    public kw_1(kt_1 kt_12) {
        this.aOY = kt_12;
    }

    @Override
    public void b(DataOutput dataOutput) {
        int[] nArray = this.aOY.aQs();
        dataOutput.writeShort(nArray[0]);
        dataOutput.writeShort(nArray[1]);
        int[] nArray2 = this.aOY.aQu();
        dataOutput.writeShort(nArray2[0]);
        dataOutput.writeShort(nArray2[1]);
        int[] nArray3 = this.aOY.aQv();
        dataOutput.writeShort(nArray3[0]);
        dataOutput.writeShort(nArray3[1]);
        int[] nArray4 = this.aOY.aQw();
        dataOutput.writeShort(nArray4[0]);
        dataOutput.writeShort(nArray4[1]);
        float[] fArray = this.aOY.aQy();
        dataOutput.writeFloat(fArray[0]);
        dataOutput.writeFloat(fArray[1]);
        float[] fArray2 = this.aOY.aQz();
        dataOutput.writeFloat(fArray2[0]);
        dataOutput.writeFloat(fArray2[1]);
        float[] fArray3 = this.aOY.aQA();
        dataOutput.writeFloat(fArray3[0]);
        dataOutput.writeFloat(fArray3[1]);
        float[] fArray4 = this.aOY.aQB();
        dataOutput.writeFloat(fArray4[0]);
        dataOutput.writeFloat(fArray4[1]);
        float[] fArray5 = this.aOY.aQC();
        dataOutput.writeFloat(fArray5[0]);
        dataOutput.writeFloat(fArray5[1]);
        float[] fArray6 = this.aOY.aQD();
        dataOutput.writeFloat(fArray6[0]);
        dataOutput.writeFloat(fArray6[1]);
        float[] fArray7 = this.aOY.aQE();
        dataOutput.writeFloat(fArray7[0]);
        dataOutput.writeFloat(fArray7[1]);
        float[] fArray8 = this.aOY.aQF();
        dataOutput.writeFloat(fArray8[0]);
        dataOutput.writeFloat(fArray8[1]);
        float[] fArray9 = this.aOY.aQG();
        dataOutput.writeFloat(fArray9[0]);
        dataOutput.writeFloat(fArray9[1]);
        float[] fArray10 = this.aOY.aQH();
        dataOutput.writeFloat(fArray10[0]);
        dataOutput.writeFloat(fArray10[1]);
        float[] fArray11 = this.aOY.aQI();
        dataOutput.writeFloat(fArray11[0]);
        dataOutput.writeFloat(fArray11[1]);
        float[] fArray12 = this.aOY.aQJ();
        dataOutput.writeFloat(fArray12[0]);
        dataOutput.writeFloat(fArray12[1]);
        int[] nArray5 = this.aOY.aQK();
        dataOutput.writeShort(nArray5[0]);
        dataOutput.writeShort(nArray5[1]);
        int[] nArray6 = this.aOY.aQL();
        dataOutput.writeShort(nArray6[0]);
        dataOutput.writeShort(nArray6[1]);
        dataOutput.writeBoolean(this.aOY.aQM());
        int[] nArray7 = this.aOY.aQt();
        dataOutput.writeShort(nArray7[0]);
        dataOutput.writeShort(nArray7[1]);
        int[] nArray8 = this.aOY.aQx();
        dataOutput.writeShort(nArray8[0]);
        dataOutput.writeShort(nArray8[1]);
        int[] nArray9 = this.aOY.aQr();
        dataOutput.writeByte(nArray9[0]);
        dataOutput.writeByte(nArray9[1]);
        ig_1.a(dataOutput, this.aOY.getName());
        ig_1.a(dataOutput, this.aOY.getDescription());
        List<kh_1> list = this.aOY.aPi().aPl();
        for (kh_1 kh_12 : list) {
            kn_2 kn_22 = new kn_2(kh_12);
            kn_22.b(dataOutput);
        }
    }
}

