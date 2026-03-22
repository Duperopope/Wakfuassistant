/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fAO
 */
public class fao_1
extends frs_1 {
    final /* synthetic */ fak_2 tPV;

    public fao_1(fak_2 fak_22) {
        this.tPV = fak_22;
    }

    public boolean gsn() {
        return false;
    }

    @Override
    public fsm_1 getContentMinSize(faw_2 faw_22) {
        int n = this.tPV.tMc.width * this.tPV.tPA + this.tPV.tPz * (this.tPV.tPA - 1);
        int n2 = this.tPV.tMc.height * this.tPV.tPB + this.tPV.tPy * (this.tPV.tPB - 1);
        return new fsm_1(n, n2);
    }

    @Override
    public fsm_1 getContentPreferedSize(faw_2 faw_22) {
        return this.getContentMinSize(faw_22);
    }

    @Override
    public void a(faw_2 faw_22) {
        int n;
        if (this.tPV.bjS == null) {
            return;
        }
        int n2 = 0;
        if (this.tPV.jeX != null) {
            n = this.tPV.jeX.get(5);
            this.tPV.jeX.set(5, 1);
            n2 = (this.tPV.jeX.get(7) - this.tPV.jeX.getFirstDayOfWeek() + 7) % 7;
            this.tPV.jeX.set(5, n);
        }
        n = n2;
        int n3 = this.tPV.tPB - 1;
        for (int i = 0; i < this.tPV.bjS.size(); ++i) {
            faw_2 faw_23 = this.tPV.bjS.get(i).getContainer();
            int n4 = (this.tPV.tMc.width + this.tPV.tPz) * n;
            int n5 = (this.tPV.tMc.height + this.tPV.tPy) * n3;
            faw_23.setPosition(n4, n5);
            faw_23.setSize(this.tPV.tMc.width, this.tPV.tMc.height);
            if (++n != this.tPV.tPA) continue;
            n = 0;
            --n3;
        }
        this.tPV.setSelectedDate(this.tPV.tPF + 1);
    }
}

