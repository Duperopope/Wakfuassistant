/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntIterator
 *  gnu.trove.procedure.TIntObjectProcedure
 *  gnu.trove.set.hash.TIntHashSet
 */
import gnu.trove.iterator.TIntIterator;
import gnu.trove.procedure.TIntObjectProcedure;
import gnu.trove.set.hash.TIntHashSet;
import java.io.IOException;

class ade
implements TIntObjectProcedure<TIntHashSet> {
    final /* synthetic */ fs_0 ciB;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    ade(add_0 add_02, fs_0 fs_02) {
        this.ciB = fs_02;
    }

    public boolean a(int n, TIntHashSet tIntHashSet) {
        try {
            this.ciB.mz(n);
            this.ciB.mz(tIntHashSet.size());
            TIntIterator tIntIterator = tIntHashSet.iterator();
            while (tIntIterator.hasNext()) {
                this.ciB.mz(tIntIterator.next());
            }
        }
        catch (IOException iOException) {
            add_0.ciz.error((Object)"IOException during save", (Throwable)iOException);
            return false;
        }
        return true;
    }

    public /* synthetic */ boolean execute(int n, Object object) {
        return this.a(n, (TIntHashSet)object);
    }
}

