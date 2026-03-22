/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.wakfu.client.console.command.debug.HideEntitiesCommand;

public class aTS
implements ase_2 {
    public aTS(HideEntitiesCommand hideEntitiesCommand) {
    }

    @Override
    public boolean J(Object object) {
        if (!(object instanceof bdj_2)) {
            return false;
        }
        bgy bgy2 = ((bdj_2)object).dcP();
        if ((HideEntitiesCommand.gvE & 1) == 1 && bgy2 instanceof bhx_0) {
            return true;
        }
        if ((HideEntitiesCommand.gvE & 2) == 2 && bgy2 instanceof bhJ && !bgy2.bvY()) {
            return true;
        }
        return (HideEntitiesCommand.gvE & 4) == 4 && bgy2.bvY();
    }
}

