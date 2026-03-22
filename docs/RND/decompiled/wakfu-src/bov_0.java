/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.jetbrains.annotations.Unmodifiable
 */
import java.util.Collections;
import java.util.Set;
import lombok.Generated;
import org.jetbrains.annotations.Unmodifiable;

/*
 * Renamed from boV
 */
public class bov_0
implements boq_1<fgj>,
bug_0<ffV> {
    private final Set<fgj> iTz;

    public bov_0(Set<fgj> set) {
        this.iTz = Collections.unmodifiableSet(set);
    }

    public boolean L(ffV ffV2) {
        return this.iTz.contains(ffV2.dwg());
    }

    @Override
    public boolean isValid() {
        return !this.iTz.isEmpty();
    }

    @Override
    public buh_0 dcz() {
        return buh_0.jov;
    }

    @Override
    public @Unmodifiable Set<fgj> dCe() {
        return this.iTz;
    }

    @Generated
    public Set<fgj> dCk() {
        return this.iTz;
    }

    @Override
    public /* synthetic */ boolean ah(Object object) {
        return this.L((ffV)object);
    }
}

