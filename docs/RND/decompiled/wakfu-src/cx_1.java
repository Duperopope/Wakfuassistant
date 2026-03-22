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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from cX
 */
public final class cx_1
extends GeneratedMessageV3
implements da_1 {
    private static final long jh = 0L;
    public static final int ji = 1;
    List<db_2> jj;
    private byte Y = (byte)-1;
    private static final cx_1 jk = new cx_1();
    @Deprecated
    public static final Parser<cx_1> jl = new cy_1();

    cx_1(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private cx_1() {
        this.jj = Collections.emptyList();
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new cx_1();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    cx_1(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                        if (!(bl & true)) {
                            this.jj = new ArrayList<db_2>();
                            bl |= true;
                        }
                        this.jj.add((db_2)codedInputStream.readMessage(db_2.js, extensionRegistryLite));
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
            if (bl & true) {
                this.jj = Collections.unmodifiableList(this.jj);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor os() {
        return cw_1.jd;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return cw_1.je.ensureFieldAccessorsInitialized(cx_1.class, cz_1.class);
    }

    @Override
    public List<db_2> ot() {
        return this.jj;
    }

    @Override
    public List<? extends de_1> ou() {
        return this.jj;
    }

    @Override
    public int ov() {
        return this.jj.size();
    }

    @Override
    public db_2 aj(int n) {
        return this.jj.get(n);
    }

    @Override
    public de_1 ak(int n) {
        return this.jj.get(n);
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        for (int i = 0; i < this.ov(); ++i) {
            if (this.aj(i).isInitialized()) continue;
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        for (int i = 0; i < this.jj.size(); ++i) {
            codedOutputStream.writeMessage(1, (MessageLite)this.jj.get(i));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        for (int i = 0; i < this.jj.size(); ++i) {
            n += CodedOutputStream.computeMessageSize((int)1, (MessageLite)((MessageLite)this.jj.get(i)));
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof cx_1)) {
            return super.equals(object);
        }
        cx_1 cx_12 = (cx_1)object;
        if (!this.ot().equals(cx_12.ot())) {
            return false;
        }
        return this.unknownFields.equals((Object)cx_12.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + cx_1.os().hashCode();
        if (this.ov() > 0) {
            n = 37 * n + 1;
            n = 53 * n + this.ot().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static cx_1 T(ByteBuffer byteBuffer) {
        return (cx_1)jl.parseFrom(byteBuffer);
    }

    public static cx_1 T(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (cx_1)jl.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static cx_1 aB(ByteString byteString) {
        return (cx_1)jl.parseFrom(byteString);
    }

    public static cx_1 T(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (cx_1)jl.parseFrom(byteString, extensionRegistryLite);
    }

    public static cx_1 T(byte[] byArray) {
        return (cx_1)jl.parseFrom(byArray);
    }

    public static cx_1 T(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (cx_1)jl.parseFrom(byArray, extensionRegistryLite);
    }

    public static cx_1 aM(InputStream inputStream) {
        return (cx_1)GeneratedMessageV3.parseWithIOException(jl, (InputStream)inputStream);
    }

    public static cx_1 aM(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (cx_1)GeneratedMessageV3.parseWithIOException(jl, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static cx_1 aN(InputStream inputStream) {
        return (cx_1)GeneratedMessageV3.parseDelimitedWithIOException(jl, (InputStream)inputStream);
    }

    public static cx_1 aN(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (cx_1)GeneratedMessageV3.parseDelimitedWithIOException(jl, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static cx_1 T(CodedInputStream codedInputStream) {
        return (cx_1)GeneratedMessageV3.parseWithIOException(jl, (CodedInputStream)codedInputStream);
    }

    public static cx_1 bF(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (cx_1)GeneratedMessageV3.parseWithIOException(jl, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public cz_1 ow() {
        return cx_1.ox();
    }

    public static cz_1 ox() {
        return jk.oy();
    }

    public static cz_1 a(cx_1 cx_12) {
        return jk.oy().c(cx_12);
    }

    public cz_1 oy() {
        return this == jk ? new cz_1() : new cz_1().c(this);
    }

    protected cz_1 T(GeneratedMessageV3.BuilderParent builderParent) {
        cz_1 cz_12 = new cz_1(builderParent);
        return cz_12;
    }

    public static cx_1 oz() {
        return jk;
    }

    public static Parser<cx_1> z() {
        return jl;
    }

    public Parser<cx_1> getParserForType() {
        return jl;
    }

    public cx_1 oA() {
        return jk;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.T(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.oy();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.ow();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.oy();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.ow();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.oA();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.oA();
    }

    static /* synthetic */ boolean aJ() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean oB() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(cx_1 cx_12) {
        return cx_12.unknownFields;
    }
}

