/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.stream.Collectors;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class Sg<C extends RT, R>
extends RS<C> {
    private static final Logger bnE = Logger.getLogger(Sg.class);
    protected final HashMap<Long, C> bnF;
    protected final RW<C, R> bnG;
    protected RU<C> bmE;
    protected final boolean bnH;
    protected final boolean bnI;

    public Sg(short s, RW<C, R> rW, RU<C> rU, boolean bl, boolean bl2, boolean bl3) {
        super(bl2, s);
        this.bnF = bl ? new LinkedHashMap() : new HashMap();
        this.ae(s);
        this.bnG = rW;
        this.bmE = rU;
        this.bnH = bl;
        this.bnI = bl3;
    }

    public RW<C, R> beS() {
        return this.bnG;
    }

    private String bfz() {
        if (this.bnF == null) {
            return "NULL_CONTENT";
        }
        return this.bnF.values().stream().filter(Objects::nonNull).map(rT -> {
            try {
                return String.valueOf(rT.avr());
            }
            catch (Exception exception) {
                return "NULL_SPELL";
            }
        }).collect(Collectors.joining(","));
    }

    @Override
    public boolean b(C c2) {
        if (c2 == null) {
            return false;
        }
        if (c2.bfd() <= 0) {
            bnE.warn((Object)("Impossile d'ajouter un item avec un quantit\u00e9e de " + c2.bfd()));
            return false;
        }
        if (this.bnF == null) {
            bnE.error((Object)("Adding a " + c2.getClass().getSimpleName() + " in a " + this.getClass().getSimpleName() + " but content is null"));
            return false;
        }
        if (!this.bmR) {
            if (this.isFull()) {
                throw new sa_0("Cannot add item : maximum size of inventory is reached (" + this.bfa() + "), inventory content is " + this.bfz());
            }
            if (this.bnF.containsKey(c2.LV())) {
                throw new Sz("Item with uniqueID " + c2.LV() + " is already present in the inventory (content : " + this.bfz() + ")", (RT)c2, (RT)this.bnF.get(c2.LV()));
            }
            if (this.bmE != null && this.bmE.a(this, c2) < 0) {
                return false;
            }
            this.bnF.put(c2.LV(), c2);
            this.a(Sn.a(this.bmS, c2));
            return true;
        }
        int n = c2.bfd();
        for (RT rT : this.bnF.values()) {
            int n2;
            if (!c2.n(rT) || (n2 = rT.bfe() - rT.bfd()) <= 0) continue;
            short s = (short)(n < n2 ? n : n2);
            n = (short)(n - s);
            rT.al(s);
            this.a(Sn.b(this.bmS, rT, s));
            if (n > 0) continue;
            break;
        }
        Object object = c2;
        while (n > 0) {
            int n3 = n < c2.bfe() ? n : c2.bfe();
            object.ak((short)n3);
            n = (short)(n - n3);
            if (this.bmE != null && this.bmE.a(this, object) < 0) {
                return false;
            }
            this.bnF.put(object.LV(), object);
            this.a(Sn.a(this.bmS, object));
            if (n <= 0) continue;
            object = object.bff();
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

    @Override
    public boolean c(C c2) {
        if (c2 == null) {
            return false;
        }
        if (this.bmE != null && this.bmE.b(this, c2) < 0) {
            return false;
        }
        if (this.bnF.remove(c2.LV()) == null) {
            return false;
        }
        this.a(Sn.b(this.bmS, c2));
        return true;
    }

    @Override
    public boolean d(C c2) {
        if (c2 == null) {
            return false;
        }
        if (this.bmE != null && this.bmE.b(this, c2) < 0) {
            return false;
        }
        if (this.bnF.remove(c2.LV()) == null) {
            return false;
        }
        this.a(Sn.b(this.bmS, c2));
        c2.aZp();
        return true;
    }

    @Override
    @Nullable
    public C dL(long l) {
        RT rT = (RT)this.bnF.get(l);
        if (rT == null) {
            return null;
        }
        if (this.bmE != null && this.bmE.b(this, rT) < 0) {
            return null;
        }
        this.bnF.remove(l);
        this.a(Sn.b(this.bmS, rT));
        return (C)rT;
    }

    @Override
    @NotNull
    public Iterator<C> iterator() {
        return this.bnF.values().iterator();
    }

    @Override
    public boolean f(C c2) {
        return c2 != null && this.bnF.containsKey(c2.LV());
    }

    @Override
    public boolean dM(long l) {
        return this.bnF.containsKey(l);
    }

    @Override
    public boolean pb(int n) {
        for (RT rT : this.bnF.values()) {
            if (rT.avr() != n) continue;
            return true;
        }
        return false;
    }

    @Override
    @Nullable
    public C dN(long l) {
        return (C)((RT)this.bnF.get(l));
    }

    @Override
    @Nullable
    public C pc(int n) {
        for (RT rT : this.bnF.values()) {
            if (rT.avr() != n) continue;
            return (C)rT;
        }
        return null;
    }

    @Override
    public C a(int n, RX<C> rX) {
        for (RT rT : this.bnF.values()) {
            if (rT.avr() != n || !rX.isValid(rT)) continue;
            return (C)rT;
        }
        return null;
    }

    @Override
    public ArrayList<C> pd(int n) {
        ArrayList<RT> arrayList = new ArrayList<RT>();
        for (RT rT : this.bnF.values()) {
            if (rT.avr() != n && n != -1) continue;
            arrayList.add(rT);
        }
        return arrayList;
    }

    @Override
    public ArrayList<C> b(int n, RX<C> rX) {
        ArrayList<RT> arrayList = new ArrayList<RT>();
        for (RT rT : this.bnF.values()) {
            if (rT.avr() != n && n != -1 || !rX.isValid(rT)) continue;
            arrayList.add(rT);
        }
        return arrayList;
    }

    @Override
    public ArrayList<C> b(RX<C> rX) {
        ArrayList<RT> arrayList = new ArrayList<RT>();
        for (RT rT : this.bnF.values()) {
            if (rT == null || !rX.isValid(rT)) continue;
            arrayList.add(rT);
        }
        return arrayList;
    }

    @Override
    public int aVo() {
        return this.bnF.size();
    }

    @Override
    public int beP() {
        int n = this.aVo();
        this.bnF.clear();
        return n;
    }

    @Override
    public int beQ() {
        int n = this.aVo();
        for (RT rT : this.bnF.values()) {
            rT.aZp();
        }
        this.bnF.clear();
        return n;
    }

    @Override
    public RU<C> beR() {
        return this.bmE;
    }

    @Override
    public void a(RU<C> rU) {
        this.bmE = rU;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("StackInventory = ");
        for (RT rT : this.bnF.values()) {
            stringBuilder.append(rT.LV()).append(' ');
        }
        return stringBuilder.toString();
    }
}

