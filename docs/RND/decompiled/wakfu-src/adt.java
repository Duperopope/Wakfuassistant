/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.jetbrains.annotations.NotNull
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import org.jetbrains.annotations.NotNull;

public class adt {
    public static final int cjE = 0;
    private final TIntObjectHashMap<adr> cjF = new TIntObjectHashMap();
    boolean ciW;

    public TIntObjectHashMap<adr> buB() {
        return this.cjF;
    }

    public void a(TIntObjectHashMap<adr> tIntObjectHashMap) {
        this.cjF.ensureCapacity(this.cjF.size() + tIntObjectHashMap.size());
        this.cjF.putAll(tIntObjectHashMap);
    }

    public void a(@NotNull apl_1 apl_12, boolean bl) {
        this.c(apl_12, bl);
    }

    public void b(@NotNull apl_1 apl_12, boolean bl) {
        byte by = apl_12.aIy();
        this.a(apl_12, bl);
    }

    public void b(@NotNull fs_0 fs_02) {
        this.l(fs_02);
    }

    private void c(apl_1 apl_12, boolean bl) {
        int n;
        if (bl) {
            this.cjF.clear();
        }
        if ((n = apl_12.aIz() & 0xFFFF) == 0) {
            return;
        }
        for (int i = 0; i < n; ++i) {
            adr adr2 = new adr();
            adr2.a(apl_12);
            this.cjF.put(adr2.o, (Object)adr2);
        }
    }

    private void l(fs_0 fs_02) {
        int n = this.cjF.size();
        if (n > Short.MAX_VALUE) {
            throw new IllegalArgumentException("Nombre de landmark > 32767");
        }
        fs_02.k((short)(n & 0xFFFF));
        TIntObjectIterator tIntObjectIterator = this.cjF.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            ((adr)tIntObjectIterator.value()).b(fs_02);
        }
    }

    public void clear() {
        this.cjF.clear();
    }
}

