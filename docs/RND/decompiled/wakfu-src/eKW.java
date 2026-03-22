/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import org.jetbrains.annotations.Nullable;

public class eKW {
    private final int qEI;
    private final int qEJ;
    private final float qEK;
    private final boolean qEL;
    private final boolean qEM;
    private final boolean qEN;
    private final TIntObjectHashMap<eKR> qEO = new TIntObjectHashMap();
    private TIntObjectHashMap<ArrayList<eKR>> qEP = null;
    private TIntObjectHashMap<ArrayList<eKR>> qEQ = null;
    private Map<Integer, Integer> qER = null;
    private Map<Integer, Integer> qES = null;

    public eKW(int n, int n2, float f2, boolean bl, boolean bl2, boolean bl3) {
        this.qEI = n;
        this.qEJ = n2;
        this.qEK = f2;
        this.qEL = bl;
        this.qEM = bl2;
        this.qEN = bl3;
    }

    public int d() {
        return this.qEI;
    }

    public int fzd() {
        return this.qEJ;
    }

    public float cmu() {
        return this.qEK;
    }

    public boolean cmv() {
        return this.qEL || this.qEM;
    }

    public boolean cmw() {
        return this.qEM;
    }

    public eKR QZ(int n) {
        return (eKR)this.qEO.get(n);
    }

    public TIntObjectIterator<eKR> fze() {
        return this.qEO.iterator();
    }

    public Map<Integer, Integer> fzf() {
        if (this.qER == null) {
            return Collections.emptyMap();
        }
        return Collections.unmodifiableMap(this.qER);
    }

    public Map<Integer, Integer> fzg() {
        if (this.qES == null) {
            return Collections.emptyMap();
        }
        return Collections.unmodifiableMap(this.qES);
    }

    @Nullable
    public Iterator<eKR> Ra(int n) {
        ArrayList arrayList = (ArrayList)this.qEP.get(n);
        return arrayList != null ? arrayList.iterator() : null;
    }

    @Nullable
    public Iterator<eKR> Rb(int n) {
        ArrayList arrayList = (ArrayList)this.qEQ.get(n);
        return arrayList != null ? arrayList.iterator() : null;
    }

    public boolean Rc(int n) {
        return this.qEP.get(n) != null;
    }

    public int fzh() {
        return this.qEO.size();
    }

    public boolean cmx() {
        return this.qEN;
    }

    public void f(TIntObjectHashMap<ArrayList<eKR>> tIntObjectHashMap) {
        this.qEP = tIntObjectHashMap;
    }

    public void g(TIntObjectHashMap<ArrayList<eKR>> tIntObjectHashMap) {
        this.qEQ = tIntObjectHashMap;
    }

    public void I(Map<Integer, Integer> map) {
        this.qER = map;
    }

    public void c(int n, eKR eKR2) {
        this.qEO.put(n, (Object)eKR2);
    }

    public Collection<eKR> dxi() {
        return this.qEO.valueCollection();
    }

    public void J(Map<Integer, Integer> map) {
        this.qES = map;
    }
}

