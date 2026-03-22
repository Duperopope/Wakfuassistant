/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cWf
 */
class cwf_2
implements alx_2 {
    cwf_2(cwe_1 cwe_12) {
    }

    @Override
    public void dialogUnloaded(String string) {
        if (string.equals("fleaDialog") || string.equals("inventoryDialog")) {
            aue_0.cVJ().b(cwe_1.eVh());
        }
    }
}

