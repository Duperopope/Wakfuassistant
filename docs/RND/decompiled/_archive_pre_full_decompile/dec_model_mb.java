/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.Descriptors$FileDescriptor
 *  com.google.protobuf.ExtensionRegistry
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 */
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;

public final class mb {
    static final Descriptors.Descriptor JN;
    static final GeneratedMessageV3.FieldAccessorTable JO;
    static final Descriptors.Descriptor JP;
    static final GeneratedMessageV3.FieldAccessorTable JQ;
    static final Descriptors.Descriptor JR;
    static final GeneratedMessageV3.FieldAccessorTable JS;
    static final Descriptors.Descriptor JT;
    static final GeneratedMessageV3.FieldAccessorTable JU;
    private static Descriptors.FileDescriptor M;

    private mb() {
    }

    public static void a(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static void a(ExtensionRegistry extensionRegistry) {
        mb.a((ExtensionRegistryLite)extensionRegistry);
    }

    public static Descriptors.FileDescriptor j() {
        return M;
    }

    static {
        String[] stringArray = new String[]{"\n\u0012market_entry.proto\u001a\nitem.proto\"\u007f\n\u0017ProtoMarketSearchResult\u0012$\n\npagination\u0018\u0001 \u0002(\u000b2\u0010.ProtoPagination\u0012\"\n\u0007entries\u0018\u0002 \u0003(\u000b2\u0011.ProtoMarketEntry\u0012\u001a\n\u0012market_server_time\u0018\u0003 \u0002(\u0003\"M\n\u000fProtoPagination\u0012\u0013\n\u000bstart_index\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bquantity\u0018\u0002 \u0002(\u0005\u0012\u0013\n\u000btotal_count\u0018\u0003 \u0002(\u0005\"\u00de\u0001\n\u0010ProtoMarketEntry\u0012\u000f\n\u0003uid\u0018\u0001 \u0001(\u0003:\u0002-1\u0012\u0018\n\u0004item\u0018\u0002 \u0001(\u000b2\n.ProtoItem\u0012\u001c\n\u0006seller\u0018\u0003 \u0002(\u000b2\f.ProtoSeller\u0012\u0018\n\u0010initial_quantity\u0018\u0005 \u0002(\u0005\u0012\u001a\n\u0012remaining_quantity\u0018\u0006 \u0002(\u0005\u0012\u0012\n\nunit_price\u0018\u0007 \u0002(\u0003\u0012\u0018\n\u0010sell_duration_id\u0018\b \u0002(\u0005\u0012\u0017\n\u000fexpiration_date\u0018\t \u0001(\u0003J\u0004\b\u0004\u0010\u0005\"o\n\u000bProtoSeller\u0012\u0012\n\naccount_id\u0018\u0001 \u0002(\u0003\u0012\f\n\u0004name\u0018\u0002 \u0002(\t\u0012\u001c\n\u0014serialized_languages\u0018\u0003 \u0001(\u0005\u0012 \n\u0014account_community_id\u0018\u0004 \u0001(\u0005:\u0002-1B7\n%com.ankama.wakfu.protocol.item.marketB\u000eProtobufMarket"};
        M = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom((String[])stringArray, (Descriptors.FileDescriptor[])new Descriptors.FileDescriptor[]{kF.j()});
        JN = (Descriptors.Descriptor)mb.j().getMessageTypes().get(0);
        JO = new GeneratedMessageV3.FieldAccessorTable(JN, new String[]{"Pagination", "Entries", "MarketServerTime"});
        JP = (Descriptors.Descriptor)mb.j().getMessageTypes().get(1);
        JQ = new GeneratedMessageV3.FieldAccessorTable(JP, new String[]{"StartIndex", "Quantity", "TotalCount"});
        JR = (Descriptors.Descriptor)mb.j().getMessageTypes().get(2);
        JS = new GeneratedMessageV3.FieldAccessorTable(JR, new String[]{"Uid", "Item", "Seller", "InitialQuantity", "RemainingQuantity", "UnitPrice", "SellDurationId", "ExpirationDate"});
        JT = (Descriptors.Descriptor)mb.j().getMessageTypes().get(3);
        JU = new GeneratedMessageV3.FieldAccessorTable(JT, new String[]{"AccountId", "Name", "SerializedLanguages", "AccountCommunityId"});
        kF.j();
    }
}
