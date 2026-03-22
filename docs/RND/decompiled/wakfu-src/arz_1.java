/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TIntHashSet
 *  org.jetbrains.annotations.NotNull
 */
import com.ankamagames.framework.graphics.engine.Anm2.Anm;
import gnu.trove.set.hash.TIntHashSet;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from arz
 */
class arz_1 {
    public final int cUs;
    public final Anm cUt;
    public final fk_0 cUu;
    private List<ez_1> cUv = null;
    public final int cUw;
    public TIntHashSet cUx;

    arz_1(int n, Anm anm, fk_0 fk_02, int n2) {
        this(n, anm, fk_02, n2, null);
    }

    arz_1(int n, Anm anm, fk_0 fk_02, int n2, TIntHashSet tIntHashSet) {
        this.cUs = n;
        this.cUt = anm;
        this.cUu = fk_02;
        this.cUw = n2;
        this.cUx = tIntHashSet;
    }

    arz_1(arz_1 arz_12) {
        this.cUs = arz_12.cUs;
        this.cUt = arz_12.cUt;
        this.cUu = null;
        this.cUw = arz_12.cUw;
        this.cUx = arz_12.cUx;
    }

    public final boolean bHL() {
        return this.cUt.aLB() && this.cUt.aID().aJS();
    }

    @NotNull
    public final List<ez_1> bHM() {
        ez_1[] ez_1Array;
        if (!this.bHL()) {
            return Collections.emptyList();
        }
        if (this.cUv != null) {
            return this.cUv;
        }
        LinkedList<ez_1> linkedList = new LinkedList<ez_1>();
        assert (this.cUu != null);
        String string = this.cUu.getName();
        assert (string != null);
        for (ez_1 ez_12 : ez_1Array = this.cUt.aID().aJU()) {
            if (!string.contains(ez_12.aAe)) continue;
            linkedList.add(ez_12);
        }
        this.cUv = Collections.unmodifiableList(linkedList);
        return this.cUv;
    }
}

