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
 * Renamed from dI
 */
public final class di_2
extends GeneratedMessageV3
implements dl_2 {
    private static final long la = 0L;
    int an;
    public static final int lb = 1;
    int lc;
    private byte Y = (byte)-1;
    private static final di_2 ld = new di_2();
    @Deprecated
    public static final Parser<di_2> le = new dj_1();

    di_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private di_2() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new di_2();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    di_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block11: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block11;
                    }
                    case 8: {
                        this.an |= 1;
                        this.lc = codedInputStream.readInt32();
                        continue block11;
                    }
                }
                if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n)) continue;
                bl2 = true;
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

    public static final Descriptors.Descriptor rV() {
        return df_2.jB;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return df_2.jC.ensureFieldAccessorsInitialized(di_2.class, dk_1.class);
    }

    @Override
    public boolean rW() {
        return (this.an & 1) != 0;
    }

    @Override
    public int rX() {
        return this.lc;
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.rW()) {
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.an & 1) != 0) {
            codedOutputStream.writeInt32(1, this.lc);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if ((this.an & 1) != 0) {
            n += CodedOutputStream.computeInt32Size((int)1, (int)this.lc);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof di_2)) {
            return super.equals(object);
        }
        di_2 di_22 = (di_2)object;
        if (this.rW() != di_22.rW()) {
            return false;
        }
        if (this.rW() && this.rX() != di_22.rX()) {
            return false;
        }
        return this.unknownFields.equals((Object)di_22.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + di_2.rV().hashCode();
        if (this.rW()) {
            n = 37 * n + 1;
            n = 53 * n + this.rX();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static di_2 ab(ByteBuffer byteBuffer) {
        return (di_2)le.parseFrom(byteBuffer);
    }

    public static di_2 ab(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (di_2)le.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static di_2 aJ(ByteString byteString) {
        return (di_2)le.parseFrom(byteString);
    }

    public static di_2 ab(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (di_2)le.parseFrom(byteString, extensionRegistryLite);
    }

    public static di_2 ab(byte[] byArray) {
        return (di_2)le.parseFrom(byArray);
    }

    public static di_2 ab(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (di_2)le.parseFrom(byArray, extensionRegistryLite);
    }

    public static di_2 bc(InputStream inputStream) {
        return (di_2)GeneratedMessageV3.parseWithIOException(le, (InputStream)inputStream);
    }

    public static di_2 bc(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (di_2)GeneratedMessageV3.parseWithIOException(le, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static di_2 bd(InputStream inputStream) {
        return (di_2)GeneratedMessageV3.parseDelimitedWithIOException(le, (InputStream)inputStream);
    }

    public static di_2 bd(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (di_2)GeneratedMessageV3.parseDelimitedWithIOException(le, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static di_2 ab(CodedInputStream codedInputStream) {
        return (di_2)GeneratedMessageV3.parseWithIOException(le, (CodedInputStream)codedInputStream);
    }

    public static di_2 cd(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (di_2)GeneratedMessageV3.parseWithIOException(le, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public dk_1 rY() {
        return di_2.rZ();
    }

    public static dk_1 rZ() {
        return ld.sa();
    }

    public static dk_1 b(di_2 di_22) {
        return ld.sa().d(di_22);
    }

    public dk_1 sa() {
        return this == ld ? new dk_1() : new dk_1().d(this);
    }

    protected dk_1 ab(GeneratedMessageV3.BuilderParent builderParent) {
        dk_1 dk_12 = new dk_1(builderParent);
        return dk_12;
    }

    public static di_2 sb() {
        return ld;
    }

    public static Parser<di_2> z() {
        return le;
    }

    public Parser<di_2> getParserForType() {
        return le;
    }

    public di_2 sc() {
        return ld;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.ab(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.sa();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.rY();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.sa();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.rY();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.sc();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.sc();
    }

    static /* synthetic */ boolean cs() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet c(di_2 di_22) {
        return di_22.unknownFields;
    }
}

