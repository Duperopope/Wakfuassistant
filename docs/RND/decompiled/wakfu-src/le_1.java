/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataOutput;
import java.util.List;

/*
 * Renamed from Le
 */
public class le_1
implements kl_2 {
    private final kb_1 aPg;

    public le_1(kb_1 kb_12) {
        this.aPg = kb_12;
    }

    @Override
    public void b(DataOutput dataOutput) {
        dataOutput.writeBoolean(this.aPg.aQM());
        dataOutput.writeBoolean(this.aPg.aQO());
        dataOutput.writeBoolean(this.aPg.aQP());
        int[] nArray = this.aPg.aQN();
        dataOutput.writeShort(nArray[0]);
        dataOutput.writeShort(nArray[1]);
        dataOutput.writeByte(this.aPg.aQQ());
        dataOutput.writeInt(this.aPg.aQR());
        dataOutput.writeInt(this.aPg.aQS());
        List<kh_1> list = this.aPg.aPi().aPl();
        for (kh_1 kh_12 : list) {
            kn_2 kn_22 = new kn_2(kh_12);
            kn_22.b(dataOutput);
        }
    }
}

