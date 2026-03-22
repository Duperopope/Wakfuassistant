/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from Tm
 */
public final class tm_0<Rated extends tk_0> {
    protected static final Logger bso = Logger.getLogger(tm_0.class);
    private Rated[] bsp;
    private final int[] bsq = new int[2];
    private tn_0 bsr;
    private boolean Nb;
    private boolean bss;
    private Rated bst;

    public tm_0(Rated[] RatedArray) {
        if (RatedArray.length == 2) {
            this.bsp = RatedArray;
            this.bsq[0] = RatedArray[0].bgK();
            this.bsq[1] = RatedArray[1].bgK();
        }
        this.Nb = false;
        this.bst = null;
        this.bss = false;
        this.bsr = null;
    }

    public Rated[] bgO() {
        return this.bsp;
    }

    public int[] bgP() {
        return this.bsq;
    }

    public void a(long l, Rated Rated) {
        if (Rated != this.bsp[0] && Rated != this.bsp[1]) {
            bso.error((Object)("Impossible de mettre \u00e0 jour le gagnant : rated " + String.valueOf(Rated) + " n'est pas inclus ni dans " + this.bsp[0].Sn() + " ni dans " + this.bsp[1].Sn() + "."));
        } else {
            this.bst = Rated;
            this.bss = false;
            this.ek(l);
        }
    }

    public void ej(long l) {
        bso.warn((Object)("Combat d'id " + l + " mis en mode d'\u00e9galit\u00e9."));
        this.bss = true;
        this.ek(l);
    }

    private void ek(long l) {
        if (!this.Nb) {
            this.Nb = true;
            if (this.bsr == null) {
                bso.error((Object)("Combat d'id " + l + " sans handler : Mise \u00e0 jour du ladder impossible."));
            } else {
                this.bsr.a(l, this);
            }
        }
    }

    public boolean app() {
        return this.Nb;
    }

    public boolean bgQ() {
        return this.bss;
    }

    public Rated bgR() {
        return this.bst;
    }

    public boolean h(Rated Rated) {
        return this.bsp[0] == Rated || this.bsp[1] == Rated;
    }

    public Rated i(Rated Rated) {
        if (this.bsp[0] == Rated) {
            return this.bsp[1];
        }
        if (this.bsp[1] == Rated) {
            return this.bsp[0];
        }
        return null;
    }

    public void a(tn_0 tn_02) {
        this.bsr = tn_02;
    }
}

