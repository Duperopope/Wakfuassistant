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
 * Renamed from fC
 */
class fc_2
extends AbstractParser<fb_2> {
    fc_2() {
    }

    public fb_2 dm(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new fb_2(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.dm(codedInputStream, extensionRegistryLite);
    }
}

