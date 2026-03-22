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
 * Renamed from eo
 */
public final class eo_2
extends GeneratedMessageV3
implements er_2 {
    private static final long mO = 0L;
    int an;
    public static final int mP = 1;
    int mQ;
    private byte Y = (byte)-1;
    private static final eo_2 mR = new eo_2();
    @Deprecated
    public static final Parser<eo_2> mS = new ep_2();

    eo_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private eo_2() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new eo_2();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    eo_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                        this.mQ = codedInputStream.readInt32();
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

    public static final Descriptors.Descriptor uY() {
        return ej_2.mB;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ej_2.mC.ensureFieldAccessorsInitialized(eo_2.class, eq_2.class);
    }

    @Override
    public boolean uZ() {
        return (this.an & 1) != 0;
    }

    @Override
    public int va() {
        return this.mQ;
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.uZ()) {
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.an & 1) != 0) {
            codedOutputStream.writeInt32(1, this.mQ);
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
            n += CodedOutputStream.computeInt32Size((int)1, (int)this.mQ);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof eo_2)) {
            return super.equals(object);
        }
        eo_2 eo_22 = (eo_2)object;
        if (this.uZ() != eo_22.uZ()) {
            return false;
        }
        if (this.uZ() && this.va() != eo_22.va()) {
            return false;
        }
        return this.unknownFields.equals((Object)eo_22.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + eo_2.uY().hashCode();
        if (this.uZ()) {
            n = 37 * n + 1;
            n = 53 * n + this.va();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static eo_2 ai(ByteBuffer byteBuffer) {
        return (eo_2)mS.parseFrom(byteBuffer);
    }

    public static eo_2 ai(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (eo_2)mS.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static eo_2 aR(ByteString byteString) {
        return (eo_2)mS.parseFrom(byteString);
    }

    public static eo_2 ai(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (eo_2)mS.parseFrom(byteString, extensionRegistryLite);
    }

    public static eo_2 ai(byte[] byArray) {
        return (eo_2)mS.parseFrom(byArray);
    }

    public static eo_2 ai(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (eo_2)mS.parseFrom(byArray, extensionRegistryLite);
    }

    public static eo_2 bq(InputStream inputStream) {
        return (eo_2)GeneratedMessageV3.parseWithIOException(mS, (InputStream)inputStream);
    }

    public static eo_2 bq(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (eo_2)GeneratedMessageV3.parseWithIOException(mS, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static eo_2 br(InputStream inputStream) {
        return (eo_2)GeneratedMessageV3.parseDelimitedWithIOException(mS, (InputStream)inputStream);
    }

    public static eo_2 br(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (eo_2)GeneratedMessageV3.parseDelimitedWithIOException(mS, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static eo_2 ai(CodedInputStream codedInputStream) {
        return (eo_2)GeneratedMessageV3.parseWithIOException(mS, (CodedInputStream)codedInputStream);
    }

    public static eo_2 cy(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (eo_2)GeneratedMessageV3.parseWithIOException(mS, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public eq_2 vb() {
        return eo_2.vc();
    }

    public static eq_2 vc() {
        return mR.vd();
    }

    public static eq_2 a(eo_2 eo_22) {
        return mR.vd().c(eo_22);
    }

    public eq_2 vd() {
        return this == mR ? new eq_2() : new eq_2().c(this);
    }

    protected eq_2 ai(GeneratedMessageV3.BuilderParent builderParent) {
        eq_2 eq_22 = new eq_2(builderParent);
        return eq_22;
    }

    public static eo_2 ve() {
        return mR;
    }

    public static Parser<eo_2> z() {
        return mS;
    }

    public Parser<eo_2> getParserForType() {
        return mS;
    }

    public eo_2 vf() {
        return mR;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.ai(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.vd();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.vb();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.vd();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.vb();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.vf();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.vf();
    }

    static /* synthetic */ boolean fa() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(eo_2 eo_22) {
        return eo_22.unknownFields;
    }
}

