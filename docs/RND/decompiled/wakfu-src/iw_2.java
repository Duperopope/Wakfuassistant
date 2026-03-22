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
 * Renamed from iW
 */
class iw_2
extends AbstractParser<iv_2> {
    iw_2() {
    }

    public iv_2 ft(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new iv_2(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ft(codedInputStream, extensionRegistryLite);
    }
}

