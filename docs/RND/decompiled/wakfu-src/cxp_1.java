/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cXp
 */
class cxp_1
implements alx_2 {
    final /* synthetic */ cxo_2 nVi;

    cxp_1(cxo_2 cxo_22) {
        this.nVi = cxo_22;
    }

    @Override
    public void dialogUnloaded(String string) {
        if (string.equals("osamodasSymbiotDialog")) {
            aue_0.cVJ().b(cxo_2.eWM());
        } else if (string.startsWith("monsterDetailDialog") && this.nVi.nVf.contains(string)) {
            this.nVi.nVf.remove(string);
        }
    }
}

