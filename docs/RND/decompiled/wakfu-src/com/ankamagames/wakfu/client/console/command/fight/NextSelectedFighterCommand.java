/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.fight;

import java.util.ArrayList;
import java.util.List;

public final class NextSelectedFighterCommand
implements aQm {
    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        if (!aue_0.cVJ().c(cuh_2.eSM())) {
            return;
        }
        bgt_0 bgt_02 = bvz_0.dLl();
        if (bgt_02 == null) {
            return;
        }
        bsj_0 bsj_02 = bgt_02.dkZ();
        if (bsj_02 == null) {
            return;
        }
        List<bgy> list = this.a(bgt_02, bsj_02);
        if (list.isEmpty()) {
            return;
        }
        this.z(list);
        this.a(bgt_02, list);
    }

    private void a(bgt_0 bgt_02, List<bgy> list) {
        bgy bgy2 = cuh_2.eSM().eSN();
        if (bgy2 == null || bgy2 == bgt_02) {
            this.q(list.get(0));
        } else {
            int n = list.indexOf(bgy2);
            if (n == list.size() - 1) {
                this.q(null);
            } else {
                this.q(list.get(n + 1));
            }
        }
    }

    private void z(List<bgy> list) {
        list.sort(new aUi(this));
    }

    private List<bgy> a(bgt_0 bgt_02, bsj_0 bsj_02) {
        ArrayList<bgy> arrayList = new ArrayList<bgy>(bsj_02.a(evb_0.rc(bgt_02.Xi())));
        arrayList.remove(bgt_02);
        return arrayList;
    }

    private void q(bgy bgy2) {
        cuh_2.eSM().cd(bgy2);
        cuh_2.eSM().eSO();
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

