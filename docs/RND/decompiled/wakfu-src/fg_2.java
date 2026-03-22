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
 * Renamed from fG
 */
class fg_2
extends AbstractParser<ff_2> {
    fg_2() {
    }

    public ff_2 dp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new ff_2(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.dp(codedInputStream, extensionRegistryLite);
    }
}

