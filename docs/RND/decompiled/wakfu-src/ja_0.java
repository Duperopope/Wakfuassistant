/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;

/*
 * Renamed from JA
 */
public class ja_0
implements jf_0 {
    private final ke_0 aKv;

    public ja_0(ke_0 ke_02) {
        this.aKv = ke_02;
    }

    @Override
    public void b(DataInput dataInput) {
        kh_1 kh_12;
        this.aKv.aj(dataInput.readFloat(), dataInput.readFloat());
        this.aKv.ak(dataInput.readFloat(), dataInput.readFloat());
        this.aKv.al(dataInput.readFloat(), dataInput.readFloat());
        this.aKv.am(dataInput.readFloat(), dataInput.readFloat());
        this.aKv.an(dataInput.readFloat(), dataInput.readFloat());
        this.aKv.ao(dataInput.readFloat(), dataInput.readFloat());
        this.aKv.ap(dataInput.readFloat(), dataInput.readFloat());
        this.aKv.aq(dataInput.readFloat(), dataInput.readFloat());
        this.aKv.ar(dataInput.readFloat(), dataInput.readFloat());
        this.aKv.as(dataInput.readFloat(), dataInput.readFloat());
        this.aKv.at(dataInput.readFloat(), dataInput.readFloat());
        this.aKv.au(dataInput.readFloat(), dataInput.readFloat());
        JG jG = this.aKv.aPi();
        do {
            kh_12 = new kh_1();
            jG.e(kh_12);
            jh_0 jh_02 = new jh_0(kh_12);
            jh_02.b(dataInput);
        } while (kh_12.aPp().aPr() != JI.aKD);
    }
}

