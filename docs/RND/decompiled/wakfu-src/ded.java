/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import java.util.Objects;
import java.util.Optional;
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

class ded
extends afk_1 {
    ded(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "addEquipmentShortcut";
    }

    @Override
    public String getDescription() {
        return "Ajoute un lien vers un objet ?quipe dans la barre de raccourcis active.";
    }

    @Override
    public afe_1[] bBg() {
        return ddU.oiD;
    }

    @Override
    @Nullable
    public final afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        Optional<ffV> optional;
        ffV ffV2;
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        String string = this.xu(0);
        long l = this.xs(1);
        short s = -1;
        boolean bl = n > 2;
        blg_2 blg_22 = bgt_02.dlG().edn();
        if (bl && !blg_22.ah(s = (short)((short)this.xp(2)))) {
            bl = false;
        }
        if (!bl) {
            s = blg_22.beO();
        }
        if (s == -1) {
            return;
        }
        if ("pos".equalsIgnoreCase(string)) {
            ffV2 = bgt_02.dmL().a(bgt_02.dnP(), ffS.gj((byte)l));
            if (ffV2 == null) {
                return;
            }
        } else if ("uid".equalsIgnoreCase(string)) {
            optional = bgt_02.dnP().B(l);
            if (optional.isEmpty()) {
                return;
            }
            ffV2 = optional.get();
            if (bgt_02.dmL().tz(ffV2.LV()) == null) {
                return;
            }
        } else if ("refId".equalsIgnoreCase(string)) {
            ffV2 = bgt_02.dmL().a(bgt_02.dnP(), (int)l);
            if (ffV2 == null) {
                return;
            }
        } else {
            ddU.ohA.warn((Object)("Type de r?f?rence (uid, ref id, position, ...) inconnu pour ajouter un equipment : " + string));
            return;
        }
        optional = Objects.requireNonNull(bgt_02.dmL().tz(ffV2.LV()));
        if (blg_22.HY(ffV2.avr()) == null) {
            blb_2 blb_22 = blb_2.a(fqu_0.sTt, -((ffS)((Object)optional)).aJr() - 1, ffV2.avr(), ffV2.aVt());
            dcz dcz2 = new dcz();
            dcz2.aL(blb_22);
            dcz2.lb(true);
            dcz2.NO(bgt_02.dlG().edo());
            dcz2.pz(s);
            dcz2.cC(false);
            dcz2.lK(19934);
            aaw_1.bUq().h(dcz2);
        }
    }
}

