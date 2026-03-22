/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;

/*
 * Renamed from Je
 */
public class je_0 {
    private final JG aKa;

    public je_0(JG jG) {
        this.aKa = jG;
    }

    public void b(DataInput dataInput) {
        kh_1 kh_12;
        do {
            kh_12 = new kh_1();
            this.aKa.e(kh_12);
            jh_0 jh_02 = new jh_0(kh_12);
            jh_02.b(dataInput);
        } while (kh_12.aPp().aPr() != JI.aKD);
    }
}

