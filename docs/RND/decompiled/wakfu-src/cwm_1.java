/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cWM
 */
class cwm_1
implements alx_2 {
    final /* synthetic */ cwl_2 nTN;

    cwm_1(cwl_2 cwl_22) {
        this.nTN = cwl_22;
    }

    @Override
    public void dialogUnloaded(String string) {
        if (string.equals("moderatorChatDialog")) {
            this.nTN.eWn();
        }
    }
}

