/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.Optional;

public interface bsS
extends eub_0<bgy> {
    public void chN();

    public Collection<bgy> bK(byte var1);

    public bgy kq(long var1);

    @Override
    public Collection<bgy> bL(byte var1);

    public boolean u(QQ var1);

    public ags_0 dGx();

    public long bhF();

    default public Optional<bgy> dGK() {
        return Optional.empty();
    }

    public aVa dGy();

    @Override
    default public /* synthetic */ euc_1 ku(long l) {
        return this.kq(l);
    }
}

