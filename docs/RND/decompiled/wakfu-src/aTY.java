/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.wakfu.client.console.command.debug.NotificationTestCommand;

public class aTY
implements Runnable {
    public aTY(NotificationTestCommand notificationTestCommand) {
    }

    @Override
    public void run() {
        String string = aum_0.cWf().c("notification.skillLevelUpTitle", "Catin");
        String string2 = cfh_2.createLink(aum_0.cWf().c("notification.skillLevelUpText", "Catin", 10), biu_1.kiw);
        dcd dcd2 = new dcd(string, string2, biu_1.kiw);
        aaw_1.bUq().h(dcd2);
    }
}

