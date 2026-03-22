/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.CodedOutputStream
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.GeneratedMessageV3$BuilderParent
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 *  com.google.protobuf.GeneratedMessageV3$UnusedPrivateParameter
 *  com.google.protobuf.Internal
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.Message
 *  com.google.protobuf.Message$Builder
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLite$Builder
 *  com.google.protobuf.Parser
 *  com.google.protobuf.UninitializedMessageException
 *  com.google.protobuf.UnknownFieldSet
 *  com.google.protobuf.UnknownFieldSet$Builder
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/*
 * Renamed from aV
 */
public final class av_2
extends GeneratedMessageV3
implements ay_2 {
    private static final long gd = 0L;
    public static final int ge = 1;
    long fG;
    public static final int gf = 2;
    volatile Object bs;
    private byte Y = (byte)-1;
    private static final av_2 gg = new av_2();
    static final Parser<av_2> gh = new aw_1();

    av_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private av_2() {
        this.bs = "";
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new av_2();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    av_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl = false;
            block12: while (!bl) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl = true;
                        continue block12;
                    }
                    case 8: {
                        this.fG = codedInputStream.readInt64();
                        continue block12;
                    }
                    case 18: {
                        String string = codedInputStream.readStringRequireUtf8();
                        this.bs = string;
                        continue block12;
                    }
                }
                if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n)) continue;
                bl = true;
            }
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw invalidProtocolBufferException.setUnfinishedMessage((MessageLite)this);
        }
        catch (UninitializedMessageException uninitializedMessageException) {
            throw uninitializedMessageException.asInvalidProtocolBufferException().setUnfinishedMessage((MessageLite)this);
        }
        catch (IOException iOException) {
            throw new InvalidProtocolBufferException(iOException).setUnfinishedMessage((MessageLite)this);
        }
        finally {
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor gO() {
        return ae_1.eM;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ae_1.eN.ensureFieldAccessorsInitialized(av_2.class, ax_2.class);
    }

    @Override
    public long fD() {
        return this.fG;
    }

    @Override
    public String getName() {
        Object object = this.bs;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        this.bs = string;
        return string;
    }

    @Override
    public ByteString bW() {
        Object object = this.bs;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.bs = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if (this.fG != 0L) {
            codedOutputStream.writeInt64(1, this.fG);
        }
        if (!GeneratedMessageV3.isStringEmpty((Object)this.bs)) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)2, (Object)this.bs);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if (this.fG != 0L) {
            n += CodedOutputStream.computeInt64Size((int)1, (long)this.fG);
        }
        if (!GeneratedMessageV3.isStringEmpty((Object)this.bs)) {
            n += GeneratedMessageV3.computeStringSize((int)2, (Object)this.bs);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof av_2)) {
            return super.equals(object);
        }
        av_2 av_22 = (av_2)object;
        if (this.fD() != av_22.fD()) {
            return false;
        }
        if (!this.getName().equals(av_22.getName())) {
            return false;
        }
        return this.unknownFields.equals((Object)av_22.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + av_2.gO().hashCode();
        n = 37 * n + 1;
        n = 53 * n + Internal.hashLong((long)this.fD());
        n = 37 * n + 2;
        n = 53 * n + this.getName().hashCode();
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static av_2 u(ByteBuffer byteBuffer) {
        return (av_2)gh.parseFrom(byteBuffer);
    }

    public static av_2 u(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (av_2)gh.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static av_2 O(ByteString byteString) {
        return (av_2)gh.parseFrom(byteString);
    }

    public static av_2 u(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (av_2)gh.parseFrom(byteString, extensionRegistryLite);
    }

    public static av_2 u(byte[] byArray) {
        return (av_2)gh.parseFrom(byArray);
    }

    public static av_2 u(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (av_2)gh.parseFrom(byArray, extensionRegistryLite);
    }

    public static av_2 O(InputStream inputStream) {
        return (av_2)GeneratedMessageV3.parseWithIOException(gh, (InputStream)inputStream);
    }

    public static av_2 O(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (av_2)GeneratedMessageV3.parseWithIOException(gh, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static av_2 P(InputStream inputStream) {
        return (av_2)GeneratedMessageV3.parseDelimitedWithIOException(gh, (InputStream)inputStream);
    }

    public static av_2 P(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (av_2)GeneratedMessageV3.parseDelimitedWithIOException(gh, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static av_2 u(CodedInputStream codedInputStream) {
        return (av_2)GeneratedMessageV3.parseWithIOException(gh, (CodedInputStream)codedInputStream);
    }

    public static av_2 ai(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (av_2)GeneratedMessageV3.parseWithIOException(gh, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public ax_2 gP() {
        return av_2.gQ();
    }

    public static ax_2 gQ() {
        return gg.gR();
    }

    public static ax_2 a(av_2 av_22) {
        return gg.gR().c(av_22);
    }

    public ax_2 gR() {
        return this == gg ? new ax_2() : new ax_2().c(this);
    }

    protected ax_2 u(GeneratedMessageV3.BuilderParent builderParent) {
        ax_2 ax_22 = new ax_2(builderParent);
        return ax_22;
    }

    public static av_2 gS() {
        return gg;
    }

    public static Parser<av_2> z() {
        return gh;
    }

    public Parser<av_2> getParserForType() {
        return gh;
    }

    public av_2 gT() {
        return gg;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.u(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.gR();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.gP();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.gR();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.gP();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.gT();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.gT();
    }

    static /* synthetic */ boolean aq() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(av_2 av_22) {
        return av_22.unknownFields;
    }

    static /* synthetic */ void P(ByteString byteString) {
        av_2.checkByteStringIsUtf8((ByteString)byteString);
    }
}

