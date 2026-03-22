/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.sun.jna.NativeLibrary
 *  uk.co.caprica.vlcj.component.EmbeddedMediaPlayerComponent
 *  uk.co.caprica.vlcj.player.MediaPlayerEventListener
 *  uk.co.caprica.vlcj.player.TrackType
 *  uk.co.caprica.vlcj.player.embedded.EmbeddedMediaPlayer
 *  uk.co.caprica.vlcj.runtime.RuntimeUtil
 *  uk.co.caprica.vlcj.runtime.x.LibXUtil
 */
import com.sun.jna.NativeLibrary;
import java.awt.Container;
import java.io.File;
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import uk.co.caprica.vlcj.component.EmbeddedMediaPlayerComponent;
import uk.co.caprica.vlcj.player.MediaPlayerEventListener;
import uk.co.caprica.vlcj.player.TrackType;
import uk.co.caprica.vlcj.player.embedded.EmbeddedMediaPlayer;
import uk.co.caprica.vlcj.runtime.RuntimeUtil;
import uk.co.caprica.vlcj.runtime.x.LibXUtil;

/*
 * Renamed from fEg
 */
final class feg_1 {
    private final EmbeddedMediaPlayerComponent ujo = new EmbeddedMediaPlayerComponent();

    public static void main(String ... stringArray) {
        File file = new File(System.getProperty("java.library.path") + "/vlc-" + ady_1.bYZ().getName());
        NativeLibrary.addSearchPath((String)RuntimeUtil.getLibVlcLibraryName(), (String)file.getAbsolutePath());
        System.load(file.getAbsolutePath() + "/" + RuntimeUtil.getLibVlcCoreName());
        LibXUtil.initialise();
        SwingUtilities.invokeLater(new feh_1());
    }

    feg_1() {
    }

    void ccA() {
        JFrame jFrame = new JFrame("vlcj Tutorial");
        jFrame.setContentPane((Container)this.ujo);
        jFrame.setLocation(100, 100);
        jFrame.setSize(1050, 600);
        jFrame.setDefaultCloseOperation(3);
        jFrame.setVisible(true);
        EmbeddedMediaPlayer embeddedMediaPlayer = this.ujo.getMediaPlayer();
        embeddedMediaPlayer.addMediaPlayerEventListener((MediaPlayerEventListener)new fei_2(this));
        boolean bl = embeddedMediaPlayer.prepareMedia("zip:///media/pdeman/Work/trunk/data/wakfu/client/contents/videos/videos.jar!/Wakfu_Cinematique_4.mov", new String[0]);
        embeddedMediaPlayer.parseMedia();
        embeddedMediaPlayer.start();
        System.out.println("Track Information before end: " + String.valueOf(embeddedMediaPlayer.getTrackInfo(new TrackType[0])));
        System.out.println("    UNKNOWN: " + String.valueOf(embeddedMediaPlayer.getTrackInfo(new TrackType[]{TrackType.UNKNOWN})));
        System.out.println("      AUDIO: " + String.valueOf(embeddedMediaPlayer.getTrackInfo(new TrackType[]{TrackType.AUDIO})));
        System.out.println("      VIDEO: " + String.valueOf(embeddedMediaPlayer.getTrackInfo(new TrackType[]{TrackType.VIDEO})));
        System.out.println("       TEXT: " + String.valueOf(embeddedMediaPlayer.getTrackInfo(new TrackType[]{TrackType.TEXT})));
        System.out.println("       TEXT: " + Arrays.toString(embeddedMediaPlayer.getSpuDescriptions().toArray()));
        embeddedMediaPlayer.setSpu(2);
    }
}

