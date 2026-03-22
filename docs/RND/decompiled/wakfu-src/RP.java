/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class RP<C extends RT, R>
extends RL<C, R> {
    private static final Logger bmN = Logger.getLogger(RP.class);

    public RP(RW<C, R> rW, RU<C> rU, short s, boolean bl) {
        super(rW, rU, s, bl);
    }

    private void aj(short s) {
        int n = 0;
        short s2 = (short)this.bmB.length;
        for (short s3 = s; s3 < s2; s3 = (short)(s3 + 1)) {
            if (this.bmB[s3] == null) {
                n = (short)(n + 1);
                continue;
            }
            if (n <= 0) continue;
            this.bmB[s3 - n] = this.bmB[s3];
            this.bmC.remove(this.bmB[s3].LV());
            this.bmB[s3] = null;
            this.bmC.put(this.bmB[s3 - n].LV(), (short)(s3 - n));
        }
    }

    @Override
    public C af(short s) {
        Object c2 = super.af(s);
        if (c2 != null) {
            this.aj(s);
        }
        return c2;
    }

    @Override
    public boolean c(C c2) {
        boolean bl = super.c(c2);
        if (bl) {
            this.aj((short)0);
        }
        return bl;
    }

    @Override
    public C dL(long l) {
        Object c2 = super.dL(l);
        if (c2 != null) {
            this.aj((short)0);
        }
        return c2;
    }

    @Override
    public int pa(int n) {
        int n2 = super.pa(n);
        this.aj((short)0);
        return n2;
    }

    @Override
    public boolean b(long l, short s) {
        boolean bl = super.b(l, s);
        this.aj((short)0);
        return bl;
    }

    @Override
    @Deprecated
    public boolean c(C c2, short s) {
        boolean bl = super.c(c2, s);
        this.aj((short)0);
        return bl;
    }

    @Override
    @Deprecated
    public boolean d(long l, short s) {
        boolean bl = super.d(l, s);
        this.aj((short)0);
        return bl;
    }

    public boolean d(C c2, short s) {
        if (c2 == null) {
            bmN.info((Object)"Impossible d'ajouter un item null");
            return false;
        }
        if (s < 0 || s >= this.bmQ) {
            bmN.info((Object)("Impossible d'ajouter un item : position en dehors des limites : " + s));
            return false;
        }
        if (this.bmE != null && this.bmE.a(this, c2, s) < 0) {
            bmN.info((Object)"Position refus\u00e9e par le checker");
            return false;
        }
        if (this.isFull()) {
            throw new sa_0("Cannot add item : maximum size of inventory is reached (" + this.bfa() + ")");
        }
        if (this.bmC.containsKey(c2.LV())) {
            throw new Sz("Item with same UID is already present in inventory : " + c2.bfi());
        }
        if (this.bmB[this.bmB.length - 1] != null) {
            throw new sc_0("if the inventory is not full, then we should not have an object in the last position");
        }
        if (s >= this.bmC.size()) {
            s = (short)this.bmC.size();
        } else {
            for (int i = this.bmB.length - 1; i > s; --i) {
                this.bmB[i] = this.bmB[i - 1];
                this.bmB[i - 1] = null;
                if (this.bmB[i] == null) continue;
                this.bmC.put(this.bmB[i].LV(), (short)i);
            }
        }
        if (this.bmB[s] != null) {
            throw new SD("Cannot add item " + String.valueOf(c2) + " at position " + s + " item " + String.valueOf(this.bmB[s]) + "already present");
        }
        this.bmB[s] = c2;
        this.bmC.put(c2.LV(), s);
        this.a(Sn.a(this.bmS, c2, s));
        return true;
    }
}

