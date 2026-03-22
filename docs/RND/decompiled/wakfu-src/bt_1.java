/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractParser
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.ExtensionRegistryLite
 */
import com.google.protobuf.AbstractParser;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;

/*
 * Renamed from bT
 */
class bt_1
extends AbstractParser<bs_1> {
    bt_1() {
    }

    public bs_1 aT(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new bs_1(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.aT(codedInputStream, extensionRegistryLite);
    }
}

