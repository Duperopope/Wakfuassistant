/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterables
 */
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/*
 * Renamed from nn
 */
public class nn_1 {
    private final List<ni_2> Nk = new ArrayList<ni_2>();
    private final Map<Integer, Long> Nl = new HashMap<Integer, Long>();
    private final Map<Integer, ne_2> Nm = new HashMap<Integer, ne_2>();
    private final Set<Integer> Nn = new HashSet<Integer>();
    private final LinkedList<Integer> No = new LinkedList();

    public List<ni_2> apz() {
        return Collections.unmodifiableList(this.Nk);
    }

    public Map<Integer, Long> apA() {
        return this.Nl;
    }

    public LinkedList<Integer> apB() {
        return this.No;
    }

    public boolean iQ(int n) {
        return this.No.contains(n);
    }

    public int apC() {
        if (this.No.isEmpty()) {
            return 0;
        }
        return this.No.removeFirst();
    }

    public boolean iR(int n) {
        return this.No.removeFirstOccurrence(n);
    }

    public void iS(int n) {
        this.No.addLast(n);
    }

    public Long c(int n, long l) {
        return this.Nl.put(n, l);
    }

    public Long iT(int n) {
        return this.Nl.get(n);
    }

    public void iU(int n) {
        this.Nl.remove(n);
    }

    public void b(ni_2 ni_22) {
        this.Nk.add(ni_22);
    }

    public void ak(Iterable<ni_2> iterable) {
        Iterables.addAll(this.Nk, iterable);
    }

    public void a(BiConsumer<Integer, ne_2> biConsumer) {
        this.Nm.forEach(biConsumer);
    }

    public void b(ne_2 ne_22) {
        this.Nm.put(ne_22.d(), ne_22);
    }

    public boolean iV(int n) {
        return this.Nm.containsKey(n);
    }

    public ne_2 iW(int n) {
        return this.Nm.get(n);
    }

    public void iX(int n) {
        this.Nm.remove(n);
    }

    public int apD() {
        return this.Nm.size();
    }

    public void a(Consumer<Integer> consumer) {
        this.Nn.forEach(consumer);
    }

    public void iY(int n) {
        this.Nn.add(n);
    }

    public boolean iZ(int n) {
        return this.Nn.contains(n);
    }

    public void ja(int n) {
        this.Nn.remove(n);
    }

    public int apE() {
        return this.Nn.size();
    }

    public Optional<Long> apF() {
        if (this.Nm.size() == 0) {
            return Optional.empty();
        }
        return this.Nm.values().stream().filter(ne_2::app).filter(ne_2::apt).map(ne_2::apq).sorted().findFirst();
    }

    public Optional<ne_2> apG() {
        if (this.Nm.isEmpty()) {
            return Optional.empty();
        }
        return this.Nm.values().stream().filter(ne_2::app).filter(ne_2::apt).min(Comparator.comparing(ne_2::apq));
    }

    public Map<Integer, ne_2> apH() {
        return this.Nm;
    }

    public String toString() {
        return "ServerAchievementData{m_history=" + String.valueOf(this.Nk) + ", m_variables=" + String.valueOf(this.Nl) + ", m_achievements=" + String.valueOf(this.Nm) + ", m_objectives=" + String.valueOf(this.Nn) + ", m_follow=" + String.valueOf(this.No) + "}";
    }
}

