/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from aCD
 */
public class acd_2 {
    protected long dBG;
    protected final List<ach_2> dBH;

    public acd_2(List<acc_2> list, long l) {
        this.dBG = l;
        this.dBH = new ArrayList<ach_2>();
        this.a(list, l);
    }

    protected void a(List<acc_2> list, long l) {
        if (list.size() == 1) {
            acc_2 acc_22 = list.get(0);
            acz_2 acz_22 = new acz_2();
            acz_22.b(acc_22.bzK());
            acz_22.ht(l + acc_22.bXG());
            acz_22.c(acc_22.bzL());
            acz_22.d(acc_22.bzM());
            acz_22.hu(l + acc_22.bXF());
            acz_22.e(acc_22.bzL());
            this.dBH.add(acz_22);
        } else {
            for (int i = 0; i < list.size() - 1; ++i) {
                acc_2 acc_23 = list.get(i);
                acc_2 acc_24 = list.get(i + 1);
                acz_2 acz_23 = new acz_2();
                if (i == 0) {
                    acz_23.b(acc_23.bzK());
                    acz_23.ht(l);
                    acz_23.c(acc_23.bzL());
                } else {
                    acz_23.b(acc_23.bzM().j(acc_23.bzK()).dD(0.5f));
                    acz_23.ht(l + acc_23.bXG() + acc_23.Tz() / 2L);
                    acz_23.c(acc_23.bzL().dD(0.5f));
                }
                if (i == list.size() - 2) {
                    acz_23.e(acc_24.bzL());
                    acz_23.hu(acz_23.bXG() + acc_23.Tz() / 2L + acc_24.Tz());
                    acz_23.d(acc_24.bzM());
                } else {
                    acz_23.d(acc_24.bzK().j(acc_24.bzM()).dD(0.5f));
                    if (i == 0) {
                        acz_23.hu(acz_23.bXG() + acc_23.Tz() + acc_24.Tz() / 2L);
                    } else {
                        acz_23.hu(acz_23.bXG() + acc_23.Tz() / 2L + acc_24.Tz() / 2L);
                    }
                    acz_23.e(acc_24.bzL().dD(0.5f));
                }
                this.dBH.add(acz_23);
            }
        }
    }

    public acp_1 fZ(long l) {
        if (l < this.dBG) {
            l = this.dBG;
        }
        if (l > this.bXF()) {
            l = this.bXF();
        }
        for (int i = 0; i < this.dBH.size(); ++i) {
            ach_2 ach_22 = this.dBH.get(i);
            if (ach_22.bXG() > l || ach_22.bXF() < l) continue;
            return ach_22.fZ(l);
        }
        return null;
    }

    public long bXG() {
        return this.dBG;
    }

    public long bXF() {
        return this.dBH.get(this.dBH.size() - 1).bXF();
    }

    public void ht(long l) {
        this.dBG = l;
    }

    public void hu(long l) {
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Smoothed trajectory : ");
        for (ach_2 ach_22 : this.dBH) {
            stringBuilder.append(ach_22.toString()).append("\n");
        }
        return stringBuilder.toString();
    }

    public acp_1 bzM() {
        return this.dBH.get(this.dBH.size() - 1).bzM();
    }

    public List<ach_2> bXI() {
        return this.dBH;
    }
}

