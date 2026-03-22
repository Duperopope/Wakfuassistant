/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TIntHashSet
 *  org.jetbrains.annotations.NotNull
 */
import com.ankamagames.framework.graphics.engine.Anm2.Anm;
import gnu.trove.set.hash.TIntHashSet;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from arH
 */
class arh_1
extends arf_2 {
    static final /* synthetic */ boolean cUZ;

    arh_1() {
    }

    @Override
    public void clear() {
        if (!cUZ && this.bHR()) {
            throw new AssertionError();
        }
        super.clear();
    }

    @Override
    boolean a(Anm anm, int n) {
        if (!cUZ) {
            throw new AssertionError((Object)"on ne peut pas faire d'op\u00e9ration sur le NULL");
        }
        return false;
    }

    @Override
    public boolean a(@NotNull Anm anm, TIntHashSet tIntHashSet) {
        if (!cUZ) {
            throw new AssertionError((Object)"on ne peut pas faire d'op\u00e9ration sur le NULL");
        }
        return false;
    }

    @Override
    arf_2 bHY() {
        return this;
    }

    static {
        cUZ = !arf_2.class.desiredAssertionStatus();
    }
}

