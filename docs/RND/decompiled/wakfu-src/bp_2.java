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
 * Renamed from bP
 */
class bp_2
extends AbstractParser<bo_2> {
    bp_2() {
    }

    public bo_2 aQ(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new bo_2(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.aQ(codedInputStream, extensionRegistryLite);
    }
}

