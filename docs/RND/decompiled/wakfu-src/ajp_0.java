/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.map.hash.TLongObjectHashMap;
import java.util.ArrayList;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Renamed from aJp
 */
public class ajp_0
extends adt {
    public static final int eaB = 0;
    public static final int eaC = 255;
    private static final Logger eaD = Logger.getLogger(ajp_0.class);
    private final TLongObjectHashMap<adq> eaE = new TLongObjectHashMap();

    public byte bur() {
        return 0;
    }

    public TLongObjectHashMap<adq> chB() {
        return this.eaE;
    }

    public adq if(long l) {
        return (adq)this.eaE.get(l);
    }

    @Override
    public void a(@NotNull apl_1 apl_12, boolean bl) {
        super.a(apl_12, bl);
        this.d(apl_12, bl);
        this.chC();
    }

    private void d(apl_1 apl_12, boolean bl) {
        int n;
        if (bl) {
            this.eaE.clear();
        }
        if ((n = apl_12.aIz()) == 0) {
            return;
        }
        for (int i = 0; i < n; ++i) {
            adq adq2 = new adq();
            adq2.a(apl_12);
            this.eaE.put(adq2.aXv, (Object)adq2);
        }
    }

    private void chC() {
        TIntObjectHashMap<adr> tIntObjectHashMap = this.buB();
        TIntObjectIterator tIntObjectIterator = tIntObjectHashMap.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            adr adr2 = (adr)tIntObjectIterator.value();
            if (adr2.cjB == null) continue;
            int n = adr2.cjB.size();
            for (int i = 0; i < n; ++i) {
                ads ads2 = adr2.cjB.get(i);
                try {
                    ads2.bfe = ehu_0.rY(ads2.cjD);
                    continue;
                }
                catch (Exception exception) {
                    eaD.warn((Object)("Impossible de compiler le crit\u00e8re " + ads2.cjD + " sur la description de landMark d'id " + ads2.o));
                }
            }
        }
    }

    public void t(ArrayList<adq> arrayList) {
        int n = arrayList.size();
        for (int i = 0; i < n; ++i) {
            adq adq2 = arrayList.get(i);
            this.eaE.put(adq2.aXv, (Object)adq2);
        }
    }

    @Override
    public void b(@NotNull fs_0 fs_02) {
        super.b(fs_02);
        this.j(fs_02);
    }

    private void j(fs_0 fs_02) {
        int n = this.eaE.size();
        if (n > Short.MAX_VALUE) {
            throw new IllegalArgumentException("Nombre d'elements interactifs superieur \u00e0 32767");
        }
        fs_02.k((short)n);
        TLongObjectIterator tLongObjectIterator = this.eaE.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            ((adq)tLongObjectIterator.value()).b(fs_02);
        }
    }

    @Override
    public void clear() {
        super.clear();
        this.eaE.clear();
    }
}

