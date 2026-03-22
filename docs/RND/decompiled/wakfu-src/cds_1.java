/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.wakfu.client.console.command.debug.CinematicsSelectorCommand;
import com.ankamagames.wakfu.client.console.command.debug.VideoCommand;
import org.apache.log4j.Logger;

/*
 * Renamed from cDS
 */
@fyf_0
public class cds_1 {
    public static final String PACKAGE = "wakfu.cinematicsSelector";
    private static final Logger mUk = Logger.getLogger(cds_1.class);

    public static void launchCinematic(flp_2 flp_22, String string) {
        cbg_1 cbg_12 = CinematicsSelectorCommand.cTT();
        if (cbg_12 == null) {
            return;
        }
        aQd.eBx.a(string, cbg_12.erY(), cbg_12.erX());
    }

    public static void toggleDebugMode(flp_2 flp_22) {
        cbg_1 cbg_12 = CinematicsSelectorCommand.cTT();
        if (cbg_12 == null) {
            return;
        }
        cbg_12.setDebugMode(!cbg_12.erX());
    }

    public static void toggleWithLoadingFrame(flp_2 flp_22) {
        cbg_1 cbg_12 = CinematicsSelectorCommand.cTT();
        if (cbg_12 == null) {
            return;
        }
        cbg_12.iV(!cbg_12.erY());
    }

    public static void toggleVideoPlayer(flp_2 flp_22) {
        VideoCommand.cUd();
    }
}

