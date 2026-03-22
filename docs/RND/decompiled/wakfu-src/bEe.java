/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public final class bEe
extends Record {
    @NotNull
    private final ffV jMj;
    @NotNull
    private final exP jMk;

    public bEe(@NotNull ffV ffV2, @NotNull exP exP2) {
        this.jMj = ffV2;
        this.jMk = exP2;
    }

    public static Optional<bEe> x(long l, long l2) {
        if (l > 0L) {
            bhJ bhJ2 = (bhJ)fcL.rUh.sw(l);
            if (bhJ2 == null) {
                return Optional.empty();
            }
            ffV ffV2 = fcI.an(bhJ2.aZj(), l2);
            if (ffV2 == null) {
                return Optional.empty();
            }
            return Optional.of(new bEe(ffV2, bhJ2));
        }
        eJS eJS2 = eJN.qAF.O(bbs_2.xl(), -l);
        if (eJS2 == null) {
            return Optional.empty();
        }
        ffV ffV3 = (ffV)eJS2.dme().dN(l2);
        if (ffV3 == null) {
            return Optional.empty();
        }
        return Optional.of(new bEe(ffV3, blq_1.i(eJS2)));
    }

    public boolean dtZ() {
        return this.jMk.a(eyp_0.pmO);
    }

    public void dRS() {
        if (this.dtZ()) {
            cvu_2.a(this.jMj, (bhJ)this.jMk);
        } else {
            eJS eJS2 = eJN.qAF.O(bbs_2.xl(), ((bhx_0)this.jMk).doL());
            if (eJS2 != null) {
                cts_1.o(eJS2);
            }
        }
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{bEe.class, "item;itemOwner", "jMj", "jMk"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{bEe.class, "item;itemOwner", "jMj", "jMk"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{bEe.class, "item;itemOwner", "jMj", "jMk"}, this, object);
    }

    @NotNull
    public ffV dRT() {
        return this.jMj;
    }

    @NotNull
    public exP dRU() {
        return this.jMk;
    }
}

