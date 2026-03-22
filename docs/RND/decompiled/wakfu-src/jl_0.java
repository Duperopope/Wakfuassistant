/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;

/*
 * Renamed from Jl
 */
public class jl_0
implements jf_0 {
    private final ko_1 aKg;

    public jl_0(ko_1 ko_12) {
        this.aKg = ko_12;
    }

    @Override
    public void b(DataInput dataInput) {
        kh_1 kh_12;
        float f2 = dataInput.readFloat();
        float f3 = dataInput.readFloat();
        float f4 = dataInput.readFloat();
        float f5 = dataInput.readFloat();
        float f6 = dataInput.readFloat();
        float f7 = dataInput.readFloat();
        this.aKg.E(f2, f5);
        this.aKg.F(f3, f6);
        this.aKg.G(f4, f7);
        JG jG = this.aKg.aPi();
        do {
            kh_12 = new kh_1();
            jG.e(kh_12);
            jh_0 jh_02 = new jh_0(kh_12);
            jh_02.b(dataInput);
        } while (kh_12.aPp().aPr() != JI.aKD);
    }
}

