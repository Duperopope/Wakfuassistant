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
 * Renamed from aW
 */
class aw_1
extends AbstractParser<av_2> {
    aw_1() {
    }

    public av_2 aj(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new av_2(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.aj(codedInputStream, extensionRegistryLite);
    }
}

