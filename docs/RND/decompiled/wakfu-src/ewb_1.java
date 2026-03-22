/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * Renamed from eWB
 */
public class ewb_1<E extends enk_0>
implements ewz_1<E> {
    private final List<E> rBN = new ArrayList();

    public static ewz_1 fOi() {
        return new ewb_1();
    }

    @Override
    public void v(E e2) {
        if (e2 == null) {
            return;
        }
        this.rBN.add(e2);
    }

    @Override
    public List<E> eeu() {
        return Collections.unmodifiableList(this.rBN);
    }

    @Override
    public E SK(int n) {
        for (int i = 0; i < this.rBN.size(); ++i) {
            enk_0 enk_02 = (enk_0)this.rBN.get(i);
            if (enk_02.aZH() != n) continue;
            return (E)enk_02;
        }
        return null;
    }

    @Override
    public int c(E e2, boolean bl) {
        return this.rBN.indexOf(e2);
    }

    @Override
    public void c(Comparator<enk_0> comparator) {
        this.rBN.sort(comparator);
    }
}

