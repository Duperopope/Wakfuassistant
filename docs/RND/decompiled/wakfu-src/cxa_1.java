/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cXA
 */
class cxa_1
implements alx_2 {
    final /* synthetic */ cxx_1 nWw;

    cxa_1(cxx_1 cxx_12) {
        this.nWw = cxx_12;
    }

    @Override
    public void dialogUnloaded(String string) {
        if (!string.startsWith("petDialog")) {
            return;
        }
        if (string.equals(this.nWw.nWq)) {
            this.nWw.nWq = null;
        }
        this.nWw.eXi();
        bjm_0 bjm_02 = (bjm_0)fse_1.gFu().aW("pet", string);
        bjm_0 bjm_03 = (bjm_0)fse_1.gFu().aW("pet", "inventoryDialog");
        if (bjm_03 == null || bjm_02.eai().LV() != bjm_03.eai().LV()) {
            bjm_02.clean();
        }
    }
}

