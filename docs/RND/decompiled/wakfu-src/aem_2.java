/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from aEm
 */
public class aem_2
implements aej_1 {
    private final String dFn;
    private final String dFo;
    private final aen_2 dFp;
    private String dFq;

    public aem_2(String string, String string2, String string3, aen_2 aen_22) {
        this.dFq = string;
        this.dFn = string2;
        this.dFo = string3;
        this.dFp = aen_22;
    }

    public aem_2(String string) {
        this.dFq = string;
        this.dFn = null;
        this.dFo = null;
        this.dFp = null;
    }

    @Override
    public void c(@NotNull aei_1 aei_12) {
        if (aei_12.bZi() == aek_2.dFg) {
            this.dFq = this.dFn;
            this.dFp.F(this.dFo, aei_12.bZl());
        }
    }

    public String bZo() {
        return this.dFq;
    }
}

