/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from eJt
 */
public class ejt_0 {
    private final LinkedList<ffV> qzI = new LinkedList();

    public static ejt_0 a(@NotNull ll_0 ll_02, int n) {
        ejt_0 ejt_02 = new ejt_0();
        ejt_02.b(ll_02, n);
        return ejt_02;
    }

    public static ejt_0 Qb(int n) {
        ejt_0 ejt_02 = new ejt_0();
        ejt_02.a(new LinkedList<li>(), n);
        return ejt_02;
    }

    private ejt_0() {
    }

    private void b(@NotNull ll_0 ll_02, int n) {
        LinkedList linkedList = ll_02.ot().stream().sorted(Comparator.comparingInt(li::Lz)).collect(Collectors.toCollection(LinkedList::new));
        this.a(linkedList, n);
    }

    private void a(LinkedList<li> linkedList, int n) {
        ArrayList<ffV> arrayList = new ArrayList<ffV>();
        while (linkedList.peek() != null && linkedList.peek().Lz() < 0) {
            ffV ffV2 = fga_0.w(linkedList.poll().aaA());
            arrayList.add(ffV2);
        }
        for (int i = 0; i < n; ++i) {
            if (linkedList.peek() == null || linkedList.peek().Lz() != i) {
                this.qzI.add(null);
                continue;
            }
            ffV ffV3 = fga_0.w(linkedList.poll().aaA());
            this.qzI.add(ffV3);
            while (linkedList.peek() != null && linkedList.peek().Lz() == i) {
                ffV ffV4 = fga_0.w(linkedList.poll().aaA());
                arrayList.add(ffV4);
            }
        }
        linkedList.forEach(li2 -> {
            ffV ffV2 = fga_0.w(li2.aaA());
            this.qzI.add(ffV2);
        });
        this.qzI.addAll(arrayList);
    }

    public List<ffV> fba() {
        return Collections.unmodifiableList(this.qzI);
    }

    public boolean jW(long l) {
        return this.qzI.stream().anyMatch(ffV2 -> ffV2 != null && ffV2.LV() == l);
    }

    public boolean a(@NotNull ffV ffV2, int n) {
        if (n < 0 || n >= this.qzI.size()) {
            return false;
        }
        this.qzI.set(n, ffV2);
        return true;
    }

    public boolean b(@NotNull ffV ffV2, int n) {
        if (n < 0 || n >= this.qzI.size()) {
            return false;
        }
        if (this.qzI.get(n) != null) {
            return false;
        }
        int n2 = this.jY(ffV2.LV());
        if (n2 == -1) {
            return false;
        }
        this.qzI.set(n, ffV2);
        this.qzI.set(n2, null);
        return true;
    }

    public boolean jX(long l) {
        int n = this.jY(l);
        if (n == -1) {
            return false;
        }
        this.qzI.set(n, null);
        return true;
    }

    public boolean i(long l, short s) {
        int n = this.jY(l);
        ffV ffV2 = this.qzI.get(n);
        if (ffV2 == null) {
            return false;
        }
        if (ffV2.bfd() - s <= 0) {
            this.qzI.set(n, null);
            return true;
        }
        ffV2.al(-s);
        return true;
    }

    public int jY(long l) {
        for (int i = 0; i < this.qzI.size(); ++i) {
            if (this.qzI.get(i) == null || this.qzI.get(i).LV() != l) continue;
            return i;
        }
        return -1;
    }

    public Optional<ffV> Dz(int n) {
        if (n < 0 || n >= this.qzI.size()) {
            return Optional.empty();
        }
        return Optional.ofNullable(this.qzI.get(n));
    }

    public boolean q(long l, long l2) {
        int n = this.jY(l);
        int n2 = this.jY(l2);
        if (n < 0) {
            return false;
        }
        if (n2 < 0) {
            return false;
        }
        ffV ffV2 = this.qzI.get(n);
        ffV ffV3 = this.qzI.get(n2);
        this.qzI.set(n, ffV3);
        this.qzI.set(n2, ffV2);
        return true;
    }
}

