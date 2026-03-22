/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cVP
 */
class cvp_1
implements alx_2 {
    final /* synthetic */ cvo_2 nQU;

    cvp_1(cvo_2 cvo_22) {
        this.nQU = cvo_22;
    }

    @Override
    public void dialogUnloaded(String string) {
        if (string.equals("inventoryDialog")) {
            this.nQU.eUO();
            aue_0.cVJ().b(cvo_2.eUK());
        } else if (string.startsWith("inventoryOnlyDialog")) {
            this.nQU.qM(string);
        }
    }
}

