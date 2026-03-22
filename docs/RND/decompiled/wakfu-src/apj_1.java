/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from apJ
 */
public class apj_1
implements ape_2 {
    private aph_1 cOz = null;
    private ape_2 cOA = null;
    private List<ape_2> cOB = null;

    public apj_1(aph_1 aph_12) {
        this.cOz = aph_12;
    }

    void c(ape_2 ape_22) {
        this.cOA = ape_22;
        ((apj_1)this.cOA).d(this);
    }

    private void d(ape_2 ape_22) {
        if (this.cOB == null) {
            this.cOB = new ArrayList<ape_2>();
        }
        this.cOB.add(ape_22);
    }

    @Override
    public List<ape_2> bFA() {
        return this.cOB;
    }

    @Override
    public ape_2 bFB() {
        return null;
    }

    @Override
    public ape_2 bFz() {
        return this.cOA;
    }

    @Override
    public aph_1 bFC() {
        return this.cOz;
    }

    public String toString() {
        return this.cOz.toString();
    }
}

