/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TLongArrayList
 */
import gnu.trove.list.array.TLongArrayList;
import java.util.ArrayList;

/*
 * Renamed from amC
 */
public class amc_2
extends amq_2 {
    private final ArrayList<amu_1> cIz;

    @Override
    public TLongArrayList f(Object object, Object object2, Object object3, Object object4) {
        TLongArrayList tLongArrayList = new TLongArrayList();
        for (amu_1 amu_12 : this.cIz) {
            tLongArrayList.add(amu_12.d(object, object2, object3, object4));
        }
        return tLongArrayList;
    }

    public amc_2(ArrayList<? extends amx_1> arrayList) {
        this(arrayList, false);
    }

    public amc_2(ArrayList<? extends amx_1> arrayList, boolean bl) {
        if (bl) {
            this.cIz = arrayList;
        } else {
            this.cIz = new ArrayList();
            for (amx_1 amx_12 : arrayList) {
                if (amx_12.bDv() == amz_1.cJy) {
                    this.cIz.add((amu_1)amx_12);
                    continue;
                }
                throw new amw_2("On essaie d'ajouter " + String.valueOf(amx_12) + " de type " + amx_12.bDv().name() + " \u00e0 une liste de valeur num\u00e9rique");
            }
        }
    }

    @Override
    public int bDw() {
        return this.cIz.size();
    }

    @Override
    public Enum bDq() {
        return amg_2.cIS;
    }

    public String toString() {
        return "Ints[" + String.valueOf(this.cIz) + "]";
    }
}

