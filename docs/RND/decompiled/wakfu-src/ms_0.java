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
 * Renamed from mS
 */
class ms_0
extends AbstractParser<mR> {
    ms_0() {
    }

    public mR ih(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new mR(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ih(codedInputStream, extensionRegistryLite);
    }
}

