/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from eYl
 */
public abstract class eyl_1
extends fi_1 {
    protected final exz_1 rJs;
    private List<eyk_1> aRj;

    eyl_1(exz_1 exz_12) {
        this.rJs = exz_12;
    }

    public void zm() {
        if (this.aRj == null) {
            return;
        }
        for (eyk_1 eyk_12 : this.aRj) {
            eyk_12.zm();
        }
    }

    public void a(eyk_1 eyk_12) {
        if (this.aRj == null) {
            this.aRj = new ArrayList<eyk_1>();
        }
        if (!this.aRj.contains(eyk_12)) {
            this.aRj.add(eyk_12);
        }
    }
}

