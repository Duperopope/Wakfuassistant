/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class QE
implements uu_0<QD>,
Iterable<QD> {
    protected static final Logger bhg = Logger.getLogger(QE.class);
    private static final Consumer<QD<?, ?>> bhh = QD::aZp;
    protected final Map<Long, QD> bhi = new LinkedHashMap<Long, QD>();
    public static final byte bhj = 1;
    public static final byte bhk = 10;
    public static final byte bhl = 11;
    public static final byte bhm = 2;
    public static final byte bhn = 20;
    public static final byte bho = 21;
    public static final byte bhp = 3;
    public static final byte bhq = 30;
    public static final byte bhr = 31;
    public static final byte bhs = 4;
    public static final byte bht = 40;
    public static final byte bhu = 41;
    public static final byte bhv = 5;
    public static final byte bhw = 6;
    public static final byte bhx = 60;
    public static final byte bhy = 61;
    private boolean bhz = false;

    public void clear() {
        HashSet<Long> hashSet = new HashSet<Long>(this.bhi.keySet());
        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            long l = (Long)iterator.next();
            QD qD = this.bhi.get(l);
            if (qD == null) continue;
            try {
                qD.aW(false);
            }
            catch (Exception exception) {
                bhg.error((Object)("Failed to unapply effect with id " + l + " for user " + String.valueOf(this.bci())), (Throwable)exception);
            }
        }
        this.bhi.clear();
    }

    public void bch() {
        this.d(bhh);
        this.bhi.clear();
    }

    public qu_0 bci() {
        return null;
    }

    public QD dm(long l) {
        return this.bhi.get(l);
    }

    public void p(QD qD) {
        if (!this.bhi.containsKey(qD.LV())) {
            this.bhi.put(qD.LV(), qD);
            qD.a(this);
        } else assert (qD == this.bhi.get(qD.LV()));
    }

    public boolean q(QD qD) {
        return this.dn(qD.LV());
    }

    public void a(QD ... qDArray) {
        if (qDArray != null && qDArray.length > 0) {
            for (QD qD : qDArray) {
                this.q(qD);
            }
        }
    }

    public void r(QD qD) {
        qD.bbR();
    }

    public boolean dn(long l) {
        QD qD = this.bhi.remove(l);
        if (qD != null) {
            this.r(qD);
            return true;
        }
        return false;
    }

    protected void d(@NotNull Consumer<QD<?, ?>> consumer) {
        if (this.bhi.isEmpty()) {
            return;
        }
        for (QD qD : this.bhi.values()) {
            consumer.accept(qD);
        }
    }

    @Nullable
    protected <T> T a(@NotNull Function<QD<?, ?>, T> function) {
        if (this.bhi.isEmpty()) {
            return null;
        }
        for (QD qD : this.bhi.values()) {
            @Nullable T t = function.apply(qD);
            if (t == null) continue;
            return t;
        }
        return null;
    }

    public List<QD> oG(int n) {
        ArrayList<QD> arrayList = new ArrayList<QD>();
        this.d(qD -> {
            if (qD.bbf() != null && qD.bbf().bab() == n) {
                arrayList.add((QD)qD);
            }
        });
        return arrayList;
    }

    public List<QD> oH(int n) {
        if (this.bhi.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList<QD> arrayList = new ArrayList<QD>();
        this.d(qD -> {
            Object FX = qD.bba();
            if (FX != null && FX.avZ() == n) {
                arrayList.add((QD)qD);
            }
        });
        return arrayList;
    }

    public <T> Optional<T> oI(int n) {
        if (this.bhi.isEmpty()) {
            return Optional.empty();
        }
        for (QD qD : this.bhi.values()) {
            Object FX = qD.bba();
            if (FX == null || FX.avZ() != n) continue;
            return Optional.of(qD);
        }
        return Optional.empty();
    }

    public List<QD> oJ(int n) {
        if (this.bhi.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList<QD> arrayList = new ArrayList<QD>();
        this.d(qD -> {
            if (qD.d() == n) {
                arrayList.add((QD)qD);
            }
        });
        return arrayList;
    }

    public List<QD> oK(int n) {
        ArrayList<QD> arrayList = new ArrayList<QD>();
        this.d(qD -> {
            Object FX = qD.bba();
            if (FX != null && FX.aZH() == n) {
                arrayList.add((QD)qD);
            }
        });
        return arrayList;
    }

    protected QN h(qu_0 qu_02) {
        return QN.a(this, this.iterator(), qu_02, false);
    }

    protected QM b(Qk qk) {
        return new QM(this, this.iterator(), qk);
    }

    public void i(qu_0 qu_02) {
        try {
            Iterator<QD> iterator = this.iterator();
            while (iterator.hasNext()) {
                QD qD = iterator.next();
                if (qD.bbc() != qu_02 && qD.bbd() != qu_02) continue;
                iterator.remove();
                qD.bbR();
            }
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            this.i(qu_02);
        }
    }

    public void a(Qk qk, boolean bl) {
        try {
            Iterator<QD> iterator = this.iterator();
            while (iterator.hasNext()) {
                QD qD = iterator.next();
                if (qD.bbf() != qk) continue;
                iterator.remove();
                if (!bl) continue;
                qD.bbR();
            }
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            this.a(qk, bl);
        }
    }

    public void a(Qk qk, boolean bl, boolean bl2) {
        throw new UnsupportedOperationException("Ne devrait pas \u00eatre appel\u00e9 si n'est pas impl\u00e9ment\u00e9");
    }

    @Override
    @NotNull
    public Iterator<QD> iterator() {
        return this.bhi.values().iterator();
    }

    public abstract QI bcj();

    @Override
    public boolean a(BitSet bitSet, QD qD, byte by) {
        if (this.bcj() == null) {
            return false;
        }
        return this.bcj().a(bitSet, qD, by);
    }

    public boolean aJG() {
        return this.bhi.isEmpty();
    }

    public int aVo() {
        return this.bhi.size();
    }

    public boolean oL(int n) {
        for (QD qD : this) {
            if (qD.bba() == null || qD.bba().aZH() != n) continue;
            return true;
        }
        return false;
    }

    public void aY(boolean bl) {
        this.bhz = bl;
    }

    public boolean bck() {
        return this.bhz;
    }

    public String toString() {
        return this.bhi.toString();
    }
}

