/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataOutput;
import java.util.List;

/*
 * Renamed from KY
 */
public class ky_1
implements kl_2 {
    private final kv_1 aPa;

    public ky_1(kv_1 kv_12) {
        this.aPa = kv_12;
    }

    @Override
    public void b(DataOutput dataOutput) {
        int[] nArray = this.aPa.aQs();
        dataOutput.writeShort(nArray[0]);
        dataOutput.writeShort(nArray[1]);
        int[] nArray2 = this.aPa.aQu();
        dataOutput.writeShort(nArray2[0]);
        dataOutput.writeShort(nArray2[1]);
        int[] nArray3 = this.aPa.aQv();
        dataOutput.writeShort(nArray3[0]);
        dataOutput.writeShort(nArray3[1]);
        int[] nArray4 = this.aPa.aQw();
        dataOutput.writeShort(nArray4[0]);
        dataOutput.writeShort(nArray4[1]);
        float[] fArray = this.aPa.aQy();
        dataOutput.writeFloat(fArray[0]);
        dataOutput.writeFloat(fArray[1]);
        float[] fArray2 = this.aPa.aQz();
        dataOutput.writeFloat(fArray2[0]);
        dataOutput.writeFloat(fArray2[1]);
        float[] fArray3 = this.aPa.aQA();
        dataOutput.writeFloat(fArray3[0]);
        dataOutput.writeFloat(fArray3[1]);
        float[] fArray4 = this.aPa.aQB();
        dataOutput.writeFloat(fArray4[0]);
        dataOutput.writeFloat(fArray4[1]);
        float[] fArray5 = this.aPa.aQC();
        dataOutput.writeFloat(fArray5[0]);
        dataOutput.writeFloat(fArray5[1]);
        float[] fArray6 = this.aPa.aQD();
        dataOutput.writeFloat(fArray6[0]);
        dataOutput.writeFloat(fArray6[1]);
        float[] fArray7 = this.aPa.aQE();
        dataOutput.writeFloat(fArray7[0]);
        dataOutput.writeFloat(fArray7[1]);
        float[] fArray8 = this.aPa.aQF();
        dataOutput.writeFloat(fArray8[0]);
        dataOutput.writeFloat(fArray8[1]);
        float[] fArray9 = this.aPa.aQG();
        dataOutput.writeFloat(fArray9[0]);
        dataOutput.writeFloat(fArray9[1]);
        float[] fArray10 = this.aPa.aQH();
        dataOutput.writeFloat(fArray10[0]);
        dataOutput.writeFloat(fArray10[1]);
        float[] fArray11 = this.aPa.aQI();
        dataOutput.writeFloat(fArray11[0]);
        dataOutput.writeFloat(fArray11[1]);
        float[] fArray12 = this.aPa.aQJ();
        dataOutput.writeFloat(fArray12[0]);
        dataOutput.writeFloat(fArray12[1]);
        int[] nArray5 = this.aPa.aQK();
        dataOutput.writeShort(nArray5[0]);
        dataOutput.writeShort(nArray5[1]);
        int[] nArray6 = this.aPa.aQL();
        dataOutput.writeShort(nArray6[0]);
        dataOutput.writeShort(nArray6[1]);
        dataOutput.writeBoolean(this.aPa.aQM());
        int[] nArray7 = this.aPa.aQt();
        dataOutput.writeShort(nArray7[0]);
        dataOutput.writeShort(nArray7[1]);
        int[] nArray8 = this.aPa.aQx();
        dataOutput.writeShort(nArray8[0]);
        dataOutput.writeShort(nArray8[1]);
        int[] nArray9 = this.aPa.aQr();
        dataOutput.writeByte(nArray9[0]);
        dataOutput.writeByte(nArray9[1]);
        List<kh_1> list = this.aPa.aPi().aPl();
        for (kh_1 kh_12 : list) {
            kn_2 kn_22 = new kn_2(kh_12);
            kn_22.b(dataOutput);
        }
    }
}

