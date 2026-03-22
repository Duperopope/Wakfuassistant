/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eMg
 */
public class emg_0
implements Iterator<enk_0> {
    private final ArrayList<enk_0> qMs = new ArrayList();
    private int bUj;

    public emg_0(Iterator<enk_0> iterator) {
        this.c(iterator);
    }

    private void c(Iterator<enk_0> iterator) {
        while (iterator.hasNext()) {
            enk_0 enk_02 = iterator.next();
            if (this.d(enk_02)) {
                enk_0 enk_03 = this.Rx(enk_02.avZ());
                if (enk_03 != null) {
                    float[] fArray = enk_02.fAm();
                    float[] fArray2 = enk_03.fAm();
                    int n = fArray2.length;
                    for (int i = 0; i < n; i += 2) {
                        int n2 = i;
                        fArray2[n2] = fArray2[n2] + fArray[i];
                    }
                    continue;
                }
                this.qMs.add(enk_02.fAs());
                continue;
            }
            this.qMs.add(enk_02);
        }
    }

    @Nullable
    private enk_0 Rx(int n) {
        int n2 = this.qMs.size();
        for (int i = 0; i < n2; ++i) {
            enk_0 enk_02 = this.qMs.get(i);
            if (enk_02.avZ() != n) continue;
            return enk_02;
        }
        return null;
    }

    private boolean d(Qj qj) {
        ero_0 ero_02 = (ero_0)enf_0.fBb().pU(qj.avZ());
        return ero_02 instanceof eok_0 || ero_02 instanceof eol_0;
    }

    @Override
    public boolean hasNext() {
        return this.bUj < this.qMs.size();
    }

    public enk_0 fAh() {
        if (!this.hasNext()) {
            throw new NoSuchElementException("Il n'y a plus d'\u00e9l\u00e9ments");
        }
        return this.qMs.get(this.bUj++);
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Remove non support\u00e9");
    }

    @Override
    public /* synthetic */ Object next() {
        return this.fAh();
    }
}

