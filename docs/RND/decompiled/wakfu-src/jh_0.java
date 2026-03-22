/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;

/*
 * Renamed from Jh
 */
public class jh_0 {
    private final kh_1 aKc;

    public jh_0(kh_1 kh_12) {
        this.aKc = kh_12;
    }

    public void b(DataInput dataInput) {
        kj_1 kj_12 = this.aKc.aPp();
        jg_0 jg_02 = new jg_0(kj_12);
        jg_02.b(dataInput);
        ki_1 ki_12 = kj_12.aPr().aPn();
        if (ki_12 == null) {
            return;
        }
        this.aKc.c(ki_12);
        jf_0 jf_02 = ih_0.aJV.a(ki_12);
        jf_02.b(dataInput);
    }
}

