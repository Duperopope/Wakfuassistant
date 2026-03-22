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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from gy
 */
@Deprecated
public final class gy_1
extends GeneratedMessageV3
implements gb_1 {
    private static final long so = 0L;
    int an;
    public static final int sp = 1;
    List<gu_1> sq;
    public static final int sr = 2;
    boolean ss;
    public static final int st = 3;
    boolean kt;
    private byte Y = (byte)-1;
    private static final gy_1 su = new gy_1();
    @Deprecated
    public static final Parser<gy_1> sv = new gz_1();

    gy_1(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private gy_1() {
        this.sq = Collections.emptyList();
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new gy_1();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    gy_1(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block13: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block13;
                    }
                    case 10: {
                        if (!(bl & true)) {
                            this.sq = new ArrayList<gu_1>();
                            bl |= true;
                        }
                        this.sq.add((gu_1)codedInputStream.readMessage(gu_1.sn, extensionRegistryLite));
                        continue block13;
                    }
                    case 16: {
                        this.an |= 1;
                        this.ss = codedInputStream.readBool();
                        continue block13;
                    }
                    case 24: {
                        this.an |= 2;
                        this.kt = codedInputStream.readBool();
                        continue block13;
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
            if (bl & true) {
                this.sq = Collections.unmodifiableList(this.sq);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor Ee() {
        return gt_1.sd;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return gt_1.se.ensureFieldAccessorsInitialized(gy_1.class, ga_1.class);
    }

    @Override
    public List<gu_1> Ef() {
        return this.sq;
    }

    @Override
    public List<? extends gx_1> Eg() {
        return this.sq;
    }

    @Override
    public int Eh() {
        return this.sq.size();
    }

    @Override
    public gu_1 cT(int n) {
        return this.sq.get(n);
    }

    @Override
    public gx_1 cU(int n) {
        return this.sq.get(n);
    }

    @Override
    public boolean Ei() {
        return (this.an & 1) != 0;
    }

    @Override
    public boolean Ej() {
        return this.ss;
    }

    @Override
    public boolean qm() {
        return (this.an & 2) != 0;
    }

    @Override
    public boolean qn() {
        return this.kt;
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.Ei()) {
            this.Y = 0;
            return false;
        }
        if (!this.qm()) {
            this.Y = 0;
            return false;
        }
        for (int i = 0; i < this.Eh(); ++i) {
            if (this.cT(i).isInitialized()) continue;
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        for (int i = 0; i < this.sq.size(); ++i) {
            codedOutputStream.writeMessage(1, (MessageLite)this.sq.get(i));
        }
        if ((this.an & 1) != 0) {
            codedOutputStream.writeBool(2, this.ss);
        }
        if ((this.an & 2) != 0) {
            codedOutputStream.writeBool(3, this.kt);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        for (int i = 0; i < this.sq.size(); ++i) {
            n += CodedOutputStream.computeMessageSize((int)1, (MessageLite)((MessageLite)this.sq.get(i)));
        }
        if ((this.an & 1) != 0) {
            n += CodedOutputStream.computeBoolSize((int)2, (boolean)this.ss);
        }
        if ((this.an & 2) != 0) {
            n += CodedOutputStream.computeBoolSize((int)3, (boolean)this.kt);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof gy_1)) {
            return super.equals(object);
        }
        gy_1 gy_12 = (gy_1)object;
        if (!this.Ef().equals(gy_12.Ef())) {
            return false;
        }
        if (this.Ei() != gy_12.Ei()) {
            return false;
        }
        if (this.Ei() && this.Ej() != gy_12.Ej()) {
            return false;
        }
        if (this.qm() != gy_12.qm()) {
            return false;
        }
        if (this.qm() && this.qn() != gy_12.qn()) {
            return false;
        }
        return this.unknownFields.equals((Object)gy_12.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + gy_1.Ee().hashCode();
        if (this.Eh() > 0) {
            n = 37 * n + 1;
            n = 53 * n + this.Ef().hashCode();
        }
        if (this.Ei()) {
            n = 37 * n + 2;
            n = 53 * n + Internal.hashBoolean((boolean)this.Ej());
        }
        if (this.qm()) {
            n = 37 * n + 3;
            n = 53 * n + Internal.hashBoolean((boolean)this.qn());
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static gy_1 aI(ByteBuffer byteBuffer) {
        return (gy_1)sv.parseFrom(byteBuffer);
    }

    public static gy_1 aE(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (gy_1)sv.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static gy_1 bx(ByteString byteString) {
        return (gy_1)sv.parseFrom(byteString);
    }

    public static gy_1 aE(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (gy_1)sv.parseFrom(byteString, extensionRegistryLite);
    }

    public static gy_1 aF(byte[] byArray) {
        return (gy_1)sv.parseFrom(byArray);
    }

    public static gy_1 aE(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (gy_1)sv.parseFrom(byArray, extensionRegistryLite);
    }

    public static gy_1 ci(InputStream inputStream) {
        return (gy_1)GeneratedMessageV3.parseWithIOException(sv, (InputStream)inputStream);
    }

    public static gy_1 ci(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (gy_1)GeneratedMessageV3.parseWithIOException(sv, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static gy_1 cj(InputStream inputStream) {
        return (gy_1)GeneratedMessageV3.parseDelimitedWithIOException(sv, (InputStream)inputStream);
    }

    public static gy_1 cj(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (gy_1)GeneratedMessageV3.parseDelimitedWithIOException(sv, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static gy_1 aE(CodedInputStream codedInputStream) {
        return (gy_1)GeneratedMessageV3.parseWithIOException(sv, (CodedInputStream)codedInputStream);
    }

    public static gy_1 dM(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (gy_1)GeneratedMessageV3.parseWithIOException(sv, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public ga_1 Ek() {
        return gy_1.El();
    }

    public static ga_1 El() {
        return su.Em();
    }

    public static ga_1 a(gy_1 gy_12) {
        return su.Em().c(gy_12);
    }

    public ga_1 Em() {
        return this == su ? new ga_1() : new ga_1().c(this);
    }

    protected ga_1 aE(GeneratedMessageV3.BuilderParent builderParent) {
        ga_1 ga_12 = new ga_1(builderParent);
        return ga_12;
    }

    public static gy_1 En() {
        return su;
    }

    public static Parser<gy_1> z() {
        return sv;
    }

    public Parser<gy_1> getParserForType() {
        return sv;
    }

    public gy_1 Eo() {
        return su;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.aE(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.Em();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.Ek();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.Em();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.Ek();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.Eo();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.Eo();
    }

    static /* synthetic */ boolean aJ() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean oB() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(gy_1 gy_12) {
        return gy_12.unknownFields;
    }
}

