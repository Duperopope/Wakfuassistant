/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fDc
 */
class fdc_1
extends frs_1 {
    final /* synthetic */ fcz_2 ubZ;

    fdc_1(fcz_2 fcz_22) {
        this.ubZ = fcz_22;
    }

    public boolean gsn() {
        return false;
    }

    @Override
    public fsm_1 getContentMinSize(faw_2 faw_22) {
        return new fsm_1(0, 0);
    }

    @Override
    public fsm_1 getContentPreferedSize(faw_2 faw_22) {
        return new fsm_1(0, 0);
    }

    @Override
    public void a(faw_2 faw_22) {
        if (this.ubZ.tZi) {
            this.ubZ.tZi = false;
        }
        if (this.ubZ.ubJ) {
            while (this.ubZ.ubB < this.ubZ.ubI.size()) {
                this.ubZ.ubI.remove(this.ubZ.ubB).gAD();
            }
            if (this.ubZ.ubB > this.ubZ.ubI.size()) {
                fbt_1 fbt_12;
                if (this.ubZ.ubI.size() == 0) {
                    fbt_12 = new fbt_1();
                    fbt_12.aVI();
                    fbt_12.setNonBlocking(true);
                    fbt_12.setModulationColor(this.ubZ.ncL);
                    fbt_12.d(this.ubZ.tEl.gAK());
                    this.ubZ.d(fbt_12);
                    this.ubZ.ubI.add(fbt_12);
                }
                while (this.ubZ.ubB > this.ubZ.ubI.size()) {
                    fbt_12 = (fbt_1)this.ubZ.ubI.get(0).gAK();
                    this.ubZ.d(fbt_12);
                    this.ubZ.ubI.add(fbt_12);
                }
                this.ubZ.j(this.ubZ.tQx);
                this.ubZ.d(this.ubZ.tQx);
            }
            this.ubZ.gur();
            this.ubZ.ubJ = false;
        }
        if (this.ubZ.ubz) {
            this.ubZ.gus();
        }
        if (this.ubZ.uby) {
            this.ubZ.gut();
            this.ubZ.gur();
        }
    }
}

