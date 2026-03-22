/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.list.array.TLongArrayList
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.procedure.TLongObjectProcedure
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.list.array.TLongArrayList;
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.procedure.TLongObjectProcedure;
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.apache.log4j.Logger;

/*
 * Renamed from afH
 */
public class afh_0
extends ZB<afk_0> {
    private static final Logger cqR = Logger.getLogger(afh_0.class);
    private static final int cqS = 18;
    private static final afh_0 cqT = new afh_0();
    protected final TLongObjectHashMap<afk_0> cqU;
    protected final TLongObjectHashMap<TLongArrayList> cqV;
    private final ArrayList<afl_0> cqW;
    private final ArrayList<afm_0> cqX;
    private final HashMap<Long, afl_0> cqY;
    private final HashMap<Long, afm_0> cqZ;
    private final TLongObjectProcedure<afk_0> cra = new afi_0(this);

    public static afh_0 bxU() {
        return cqT;
    }

    protected afh_0() {
        this.cqU = new TLongObjectHashMap();
        this.cqV = new TLongObjectHashMap();
        this.cqW = new ArrayList();
        this.cqX = new ArrayList();
        this.cqY = new HashMap();
        this.cqZ = new HashMap();
    }

    public void a(afk_0 afk_02) {
        if (!this.cqU.containsKey(afk_02.Sn())) {
            afk_02.bC(afk_02.bsr());
            this.cqU.put(afk_02.Sn(), (Object)afk_02);
            acd_1 acd_12 = afk_02.bqg();
            TLongArrayList tLongArrayList = this.bz(acd_12.getX(), acd_12.getY());
            tLongArrayList.add(afk_02.Sn());
            this.a(afk_02, acd_12.getX(), acd_12.getY(), acd_12.bdi());
            this.d(afk_02);
        } else {
            cqR.warn((Object)("Impossible d'ajouter l'\u00e9l\u00e9ment id=" + afk_02.Sn() + " en " + afk_02.bcC() + ":" + afk_02.bcD() + " car il en existe d\u00e9j\u00e0 avec cet ID."));
        }
    }

    public void b(afk_0 afk_02) {
        if (afk_02 != null) {
            this.cqU.remove(afk_02.Sn());
            long l = this.c(afk_02);
            this.a(afk_02, l);
            this.e(afk_02);
            afk_02.aZp();
        } else {
            cqR.error((Object)"Impossible de retirer un element null");
        }
    }

    private long c(afk_0 afk_02) {
        return GC.s(afk_02.bqg().getX(), afk_02.bqg().getY());
    }

    public void fQ(long l) {
        afk_0 afk_02 = (afk_0)this.cqU.get(l);
        if (afk_02 != null) {
            this.b(afk_02);
        } else {
            cqR.warn((Object)("Impossible de supprimer un element d'ID " + l + " qui n'existe pas"));
        }
    }

    public void bxV() {
        cqR.info((Object)"Supression de tout les Element du AnimatedElementSceneViewManager.");
        Object[] objectArray = new afk_0[this.cqU.size()];
        for (Object object : objectArray = (afk_0[])this.cqU.values(objectArray)) {
            this.b((afk_0)object);
        }
        if (!this.cqU.isEmpty()) {
            cqR.error((Object)("Il reste encore " + this.cqU.size() + " apr\u00e8s la supression !!!"));
        }
    }

    public boolean bx(int n, int n2) {
        return this.cqV.contains(GC.s(n, n2));
    }

    public afk_0 fR(long l) {
        return (afk_0)this.cqU.get(l);
    }

    public ArrayList<afk_0> by(int n, int n2) {
        ArrayList<afk_0> arrayList = new ArrayList<afk_0>();
        TLongArrayList tLongArrayList = (TLongArrayList)this.cqV.get(GC.s(n, n2));
        if (tLongArrayList != null) {
            for (int i = tLongArrayList.size() - 1; i >= 0; --i) {
                arrayList.add((afk_0)this.cqU.get(tLongArrayList.get(i)));
            }
            return arrayList;
        }
        return arrayList;
    }

    public int bxW() {
        return this.cqU.size();
    }

    @Override
    public void a(aaj_0 aaj_02, int n) {
        int n2 = this.cqU.size();
        Object[] objectArray = new afk_0[n2];
        this.cqU.values(objectArray);
        this.bUI.clear();
        for (int i = 0; i < n2; ++i) {
            Object object = objectArray[i];
            if (!((ZH)object).b(aaj_02, n)) continue;
            this.bUI.add(object);
        }
    }

    @Override
    public void a(aaj_0 aaj_02, float f2, float f3) {
        this.bUI.clear();
        TLongObjectIterator tLongObjectIterator = this.cqU.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            afk_0 afk_02 = (afk_0)tLongObjectIterator.value();
            if (afk_02.c(aaj_02)) {
                this.bUI.add(afk_02);
            }
            this.a(afk_02, aaj_02);
        }
    }

    public void clear() {
        long l;
        TLongObjectIterator tLongObjectIterator = this.cqU.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            Iterator<afm_0> iterator = (afk_0)tLongObjectIterator.value();
            ((ZC)((Object)iterator)).bpI();
            ((afk_0)((Object)iterator)).aZp();
        }
        this.cqU.clear();
        this.bUI.clear();
        this.cqY.clear();
        for (afl_0 object : this.cqW) {
            l = System.currentTimeMillis();
            this.b(object, l);
        }
        this.cqZ.clear();
        for (afm_0 afm_02 : this.cqX) {
            l = System.currentTimeMillis();
            this.b(afm_02, l);
        }
    }

    public void a(long l, int n, int n2) {
        afk_0 afk_02 = (afk_0)this.cqU.get(l);
        if (afk_02 != null) {
            long l2 = this.c(afk_02);
            this.a(afk_02, l2);
            TLongArrayList tLongArrayList = this.bz(n, n2);
            tLongArrayList.add(afk_02.Sn());
        }
    }

    private TLongArrayList bz(int n, int n2) {
        long l = GC.s(n, n2);
        TLongArrayList tLongArrayList = (TLongArrayList)this.cqV.get(l);
        if (tLongArrayList == null) {
            tLongArrayList = new TLongArrayList();
            this.cqV.put(l, (Object)tLongArrayList);
        }
        return tLongArrayList;
    }

    private void a(afk_0 afk_02, long l) {
        TLongArrayList tLongArrayList = (TLongArrayList)this.cqV.get(l);
        if (tLongArrayList == null) {
            cqR.error((Object)("Pas d'elements enregistr\u00e9s \u00e0 la position " + String.valueOf(afk_02.bqg()) + " l'IE " + String.valueOf(afk_02)));
            return;
        }
        aeb_2.b(tLongArrayList, afk_02.Sn());
        if (tLongArrayList.isEmpty()) {
            this.cqV.remove(l);
        }
    }

    private void d(afk_0 afk_02) {
        for (afl_0 afl_02 : this.cqY.values()) {
            afl_02.g(afk_02);
        }
    }

    private void e(afk_0 afk_02) {
        for (afm_0 afm_02 : this.cqZ.values()) {
            afm_02.h(afk_02);
        }
    }

    public void a(afl_0 afl_02, long l) {
        if (this.cqW.contains(afl_02)) {
            return;
        }
        this.cqW.add(afl_02);
        this.b(afl_02, l);
    }

    public void a(afm_0 afm_02, long l) {
        if (this.cqX.contains(afm_02)) {
            return;
        }
        this.cqX.add(afm_02);
        this.b(afm_02, l);
    }

    public void b(afl_0 afl_02, long l) {
        if (!this.cqY.containsKey(l) && !this.cqY.containsValue(afl_02)) {
            this.cqY.put(l, afl_02);
        }
    }

    public void b(afm_0 afm_02, long l) {
        if (!this.cqZ.containsKey(l) && !this.cqZ.containsValue(afm_02)) {
            this.cqZ.put(l, afm_02);
        }
    }

    public void fS(long l) {
        if (this.cqZ.containsKey(l)) {
            this.cqZ.remove(l);
        }
    }

    public void fT(long l) {
        if (this.cqY.containsKey(l)) {
            this.cqY.remove(l);
        }
    }

    public Iterator<afk_0> bxX() {
        return this.bUI.iterator();
    }

    public TLongObjectIterator<afk_0> bxY() {
        return this.cqU.iterator();
    }

    public void d(TObjectProcedure<? super afk_0> tObjectProcedure) {
        this.cqU.forEachValue(tObjectProcedure);
    }

    @Override
    public void bpi() {
        this.cqU.forEachValue((TObjectProcedure)new afj_0(this));
    }
}

