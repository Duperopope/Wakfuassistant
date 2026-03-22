/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

public class Sn
extends Sl {
    private RT boj;
    protected short bok;
    protected short bol;

    public Sn(Sj sj, Sm sm) {
        super(sj, sm);
    }

    public static Sn a(Sj sj, RT rT) {
        return Sn.a(sj, Sm.bnZ, rT, (short)0);
    }

    public static Sn a(Sj sj, RT rT, short s) {
        return Sn.a(sj, Sm.boa, rT, s);
    }

    public static Sn b(Sj sj, RT rT, short s) {
        return Sn.a(sj, Sm.bod, rT, (short)0, s);
    }

    public static Sn a(Sj sj, RT rT, short s, short s2) {
        return Sn.a(sj, Sm.bod, rT, s, s2);
    }

    public static Sn c(Sj sj, RT rT, short s) {
        return Sn.a(sj, Sm.boe, rT, s);
    }

    public static Sn d(Sj sj, RT rT, short s) {
        return Sn.a(sj, Sm.bof, rT, s);
    }

    public static Sn b(Sj sj, RT rT) {
        return Sn.a(sj, Sm.bob, rT, (short)0);
    }

    public static Sn e(Sj sj, RT rT, short s) {
        return Sn.a(sj, Sm.boc, rT, s);
    }

    public static Sl b(Sj sj) {
        return new Sk(sj, Sm.bog);
    }

    private static Sn a(Sj sj, Sm sm, RT rT, short s) {
        return Sn.a(sj, sm, rT, s, (short)-1);
    }

    private static Sn a(Sj sj, Sm sm, RT rT, short s, short s2) {
        Sn sn = new Sn(sj, sm);
        sn.boj = rT;
        sn.bok = s;
        sn.bol = s2;
        return sn;
    }

    public RT bfD() {
        return this.boj;
    }

    public short bfE() {
        return this.bok;
    }

    public short bfd() {
        return this.bol;
    }

    @Override
    @Nullable
    public String beT() {
        RT rT = this.boj;
        if (!(rT instanceof sg_0)) {
            bnW.error((Object)("Log de type " + this.getClass().getName() + " sur un InventoryItemModifiedEvent d'un item de type non-loggable : " + rT.getClass().getName()));
            return null;
        }
        String string = ((sg_0)((Object)rT)).beT();
        switch (this.bfB()) {
            case bnZ: 
            case boa: {
                return "itemAcquired=" + string;
            }
            case boe: {
                return "itemPriceChange=" + string;
            }
            case bof: {
                return "itemPackSizeChange=" + string;
            }
            case bod: {
                return "itemQuantityModified=" + string + " quantity=" + this.bol;
            }
            case bob: 
            case boc: {
                return "itemLost=" + string;
            }
        }
        bnW.error((Object)("Log de type " + this.getClass().getName() + " sur un InventoryItemModifiedEvent d'action " + String.valueOf((Object)this.bfB()) + " inconnue"));
        return null;
    }

    @Override
    public String toString() {
        return "InventoryItemModifiedEvent{m_concernedItem=" + String.valueOf(this.boj) + ", m_position=" + this.bok + ", m_quantity=" + this.bol + "} " + super.toString();
    }
}

