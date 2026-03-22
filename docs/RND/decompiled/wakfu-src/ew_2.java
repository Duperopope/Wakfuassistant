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
 *  com.google.protobuf.Internal$IntList
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
import java.util.List;

/*
 * Renamed from ew
 */
public final class ew_2
extends GeneratedMessageV3
implements ez_2 {
    private static final long mZ = 0L;
    int an;
    public static final int na = 1;
    int nb;
    public static final int nc = 2;
    Internal.IntList nd;
    private byte Y = (byte)-1;
    private static final ew_2 ne = new ew_2();
    @Deprecated
    public static final Parser<ew_2> nf = new ex_2();

    ew_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private ew_2() {
        this.nd = ew_2.emptyIntList();
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new ew_2();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    ew_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        int n = 0;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl = false;
            block13: while (!bl) {
                int n2 = codedInputStream.readTag();
                switch (n2) {
                    case 0: {
                        bl = true;
                        continue block13;
                    }
                    case 8: {
                        this.an |= 1;
                        this.nb = codedInputStream.readInt32();
                        continue block13;
                    }
                    case 16: {
                        if ((n & 2) == 0) {
                            this.nd = ew_2.newIntList();
                            n |= 2;
                        }
                        this.nd.addInt(codedInputStream.readInt32());
                        continue block13;
                    }
                    case 18: {
                        int n3 = codedInputStream.readRawVarint32();
                        int n4 = codedInputStream.pushLimit(n3);
                        if ((n & 2) == 0 && codedInputStream.getBytesUntilLimit() > 0) {
                            this.nd = ew_2.newIntList();
                            n |= 2;
                        }
                        while (codedInputStream.getBytesUntilLimit() > 0) {
                            this.nd.addInt(codedInputStream.readInt32());
                        }
                        codedInputStream.popLimit(n4);
                        continue block13;
                    }
                }
                if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n2)) continue;
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
            if ((n & 2) != 0) {
                this.nd.makeImmutable();
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor vB() {
        return ej_2.mD;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ej_2.mE.ensureFieldAccessorsInitialized(ew_2.class, ey_2.class);
    }

    @Override
    public boolean vC() {
        return (this.an & 1) != 0;
    }

    @Override
    public int vD() {
        return this.nb;
    }

    @Override
    public List<Integer> vE() {
        return this.nd;
    }

    @Override
    public int vF() {
        return this.nd.size();
    }

    @Override
    public int br(int n) {
        return this.nd.getInt(n);
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.vC()) {
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.an & 1) != 0) {
            codedOutputStream.writeInt32(1, this.nb);
        }
        for (int i = 0; i < this.nd.size(); ++i) {
            codedOutputStream.writeInt32(2, this.nd.getInt(i));
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
            n += CodedOutputStream.computeInt32Size((int)1, (int)this.nb);
        }
        int n2 = 0;
        for (int i = 0; i < this.nd.size(); ++i) {
            n2 += CodedOutputStream.computeInt32SizeNoTag((int)this.nd.getInt(i));
        }
        n += n2;
        n += 1 * this.vE().size();
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof ew_2)) {
            return super.equals(object);
        }
        ew_2 ew_22 = (ew_2)object;
        if (this.vC() != ew_22.vC()) {
            return false;
        }
        if (this.vC() && this.vD() != ew_22.vD()) {
            return false;
        }
        if (!this.vE().equals(ew_22.vE())) {
            return false;
        }
        return this.unknownFields.equals((Object)ew_22.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + ew_2.vB().hashCode();
        if (this.vC()) {
            n = 37 * n + 1;
            n = 53 * n + this.vD();
        }
        if (this.vF() > 0) {
            n = 37 * n + 2;
            n = 53 * n + this.vE().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static ew_2 ak(ByteBuffer byteBuffer) {
        return (ew_2)nf.parseFrom(byteBuffer);
    }

    public static ew_2 ak(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ew_2)nf.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static ew_2 aV(ByteString byteString) {
        return (ew_2)nf.parseFrom(byteString);
    }

    public static ew_2 ak(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (ew_2)nf.parseFrom(byteString, extensionRegistryLite);
    }

    public static ew_2 ak(byte[] byArray) {
        return (ew_2)nf.parseFrom(byArray);
    }

    public static ew_2 ak(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (ew_2)nf.parseFrom(byArray, extensionRegistryLite);
    }

    public static ew_2 bu(InputStream inputStream) {
        return (ew_2)GeneratedMessageV3.parseWithIOException(nf, (InputStream)inputStream);
    }

    public static ew_2 bu(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ew_2)GeneratedMessageV3.parseWithIOException(nf, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ew_2 bv(InputStream inputStream) {
        return (ew_2)GeneratedMessageV3.parseDelimitedWithIOException(nf, (InputStream)inputStream);
    }

    public static ew_2 bv(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ew_2)GeneratedMessageV3.parseDelimitedWithIOException(nf, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ew_2 ak(CodedInputStream codedInputStream) {
        return (ew_2)GeneratedMessageV3.parseWithIOException(nf, (CodedInputStream)codedInputStream);
    }

    public static ew_2 cE(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ew_2)GeneratedMessageV3.parseWithIOException(nf, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public ey_2 vG() {
        return ew_2.vH();
    }

    public static ey_2 vH() {
        return ne.vI();
    }

    public static ey_2 a(ew_2 ew_22) {
        return ne.vI().c(ew_22);
    }

    public ey_2 vI() {
        return this == ne ? new ey_2() : new ey_2().c(this);
    }

    protected ey_2 ak(GeneratedMessageV3.BuilderParent builderParent) {
        ey_2 ey_22 = new ey_2(builderParent);
        return ey_22;
    }

    public static ew_2 vJ() {
        return ne;
    }

    public static Parser<ew_2> z() {
        return nf;
    }

    public Parser<ew_2> getParserForType() {
        return nf;
    }

    public ew_2 vK() {
        return ne;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.ak(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.vI();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.vG();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.vI();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.vG();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.vK();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.vK();
    }

    static /* synthetic */ boolean bg() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ Internal.IntList vL() {
        return ew_2.emptyIntList();
    }

    static /* synthetic */ UnknownFieldSet b(ew_2 ew_22) {
        return ew_22.unknownFields;
    }

    static /* synthetic */ Internal.IntList vM() {
        return ew_2.emptyIntList();
    }

    static /* synthetic */ Internal.IntList a(Internal.IntList intList) {
        return ew_2.mutableCopy((Internal.IntList)intList);
    }

    static /* synthetic */ Internal.IntList vN() {
        return ew_2.emptyIntList();
    }
}

