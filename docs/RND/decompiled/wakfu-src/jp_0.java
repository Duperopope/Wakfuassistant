/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;

/*
 * Renamed from Jp
 */
public class jp_0
implements jf_0 {
    private final ks_1 aKk;

    public jp_0(ks_1 ks_12) {
        this.aKk = ks_12;
    }

    @Override
    public void b(DataInput dataInput) {
        kh_1 kh_12;
        JG jG = this.aKk.aPi();
        do {
            kh_12 = new kh_1();
            jG.e(kh_12);
            jh_0 jh_02 = new jh_0(kh_12);
            jh_02.b(dataInput);
        } while (kh_12.aPp().aPr() != JI.aKD);
    }
}

