/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Unmodifiable
 */
import java.util.Collections;
import java.util.Set;
import org.jetbrains.annotations.Unmodifiable;

/*
 * Renamed from bpf
 */
public class bpf_0
implements boq_1<Integer>,
bug_0<bpe_0> {
    private final Set<Integer> iUD;

    public bpf_0(Set<Integer> set) {
        this.iUD = Collections.unmodifiableSet(set);
    }

    public boolean c(bpe_0 bpe_02) {
        return this.iUD.contains(bpe_02.dCD());
    }

    @Override
    public boolean isValid() {
        return !this.iUD.isEmpty();
    }

    @Override
    public buh_0 dcz() {
        return buh_0.jou;
    }

    @Override
    public @Unmodifiable Set<Integer> dCe() {
        return this.iUD;
    }

    @Override
    public /* synthetic */ boolean ah(Object object) {
        return this.c((bpe_0)object);
    }
}

