/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongShortIterator
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TLongShortIterator;
import org.apache.log4j.Logger;

/*
 * Renamed from fqw
 */
public class fqw_0<S extends fqr_0>
extends RL<S, yi_2>
implements gq_0<yj_2> {
    private static final Logger sTB = Logger.getLogger(fqw_0.class);
    private fqt_0 sTC = fqt_0.sTc;

    public fqw_0(fqt_0 fqt_02, RW<S, yi_2> rW, RU<S> rU, short s, boolean bl) {
        super(rW, rU, s, bl);
        this.a(Sj.bnR);
        this.sTC = fqt_02;
    }

    @Override
    public boolean b(yj_2 yj_22) {
        yj_22.clear();
        yj_22.Us = (byte)this.sTC.ordinal();
        TLongShortIterator tLongShortIterator = this.bmC.iterator();
        while (tLongShortIterator.hasNext()) {
            tLongShortIterator.advance();
            short s = tLongShortIterator.value();
            fqr_0 fqr_02 = (fqr_0)this.ai(s);
            if (fqr_02 == null) {
                sTB.error((Object)("Incoh\u00e9rence d'Inventory, l'item $" + tLongShortIterator.key() + " est r\u00e9f\u00e9renc\u00e9 mais n'est pas pr\u00e9sent dans le tableau"), (Throwable)new Exception());
                continue;
            }
            if (!fqr_02.bfh()) continue;
            yk_2 yk_22 = new yk_2();
            yk_22.adx = s;
            boolean bl = fqr_02.c(yk_22.alA);
            if (bl) {
                yj_22.alz.add(yk_22);
                continue;
            }
            sTB.error((Object)("Impossible de convertir le raccourci \u00e0 la position " + s + " sous forme d\u00e9-s\u00e9rialis\u00e9e brute"));
            return false;
        }
        return true;
    }

    @Override
    public boolean c(yj_2 yj_22) {
        this.beQ();
        boolean bl = true;
        fqt_0[] fqt_0Array = fqt_0.values();
        if (yj_22.Us >= 0 && yj_22.Us < fqt_0Array.length) {
            this.sTC = fqt_0Array[yj_22.Us];
        } else {
            bl = false;
        }
        try {
            for (yk_2 yk_22 : yj_22.alz) {
                fqr_0 fqr_02 = (fqr_0)this.bmD.x(yk_22.alA);
                if (fqr_02 != null) {
                    if (this.a(fqr_02, yk_22.adx)) continue;
                    bl = false;
                    continue;
                }
                bl = false;
                sTB.error((Object)"Erreur lors de la d\u00e9-serialisation d'un ArrayInventory : item null");
            }
        }
        catch (sa_0 sa_02) {
            sTB.error((Object)sa_02);
            bl = false;
        }
        catch (Sz sz) {
            sTB.error((Object)sz);
            bl = false;
        }
        catch (SD sD) {
            sTB.error((Object)sD);
            bl = false;
        }
        return bl;
    }

    public fqt_0 ecS() {
        return this.sTC;
    }

    public boolean a(long l, fqu_0 fqu_02) {
        fqr_0 fqr_02 = (fqr_0)this.dN(l);
        return fqr_02 != null && fqr_02.gih() == fqu_02;
    }

    @Override
    public /* synthetic */ boolean b(Object object) {
        return this.c((yj_2)object);
    }

    @Override
    public /* synthetic */ boolean a(Object object) {
        return this.b((yj_2)object);
    }
}

