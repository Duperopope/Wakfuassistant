/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.haapi.client.okhttp.ankama.model.ShopImage
 *  com.ankama.shopi.client.model.DeviceImage
 *  com.ankama.shopi.client.model.MediaImage
 *  com.ankama.shopi.client.model.MediaOneOf
 *  com.ankama.shopi.client.model.MediaOneOf$DiscriminatorEnum
 *  com.ankama.shopi.client.model.MediaYoutubeVideo
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import com.ankama.haapi.client.okhttp.ankama.model.ShopImage;
import com.ankama.shopi.client.model.DeviceImage;
import com.ankama.shopi.client.model.MediaImage;
import com.ankama.shopi.client.model.MediaOneOf;
import com.ankama.shopi.client.model.MediaYoutubeVideo;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

public class bPh {
    private static final Pattern kOp = Pattern.compile("([0-9]+)_([0-9]+)");
    private static final Logger kOq = Logger.getLogger(bPh.class);
    private final int kOr;
    private final int kOs;
    private final String kOt;
    @Nullable
    private final Object kOu;

    private bPh(int n, int n2, String string) {
        this(n, n2, string, null);
    }

    private bPh(int n, int n2, String string, @Nullable Object object) {
        this.kOr = n;
        this.kOs = n2;
        this.kOt = string;
        this.kOu = object;
    }

    public int getWidth() {
        return this.kOr;
    }

    public int getHeight() {
        return this.kOs;
    }

    public String bZo() {
        return this.kOt;
    }

    @Nullable
    public Object ehV() {
        return this.kOu;
    }

    public static ArrayList<bPh> ae(List<ShopImage> list) {
        ArrayList<bPh> arrayList = new ArrayList<bPh>();
        for (ShopImage shopImage : list) {
            int n = Bw.m(shopImage.getWidth());
            int n2 = Bw.m(shopImage.getHeight());
            String string = shopImage.getUrl();
            arrayList.add(new bPh(n, n2, string));
        }
        return arrayList;
    }

    public static ArrayList<bPh> af(List<MediaOneOf> list) {
        ArrayList<bPh> arrayList = new ArrayList<bPh>();
        block4: for (MediaOneOf mediaOneOf : list) {
            MediaOneOf.DiscriminatorEnum discriminatorEnum = mediaOneOf.getDiscriminator();
            switch (discriminatorEnum) {
                case MEDIAIMAGE: {
                    MediaImage mediaImage = mediaOneOf.getMediaImage();
                    if (mediaImage == null) {
                        kOq.warn((Object)("Missing " + String.valueOf(MediaImage.class) + "  with following discriminator" + String.valueOf(discriminatorEnum) + " in following" + String.valueOf(mediaOneOf)));
                        continue block4;
                    }
                    arrayList.add(new bPh(0, 0, mediaImage.getImage().getUri().toString(), mediaImage.getType()));
                    continue block4;
                }
                case MEDIAYOUTUBEVIDEO: {
                    MediaYoutubeVideo mediaYoutubeVideo = mediaOneOf.getMediaYoutubeVideo();
                    if (mediaYoutubeVideo == null) {
                        kOq.warn((Object)("Missing " + String.valueOf(MediaYoutubeVideo.class) + "  with following discriminator" + String.valueOf(discriminatorEnum) + " in following" + String.valueOf(mediaOneOf)));
                        continue block4;
                    }
                    arrayList.add(new bPh(0, 0, String.format("https://i.ytimg.com/vi_webp/%s/maxresdefault.webp", mediaYoutubeVideo.getId())));
                    continue block4;
                }
            }
            kOq.warn((Object)("Unknown/Unsupported discriminator " + String.valueOf(discriminatorEnum) + " to extract " + String.valueOf(bPh.class) + " from " + String.valueOf(mediaOneOf)));
        }
        return arrayList;
    }

    public static ArrayList<bPh> ag(@Nullable List<DeviceImage> list) {
        ArrayList<bPh> arrayList = new ArrayList<bPh>();
        if (list == null) {
            return arrayList;
        }
        for (DeviceImage deviceImage : list) {
            arrayList.add(new bPh(0, 0, deviceImage.getUri().toString(), deviceImage.getDevice()));
        }
        return arrayList;
    }
}

