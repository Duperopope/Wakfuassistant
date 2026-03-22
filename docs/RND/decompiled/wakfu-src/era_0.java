/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*
 * Renamed from eRa
 */
abstract class era_0
extends ero_0 {
    private static final short rgT = 8;
    private static final short rgU = 2;
    private fqP<fqE> rgV;

    era_0() {
    }

    protected void fGa() {
        if (!(this.bgF instanceof exP)) {
            return;
        }
        exP exP2 = (exP)this.bgF;
        fqP<fqE> fqP2 = exP2.dkB();
        ArrayList<fqE> arrayList = new ArrayList<fqE>();
        ArrayList<fqE> arrayList2 = new ArrayList<fqE>();
        this.a(fqP2, arrayList, true, false);
        this.a(fqP2, arrayList2, false, true);
        arrayList.sort(ftB.gmo());
        arrayList2.sort(ftB.gmo());
        List list = arrayList2.size() > 0 ? arrayList2.subList(0, Math.min(arrayList2.size(), 2)) : new LinkedList();
        list.addAll(arrayList.subList(0, Math.min(arrayList.size(), 8 - list.size())));
        this.rgV = new fqP(8, fqP2.beS(), fqP2.beR(), false, false, false);
        for (fqE fqE2 : list) {
            try {
                if (this.rgV.f(fqE2)) {
                    bgA.warn((Object)("Le sort est deja contenu dans l'inventaire, il faut v\u00e9rifier si son \u00e9l\u00e9ment n'est pas PHYSICAL id : " + fqE2.avr()));
                    continue;
                }
                ((Sg)this.rgV).b(fqE2);
            }
            catch (sa_0 sa_02) {
                bgA.error((Object)"InventoryCapacityReachedException during createSpellInventoryForController", (Throwable)sa_02);
            }
            catch (Sz sz) {
                bgA.error((Object)"ContentAlreadyPresentException during createSpellInventoryForController", (Throwable)sz);
            }
        }
    }

    private void a(fqP<fqE> fqP2, List<fqE> list, boolean bl, boolean bl2) {
        for (fqE fqE2 : fqP2) {
            Object Spell = fqE2.giP();
            Iterator<enk_0> iterator = ((fqD)Spell).fA(this.fHf());
            byte by = ((fqD)Spell).giG();
            eNd eNd2 = eNd.ff(by);
            if (eNd2 == null || !bl && eNd2.fAX() || !bl2 && eNd2 == eNd.qPf || ((fqD)Spell).eeY()) continue;
            boolean bl3 = false;
            while (iterator.hasNext()) {
                enk_0 enk_02 = iterator.next();
                if (enk_02.avZ() != enf_0.qUj.d() && enk_02.avZ() != enf_0.qUl.d() && enk_02.avZ() != enf_0.qUp.d()) continue;
                bl3 = true;
                break;
            }
            if (bl3) continue;
            list.add(fqE2);
        }
    }

    @Override
    protected void b(io_1 io_12) {
        io_12.a(ii_1.MR().a(this.rgV.gjd()));
    }

    @Override
    protected void f(im_1 im_12) {
        if (im_12.Qz()) {
            exP exP2 = (exP)this.bbd();
            if (exP2 == null || exP2.Sn() < 0L) {
                return;
            }
            exP2.f(im_12.QA().MO());
        }
    }
}

