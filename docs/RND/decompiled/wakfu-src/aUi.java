/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.wakfu.client.console.command.fight.NextSelectedFighterCommand;
import java.util.Comparator;

public class aUi
implements Comparator<bgy> {
    public aUi(NextSelectedFighterCommand nextSelectedFighterCommand) {
    }

    public int a(bgy bgy2, bgy bgy3) {
        int n = Short.compare(bgy2.aWP(), bgy3.aWP());
        if (n != 0) {
            return n;
        }
        return Long.compare(bgy2.Sn(), bgy3.Sn());
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((bgy)object, (bgy)object2);
    }
}

