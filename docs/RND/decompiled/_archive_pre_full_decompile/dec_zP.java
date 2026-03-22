Picked up JAVA_TOOL_OPTIONS: 
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractParser
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.ExtensionRegistryLite
 *  zO
 */
import com.google.protobuf.AbstractParser;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;

class zP
extends AbstractParser<zO> {
    zP() {
    }

    public zO jK(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new zO(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.jK(codedInputStream, extensionRegistryLite);
    }
}

