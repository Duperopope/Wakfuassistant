/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
import java.util.Collections;
import java.util.Set;
import lombok.Generated;

public class bEp
implements bug_0<ffV> {
    private final Set<fgj> jNT;

    public bEp(Set<fgj> set) {
        this.jNT = Collections.unmodifiableSet(set);
    }

    public boolean L(ffV ffV2) {
        return this.jNT.contains(ffV2.dwg());
    }

    @Override
    public boolean isValid() {
        return !this.jNT.isEmpty();
    }

    @Override
    public buh_0 dcz() {
        return buh_0.jov;
    }

    @Generated
    public Set<fgj> dCk() {
        return this.jNT;
    }

    @Override
    public /* synthetic */ boolean ah(Object object) {
        return this.L((ffV)object);
    }
}

