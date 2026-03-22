/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from feJ
 */
public class fej_0 {
    private static final Logger seI = Logger.getLogger(fej_0.class);
    private final long seJ;
    private final feh_0 seK;
    public static final long seL = -1L;

    public fej_0(long l, feh_0 feh_02) {
        this.seJ = l;
        this.seK = feh_02;
    }

    protected feh_0 fUI() {
        return this.seK;
    }

    @Nullable
    public ffV lR(long l) {
        return this.seK.sP(l);
    }

    public final boolean h(ffV ffV2, boolean bl) {
        boolean bl2;
        if (bl) {
            return this.i(ffV2, true);
        }
        boolean bl3 = bl2 = !this.cm(ffV2);
        if (bl2) {
            return this.cl(ffV2);
        }
        return true;
    }

    public final boolean cj(ffV ffV2) {
        return this.h(ffV2, false);
    }

    public final ffV sT(long l) {
        ffV ffV2 = this.seK.sP(l);
        if (ffV2 == null) {
            throw new ffr("Impossible de trouver l'item " + l);
        }
        return this.seK.sR(l);
    }

    public final short sU(long l) {
        ffV ffV2 = this.seK.sP(l);
        if (ffV2 == null) {
            throw new ffr("Impossible de trouver l'item " + l);
        }
        return ffV2.bfd();
    }

    public final void s(long l, short s) {
        ffV ffV2 = this.seK.sP(l);
        if (ffV2 == null) {
            throw new ffr("Impossible de trouver l'item " + l);
        }
        this.f(ffV2, s);
    }

    @Nullable
    public final ffV t(long l, short s) {
        if (s < 0) {
            throw new ffr("Impossible de modifier la quantit\u00e9 de l'item " + l + ", on utilise une quantit\u00e9 n\u00e9gative");
        }
        ffV ffV2 = this.seK.sP(l);
        if (ffV2 == null) {
            throw new ffr("Impossible de trouver l'item " + l);
        }
        int n = ffV2.bfd() - s;
        return this.f(ffV2, (short)n);
    }

    public final void a(long l, long l2, short s, short s2) {
        block13: {
            short s3;
            ffs_0 ffs_02 = this.lf(l2);
            if (ffs_02 == null) {
                throw new ffr("Impossible de trouver le sac");
            }
            ffV ffV2 = this.seK.sP(l);
            if (ffV2 == null) {
                throw new ffr("Impossible de trouver l'item " + l);
            }
            short s4 = s3 = s2 == -1 ? ffV2.bfd() : s2;
            if (s3 < 0 || s3 > ffV2.bfd()) {
                throw new ffr("Quantit\u00e9 invalide : " + s3);
            }
            try {
                if (ffs_02.h(ffV2, s)) {
                    if (!ffs_02.i(ffV2, s)) {
                        throw new ffr("Probl\u00e8me \u00e0 l'ajout de l'item.");
                    }
                    this.seK.sR(l);
                    if (!ffs_02.bt(ffV2)) {
                        ffV2.aZp();
                    }
                    break block13;
                }
                ffV ffV3 = ffs_02.eQ(s);
                if (ffV3 != null && ffV3.n(ffV2)) {
                    short s5 = (short)Math.min(s3, Math.min(ffV2.bfd(), ffV3.fWa()));
                    ffs_02.b(ffV3.LV(), s5);
                    if (s5 == ffV2.bfd()) {
                        this.seK.sR(l);
                    } else {
                        this.seK.r(l, (short)(ffV2.bfd() - s5));
                    }
                    break block13;
                }
                throw new ffr("La position n'est pas stackable.");
            }
            catch (sa_0 sa_02) {
                throw new ffr("La destination est occup\u00e9e. " + String.valueOf(sa_02));
            }
            catch (Sz sz) {
                throw new ffr("Contenu d\u00e9ja pr\u00e9sent. Triche ?" + String.valueOf(sz));
            }
            catch (SD sD) {
                throw new ffr("La destination est occup\u00e9e." + String.valueOf(sD));
            }
        }
    }

    public void c(RX<ffV> rX) {
        for (short s = (short)(this.seK.fUH() - 1); s >= 0; s = (short)(s - 1)) {
            ffV ffV2 = this.seK.eO(s);
            if (!rX.isValid(ffV2)) continue;
            ffV ffV3 = this.seK.sR(ffV2.LV());
            ffV3.aZp();
        }
    }

    public void clear() {
        this.seK.clear();
    }

    @Nullable
    protected ffs_0 lf(long l) {
        return null;
    }

    protected boolean ck(ffV ffV2) {
        seI.error((Object)("[TempInv] Could not add item " + ffV2.fWz() + " to temporary inventory of " + this.seJ));
        return false;
    }

    private boolean i(ffV ffV2, boolean bl) {
        if (this.seK.isFull()) {
            if (bl) {
                return false;
            }
            return this.ck(ffV2);
        }
        this.seK.cf(ffV2);
        return true;
    }

    private boolean cl(ffV ffV2) {
        return this.i(ffV2, false);
    }

    private boolean cm(ffV ffV2) {
        short s = this.seK.fUH();
        for (short s2 = 0; s2 < s; s2 = (short)(s2 + 1)) {
            ffV ffV3 = this.seK.eO(s2);
            if (!ffV3.n(ffV2) || ffV3.fWa() == 0) continue;
            int n = Math.min(ffV2.bfd(), ffV3.fWa());
            this.seK.r(ffV3.LV(), (short)(ffV3.bfd() + n));
            if (ffV2.bfd() == n) {
                ffV2.aZp();
                return true;
            }
            ffV2.al((short)(-n));
        }
        return false;
    }

    @Nullable
    private ffV f(ffV ffV2, short s) {
        if (s < 0 || s > ffV2.bfe()) {
            throw new ffr("Impossible de d\u00e9finir la quantit\u00e9 de l'item " + ffV2.LV() + " \u00e0 " + s);
        }
        ffV ffV3 = null;
        if (s == 0) {
            ffV3 = this.seK.sR(ffV2.LV());
        } else {
            this.seK.r(ffV2.LV(), s);
        }
        return ffV3;
    }

    public String toString() {
        return "TemporaryInventoryController{m_inventory=" + String.valueOf(this.seK) + "}";
    }
}

