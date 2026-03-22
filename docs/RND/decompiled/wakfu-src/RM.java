/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TShortArrayList
 *  gnu.trove.map.hash.TLongShortHashMap
 *  gnu.trove.procedure.TLongShortProcedure
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.list.array.TShortArrayList;
import gnu.trove.map.hash.TLongShortHashMap;
import gnu.trove.procedure.TLongShortProcedure;
import gnu.trove.procedure.TObjectProcedure;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.function.BiConsumer;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class RM<C extends RT, R>
extends RS<C> {
    private static final Logger bmG = Logger.getLogger(RM.class);
    private RU<C> bmH;
    protected final Class<C> bmI;
    protected C[] bmB;
    protected final TLongShortHashMap bmJ = new TLongShortHashMap();
    protected final RW<C, R> bmK;
    protected final boolean bmL;

    @Override
    public RU<C> beR() {
        return this.bmH;
    }

    @Override
    public void a(RU<C> rU) {
        this.bmH = rU;
    }

    public RM(Class<C> clazz, RW<C, R> rW, RU<C> rU, short s, boolean bl, boolean bl2) {
        super(bl, s);
        this.bmI = clazz;
        this.bmH = rU;
        if (!bl && bl2) {
            throw new IllegalArgumentException("Impossible de cr\u00e9er un inventaire \u00e0 la fois non stackable (donc sans quantit\u00e9) et pour lequel on veut s\u00e9rialiser une quantit\u00e9.");
        }
        this.ae(s);
        this.bmK = rW;
        this.bmL = bl2;
    }

    @Override
    public final boolean ae(short s) {
        if (s < this.bfa()) {
            bmG.error((Object)"Can't decrease the size of an ArrayInventory");
            return false;
        }
        if (this.bmB != null && s == this.bfa()) {
            return true;
        }
        super.ae(s);
        if (this.bmB == null) {
            this.bmB = (RT[])Array.newInstance(this.bmI, (int)s);
        } else {
            RT[] rTArray = (RT[])Array.newInstance(this.bmI, (int)s);
            System.arraycopy(this.bmB, 0, rTArray, 0, this.bmB.length);
            this.bmB = rTArray;
        }
        this.bmJ.ensureCapacity((int)s);
        return true;
    }

    public boolean i(C c2) {
        return this.bmH.a(this, c2) >= 0;
    }

    public boolean b(C c2, short s) {
        return this.bmH.a((RS<C>)this, c2, (C)s) >= 0;
    }

    public boolean dO(long l) {
        return this.bmH.b(this, this.dN(l)) >= 0;
    }

    public boolean j(C c2) {
        return this.bmH.b(this, c2) >= 0;
    }

    public boolean a(C c2, C c3) {
        return this.bmH.a(this, c2, c3) >= 0;
    }

    @Override
    public boolean b(C c2) {
        if (c2 == null) {
            return false;
        }
        if (c2.bfd() <= 0) {
            bmG.error((Object)("On essaye d'ajouter un item avec une quantit\u00e9 de " + c2.bfd()), (Throwable)new Exception());
            return false;
        }
        if (this.isFull()) {
            throw new sa_0("Cannot add item : maximum size of inventory is reached (" + this.bfa() + ")");
        }
        if (this.bmJ.containsKey(c2.LV())) {
            throw new Sz("Item with same UID is already present in inventory : " + c2.bfi());
        }
        short s = -1;
        short s2 = (short)this.bmB.length;
        for (short s3 = 0; s3 < s2; s3 = (short)(s3 + 1)) {
            if (this.bmB[s3] != null) continue;
            s = s3;
            break;
        }
        if (s == -1) {
            throw new sa_0("Cannot add item : no left space for it (strange, should have said Inventory is full before. Size : " + this.aVo() + " MaxSize : " + this.bfa());
        }
        this.bmB[s] = c2;
        this.bmJ.put(c2.LV(), s);
        this.a(Sn.a(this.bmS, c2, s));
        return true;
    }

    @Override
    public boolean b(long l, short s) {
        C c2;
        if (!this.bmR) {
            bmG.error((Object)"Cannot update quantity of a not stackable inventory");
            return false;
        }
        short s2 = this.bmJ.get(l);
        if (s2 != -1 && (c2 = this.bmB[s2]) != null) {
            if (c2.bfd() + s <= 0) {
                return this.d(c2);
            }
            if (c2.bfd() + s > c2.bfe()) {
                return false;
            }
            c2.al(s);
            this.a(Sn.b(this.bmS, c2, s));
            return true;
        }
        bmG.error((Object)"Item Not found");
        return false;
    }

    @Override
    public short dJ(long l) {
        C c2 = this.dN(l);
        if (c2 == null) {
            return 0;
        }
        return c2.bfd();
    }

    public boolean a(C c2, short s) {
        if (c2 == null) {
            bmG.info((Object)"Impossible d'ajouter un item null");
            return false;
        }
        if (s < 0 || s >= this.bmQ) {
            bmG.info((Object)("Impossible d'ajouter un item : position en dehors des limites : " + s));
            return false;
        }
        if (this.bmB[s] != null) {
            if (c2.n((RT)this.bmB[s]) && c2.bfd() + this.bmB[s].bfd() < c2.bfe()) {
                this.b(this.bmB[s].LV(), c2.bfd());
                return true;
            }
            throw new SD("Cannot add item " + String.valueOf(c2) + " at position " + s + " item " + String.valueOf(this.bmB[s]) + "already present");
        }
        if (this.bmJ.containsKey(c2.LV())) {
            throw new Sz("Item with same UID is already present in inventory : " + c2.bfi());
        }
        this.bmB[s] = c2;
        this.bmJ.put(c2.LV(), s);
        this.a(Sn.a(this.bmS, c2, s));
        return true;
    }

    @Override
    public boolean c(C c2) {
        if (c2 == null) {
            return false;
        }
        if (this.bmJ.contains(c2.LV())) {
            short s = this.bmJ.get(c2.LV());
            if (this.bmB[s] != c2) {
                bmG.error((Object)("Probl\u00e8me de logique : table d'index et tableau incoh\u00e9rents. Item attendu \u00e0 la position " + s + " : " + String.valueOf(c2) + " item trouv\u00e9 : " + String.valueOf(this.bmB[s])));
                return false;
            }
            this.bmB[s] = null;
            this.bmJ.remove(c2.LV());
            this.a(Sn.e(this.bmS, c2, s));
            return true;
        }
        return false;
    }

    @Override
    public void a(RX<C> rX) {
        for (C c2 : this.bmB) {
            if (c2 == null || rX != null && !rX.isValid(c2)) continue;
            this.d(c2);
        }
    }

    @Override
    public boolean d(C c2) {
        boolean bl = this.c(c2);
        c2.aZp();
        return bl;
    }

    public C af(short s) {
        if (s < 0 || s >= this.bmQ) {
            return null;
        }
        C c2 = this.bmB[s];
        if (c2 == null) {
            return null;
        }
        this.bmB[s] = null;
        this.bmJ.remove(c2.LV());
        this.a(Sn.e(this.bmS, c2, s));
        return c2;
    }

    public boolean ag(short s) {
        C c2 = this.af(s);
        c2.aZp();
        return true;
    }

    public short dK(long l) {
        if (!this.bmJ.containsKey(l)) {
            return -1;
        }
        return this.bmJ.get(l);
    }

    @Deprecated
    public short e(C c2) {
        if (c2 == null) {
            return -1;
        }
        return this.dK(c2.LV());
    }

    @Override
    @Nullable
    public C dL(long l) {
        if (this.bmJ.contains(l)) {
            short s = this.bmJ.get(l);
            return this.af(s);
        }
        return null;
    }

    public TShortArrayList pe(int n) {
        TShortArrayList tShortArrayList = null;
        for (C c2 : this.bmB) {
            short s;
            if (c2 == null || c2.avr() != n || !this.ag(s = this.dK(c2.LV()))) continue;
            if (tShortArrayList == null) {
                tShortArrayList = new TShortArrayList();
            }
            tShortArrayList.add(s);
        }
        return tShortArrayList;
    }

    public TShortArrayList ae(int n, int n2) {
        TShortArrayList tShortArrayList = null;
        for (C c2 : this.bmB) {
            short s;
            if (c2 == null || c2.avr() != n || !this.ag(s = this.dK(c2.LV()))) continue;
            if (tShortArrayList == null) {
                tShortArrayList = new TShortArrayList();
            }
            tShortArrayList.add(s);
            if (n2 == 1) {
                return tShortArrayList;
            }
            --n2;
        }
        return tShortArrayList;
    }

    @Override
    public int pa(int n) {
        return 0;
    }

    @Override
    public int a(int n, int n2, boolean bl) {
        return 0;
    }

    @Override
    @NotNull
    public Iterator<C> iterator() {
        return new azh_1<C>(this.bmB, false);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("[ ");
        stringBuilder.append(this.getClass().getSimpleName()).append(' ');
        if (this.bmB == null) {
            stringBuilder.append("contents=null");
        } else {
            int n = this.bmB.length;
            for (int i = 0; i < n; ++i) {
                stringBuilder.append(i).append(':');
                C c2 = this.bmB[i];
                if (c2 == null) {
                    stringBuilder.append("<null>");
                } else {
                    stringBuilder.append(c2.getClass().getSimpleName()).append(",ref=").append(c2.avr()).append(",unique=").append(c2.LV());
                }
                stringBuilder.append(' ');
            }
        }
        stringBuilder.append(" / idxByUid={ ");
        if (this.bmJ != null && !this.bmJ.isEmpty()) {
            this.bmJ.forEachEntry((TLongShortProcedure)new RN(this, stringBuilder));
        }
        stringBuilder.append("} ]");
        return stringBuilder.toString();
    }

    @Override
    public boolean f(C c2) {
        return c2 != null && this.bmJ.containsKey(c2.LV());
    }

    @Override
    public boolean dM(long l) {
        return this.bmJ.containsKey(l);
    }

    @Override
    public boolean pb(int n) {
        for (C c2 : this.bmB) {
            if (c2 == null || c2.avr() != n) continue;
            return true;
        }
        return false;
    }

    public boolean ah(short s) {
        return s >= 0 && s < this.bmQ && this.bmB[s] == null;
    }

    @Nullable
    public C ai(short s) {
        if (s < 0 || s >= this.bmQ) {
            return null;
        }
        return this.bmB[s];
    }

    @Override
    @Nullable
    public C dN(long l) {
        if (!this.bmJ.contains(l)) {
            return null;
        }
        short s = this.bmJ.get(l);
        return this.bmB[s];
    }

    @Override
    @Nullable
    public C pc(int n) {
        for (C c2 : this.bmB) {
            if (c2 == null || c2.avr() != n) continue;
            return c2;
        }
        return null;
    }

    @Override
    public C a(int n, RX<C> rX) {
        for (C c2 : this.bmB) {
            if (c2 == null || c2.avr() != n || !rX.isValid(c2)) continue;
            return c2;
        }
        return null;
    }

    @Override
    public ArrayList<C> pd(int n) {
        ArrayList<C> arrayList = new ArrayList<C>();
        for (C c2 : this.bmB) {
            if (c2 == null || c2.avr() != n) continue;
            arrayList.add(c2);
        }
        return arrayList;
    }

    @Override
    public ArrayList<C> b(int n, RX<C> rX) {
        ArrayList<C> arrayList = new ArrayList<C>();
        for (C c2 : this.bmB) {
            if (c2 == null || c2.avr() != n || !rX.isValid(c2)) continue;
            arrayList.add(c2);
        }
        return arrayList;
    }

    @Override
    public ArrayList<C> b(RX<C> rX) {
        ArrayList<C> arrayList = new ArrayList<C>();
        for (C c2 : this.bmB) {
            if (c2 == null || !rX.isValid(c2)) continue;
            arrayList.add(c2);
        }
        return arrayList;
    }

    @Override
    public int aVo() {
        return this.bmJ.size();
    }

    @Override
    public int beP() {
        int n = this.aVo();
        for (int i = this.bmB.length - 1; i >= 0; --i) {
            this.bmB[i] = null;
        }
        this.bmJ.clear();
        return n;
    }

    @Override
    public int beQ() {
        int n = this.aVo();
        for (int i = this.bmB.length - 1; i >= 0; --i) {
            if (this.bmB[i] != null) {
                this.bmB[i].aZp();
            }
            this.bmB[i] = null;
        }
        this.bmJ.clear();
        return n;
    }

    public boolean a(TObjectProcedure<C> tObjectProcedure) {
        for (C c2 : this.bmB) {
            if (c2 == null || tObjectProcedure.execute(c2)) continue;
            return false;
        }
        return true;
    }

    public void c(BiConsumer<C, Integer> biConsumer) {
        for (int i = 0; i < this.bmB.length; ++i) {
            if (this.bmB[i] == null) continue;
            biConsumer.accept(this.bmB[i], i);
        }
    }

    public Map<Integer, Long> beU() {
        HashMap<Integer, Long> hashMap = new HashMap<Integer, Long>(this.bmB.length);
        for (int i = 0; i < this.bmB.length; ++i) {
            if (this.bmB[i] == null || !this.bmB[i].bfh() || this.bmB[i].LV() <= 0L) continue;
            hashMap.put(i, this.bmB[i].LV());
        }
        return hashMap;
    }
}

