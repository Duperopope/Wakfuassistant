/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.Collections;
import java.util.Set;
import org.jetbrains.annotations.NotNull;

public class bpW
implements bqg_0 {
    @NotNull
    private final bKT iYy;
    private final Set<Integer> iYz;

    public bpW(@NotNull bKT bKT2) {
        this.iYy = bKT2;
        this.iYz = bpm_1.dCG().EY(bKT2.d()).orElse(Collections.emptySet());
    }

    public int dDR() {
        return this.iYy.d();
    }

    public boolean a(bpb_1 bpb_12) {
        if (!(bpb_12 instanceof bpe_1)) {
            return false;
        }
        return this.iYz.contains(bpb_12.d());
    }

    @Override
    public boolean isValid() {
        return !this.iYz.isEmpty();
    }

    @Override
    @NotNull
    public String dDG() {
        return this.iYy.ebZ();
    }

    @Override
    public buh_0 dcz() {
        return buh_0.jot;
    }

    @Override
    public /* synthetic */ boolean ah(Object object) {
        return this.a((bpb_1)object);
    }
}

