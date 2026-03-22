/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongIntHashMap
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import gnu.trove.map.hash.TLongIntHashMap;
import java.util.ArrayList;
import java.util.Collection;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from Tq
 */
public class tq_0<Rated extends tk_0> {
    private static final Logger bsw = Logger.getLogger(tq_0.class);
    private final int bsx;
    private final ArrayList<Rated> bsy = new ArrayList();
    private final ArrayList<Rated> bsz = new ArrayList();
    private final byte bsA;
    private final boolean bsB;
    private tn_0<Rated> bsr;
    private boolean Nb;
    private boolean bss;
    private byte bsC;
    private final TLongIntHashMap bsD = new TLongIntHashMap();

    public tq_0(int n, @NotNull Collection<Rated> collection, @NotNull Collection<Rated> collection2, byte by, boolean bl) {
        tk_0 tk_02;
        int n2;
        this.bsx = n;
        this.bsy.addAll(collection);
        this.bsz.addAll(collection2);
        this.bsA = by;
        this.bsB = bl;
        int n3 = this.bsy.size();
        for (n2 = 0; n2 < n3; ++n2) {
            tk_02 = (tk_0)this.bsy.get(n2);
            this.bsD.put(tk_02.Sn(), tk_02.bgK());
        }
        n3 = this.bsz.size();
        for (n2 = 0; n2 < n3; ++n2) {
            tk_02 = (tk_0)this.bsz.get(n2);
            this.bsD.put(tk_02.Sn(), tk_02.bgK());
        }
        this.Nb = false;
        this.bsC = (byte)-1;
        this.bss = false;
        this.bsr = null;
    }

    public Collection<Rated> bgU() {
        return this.bsy;
    }

    public Collection<Rated> bgV() {
        return this.bsz;
    }

    public void ab(byte by) {
        if (by < 0 || by > 1) {
            bsw.error((Object)("Impossible de mettre \u00e0 jour le gagnant : l'\u00e9quipe " + by + " n'existe pas"));
        } else {
            this.bsC = by;
            this.bss = false;
            this.bgX();
        }
    }

    public void bgW() {
        this.bss = true;
        this.bgX();
    }

    private void bgX() {
        if (!this.Nb) {
            this.Nb = true;
            if (this.bsr == null) {
                bsw.error((Object)"Combat sans handler : Mise \u00e0 jour du ladder impossible.");
            } else {
                this.bsr.a(this);
            }
        }
    }

    public TLongIntHashMap bgY() {
        return this.bsD;
    }

    public boolean app() {
        return this.Nb;
    }

    public boolean bgQ() {
        return this.bss;
    }

    public byte bgZ() {
        return this.bsC;
    }

    public int bha() {
        return this.bsx;
    }

    public Collection<Rated> bhb() {
        return this.bsC == 0 ? this.bsy : this.bsz;
    }

    public Collection<Rated> bhc() {
        return this.bsC == 1 ? this.bsy : this.bsz;
    }

    public boolean bhd() {
        boolean bl = this.bsA != this.bsC;
        return this.bsB || bl;
    }

    public boolean bhe() {
        boolean bl = this.bsA == this.bsC;
        return this.bsB || bl;
    }

    public void a(tn_0<Rated> tn_02) {
        this.bsr = tn_02;
    }

    public String toString() {
        return "RatedTeamMatch{m_teamA=" + String.valueOf(this.bsy) + ", m_teamB=" + String.valueOf(this.bsz) + "}";
    }
}

