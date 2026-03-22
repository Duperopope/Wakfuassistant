/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cEf
 */
@fyf_0
public class cef_2 {
    public static final String PACKAGE = "wakfu.cosmeticsPreview";

    public static void changeCharacter(fiq_1 fiq_12, bgt_0 bgt_02) {
        dae_0.b((short)17840, bgt_02);
    }

    public static void resetPreview(fiq_1 fiq_12) {
        dae_0.cV((short)16111);
    }

    public static void toggleHideHat(flv_2 flv_22, bmo_1 bmo_12) {
        bmo_12.gx(flv_22.bqr());
    }

    public static void changeActorDirectionOnClick(flp_2 flp_22, blR blR2, fax_1 fax_12) {
        if (flp_22.gEk()) {
            cef_2.a(blR2, fax_12, -1);
        } else if (flp_22.gEm()) {
            cef_2.a(blR2, fax_12, 1);
        }
    }

    public static void changeActorDirectionOnScroll(flp_2 flp_22, blR blR2, fax_1 fax_12) {
        cef_2.a(blR2, fax_12, flp_22.gEo());
    }

    public static void turnActorClockwise(fiq_1 fiq_12, blR blR2, fax_1 fax_12) {
        cef_2.a(blR2, fax_12, 1);
    }

    public static void turnActorCounterClockwise(fiq_1 fiq_12, blR blR2, fax_1 fax_12) {
        cef_2.a(blR2, fax_12, -1);
    }

    private static void a(blR blR2, fax_1 fax_12, int n) {
        if (!bnv_1.kCu.egb()) {
            return;
        }
        if (bnv_1.kCu.egc()) {
            blR2.a(abi_1.dzk);
            fax_12.setAnimName("AnimEmote-Vomis");
            return;
        }
        blR2.DK(n);
    }

    public static void cyclePreviewAnimation(fiq_1 fiq_12, blR blR2) {
        blR2.duw();
    }

    public static void togglePreviewPet(flv_2 flv_22, blR blR2) {
        if (flv_22.bqr() != blR2.duz()) {
            blR2.duC();
        }
    }

    public static void togglePreviewMount(flv_2 flv_22, blR blR2) {
        if (flv_22.bqr() != blR2.duD()) {
            blR2.duG();
        }
    }

    public static void togglePreviewAura(flv_2 flv_22, blR blR2) {
        if (flv_22.bqr() != blR2.duH()) {
            blR2.duK();
        }
    }

    public static void addItemToPreview(fla_2 fla_22) {
        bgv_2 bgv_22;
        Object object;
        cee_2.onItemDragStop(fla_22);
        Object object2 = fla_22.getValue();
        if (object2 instanceof fgf_0) {
            object = (fgf_0)object2;
            bgv_22 = bjf_1.h(object.getItem());
        } else {
            object2 = fla_22.getValue();
            if (object2 instanceof bek_0) {
                bek_0 bek_02 = (bek_0)object2;
                bgv_22 = bek_02.duo();
            } else {
                return;
            }
        }
        if (bgv_22 == null) {
            return;
        }
        Object object3 = fla_22.gBD();
        if (object3 instanceof fcv_1 && (object3 = ((fcv_1)(object2 = (fcv_1)object3)).getItemValue()) instanceof bmn_1) {
            bmn_1 bmn_12 = (bmn_1)object3;
            if (!bjf_1.a((fhc_0)bgv_22, bmn_12.duf())) {
                return;
            }
            object = bmn_12.duf();
        } else {
            object3 = bjf_1.a(bgv_22);
            if (object3.isEmpty()) {
                return;
            }
            object = (fm_1)((Object)object3.getFirst());
        }
        object2 = new dae_0();
        ((ama_1)object2).lK(18240);
        ((ama_1)object2).D(object);
        ((ama_1)object2).sY(bgv_22.d());
        aaw_1.bUq().h((aam_2)object2);
    }

    public static void removeCosmeticFromPreview(flg_2 flg_22) {
        Object object = flg_22.getItemValue();
        if (!(object instanceof bmn_1)) {
            return;
        }
        bmn_1 bmn_12 = (bmn_1)object;
        dae_0.b((short)18145, (Object)bmn_12.duf());
    }

    public static void removeCosmeticFromPreview(flc_2 flc_22) {
        Object object = flc_22.getValue();
        if (!(object instanceof bmn_1)) {
            return;
        }
        bmn_1 bmn_12 = (bmn_1)object;
        dae_0.b((short)18145, (Object)bmn_12.duf());
    }
}

