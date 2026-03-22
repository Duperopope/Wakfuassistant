/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

public abstract class eJB
extends eJy<eJA, eJC> {
    protected final RP<ffV, uy_1> qAb;

    protected eJB(fdl fdl2) {
        super(new eJA(fdl2));
        this.qAb = new RP<ffV, uy_1>(eJD.qAc, (RU)((Object)this.qzY), fdl2.clh(), true);
        this.qAb.a(Sj.bnM);
    }

    public void ca(ffV ffV2) {
        if (this.qzZ != null) {
            ((eJC)this.qzZ).ah(ffV2);
        }
    }

    public boolean bp(ffV ffV2) {
        try {
            if (!this.bq(ffV2)) {
                return false;
            }
            this.qAb.b(ffV2);
        }
        catch (sb_0 sb_02) {
            qzX.error((Object)"Impossible d'ajouter un item \u00e0 l'inventaire alors qu'on \u00e0 pourtant test\u00e9 le canAdd", (Throwable)sb_02);
            return false;
        }
        this.ca(ffV2);
        return true;
    }

    public boolean b(ffV ffV2, byte by) {
        return false;
    }

    public boolean k(long l, short s) {
        if (!this.c(l, s)) {
            return false;
        }
        this.qAb.b(l, -s);
        return true;
    }

    public boolean bs(ffV ffV2) {
        if (!this.br(ffV2)) {
            return false;
        }
        this.qAb.c(ffV2);
        return true;
    }

    @Nullable
    public ffV lR(long l) {
        return (ffV)this.qAb.dN(l);
    }

    @Nullable
    public ffV cv(byte by) {
        return (ffV)this.qAb.ai(by);
    }

    public byte lS(long l) {
        return (byte)this.qAb.dK(l);
    }

    @Override
    public boolean isFull() {
        return this.qAb.isFull();
    }

    @Override
    public void clear() {
        super.clear();
        this.qAb.beZ();
    }

    public boolean bq(ffV ffV2) {
        return ((eJA)this.qzY).a((RS)this.qAb, ffV2) >= 0;
    }

    public boolean c(long l, short s) {
        return ((eJA)this.qzY).a((RS<ffV>)this.qAb, l, s) >= 0;
    }

    public boolean br(ffV ffV2) {
        return ((eJA)this.qzY).b((RS)this.qAb, ffV2) >= 0;
    }

    public boolean a(ffV ffV2, byte by) {
        return ((eJA)this.qzY).a((RS)this.qAb, ffV2, (short)by) >= 0;
    }
}

