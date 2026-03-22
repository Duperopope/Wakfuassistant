/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongShortIterator
 *  gnu.trove.set.hash.TByteHashSet
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TLongShortIterator;
import gnu.trove.set.hash.TByteHashSet;
import org.apache.log4j.Logger;

/*
 * Renamed from fgd
 */
public class fgd_0
extends RM<ffV, uy_1>
implements sg_0,
gq_0<vu_1> {
    public static final int shU = 2;
    private static final Logger shV = Logger.getLogger(fgd_0.class);
    private static final boolean shW = false;
    private static final boolean shX = false;
    private final TByteHashSet shY = new TByteHashSet();

    public fgd_0() {
        super(ffV.class, ffr_0.fVL(), ffq_0.fVK(), ffS.fVN(), false, false);
        this.a(Sj.bnO);
    }

    public void a(ffS ffS2, boolean bl) {
        if (bl) {
            this.shY.add(ffS2.shb);
        } else {
            this.shY.remove(ffS2.shb);
        }
    }

    public boolean gk(byte by) {
        return this.shY.contains(by);
    }

    @Override
    public void beZ() {
        super.beZ();
        this.shY.clear();
    }

    @Override
    public final boolean a(vu_1 vu_12) {
        if (this.bmL) {
            shV.warn((Object)"Impossible d'ajouter l'information de quantit\u00e9 \u00e0 un RawInventoryItemInventory qui n'est pas pr\u00e9vu pour");
        }
        vu_12.clear();
        TLongShortIterator tLongShortIterator = this.bmJ.iterator();
        while (tLongShortIterator.hasNext()) {
            Object object;
            tLongShortIterator.advance();
            short s = tLongShortIterator.value();
            try {
                ffV ffV2 = ((ffV[])this.bmB)[s];
                if (!ffV2.bfh()) continue;
                object = new vv_2();
                ((vv_2)object).adx = this.dK(ffV2.LV());
                ffV2.b(((vv_2)object).afu);
                vu_12.afs.add((vv_2)object);
            }
            catch (ClassCastException classCastException) {
                object = ((ffV[])this.bmB)[s];
                shV.error((Object)("erreur de cast : content is " + object.getClass().getName()), (Throwable)classCastException);
            }
            catch (Exception exception) {
                shV.error((Object)("Exception lev\u00e9e lors de la r\u00e9cup\u00e9ration de l'item \u00e0 la position " + s + " de l'\u00e9quipement " + String.valueOf(this)), (Throwable)exception);
            }
        }
        return true;
    }

    @Override
    public boolean b(vu_1 vu_12) {
        try {
            this.beQ();
            if (this.bmL) {
                shV.warn((Object)"Impossible de d\u00e9s\u00e9rialiser la quantit\u00e9 d'objets dans un inventaire, cette information n'est pas pr\u00e9sente dans le format RawInventory");
            }
            boolean bl = true;
            for (vv_2 vv_22 : vu_12.afs) {
                try {
                    ffV ffV2 = (ffV)this.bmK.x(vv_22.afu);
                    if (ffV2 != null) {
                        if (this.a(ffV2, vv_22.adx)) continue;
                        bl = false;
                        continue;
                    }
                    bl = false;
                    shV.error((Object)"Erreur lors de la d\u00e9-serialisation d'un ArrayInventory : item null");
                }
                catch (Exception exception) {
                    shV.error((Object)("Could not unserialize equipment from raw " + String.valueOf(vu_12)), (Throwable)exception);
                    bl = false;
                }
            }
            return bl;
        }
        catch (ClassCastException classCastException) {
            shV.error((Object)("Impossible d'initialiser un " + String.valueOf(this.getClass()) + " \u00e0 partir d'un " + String.valueOf(vu_12.getClass()) + " : RawArrayInventory attendu"), (Throwable)classCastException);
            return false;
        }
    }

    @Override
    public String beT() {
        return "equipment";
    }

    @Override
    public String toString() {
        return "ItemEquipment{m_lockedPositions=" + this.shY.size() + ", " + super.toString() + "}";
    }
}

