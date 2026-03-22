/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.set.hash.TByteHashSet
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.set.hash.TByteHashSet;
import java.util.List;
import org.apache.log4j.Logger;

public class bsU {
    protected static final Logger jjG = Logger.getLogger(bsU.class);
    private static final bsU jjH = new bsU();
    protected final TIntObjectHashMap<bsS> jjI = new TIntObjectHashMap();

    public static bsU dHk() {
        return jjH;
    }

    public bsj_0 a(int n, int n2, rh_0 rh_02, TByteHashSet tByteHashSet, TByteHashSet tByteHashSet2, List<byte[]> list) {
        if (n2 == -1) {
            throw new IllegalArgumentException("fightId = FightConstants.NO_FIGHT_ID - On doit toujours passer l'id du fight sur le client.");
        }
        eUw eUw2 = eUw.Sy(n);
        bsj_0 bsj_02 = new bsj_0(n2, eUw2, rh_02, tByteHashSet, tByteHashSet2);
        this.h(bsj_02);
        return bsj_02;
    }

    public bsj_0 a(int n, int n2, rh_0 rh_02, TByteHashSet tByteHashSet, TByteHashSet tByteHashSet2, byte by) {
        if (n2 == -1) {
            throw new IllegalArgumentException("fightId = FightConstants.NO_FIGHT_ID - On doit toujours passer l'id du fight sur le client.");
        }
        eUw eUw2 = eUw.Sy(n);
        etw_0 etw_02 = etw_0.fk(by);
        bsj_0 bsj_02 = new bsj_0(n2, eUw2, rh_02, tByteHashSet, tByteHashSet2, etw_02);
        this.h(bsj_02);
        return bsj_02;
    }

    private void h(bsj_0 bsj_02) {
        this.q(bsj_02);
        bsj_02.fJF();
    }

    public void q(bsS bsS2) {
        if (this.jjI.contains(bsS2.d())) {
            jjG.error((Object)("On ajoute un fight (class=" + bsS2.getClass().getSimpleName() + " id=" + bsS2.d() + ") alors qu'un fight existe d\u00e9j\u00e0 avec cet id (class=" + ((bsS)this.jjI.get(bsS2.d())).getClass().getSimpleName() + ") : leaks possibles"));
        }
        this.jjI.put(bsS2.d(), (Object)bsS2);
    }

    public void r(bsS bsS2) {
        if (bsS2 == null) {
            return;
        }
        this.jjI.remove(bsS2.d());
        if (bsS2 instanceof bsi_0) {
            bsi_0 bsi_02 = (bsi_0)bsS2;
            bsi_02.dGv();
        }
    }

    public bsS Ft(int n) {
        return (bsS)this.jjI.get(n);
    }

    public TIntObjectIterator<bsS> dHl() {
        return this.jjI.iterator();
    }

    public void clear() {
        this.jjI.clear();
    }

    public void bmX() {
        bud.joo.clear();
        TIntObjectIterator<bsS> tIntObjectIterator = this.dHl();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            bsS bsS2 = (bsS)tIntObjectIterator.value();
            if (bsS2 instanceof bsj_0) {
                bsS2.chN();
                tIntObjectIterator = this.dHl();
            } else {
                tIntObjectIterator.remove();
            }
            aVi.cWF().zZ(bsS2.d());
        }
    }

    public bsS dz(int n, int n2) {
        TIntObjectIterator<bsS> tIntObjectIterator = this.dHl();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            bsS bsS2 = (bsS)tIntObjectIterator.value();
            if (!bsS2.bag().T(n, n2)) continue;
            return bsS2;
        }
        return null;
    }

    public boolean dA(int n, int n2) {
        return this.dz(n, n2) != null;
    }

    public void Fu(int n) {
        bsS bsS2 = (bsS)this.jjI.get(n);
        this.r(bsS2);
    }
}

