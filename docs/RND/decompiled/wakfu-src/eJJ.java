/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public class eJJ {
    private static final Logger qAl = Logger.getLogger(eJJ.class);
    protected final eJS qAm;

    public eJJ(@NotNull eJS eJS2) {
        this.qAm = eJS2;
    }

    public void pO(long l) {
        this.qAm.pO(l);
    }

    public void ij(long l) {
        this.qAm.ij(l);
    }

    public boolean sm(String string) {
        if (!VV.bkY().dB(string)) {
            return false;
        }
        if (string.equals(this.qAm.getName())) {
            return false;
        }
        this.qAm.setName(string);
        return true;
    }

    public boolean a(byte by, fgd_0 fgd_02, ffV ffV2) {
        boolean bl = false;
        try {
            fgd_02.a(ffV2, by);
        }
        catch (sa_0 sa_02) {
            bl = true;
            qAl.error((Object)"Exception levee", (Throwable)sa_02);
        }
        catch (Sz sz) {
            bl = true;
            qAl.error((Object)"Exception levee", (Throwable)sz);
        }
        catch (SD sD) {
            bl = true;
            qAl.error((Object)"Exception levee", (Throwable)sD);
        }
        if (bl) {
            fgd_02.c(ffV2);
            throw new eJM("Erreur lors de l'ajout de l'objet " + String.valueOf(ffV2) + " \u00e0 la position donn\u00e9e " + by + " sur le companion " + String.valueOf(this.qAm));
        }
        return bl;
    }

    public boolean a(@NotNull exP exP2, long l, @NotNull ffs_0 ffs_02, short s) {
        fgd_0 fgd_02 = this.qAm.dme();
        ffV ffV2 = (ffV)fgd_02.dN(l);
        if (ffV2 == null) {
            throw new eJM("[Companion] Unknown item " + l + " to remove from companion equipment " + String.valueOf(this.qAm));
        }
        if (!ffs_02.h(ffV2, s)) {
            throw new eJM("[Companion] Cannot add item " + String.valueOf(ffV2) + " in bag " + String.valueOf(ffs_02) + " at position " + s);
        }
        try {
            if (!fgd_02.c(ffV2)) {
                throw new eJM("[COMPANION] Failed to remove item " + String.valueOf(ffV2) + " from companion inventory " + String.valueOf(this.qAm));
            }
            ffs_02.i(ffV2, s);
            fes.a("FromCompanionEquipmentToInventory", fet.D(this.qAm), fet.bS(exP2), fet.a(ffV2, 1), fet.sK(exP2.aqZ()));
        }
        catch (SD | Sz | sa_0 sb_02) {
            qAl.fatal((Object)("[ITEM][COMPANION] We removed item " + String.valueOf(ffV2) + " from inventory of companion " + String.valueOf(this.qAm) + " of account " + exP2.Xi() + ", but we cannot add it to player inventory. Item is lost. Item data: " + ffV2.fWz()));
            throw new eJM("Error while adding item " + String.valueOf(ffV2) + " at destination " + s + " in bag " + String.valueOf(ffs_02));
        }
        return true;
    }

    public String toString() {
        return "CompanionController{m_companionModel=" + String.valueOf(this.qAm) + "}";
    }

    protected boolean fxn() {
        return !this.qAm.efO() && !eKb.qBe.dK(this.qAm.aWP()) && this.qAm.dme().aJG();
    }
}

