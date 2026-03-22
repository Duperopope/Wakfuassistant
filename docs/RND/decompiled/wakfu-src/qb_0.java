/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Optional;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from Qb
 */
public class qb_0 {
    private final int beZ;
    private final ArrayList<qc_0> bfa = new ArrayList();
    @Nullable
    private String bfb;
    @Nullable
    private String bfc;

    public qb_0(int n) {
        this.beZ = n;
    }

    public void a(qc_0 qc_02) {
        if (!this.bfa.contains(qc_02)) {
            this.bfa.add(qc_02);
        }
    }

    public <Choice extends qc_0> Choice ow(int n) {
        for (int i = 0; i < this.bfa.size(); ++i) {
            qc_0 qc_02 = this.bfa.get(i);
            if (qc_02.d() != n) continue;
            return (Choice)qc_02;
        }
        return null;
    }

    public int aZq() {
        return this.bfa.size();
    }

    public Iterator<qc_0> aZr() {
        return this.bfa.iterator();
    }

    public int d() {
        return this.beZ;
    }

    public Optional<String> aZs() {
        return Optional.ofNullable(this.bfb);
    }

    public void df(@Nullable String string) {
        this.bfb = string;
    }

    public Optional<String> aZt() {
        return Optional.ofNullable(this.bfc);
    }

    public void dg(@Nullable String string) {
        this.bfc = string;
    }
}

