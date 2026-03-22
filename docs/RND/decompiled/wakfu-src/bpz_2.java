/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.io.File;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bPz
 */
public class bpz_2
implements aej_1 {
    private final aej_1 kRf;

    public bpz_2(aej_1 aej_12) {
        this.kRf = aej_12;
    }

    @Override
    public void c(@NotNull aei_1 aei_12) {
        aeo_2 aeo_22;
        aeq_2 aeq_22;
        String string;
        if (aei_12.bZi() == aek_2.dFg && (string = (aeq_22 = (aeq_2)(aeo_22 = (aeo_2)aei_12).bZg()).bZr()) != null && !string.equals(aeq_22.bZq())) {
            File file = aeo_22.bZp();
            aep_2.dFy.G(file.getName(), string);
        }
        this.kRf.c(aei_12);
    }

    public String toString() {
        return "CacheFillerListener{}";
    }
}

