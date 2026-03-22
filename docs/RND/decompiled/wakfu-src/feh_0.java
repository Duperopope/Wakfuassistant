/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 *  org.jetbrains.annotations.Nullable
 *  org.jetbrains.annotations.Unmodifiable
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

/*
 * Renamed from feH
 */
public class feh_0
implements fff<ffV> {
    private static final byte seE = 100;
    private final LinkedList<ffV> seF = new LinkedList();
    private final ArrayList<ffo> seG = new ArrayList();

    public @Unmodifiable List<ffV> fba() {
        return Collections.unmodifiableList(this.seF);
    }

    public ffV eO(short s) {
        return this.seF.get(s);
    }

    @Nullable
    public ffV sP(long l) {
        short s = this.sS(l);
        return s == -1 ? null : this.seF.get(s);
    }

    public boolean sQ(long l) {
        return this.sS(l) != -1;
    }

    @Deprecated
    public void cf(ffV ffV2) {
        this.seF.add(ffV2);
        this.cg(ffV2);
    }

    @Nullable
    private ffV eP(short s) {
        if (s != -1) {
            ffV ffV2 = this.seF.remove(s);
            this.ch(ffV2);
            return ffV2;
        }
        return null;
    }

    ffV sR(long l) {
        return this.eP(this.sS(l));
    }

    boolean bs(ffV ffV2) {
        return this.sR(ffV2.LV()) != null;
    }

    ffV fUG() {
        if (!this.seF.isEmpty()) {
            return this.eP((short)0);
        }
        return null;
    }

    void r(long l, short s) {
        ffV ffV2 = this.sP(l);
        if (ffV2 != null) {
            ffV2.ak(s);
            this.ci(ffV2);
        }
    }

    short sS(long l) {
        int n = this.seF.size();
        for (int i = 0; i < n; ++i) {
            if (this.seF.get(i).LV() != l) continue;
            return (short)i;
        }
        return -1;
    }

    short fUH() {
        return (short)this.seF.size();
    }

    private void cg(ffV ffV2) {
        for (int i = this.seG.size() - 1; i >= 0; --i) {
            this.seG.get(i).ah(ffV2);
        }
    }

    private void ch(ffV ffV2) {
        for (int i = this.seG.size() - 1; i >= 0; --i) {
            this.seG.get(i).ai(ffV2);
        }
    }

    private void ci(ffV ffV2) {
        for (int i = this.seG.size() - 1; i >= 0; --i) {
            this.seG.get(i).aj(ffV2);
        }
    }

    private void fna() {
        for (int i = this.seG.size() - 1; i >= 0; --i) {
            this.seG.get(i).dRK();
        }
    }

    public void a(ffo ffo2) {
        this.seG.add(ffo2);
    }

    public void b(ffo ffo2) {
        this.seG.remove(ffo2);
    }

    public void eqo() {
        this.seG.clear();
    }

    public boolean isFull() {
        return this.seF.size() == 100;
    }

    public boolean aJG() {
        return this.seF.isEmpty();
    }

    public void clear() {
        this.a(fei_0.seH);
        this.seF.clear();
        this.fna();
    }

    public boolean fa(long l) {
        return this.sS(l) != -1;
    }

    public boolean bt(ffV ffV2) {
        return this.fa(ffV2.LV());
    }

    @Override
    public boolean a(TObjectProcedure<ffV> tObjectProcedure) {
        int n = this.seF.size();
        for (int i = 0; i < n; ++i) {
            ffV ffV2 = this.seF.get(i);
            if (tObjectProcedure.execute((Object)ffV2)) continue;
            return false;
        }
        return true;
    }

    @Override
    public void r(Consumer<ffV> consumer) {
        this.seF.forEach(consumer);
    }

    public String toString() {
        return "TemporaryInventoryModel{m_items=" + (this.seF == null ? "null" : Collections.singletonList(this.seF).toString()) + "}";
    }
}

