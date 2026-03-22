/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL2
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 */
import com.jogamp.opengl.GL2;
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.apache.log4j.Logger;

/*
 * Renamed from awM
 */
public final class awm_1 {
    private static final Logger dmS = Logger.getLogger(awm_1.class);
    private static final awm_1 dmT = new awm_1();
    private static final int dmU = 131072;
    private final TLongObjectHashMap<awk_1> dmV;
    private final ArrayList<awk_1> dmW;
    private float dmX;
    private float dmY = 131072.0f;
    private final awi_1 dmZ = new awi_1();
    private final awj_1 dna = new awj_1();
    private final Lock dnb = new ReentrantLock();

    private awm_1() {
        this.dmV = new TLongObjectHashMap(1024);
        this.dmW = new ArrayList(128);
    }

    public static awm_1 bPn() {
        return dmT;
    }

    public awk_1 a(art_1 art_12, long l, String string, boolean bl, boolean bl2) {
        awk_1 awk_12 = this.gB(l);
        if (awk_12 == null) {
            awk_12 = art_12.a(l, string, bl);
            awk_12.dn(bl2);
            this.a(l, awk_12);
        }
        return awk_12;
    }

    public awk_1 a(art_1 art_12, long l, String string, boolean bl) {
        return this.a(art_12, l, string, bl, true);
    }

    public awk_1 a(art_1 art_12, long l, axc_2 axc_22, boolean bl) {
        awk_1 awk_12 = this.gB(l);
        if (awk_12 == null) {
            awk_12 = art_12.a(l, axc_22, bl);
            this.a(l, awk_12);
        }
        return awk_12;
    }

    public awk_1 b(art_1 art_12, long l, axc_2 axc_22, boolean bl) {
        awk_1 awk_12 = this.gD(l);
        if (awk_12 != null) {
            return awk_12;
        }
        return this.c(art_12, l, axc_22, bl);
    }

    public awk_1 b(art_1 art_12, long l, String string, boolean bl) {
        awk_1 awk_12 = this.gD(l);
        if (awk_12 != null) {
            return awk_12;
        }
        axc_2 axc_22 = new axc_2();
        if (axc_22.gF(string)) {
            awk_12 = this.c(art_12, l, axc_22, bl);
            awk_12.aCH = string;
        }
        axc_22.bsI();
        return awk_12;
    }

    public awk_1 b(art_1 art_12, long l, String string, boolean bl, boolean bl2) {
        if (!bl2) {
            return this.b(art_12, l, string, bl);
        }
        awk_1 awk_12 = this.gD(l);
        if (awk_12 != null) {
            return awk_12;
        }
        awk_12 = art_12.a(l, string, bl);
        awk_12.dp(true);
        awk_12.dn(bl2);
        this.a(l, awk_12);
        return awk_12;
    }

    private void a(long l, awk_1 awk_12) {
        if (awk_12 == null) {
            dmS.error((Object)("Essaye d'ins\u00e9rer une texture null id=" + l), (Throwable)new Exception());
            return;
        }
        this.dnb.lock();
        this.dmV.put(l, (Object)awk_12);
        awk_12.dmJ = awl_1.dmN;
        this.dnb.unlock();
    }

    public awk_1 a(art_1 art_12, long l, String string, String string2, boolean bl) {
        awk_1 awk_12 = this.gD(l);
        if (awk_12 != null) {
            return awk_12;
        }
        axc_2 axc_22 = new axc_2();
        if (axc_22.gF(string2 + string)) {
            awk_12 = this.c(art_12, l, axc_22, bl);
        }
        axc_22.bsI();
        return awk_12;
    }

    public awk_1 a(art_1 art_12, long l, int n, int n2, boolean bl) {
        return art_12.b(l, n, n2, bl);
    }

    public int bPo() {
        return this.dmV.size();
    }

    public awk_1 gB(long l) {
        this.dnb.lock();
        awk_1 awk_12 = (awk_1)this.dmV.get(l);
        this.dnb.unlock();
        return awk_12;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public int gC(String string) {
        assert (string != null);
        this.dnb.lock();
        int n = 0;
        try {
            n = 0;
            TLongObjectIterator tLongObjectIterator = this.dmV.iterator();
            while (tLongObjectIterator.hasNext()) {
                tLongObjectIterator.advance();
                awk_1 awk_12 = (awk_1)tLongObjectIterator.value();
                if (awk_12.bPe() || !awk_12.bQp() || !awk_12.gB(string)) continue;
                ++n;
            }
        }
        catch (Exception exception) {
            dmS.error((Object)"Exception raised while loading textures : ", (Throwable)exception);
        }
        finally {
            this.dnb.unlock();
        }
        return n;
    }

    public void j(GL2 gL2) {
        this.dnb.lock();
        try {
            this.dmZ.i(gL2);
            this.dmV.forEachValue((TObjectProcedure)this.dmZ);
            this.dmX += this.dmZ.bOZ();
        }
        catch (Exception exception) {
            dmS.error((Object)"Exception raised while preparing textures : ", (Throwable)exception);
        }
        finally {
            this.dnb.unlock();
        }
    }

    public void bPp() {
        this.dnb.lock();
        TLongObjectIterator tLongObjectIterator = this.dmV.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            awk_1 awk_12 = (awk_1)tLongObjectIterator.value();
            if (awk_12 == null || awk_12.bSW() != 0) continue;
            for (int i = awk_12.bPj(); i > 0; --i) {
                awk_12.bPk();
            }
            assert (awk_12.bPj() == 0);
        }
        this.dnb.unlock();
        float f2 = this.dmY;
        this.dmY = 0.0f;
        this.bPq();
        this.dmY = f2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void bPq() {
        float f2 = this.dmX - this.dmY;
        if (f2 <= 0.0f) {
            return;
        }
        this.dnb.lock();
        try {
            this.dna.reset();
            this.dmV.forEachValue((TObjectProcedure)this.dna);
            float f3 = this.dna.a(this.dmW, f2);
            this.dmX -= f3;
            int n = this.dmW.size();
            for (int i = 0; i < n; ++i) {
                awk_1 awk_12 = this.dmW.get(i);
                awk_12.dmJ = awl_1.dmP;
                this.dmV.remove(awk_12.bPb());
                awk_12.bsI();
            }
            this.dmW.clear();
        }
        catch (Exception exception) {
            dmS.error((Object)"Exception raised while releasing textures : ", (Throwable)exception);
        }
        finally {
            this.dnb.unlock();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void gC(long l) {
        this.dnb.lock();
        try {
            awk_1 awk_12 = (awk_1)this.dmV.get(l);
            if (awk_12 == null) {
                return;
            }
            float f2 = awk_12.bPi();
            awk_12.dmJ = awl_1.dmP;
            this.dmV.remove(awk_12.bPb());
            awk_12.bsI();
            this.dmX -= f2;
        }
        catch (Exception exception) {
            dmS.error((Object)("Error when trying to release texture " + l), (Throwable)exception);
        }
        finally {
            this.dnb.unlock();
        }
    }

    public float bPr() {
        return this.dmX / 1024.0f;
    }

    public void dh(float f2) {
        this.dmY = Math.max(131072.0f, f2);
    }

    private awk_1 gD(long l) {
        return this.gB(l);
    }

    private awk_1 c(art_1 art_12, long l, axc_2 axc_22, boolean bl) {
        acc_1 acc_12 = new acc_1(axc_22.vf(0));
        axc_22.bQu();
        awk_1 awk_12 = this.a(art_12, l, axc_22, bl);
        awk_12.bQs().b(acc_12);
        this.a(l, awk_12);
        return awk_12;
    }
}

