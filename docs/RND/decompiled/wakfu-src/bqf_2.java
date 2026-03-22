/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.haapi.client.okhttp.ankama.model.MoneyBalance
 *  com.ankama.haapi.client.okhttp.ankama.model.MoneyBalance$CurrencyEnum
 */
import com.ankama.haapi.client.okhttp.ankama.model.MoneyBalance;
import java.util.List;

/*
 * Renamed from bQf
 */
class bqf_2
implements bPl {
    final /* synthetic */ bpp_2 kUl;

    bqf_2(bpp_2 bpp_22) {
        this.kUl = bpp_22;
    }

    @Override
    public void b(int n, List<MoneyBalance> list) {
        this.kUl.IS(n);
        int n2 = 0;
        for (MoneyBalance moneyBalance : list) {
            if (moneyBalance.getCurrency() != MoneyBalance.CurrencyEnum.OGR) continue;
            n2 = GC.B(moneyBalance.getAmount().floatValue());
        }
        this.kUl.IQ(n2);
        this.kUl.eje();
    }

    @Override
    public void B(int n, boolean bl) {
        if (bl) {
            bpg_2 bpg_22 = this.kUl.IR(n);
            if (bpg_22 != null) {
                this.kUl.a(bpg_22);
            } else {
                this.kUl.ejf();
            }
        }
        this.kUl.IS(n);
        this.kUl.eje();
    }

    @Override
    public void a(int n, bPk bPk2) {
        this.kUl.IS(n);
        this.kUl.eje();
    }
}

