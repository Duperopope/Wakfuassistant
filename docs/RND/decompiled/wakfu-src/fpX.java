/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.jetbrains.annotations.Unmodifiable
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.Collection;
import java.util.Collections;
import org.jetbrains.annotations.Unmodifiable;

public class fpX<ReferenceRessource extends fpW> {
    protected final TIntObjectHashMap<ReferenceRessource> sRB = new TIntObjectHashMap();

    public void a(ReferenceRessource ReferenceRessource) {
        this.sRB.put(((fpW)ReferenceRessource).d(), ReferenceRessource);
    }

    public ReferenceRessource YN(int n) {
        return (ReferenceRessource)((fpW)this.sRB.get(n));
    }

    public boolean aJG() {
        return this.sRB.isEmpty();
    }

    public TIntObjectIterator<ReferenceRessource> ekN() {
        return this.sRB.iterator();
    }

    public @Unmodifiable Collection<ReferenceRessource> ghF() {
        return Collections.unmodifiableCollection(this.sRB.valueCollection());
    }
}

