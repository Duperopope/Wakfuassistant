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
 * Renamed from ek
 */
public final class ek_2
extends GeneratedMessageV3
implements en_2 {
    private static final long mJ = 0L;
    int an;
    public static final int mK = 1;
    ByteString mL;
    private byte Y = (byte)-1;
    private static final ek_2 mM = new ek_2();
    @Deprecated
    public static final Parser<ek_2> mN = new el_2();

    ek_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private ek_2() {
        this.mL = ByteString.EMPTY;
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new ek_2();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    ek_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                    case 10: {
                        this.an |= 1;
                        this.mL = codedInputStream.readBytes();
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

    public static final Descriptors.Descriptor uK() {
        return ej_2.mH;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ej_2.mI.ensureFieldAccessorsInitialized(ek_2.class, em_2.class);
    }

    @Override
    public boolean uL() {
        return (this.an & 1) != 0;
    }

    @Override
    public ByteString uM() {
        return this.mL;
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.uL()) {
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.an & 1) != 0) {
            codedOutputStream.writeBytes(1, this.mL);
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
            n += CodedOutputStream.computeBytesSize((int)1, (ByteString)this.mL);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof ek_2)) {
            return super.equals(object);
        }
        ek_2 ek_22 = (ek_2)object;
        if (this.uL() != ek_22.uL()) {
            return false;
        }
        if (this.uL() && !this.uM().equals((Object)ek_22.uM())) {
            return false;
        }
        return this.unknownFields.equals((Object)ek_22.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + ek_2.uK().hashCode();
        if (this.uL()) {
            n = 37 * n + 1;
            n = 53 * n + this.uM().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static ek_2 ah(ByteBuffer byteBuffer) {
        return (ek_2)mN.parseFrom(byteBuffer);
    }

    public static ek_2 ah(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ek_2)mN.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static ek_2 aP(ByteString byteString) {
        return (ek_2)mN.parseFrom(byteString);
    }

    public static ek_2 ah(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (ek_2)mN.parseFrom(byteString, extensionRegistryLite);
    }

    public static ek_2 ah(byte[] byArray) {
        return (ek_2)mN.parseFrom(byArray);
    }

    public static ek_2 ah(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (ek_2)mN.parseFrom(byArray, extensionRegistryLite);
    }

    public static ek_2 bo(InputStream inputStream) {
        return (ek_2)GeneratedMessageV3.parseWithIOException(mN, (InputStream)inputStream);
    }

    public static ek_2 bo(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ek_2)GeneratedMessageV3.parseWithIOException(mN, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ek_2 bp(InputStream inputStream) {
        return (ek_2)GeneratedMessageV3.parseDelimitedWithIOException(mN, (InputStream)inputStream);
    }

    public static ek_2 bp(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ek_2)GeneratedMessageV3.parseDelimitedWithIOException(mN, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ek_2 ah(CodedInputStream codedInputStream) {
        return (ek_2)GeneratedMessageV3.parseWithIOException(mN, (CodedInputStream)codedInputStream);
    }

    public static ek_2 cv(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ek_2)GeneratedMessageV3.parseWithIOException(mN, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public em_2 uN() {
        return ek_2.uO();
    }

    public static em_2 uO() {
        return mM.uP();
    }

    public static em_2 a(ek_2 ek_22) {
        return mM.uP().c(ek_22);
    }

    public em_2 uP() {
        return this == mM ? new em_2() : new em_2().c(this);
    }

    protected em_2 ah(GeneratedMessageV3.BuilderParent builderParent) {
        em_2 em_22 = new em_2(builderParent);
        return em_22;
    }

    public static ek_2 uQ() {
        return mM;
    }

    public static Parser<ek_2> z() {
        return mN;
    }

    public Parser<ek_2> getParserForType() {
        return mN;
    }

    public ek_2 uR() {
        return mM;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.ah(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.uP();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.uN();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.uP();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.uN();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.uR();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.uR();
    }

    static /* synthetic */ boolean jh() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(ek_2 ek_22) {
        return ek_22.unknownFields;
    }
}

