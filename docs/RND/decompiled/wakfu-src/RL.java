/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongShortHashMap
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  org.jetbrains.annotations.Unmodifiable
 */
import gnu.trove.map.hash.TLongShortHashMap;
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

public class RL<C extends RT, R>
extends RS<C>
implements sg_0 {
    private static final Logger bmA = Logger.getLogger(RL.class);
    protected C[] bmB;
    protected final TLongShortHashMap bmC;
    protected final RW<C, R> bmD;
    protected RU<C> bmE;
    protected final Set<Long> bmF;

    public RL(RW<C, R> rW, RU<C> rU, short s, boolean bl) {
        super(bl, s);
        this.bmB = new RT[s];
        this.bmC = new TLongShortHashMap((int)s, 0.5f, -1L, -1);
        this.bmD = rW;
        this.bmE = rU;
        this.bmF = new HashSet<Long>();
    }

    @Override
    public boolean ae(short s) {
        if (s < this.bmQ) {
            bmA.error((Object)"Can't decrease the size of an ArrayInventory");
            return false;
        }
        if (this.bmB != null && s == this.bmQ) {
            return true;
        }
        if (!super.ae(s)) {
            return false;
        }
        RT[] rTArray = new RT[s];
        System.arraycopy(this.bmB, 0, rTArray, 0, this.bmB.length);
        this.bmB = rTArray;
        this.bmC.ensureCapacity((int)s);
        return true;
    }

    public @Unmodifiable @NotNull Set<Long> beN() {
        return Collections.unmodifiableSet(this.bmF);
    }

    public void h(@NotNull Collection<Long> collection) {
        this.bmF.clear();
        this.bmF.addAll(collection);
    }

    public void e(long @NotNull [] lArray) {
        this.bmF.clear();
        for (long l : lArray) {
            this.bmF.add(l);
        }
    }

    public boolean a(@NotNull C c2) {
        return this.dI(c2.LV());
    }

    public boolean dI(long l) {
        return this.bmC.containsKey(l) && this.bmF.contains(l);
    }

    public void b(long l, boolean bl) {
        if (bl && this.bmC.containsKey(l)) {
            this.bmF.add(l);
        } else {
            this.bmF.remove(l);
        }
    }

    @Override
    public boolean b(C c2) {
        short s;
        short s2;
        if (c2 == null) {
            return false;
        }
        if (c2.bfd() <= 0) {
            bmA.error((Object)("On essaye d'ajouter un item avec une quantit\u00e9 de " + c2.bfd()), (Throwable)new Exception());
            return false;
        }
        if (this.bmC.containsKey(c2.LV())) {
            throw new Sz("Item with same UID is already present in inventory : " + c2.bfi());
        }
        if (this.bmE != null && this.bmE.a(this, c2) < 0) {
            return false;
        }
        short s3 = -1;
        short s4 = -1;
        short s5 = (short)this.bmB.length;
        for (s2 = 0; s2 < s5; s2 = (short)(s2 + 1)) {
            if (this.bmB[s2] != null && c2.n((RT)this.bmB[s2])) {
                short s6 = s = c2.bfe() > 1 ? (short)1 : 0;
                if (s3 != -1 && this.bmB[s3].bfd() < this.bmB[s2].bfd()) {
                    s = 0;
                }
                if (s != 0) {
                    s3 = s2;
                }
            }
            if (this.bmB[s2] != null || s4 != -1) continue;
            s4 = s2;
        }
        if (this.isFull() && s3 == -1) {
            throw new sa_0("Cannot add item : maximum size of inventory is reached (" + this.bfa() + ")");
        }
        if (s3 >= 0 && c2.bfd() + this.bmB[s3].bfd() > c2.bfe() && s4 == -1) {
            throw new sa_0("Cannot add item : There is a possible stack, but his maxSize will be reached, and there is no free place for the rest.  MaxSize : " + this.bfa());
        }
        s2 = 0;
        if (s3 != -1) {
            s5 = this.bmB[s3].bfe() - this.bmB[s3].bfd();
            s2 = s5 < (s = c2.bfd()) ? s5 : s;
            this.bmB[s3].al(s2);
            this.a(Sn.a(this.bmS, this.bmB[s3], s3, s2));
        }
        if (c2.bfd() - s2 > 0) {
            c2.al(-s2);
            if (c2.bfd() > 0 && s4 != -1) {
                this.bmB[s4] = c2;
                this.bmC.put(c2.LV(), s4);
                this.a(Sn.a(this.bmS, c2, s4));
            }
        }
        return true;
    }

    @Override
    public boolean b(long l, short s) {
        C c2 = this.dN(l);
        if (c2 == null) {
            return false;
        }
        if (c2.bfd() + s <= 0) {
            return this.d(c2);
        }
        c2.al(s);
        this.a(Sn.b(this.bmS, c2, s));
        return true;
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
            bmA.error((Object)"Impossible d'ajouter un item null");
            return false;
        }
        if (s < 0 || s >= this.bmQ) {
            bmA.error((Object)("Impossible d'ajouter un item : position en dehors des limites : " + s), (Throwable)new Exception());
            return false;
        }
        if (this.bmE != null && this.bmE.a((RS<C>)this, c2, (C)s) < 0) {
            bmA.error((Object)("Position refus\u00e9e par le checker, item=" + String.valueOf(c2)), (Throwable)new Exception("for stacktrace"));
            return false;
        }
        if (this.bmC.containsKey(c2.LV())) {
            throw new Sz("Item with same UID is already present in inventory : " + c2.bfi());
        }
        C c3 = this.bmB[s];
        if (c3 == null) {
            this.bmB[s] = c2;
            this.bmC.put(c2.LV(), s);
            this.a(Sn.a(this.bmS, c2, s));
            return true;
        }
        if (!c2.n((RT)c3)) {
            throw new SD("Cannot add item " + String.valueOf(c2) + " at position " + s + " item " + String.valueOf(this.bmB[s]) + "already present");
        }
        if (c3.bfe() - c3.bfd() < c2.bfd()) {
            throw new SD("Cannot add item " + String.valueOf(c2) + " at position " + s + " item " + String.valueOf(this.bmB[s]) + "already present");
        }
        return this.b(c3.LV(), c2.bfd());
    }

    @Override
    public boolean c(C c2) {
        if (c2 == null) {
            return false;
        }
        if (this.bmC.contains(c2.LV())) {
            short s = this.bmC.get(c2.LV());
            if (this.bmB[s] == null || this.bmB[s].LV() != c2.LV()) {
                bmA.error((Object)("Probl\u00e8me de logique : table d'index et tableau incoh\u00e9rents. Item attendu \u00e0 la position " + s + " : " + String.valueOf(c2) + " item trouv\u00e9 : " + String.valueOf(this.bmB[s])));
                return false;
            }
            if (!this.l(c2)) {
                return false;
            }
            this.a(Sn.e(this.bmS, c2, s));
            return true;
        }
        return false;
    }

    @Override
    public boolean d(C c2) {
        if (c2 == null) {
            return false;
        }
        if (this.bmC.contains(c2.LV())) {
            short s = this.bmC.get(c2.LV());
            if (this.bmB[s] == null || this.bmB[s].LV() != c2.LV()) {
                bmA.error((Object)("Probl\u00e8me de logique : table d'index et tableau incoh\u00e9rents. Item attendu \u00e0 la position " + s + " : " + String.valueOf(c2) + " item trouv\u00e9 : " + String.valueOf(this.bmB[s])));
                return false;
            }
            if (!this.l(c2)) {
                return false;
            }
            this.a(Sn.e(this.bmS, c2, s));
            c2.aZp();
            return true;
        }
        return false;
    }

    @Nullable
    public C af(short s) {
        C c2 = this.bmB[s];
        if (c2 == null) {
            return null;
        }
        if (!this.l(c2)) {
            return null;
        }
        this.a(Sn.e(this.bmS, c2, s));
        return c2;
    }

    public boolean ag(short s) {
        if (s < 0 || s >= this.bmQ) {
            return false;
        }
        C c2 = this.bmB[s];
        if (c2 == null) {
            return false;
        }
        if (!this.l(c2)) {
            return false;
        }
        this.a(Sn.e(this.bmS, c2, s));
        c2.aZp();
        return true;
    }

    public short dK(long l) {
        if (!this.bmC.containsKey(l)) {
            return -1;
        }
        return this.bmC.get(l);
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
        if (this.bmC.contains(l)) {
            short s = this.bmC.remove(l);
            if (this.bmB[s] == null || this.bmB[s].LV() != l) {
                bmA.error((Object)("Probl\u00e8me de logique : table d'index et tableau incoh\u00e9rents. Item attendu \u00e0 la position " + s + " : id " + l + ". item trouv\u00e9 : " + String.valueOf(this.bmB[s]) + (String)(this.bmB[s] == null ? "" : "(id : " + this.bmB[s].LV() + ")")));
                this.bmB[s] = null;
                return null;
            }
            C c2 = this.bmB[s];
            if (this.bmE != null && this.bmE.b(this, c2) < 0) {
                return null;
            }
            this.bmF.remove(l);
            this.bmB[s] = null;
            this.a(Sn.e(this.bmS, c2, s));
            return c2;
        }
        return null;
    }

    @Override
    public void a(RX<C> rX) {
        for (C c2 : this.bmB) {
            if (c2 == null || rX != null && !rX.isValid(c2)) continue;
            this.d(c2);
        }
    }

    @Override
    public int pa(int n) {
        int n2 = 0;
        for (C c2 : this.bmB) {
            if (c2 == null || c2.avr() != n) continue;
            n2 += c2.bfd();
            this.d(c2);
        }
        return n2;
    }

    @Override
    public int a(int n, int n2, boolean bl) {
        int n3 = 0;
        for (C c2 : this.bmB) {
            if (c2 == null || c2.avr() != n || !bl && this.a(c2)) continue;
            short s = c2.bfd();
            if (s <= n2 - n3) {
                if (this.d(c2)) {
                    n3 += s;
                }
            } else {
                this.b(c2.LV(), (short)(n3 - n2));
                return n2;
            }
            if (n3 < n2) continue;
            return n3;
        }
        return n3;
    }

    @Override
    @NotNull
    public Iterator<C> iterator() {
        return this.bk(false);
    }

    public Iterator<C> bk(boolean bl) {
        return new azh_1<C>(this.bmB, bl);
    }

    public C[] a(C ... CArray) {
        System.arraycopy(this.bmB, 0, CArray, 0, this.bmB.length);
        return CArray;
    }

    @Override
    public boolean f(C c2) {
        return c2 != null && this.bmC.containsKey(c2.LV());
    }

    @Override
    public boolean dM(long l) {
        return this.bmC.containsKey(l);
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
        if (!this.bmC.contains(l)) {
            return null;
        }
        short s = this.bmC.get(l);
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
    @Nullable
    public C a(int n, RX<C> rX) {
        for (C c2 : this.bmB) {
            if (c2 == null || c2.avr() != n || !rX.isValid(c2)) continue;
            return c2;
        }
        return null;
    }

    public short g(C c2) {
        short s = 0;
        for (C c3 : this.bmB) {
            if (c2.n((RT)c3) && c3.bfd() + c2.bfd() <= c3.bfe()) {
                return s;
            }
            s = (short)(s + 1);
        }
        return -1;
    }

    public short h(C c2) {
        short s = 0;
        for (C c3 : this.bmB) {
            if (c3 == null || c2.n((RT)c3) && c3.bfd() + c2.bfd() <= c3.bfe()) {
                return s;
            }
            s = (short)(s + 1);
        }
        return -1;
    }

    public short beO() {
        short s = 0;
        for (C c2 : this.bmB) {
            if (c2 == null) {
                return s;
            }
            s = (short)(s + 1);
        }
        return -1;
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
    public @Unmodifiable List<C> b(Predicate<C> predicate) {
        return Arrays.stream(this.bmB).filter(predicate).toList();
    }

    @Override
    public int aVo() {
        return this.bmC.size();
    }

    @Override
    public int beP() {
        int n = this.aVo();
        if (n == 0) {
            return 0;
        }
        for (int i = this.bmB.length - 1; i >= 0; --i) {
            this.bmB[i] = null;
        }
        this.bmC.clear();
        this.a(Sn.b(this.bmS));
        return n;
    }

    @Override
    public int beQ() {
        int n = this.aVo();
        if (n == 0) {
            return 0;
        }
        for (int i = this.bmB.length - 1; i >= 0; --i) {
            if (this.bmB[i] != null) {
                this.bmB[i].aZp();
            }
            this.bmB[i] = null;
        }
        this.bmC.clear();
        this.a(Sn.b(this.bmS));
        return n;
    }

    @Override
    public RU<C> beR() {
        return this.bmE;
    }

    @Override
    public void a(@NotNull RU<C> rU) {
        this.bmE = rU;
    }

    public boolean i(C c2) {
        if (c2 == null) {
            return false;
        }
        if (c2.bfd() <= 0) {
            bmA.error((Object)("On essaye de simuler l'ajout d'un item avec une quantit\u00e9 de " + c2.bfd()), (Throwable)new Exception());
            return false;
        }
        if (this.dN(c2.LV()) != null) {
            bmA.error((Object)("Simulation : Item with same UID is already present in inventory : " + c2.bfi()), (Throwable)new Sz());
            return false;
        }
        if (this.bmE != null && this.bmE.a(this, c2) < 0) {
            return false;
        }
        if (!this.isFull()) {
            return true;
        }
        if (!this.bmR) {
            return false;
        }
        short s = c2.bfd();
        int n = this.bmB.length;
        for (int i = 0; i < n && s > 0; ++i) {
            C c3 = this.bmB[i];
            if (!c2.n((RT)c3)) continue;
            int n2 = c3.bfe() - c3.bfd();
            s = (short)(s - n2);
        }
        return s <= 0;
    }

    public boolean b(C c2, short s) {
        if (c2 == null) {
            return false;
        }
        if (c2.bfd() <= 0) {
            bmA.error((Object)("On essaye de simuler l'ajout d'un item avec une quantit\u00e9 de " + c2.bfd()), (Throwable)new Exception());
            return false;
        }
        if (this.dN(c2.LV()) != null) {
            bmA.error((Object)("Simulation : Item with same UID is already present in inventory : " + c2.bfi()), (Throwable)new Sz());
            return false;
        }
        if (s < 0 || s > this.bmQ - 1) {
            return false;
        }
        if (this.bmE != null && this.bmE.a((RS<C>)this, c2, (C)s) < 0) {
            return false;
        }
        C c3 = this.bmB[s];
        if (c3 == null) {
            return true;
        }
        boolean bl = c3.bfe() - c3.bfd() >= c2.bfd();
        return this.bmR && c2.n((RT)c3) && bl;
    }

    public boolean j(C c2) {
        return c2 != null && !this.aJG() && this.dM(c2.LV()) && this.f(c2) && (this.bmE == null || this.bmE.b(this, c2) >= 0);
    }

    public boolean c(long l, short s) {
        C c2 = this.dN(l);
        if (c2 == null) {
            return false;
        }
        if (s > c2.bfd()) {
            return false;
        }
        return this.bmE == null || this.bmE.b(this, c2) >= 0;
    }

    @Deprecated
    public boolean k(C c2) {
        int n;
        short s;
        if (c2 == null) {
            return false;
        }
        if (c2.bfd() <= 0) {
            bmA.error((Object)("On essaye de simuler l'ajout d'un item avec une quantit\u00e9 de " + c2.bfd()), (Throwable)new Exception());
            return false;
        }
        if (this.bmC.containsKey(c2.LV())) {
            throw new Sz("Simulation: Item with same UID is already present in inventory : " + c2.bfi());
        }
        if (this.bmE != null && this.bmE.a(this, c2) < 0) {
            return false;
        }
        short s2 = -1;
        short s3 = -1;
        short s4 = (short)this.bmB.length;
        for (s = 0; s < s4; s = (short)((short)(s + 1))) {
            if (this.bmB[s] != null && this.bmB[s] != null && c2.n((RT)this.bmB[s])) {
                n = 1;
                if (s2 != -1 && this.bmB[s2].bfd() < this.bmB[s].bfd()) {
                    n = 0;
                }
                if (n != 0) {
                    s2 = s;
                }
            }
            if (this.bmB[s] != null || s3 != -1) continue;
            s3 = s;
        }
        if (this.isFull() && s2 == -1) {
            return false;
        }
        if (s2 >= 0 && c2.bfd() + this.bmB[s2].bfd() > c2.bfe() && s3 == -1) {
            return false;
        }
        s = 0;
        s4 = -1;
        if (s2 != -1) {
            short s5;
            n = this.bmB[s2].bfe() - this.bmB[s2].bfd();
            s = (short)(n < (s5 = c2.bfd()) ? n : (int)s5);
            s4 = this.bmB[s2].bfd();
            this.bmB[s2].al(s);
        }
        if (c2.bfd() - s > 0) {
            if (s2 != -1) {
                this.bmB[s2].al(-s);
            }
            if (c2.bfd() > 0 && s3 != -1) {
                this.bmB[s3] = c2;
                this.bmC.put(c2.LV(), s3);
                this.bmB[s3] = null;
                this.bmC.remove(c2.LV());
                this.bmF.remove(c2.LV());
                return true;
            }
        } else if (s4 != -1) {
            this.bmB[s2].ak(s4);
            return true;
        }
        return false;
    }

    @Deprecated
    public boolean c(C c2, short s) {
        Object object = this.dN(c2.LV());
        if (object == null) {
            for (RT rT : this.pd(c2.avr())) {
                if (rT.bfd() <= 1) continue;
                object = rT;
            }
        }
        if (object == null) {
            return false;
        }
        if (object.bfd() + s <= 0) {
            this.l(object);
        } else {
            object.al(s);
        }
        return true;
    }

    @Deprecated
    public boolean d(long l, short s) {
        C c2 = this.dN(l);
        if (c2 == null) {
            return false;
        }
        if (c2.bfd() + s <= 0) {
            this.l(c2);
        } else {
            c2.al(s);
        }
        return true;
    }

    public RW<C, R> beS() {
        return this.bmD;
    }

    private boolean l(@NotNull C c2) {
        if (this.bmE != null && this.bmE.b(this, c2) < 0) {
            return false;
        }
        short s = this.bmC.remove(c2.LV());
        if (s == this.bmC.getNoEntryValue() && (this.bmB[s] == null || this.bmB[s].LV() != c2.LV())) {
            return false;
        }
        this.bmF.remove(c2.LV());
        this.bmB[s] = null;
        return true;
    }

    public boolean a(TObjectProcedure<C> tObjectProcedure) {
        for (C c2 : this.bmB) {
            if (c2 == null || tObjectProcedure.execute(c2)) continue;
            return false;
        }
        return true;
    }

    public void e(Consumer<Short> consumer) {
        for (short s = 0; s < this.bmB.length; s = (short)(s + 1)) {
            if (this.bmB[s] != null) continue;
            consumer.accept(s);
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("[");
        stringBuilder.append(this.getClass().getSimpleName());
        int n = this.bmB.length;
        for (int i = 0; i < n; ++i) {
            C c2 = this.bmB[i];
            stringBuilder.append(' ').append(i).append(": ");
            if (c2 != null) {
                stringBuilder.append(c2);
                continue;
            }
            stringBuilder.append("{}");
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    @Override
    public String beT() {
        return "arrayInventory";
    }

    public short m(C c2) {
        if (c2 == null) {
            return -1;
        }
        int n = -1;
        short s = (short)this.bmB.length;
        for (short s2 = 0; s2 < s; s2 = (short)(s2 + 1)) {
            boolean bl;
            if (this.bmB[s2] == null || !c2.n((RT)this.bmB[s2])) continue;
            boolean bl2 = bl = c2.bfe() > 1;
            if (n != -1 && this.bmB[n].bfd() < this.bmB[s2].bfd()) {
                bl = false;
            }
            if (!bl) continue;
            n = s2;
        }
        return n == -1 ? (short)-1 : this.bmB[n].bfd();
    }
}

