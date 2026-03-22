/*
 * Decompiled with CFR 0.152.
 */
import java.util.OptionalInt;

/*
 * Renamed from bdb
 */
public abstract class bdb_2
implements bug_0<bci_1> {
    private final boolean hJC;

    protected bdb_2(boolean bl) {
        this.hJC = bl;
    }

    abstract boolean b(bcl_1 var1);

    public boolean f(bci_1 bci_12) {
        for (bcl_1 bcl_12 : bci_12.daS().aFV()) {
            if (!this.b(bcl_12)) continue;
            return true;
        }
        return false;
    }

    @Override
    public boolean isValid() {
        return this.hJC;
    }

    static OptionalInt c(bcl_1 bcl_12) {
        if (bcl_12.dbb() != bby_2.hCy) {
            return OptionalInt.empty();
        }
        int[] nArray = bcl_12.dba();
        if (nArray == null || nArray.length == 0) {
            return OptionalInt.empty();
        }
        Object r = fgD.fXh().Vd(nArray[0]);
        if (r == null) {
            return OptionalInt.empty();
        }
        fhy_0 fhy_02 = ((fhc_0)r).dGh();
        if (fhy_02 == null) {
            return OptionalInt.empty();
        }
        return OptionalInt.of(fhy_02.aIi());
    }

    @Override
    public /* synthetic */ boolean ah(Object object) {
        return this.f((bci_1)object);
    }
}

